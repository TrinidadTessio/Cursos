
/*Se ingresa por teclado un n�mero positivo de uno o dos d�gitos (1..99) mostrar un mensaje indicando si el n�mero tiene uno o dos d�gitos.
(Tener en cuenta que condici�n debe cumplirse para tener dos d�gitos, un n�mero entero)*/

import java.util.Scanner;

public class verificarCantidadDeDigitos {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int numero;
		
		System.out.print("\nIngrese un numero: ");
		numero = teclado.nextInt();
		
		if(numero < 10) {
			System.out.print("\nEL NUMERO TIENE UN DIGITO");
		}
		else {
			System.out.print("\nEL NUMERO TIENE DOS DIGITOS");
		}
	}

}
