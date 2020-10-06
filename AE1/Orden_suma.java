package AE1;

import java.util.Scanner;

public class Orden_suma {

	public static void main(String[] args) {
		
		int suma = 0;
		
		suma = ordena_Suma();
		
		System.out.println("La suma de todos los numeros introducidos es: " + suma);
	}
	
	public static int ordena_Suma() {
		
		int suma = 0;
		
		int [] numeros = new int [5];
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduce cinco números");
		
		for(int i = 0; i < 5; i++) {
			
			numeros[i] = reader.nextInt();
			
			suma += numeros[i];
		}
		
		System.out.println("Mostrando los números en orden inverso: ");
		
		for (int i = numeros.length - 1; i >= 0 ; i--) {
			
            System.out.println(numeros[i]);
        }		
		
		return suma;
	}

}
