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
                String[] parts = line.split(";");
                if (parts.length >= 2) {
                    try {
                        double value = Double.parseDouble(parts[1].replace(",", "."));
                        sum += value;
                        count++;
                    } catch (NumberFormatException e) {
                    }
                }
                else {
                    System.err.println("Invalid line:" + line);
                }
                }

            if (count > 0) {
                double average = sum / count;
                System.out.printf("Average temperature on the 1st day of January 2023: %.2f\n", average);
            } else {
                System.out.println("No valid temperature data found.");
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}






