package Module3;

import java.io.*;
import java.net.URL;

public class CSVfile {
    public static void main(String[] args) {
        try {
            String url = "https://users.metropolia.fi/~jarkkov/temploki.csv";

            BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(url).openStream()));

            // Skip the header
            reader.readLine();

            double sum = 0;
            int count = 0;

            // Read each line of the CSV file
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replace(",", ".");
                String[] parts = line.split(";");

                String[] dateParts = parts[0].split(" ");
                String[] date = dateParts[0].split("\\.");
                int day = Integer.parseInt(date[0]);
                int month = Integer.parseInt(date[1]);
                int year = Integer.parseInt(date[2]);

                String temperatureStr = parts[1];
                if (!temperatureStr.equals("*")) {
                    // Parse the temperature value to double
                    double temperature = Double.parseDouble(temperatureStr);

                // Check if the date is on the 1st day of January 2023
                if (day == 1 && month == 1 && year == 2023) {
                    sum += temperature;
                    count++;
                }
            } }

            reader.close();

            double average = count > 0 ? sum / count : 0;

            System.out.println("Average temperature on the 1st day of January 2023: " + average);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}






