package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//////imp : read from one file and write to another one
public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Quiz q = new Quiz();
		q.createSourceFile();
		q.copySourceToDestination();
	}
	
	void createSourceFile()
	{

		try {

			File logFile = new File("Source.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(logFile));
			writer.write("Hello");
			writer.newLine();
			writer.write("Hello sanjeev How are you?");
			
			writer.close();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception occrur :" + e.getMessage());
		}

	}
	
	void copySourceToDestination()
	{

		String sCurrentLine;
		File logFile1 = new File("Destination.txt");
		try(BufferedWriter writer1 = new BufferedWriter(new FileWriter(logFile1));BufferedReader reader = new BufferedReader(new FileReader("Source.txt"));) {		
				while ((sCurrentLine = reader.readLine()) != null) {
					writer1.write(sCurrentLine);
					System.out.println(sCurrentLine);
				}

		} catch (IOException e) {
			System.out.println("Exception occrur :" + e.getMessage());
			//throw new IOException(e);
		}
	}

}
