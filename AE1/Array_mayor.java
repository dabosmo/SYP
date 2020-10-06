package AE1;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Array_mayor {

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<Integer>();
		
		Scanner reader = new Scanner(System.in);
		
		int numero = 0;

		System.out.println("Introduce números. El cero para salir");

		do {			
		  
		    numero = reader.nextInt();
		    
		    lista.add(numero);
		  
		} while (numero!=0);
		
		System.out.println("El numero de mayor valor es: " + numeroMayor(lista));
	}
	
	public static int numeroMayor(List<Integer> numeros) {
		
		int mayor = 0;
		
		for(int i = 0; i < numeros.size(); i++) {
			
			if(numeros.get(i) > mayor) {
				
				mayor = numeros.get(i);
			}
		}
		
		return mayor;
	}

}
