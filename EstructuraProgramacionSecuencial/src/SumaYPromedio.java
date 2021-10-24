
/* Realizar un programa que lea cuatro valores numéricos e informar su suma y promedio.*/

import java.util.Scanner;

public class SumaYPromedio {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		float numeroUno;
		float numeroDos;
		float numeroTres;
		float numeroCuatro;
		float suma;
		float promedio;
		
		System.out.print("\nIngrese el primer valor: ");
		numeroUno = teclado.nextInt();
		System.out.print("\nIngrese el segundo valor: ");
		numeroDos = teclado.nextInt();
		System.out.print("\nIngrese el tercer valor: ");
		numeroTres = teclado.nextInt();
		System.out.print("\nIngrese el cuarto valor: ");
		numeroCuatro = teclado.nextInt();
		
		suma = (numeroUno + numeroDos + numeroTres + numeroCuatro);
		promedio = (suma / 4);
		
		System.out.print("\nSUMA DE LOS NUMEROS: " + suma);
		System.out.println("\nPROMEDIO DE LOS NUMEROS: " + promedio);

	}

}
