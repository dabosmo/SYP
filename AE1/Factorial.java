package AE1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double factorial = 1;
		double numero = 20;
		
		while ( numero!=0) {
			  factorial=factorial*numero;
			  numero--;
		}
		System.out.println("El factorial de " + numero + " es " + factorial);
	}

}
