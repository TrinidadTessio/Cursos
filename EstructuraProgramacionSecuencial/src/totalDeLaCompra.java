
/* Se debe desarrollar un programa que pida el ingreso del precio de un artículo y la cantidad que lleva el cliente. Mostrar lo que debe abonar el comprador.*/

import java.util.Scanner;

public class totalDeLaCompra {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		float precioArticulo;
		int cantidadArticulo;
		float totalAPagar;
		
		System.out.print("\nIngrese el precio del articulo: ");
		precioArticulo = teclado.nextFloat();
		System.out.print("\nIngrese la cantidad que desea comprar: ");
		cantidadArticulo = teclado.nextInt();
		
		totalAPagar = (precioArticulo * cantidadArticulo);
		
		System.out.println("\nTOTAL A PAGAR: " + totalAPagar);

	}

}
