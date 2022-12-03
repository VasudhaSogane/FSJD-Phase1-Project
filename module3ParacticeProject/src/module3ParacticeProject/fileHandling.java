package module3ParacticeProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class fileOps{
	//full path of the file
	private String filePath = "C:\\Temp\\java.txt";

	//method to write to file using FileWriter
	public void writeToFile() throws IOException{
		BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
		writer.write("Java is a programming language");
		writer.close();
		System.out.println("Successfully wrote to the file");
	}

	//method to read from file using FileReader
	public void readFromFile() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		String line;
		while ((line=reader.readLine())!=null)
			System.out.println(line);
		reader.close();
	}

	//method to append data to the file
	public void appendToFile() throws IOException {
		BufferedWriter writer1 = new BufferedWriter(new FileWriter(filePath,true));
		writer1.write("\nThis is a newly entered line.");
		writer1.close();
		System.out.println("Successfully appended to the file");
	}
}
public class fileHandling {

	public static void main(String[] args) {
		fileOps fileOPS = new fileOps();
		//writing to a file
		System.out.println("Writing to the file");
		try {
			fileOPS.writeToFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		//reading from a file
		System.out.println("\nReading from the file");
		try {
			fileOPS.readFromFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		//appending to a file
		System.out.println("\nAppending data to the file");
		try {
			fileOPS.appendToFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		//reading from the file after appending
		System.out.println("\nReading from the file after appeding");
		try {
			fileOPS.readFromFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
