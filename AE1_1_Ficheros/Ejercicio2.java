package AE1_1_Ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejercicio2 {

	public static void main(String[] args) throws IOException {
		
		List<Float> numeros = new ArrayList<>();
		String line;
		
		int cont = 0;
		
		float suma = 0;
		
		double startTimeRead;
		double endTimeRead;
		double startTimeCalculate;
		double endTimeCalculate;
		double totalTimeRead;
		double totalTimeCalculate;
		
		FileReader reader = new FileReader("numeros.txt");
		
		BufferedReader bReader = new BufferedReader(reader);
		
		startTimeRead = System.nanoTime();
		
		while((line = bReader.readLine()) != null && cont < 100) {  //Para leer el archivo y rellenar el arrayList de numeros
			
			numeros.add(Float.parseFloat(line));
			
			cont++;
		}
		
		endTimeRead = System.nanoTime();
		
		totalTimeRead = (endTimeRead - startTimeRead)/1000000;
		
		Iterator<Float> iteratorNumeros = numeros.iterator();
		
		startTimeCalculate = System.nanoTime();
		
		while(iteratorNumeros.hasNext()){  //Bucle para realizar el acceso a los elementos de el arrayList de numeros
			
			Float elemento = iteratorNumeros.next();
			
			suma += elemento;
		}
		
		endTimeCalculate = System.nanoTime();
		
		totalTimeCalculate = (endTimeCalculate - startTimeCalculate)/1000000;
		
		System.out.println("La suma total es: " + suma);
		System.out.println("El proceso de lectura ha tardado: " + totalTimeRead + " ms");
		System.out.println("El proceso de calculo ha tardado: " + totalTimeCalculate + " ms");
		
		bReader.close();
	}

}
