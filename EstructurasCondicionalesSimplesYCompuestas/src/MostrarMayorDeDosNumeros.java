
/* Realizar un programa que solicite ingresar dos números distintos y muestre por pantalla el mayor de ellos.*/

import java.util.Scanner;

public class MostrarMayorDeDosNumeros {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numeroUno;
		int numeroDos;
		
		System.out.print("\nIngrese el primer valor: ");
		numeroUno = teclado.nextInt();
		System.out.print("\nIngrese el segundo valor: ");
		numeroDos = teclado.nextInt();
		
		if (numeroUno > numeroDos) {
			System.out.print("\nMAYOR NUMERO: " + numeroUno);
		}
		else {
			System.out.print("\nMAYOR NUMERO: " + numeroDos);
		}
	}

}
