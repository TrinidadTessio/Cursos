
/* Realizar un programa que lea por teclado dos números, si el primero es mayor al segundo informar su suma y diferencia, en caso contrario informar el producto y la división del primero respecto al segundo.*/

import java.util.Scanner;

public class CalculosMayorNumero {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int numeroUno;
		int numeroDos;
		int suma;
		int resta;
		int producto;
		int division;
		
		System.out.print("\nIngrese el primer valor: ");
		numeroUno = teclado.nextInt();
		System.out.print("\nIngrese el segundo valor: ");
		numeroDos = teclado.nextInt();
		
		if (numeroUno > numeroDos) {
			
			suma = (numeroUno + numeroDos);
			resta = (numeroUno - numeroDos);
			
			System.out.print("\nSUMA DE NUMEROS: " + suma);
			System.out.print("\nDIFERENCIA DE NUMEROS: " + resta);
		}
		else {
			producto = (numeroUno * numeroDos);
			division = (numeroDos / numeroUno);
			
			System.out.print("\nPRODUCTO DE LOS NUMEROS: " + producto);
			System.out.print("\nDIVISION DE LOS NUMEROS: " + division);
		}
	}

}
