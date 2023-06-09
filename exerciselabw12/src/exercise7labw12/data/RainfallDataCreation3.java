package exercise7labw12.data;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * This program is to create a set of data in a file using java.io.BufferedWriter.
 * 
 * The data represent a 6 days reading of daily rainfall from station Simpang Ampat in Alor Gajah district.
 * 
 * @author atiqaidayu
 *
 */
public class RainfallDataCreation3 {

    public static void main(String[] args) {

        // 1. Declare output file
        String outFile = "rainfallData.txt";

        // Data declaration
        double[] rainfall = { 0.0, 4.0, 1.0, 6.0, 1.0, 19.0 };

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outFile))) {

            // Process data
            for (double value : rainfall) {
                // 2. Write data into file
                writer.write(Double.toString(value));
                writer.newLine();
            }

            // Complete Data Creation
            System.out.println("Rainfall Data Creation completed. Check out " + outFile);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
