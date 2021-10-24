
/* Escribir un programa en el cual se ingresen cuatro números, calcular e informar la suma de los dos primeros y el producto del tercero y el cuarto.*/

import java.util.Scanner;

public class SumaDosPrimerosProductoDosUltimos {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int numeroUno;
		int numeroDos;
		int numeroTres;
		int numeroCuatro;
		int suma;
		int producto;
		
		System.out.print("\nIngrese el primer valor: ");
		numeroUno = teclado.nextInt();
		System.out.print("\nIngrese el segundo valor: ");
		numeroDos = teclado.nextInt();
		System.out.print("\nIngrese el tercer valor: ");
		numeroTres = teclado.nextInt();
		System.out.print("\nIngrese el cuarto valor: ");
		numeroCuatro = teclado.nextInt();
		
		suma = (numeroUno + numeroDos);
		producto = (numeroTres * numeroCuatro);
		
		System.out.print("\nSUMA DE LOS DOS PRIMEROS NUMEROS: " + suma);
		System.out.print("\nPRODUCTO DEL TERCER Y CUARTO NUMERO: " + producto);

	}

}
