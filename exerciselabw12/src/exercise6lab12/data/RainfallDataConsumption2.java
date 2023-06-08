package exercise6lab12.data;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * This class reads the data created from the RainfallDataCreation class using java.io.DataInputStream.
 * It displays all the data and computes the average rainfall for each station.
 * 
 * 
 * @author atiqaidayu
 */
public class RainfallDataConsumption2 {

    public static void main(String[] args) {

        // Declare input file
        String sourceFile = "rainfallData.txt";
        System.out.println("Reading data from " + sourceFile + "\n");

        try {
            // Create stream to read data
            DataInputStream dis = new DataInputStream(new FileInputStream(sourceFile));

            // Variables for processing data
            int stationCount = 0;
            int districtCount = 0;
            double totalRainfall = 0.0;

            // Process data until end-of-file
            while (dis.available() > 0) {
                stationCount++;
                int stationId = dis.readInt();
                String stationName = dis.readUTF();
                String districtName = dis.readUTF();
                double[] rainfall = new double[6];

                System.out.println("Station ID: " + stationId);
                System.out.println("Station Name: " + stationName);
                System.out.println("District Name: " + districtName);
                System.out.println("Rainfall Data:");

                // Read and display rainfall data
                for (int i = 0; i < 6; i++) {
                    rainfall[i] = dis.readDouble();
                    System.out.println("Day " + (i + 1) + ": " + rainfall[i]);
                    totalRainfall += rainfall[i];
                }

                // Compute and display average rainfall for the station
                double averageRainfall = totalRainfall / 6;
                System.out.println("Average Rainfall: " + averageRainfall);
                System.out.println();

                totalRainfall = 0.0;

                // Check if district changes
                if (stationCount % 2 == 0) {
                    districtCount++;
                }
            }

            // Close stream
            dis.close();

            // Display number of stations and districts
            System.out.println("Number of Stations: " + stationCount);
            System.out.println("Number of Districts: " + districtCount);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // Indicate end of program - Could be successful
        System.out.println("\nEnd of program.");
    }
}
