/**
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces
por teclado dos valores y a continuación cambiará todas las ocurrencias del
primer valor por el segundo en la lista generada anteriormente. Los números
que se han cambiado deben aparecer entrecomillados.
* 
* @author Raul Martin
*/
import java.util.Scanner;
public class Ejercicio07 { 
	public static void main(String[] args) {
		Scanner S = new Scanner (System.in);
		
		int i,n;
		int random[] = new int[100];
		int valor1, valor2;
		for(i = 0; i < 100; i++) {
			random[i] = (int)(Math.random()*21);
			System.out.printf("%-6d",random[i]);
		}
		System.out.println("\nIntroduce un valor del 0 al 20");
		valor1 = S.nextInt();
		System.out.println("Introduce un valor diferente al primero");
		valor2 = S.nextInt();
		for(i = 0; i < 100; i++) {
			if( valor1 == random[i]) {
				random[i] = valor2;
				System.out.printf("'%-2d'  ",random[i]);
			} else {
				System.out.printf("%-6d",random[i]);
			}
		}
	}
}
