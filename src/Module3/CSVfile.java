package Module3;

import java.io.*;
import java.net.*;
import java.time.format.*;
import java.util.*;

public class CSVfile {

    public static void main(String[] args) {
        URL myUrl;

        try {
            myUrl = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
        } catch (MalformedURLException e) {
            System.err.println(e);
            return;
        }

        try {
            InputStream istream = myUrl.openStream();
            InputStreamReader istreamreader = new InputStreamReader(istream);
            BufferedReader reader = new BufferedReader(istreamreader);

            String line;
            Map<String, Double> temperatureMap = new HashMap<>();

            // Skip the header line
            reader.readLine();

            // Read the content of the web page line by line
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 2) { // Ensure it has enough columns
                    String dateStr = parts[0];
                    double temperature = Double.parseDouble(parts[1]); // Assuming UlkoTalo is the second column
                    temperatureMap.put(dateStr, temperature);
                }
            }

            // Calculate the average temperature for the 1st day of January 2023
            String targetDate = "2023-01-01";
            double sumTemperature = 0;
            int count = 0;
            for (Map.Entry<String, Double> entry : temperatureMap.entrySet()) {
                if (entry.getKey().startsWith(targetDate)) {
                    sumTemperature += entry.getValue();
                    count++;
                }
            }
            double averageTemperature = count > 0 ? sumTemperature / count : 0;
            System.out.println("Average temperature on " + targetDate + " is: " + averageTemperature);

            // Close the reader
            reader.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}




