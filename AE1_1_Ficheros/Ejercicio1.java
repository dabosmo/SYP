package AE1_1_Ficheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejercicio1 {

	public static void main(String[] args) throws IOException {
		
		double startTime;
		double endTime;
		double totalTime;
		
		File file = new File("numeros.txt");
		FileWriter writer = new FileWriter(file);
		
		PrintWriter printer = new PrintWriter(writer);
		
		startTime = System.currentTimeMillis();
		
		for(int i = 0; i < 100; i++) {
			
			printer.println(Math.floor(Math.random()*9+1));  //Genera valores enteros entre 1 y 10
		}
		
		endTime = System.currentTimeMillis();
		
		totalTime = endTime - startTime;
		
		printer.println(totalTime + " ms");
		
		printer.close();
	}

}
