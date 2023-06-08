package exercise6lab12.data;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * This class creates the input data using java.io.DataOutputStream for two stations in each district in Melaka.
 * The data consists of the station id, station name, name of district, and 6-days reading of daily rainfall.
 * 
 * 
 * @author atiqaidayu
 */
public class RainfallDataCreation2 {

    public static void main(String[] args) {

        // Declare output file
        String outFile = "rainfallData.txt";

        try {
            // Create stream to write data
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile));

            // District 1: Alor Gajah
            String district1 = "Alor Gajah";

            // Station 1: Simpang Ampat
            int stationId1 = 2421003;
            String stationName1 = "Simpang Ampat";
            double[] rainfall1 = { 0.0, 4.0, 1.0, 6.0, 1.0, 19.0 };

            // Write data for station 1
            dos.writeInt(stationId1);
            dos.writeUTF(stationName1);
            dos.writeUTF(district1);
            for (double value : rainfall1) {
                dos.writeDouble(value);
            }

            // Station 2: Station 2 for Alor Gajah
            int stationId2 = 2222002;
            String stationName2 = "Durian Tunggal";
            double[] rainfall2 = { 2.0, 5.0, 3.0, 8.0, 2.0, 12.0 };

            // Write data for station 2
            dos.writeInt(stationId2);
            dos.writeUTF(stationName2);
            dos.writeUTF(district1);
            for (double value : rainfall2) {
                dos.writeDouble(value);
            }

            // District 2: Melaka Tengah
            String district2 = "Melaka Tengah";

            // Station 3: Bukit Baru
            int stationId3 = 0300061;
            String stationName3 = "Bukit Katil";
            double[] rainfall3 = { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0 };

            // Write data for station 3
            dos.writeInt(stationId3);
            dos.writeUTF(stationName3);
            dos.writeUTF(district2);
            for (double value : rainfall3) {
                dos.writeDouble(value);
            }

            // Station 4: Station 2 for Melaka Tengah
            int stationId4 =  2222006;
            String stationName4 = "Cheng";
            double[] rainfall4 = { 3.0, 4.0, 5.0, 6.0, 7.0, 8.0 };

            // Write data for station 4
            dos.writeInt(stationId4);
            dos.writeUTF(stationName4);
            dos.writeUTF(district2);
            for (double value : rainfall4) {
                dos.writeDouble(value);
            }

            // District 3: Jasin
            String district3 = "Jasin";

            // Station 5: Station 1 for Jasin
            int stationId5 = 2225044;
            String stationName5 = "Chohong";
            double[] rainfall5 = { 10.0, 11.0, 12.0, 13.0, 14.0, 15.0 };

            // Write data for station 5
            dos.writeInt(stationId5);
            dos.writeUTF(stationName5);
            dos.writeUTF(district3);
            for (double value : rainfall5) {
                dos.writeDouble(value);
            }

            // Station 6: Station 2 for Jasin
            int stationId6 = 2324033;
            String stationName6 = "Hospital Jasin";
            double[] rainfall6 = { 20.0, 21.0, 22.0, 23.0, 24.0, 25.0 };

            // Write data for station 6
            dos.writeInt(stationId6);
            dos.writeUTF(stationName6);
            dos.writeUTF(district3);
            for (double value : rainfall6) {
                dos.writeDouble(value);
            }

            // Close stream
            dos.close();

            // Complete Data Creation
            System.out.println("Rainfall Data Creation completed. Check out " + outFile);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
