/**
 * Escribe un programa que lea 10 números por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el último en
mostrarse y viceversa.
* 
* @author Raul Martin;
*/
import java.util.Scanner;

public class Ejercicio03 {
	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		
		int[] array = new int[10];
		System.out.println("Introduce los 10 valores de la array");
		
		for(int i = 0; i < 10; i++) {
			
			array[i] = S.nextInt();
		}
		for(int i = 9; i >= 0; i--) {
			
			System.out.print(array[i] + "  ");
		}
	}
}
