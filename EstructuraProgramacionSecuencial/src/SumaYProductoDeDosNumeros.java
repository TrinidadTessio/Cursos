
/* Realizar la carga de dos números enteros por teclado e imprimir su suma y su producto. */

import java.util.Scanner;

public class SumaYProductoDeDosNumeros {

	public static void main(String[] args) {
		
Scanner teclado = new Scanner(System.in);
		
		int primerValor;
		int segundoValor;
		int suma;
		int producto;
		
		System.out.print("Ingrese primer valor: ");
		primerValor = teclado.nextInt();
		System.out.print("Ingrese el segundo valor: ");
		segundoValor = teclado.nextInt();
		
		suma = (primerValor + segundoValor);
		producto = (primerValor * segundoValor);
		
		System.out.print("\nLa suma de los dos valores es: " + suma);
		System.out.print("\nEl producto de los dos valores es: " + producto);
	}

}
