
/*Ingresar el sueldo de una persona, si supera los 3000 pesos mostrar un mensaje en pantalla indicando que debe abonar impuestos.*/

import java.util.Scanner;

public class verificarSiDebeAbonar {

	public static void main(String[] args) {
		
	Scanner teclado = new Scanner(System.in);
		
		float sueldo;
		
		System.out.print("\nIngrese el sueldo de la persona: ");
		sueldo = teclado.nextFloat();
		
		if(sueldo > 3000) {
			
			System.out.print("\nESTA PERSONA DEBE ABONAR IMPUESTOS");
		}
	}

}
