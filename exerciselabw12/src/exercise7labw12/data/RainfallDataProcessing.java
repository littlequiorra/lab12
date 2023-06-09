package exercise7labw12.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * This program is to read and process data from a file using java.io.BufferedReader.
 * 
 * The data represents a 6 days reading of daily rainfall from station Simpang Ampat in Alor Gajah district.
 * It calculates the average rainfall.
 * 
 * @author atiqaidayu
 *
 */
public class RainfallDataProcessing {

    public static void main(String[] args) {

        // 1. Declare input file
        String sourceFile = "rainfallData.txt";
        System.out.println("Reading data from " + sourceFile + "\n");

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile))) {

            // Variables for processing data
            double rainfall;
            double totalRainfall = 0.0;
            int days = 6;
            int count = 0;

            // 2. Read data until end-of-file
            String line;
            while ((line = reader.readLine()) != null) {
                // Parse the line as a double
                rainfall = Double.parseDouble(line);

                // Calculate total rainfall
                totalRainfall += rainfall;
                count++;
            }

            // Calculate average rainfall
            double averageRainfall = totalRainfall / days;
            String formattedAverage = String.format("%.1f", averageRainfall);
            System.out.print("\nAverage Rainfall for " + count
                    + " days in Simpang Ampat Station: " + formattedAverage + "%");

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Indicate end of program - Could be successful
        System.out.println("\nEnd of program.");
    }
}
