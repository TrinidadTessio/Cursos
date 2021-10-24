
/* Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete mostrar un mensaje "Promocionado".*/

import java.util.Scanner;

public class VerificarPromocionDeNotas {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int notaUno;
		int notaDos;
		int notaTres;
		float suma;
		float promedio;
		
		System.out.print("\nIngrese la primer nota: ");
		notaUno = teclado.nextInt();
		System.out.print("\nIngrese la segunda nota: ");
		notaDos = teclado.nextInt();
		System.out.print("\nIngrese la tercer nota: ");
		notaTres = teclado.nextInt();

		suma = (notaUno + notaDos + notaTres);
		promedio = (suma / 3);
		
		if (promedio >= 7) {
			System.out.print("PROMOCIONADO");
		}
	}

}
