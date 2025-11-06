package co3_scena;
import java.io.*;
public class FileHandlingDemo {
	 public static void main(String[] args) {

	        try {
	            FileReader fr = new FileReader("git init.txt");
	            BufferedReader br = new BufferedReader(fr);

	            String line;
	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }

	            br.close();
	        }
	        catch (FileNotFoundException e) {
	            System.out.println("Error: File not found!");
	        }
	        catch (IOException e) {
	            System.out.println("Error: Unable to read the file!");
	        }

	        System.out.println("Program continues...");
	    }
}
