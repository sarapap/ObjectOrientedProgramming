package Module3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

public class CSVfile {
    private final static String Filename = "temploki.csv";

    public static void main(String[] args) {
        BufferedReader bufferedReader = null;

        try {
            // Open the file in the same directory as the class
            FileReader fileReader = new FileReader(Filename);
            bufferedReader = new BufferedReader(fileReader);

            String line;
            String[] columnNames = null;
            boolean header = true;
            double sum = 0.0;
            int count = 0;

            while ((line = bufferedReader.readLine()) != null) {
                if (header) {
                    columnNames = line.split(";");
                    header = false;
                } else {
                    String[] columns = line.split(";");
                    LocalDate timestamp = LocalDate.parse(columns[0].trim());

                    // Check if the timestamp is on January 1, 2023
                    if (timestamp.equals(LocalDate.of(2023, 1, 1))) {
                        double temperature = Double.parseDouble(columns[1].replace(",", "."));
                        sum += temperature;
                        count++;
                    }
                }
            }

            if (count > 0) {
                double averageTemperature = sum / count;
                System.out.println("Average temperature on January 1, 2023: " + averageTemperature);
            } else {
                System.out.println("No data found for January 1, 2023.");
            }

        } catch (IOException e) {
            System.err.println(e);
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                System.out.println("Error while closing the file stream.");
            }
        }
    }
}


