package exercise5labw12.data;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * This program is to create a set of data in a file using java.io.DataOutputStream  
 * 
 * The data represent a 6 days reading of daily rainfall from station Simpang Ampat in Alor Gajah district..
 * 
 * @author atiqaidayu
 *
 */
public class RainfallDataCreation {

	public static void main(String[] args) {
		
		
		// 1. Declare output file 
		String outFile = "rainfallData.txt";
		
		// Data declaration
		double [] rainfall = { 0.0, 4.0, 1.0, 6.0, 1.0, 19.0 };
			
		try {
			
			// 2. Create stream to read data
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile));
			
			// Process data
			for (int index = 0; index < rainfall.length; index++) {
				
				// 3. Write data into data stream
				dos.writeDouble(rainfall[index]);
				
				// 4. Flush for each writing
				dos.flush();
			}
			
			// 5. Close stream
			dos.close();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		
		// Complete Data Creation
		System.out.println("Rainfall Data Creation completed. Check out " + outFile); 
	}

}
