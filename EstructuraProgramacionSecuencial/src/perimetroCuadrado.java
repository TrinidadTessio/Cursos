/* Realizar la carga del lado de un cuadrado, mostrar por pantalla el perímetro del mismo (El perímetro de un cuadrado se calcula multiplicando el valor del lado por cuatro)*/

import java.util.Scanner;

public class perimetroCuadrado {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int valorDelLadoCuadrado;
		int perimetro;
		
		System.out.print("\nIngrese el valor del lado del cuadrado: ");
		valorDelLadoCuadrado = teclado.nextInt();
		
		perimetro = (valorDelLadoCuadrado * 4);
		
		System.out.print("\nPERIMETRO DEL CUADRADO: " + perimetro);
	}

}
