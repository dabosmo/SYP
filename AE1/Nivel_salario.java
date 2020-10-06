package AE1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nivel_salario {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String nombre;
		double experiencia;
		
		System.out.println("Introduzca su nombre: ");
		
		nombre = reader.readLine();
		
		System.out.println("Introduzca los años de experiencia: ");
		
		experiencia = Double.parseDouble(reader.readLine());
		
		nivelSalario(nombre, experiencia);
		
		
		
		

	}
	
	public static void nivelSalario(String nom, double exp) {
		
		if(exp < 1) {
			System.out.println("Desarrollador Junior L1 - 15000/18000");			
		}
		if(exp >= 1 && exp < 3) {
			System.out.println("Desarrollador Junior L2 - 18000/22000");			
		}
		if(exp >= 3 && exp < 5) {
			System.out.println("Desarrollador Senior L1 - 22000/28000");			
		}
		if(exp >= 5 && exp < 8) {
			System.out.println("Desarrollador Senior L2 - 28000/36000");			
		}
		if(exp > 8) {
			System.out.println("Analista/Arquitecto. Salario a convenir en base a rol");			
		}
	}

}
