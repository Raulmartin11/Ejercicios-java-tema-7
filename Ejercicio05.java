/**
 * Escribe un programa que pida 10 números por teclado y que luego muestre
los números introducidos junto con las palabras “máximo” y “mínimo” al lado
del máximo y del mínimo respectivamente.
* 
* @author Raul Martin
*/
import java.util.Scanner;
public class Ejercicio05 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int[] array = new int[10];
		int maximo = 0;
		int minimo = 1000000;
		int i = 0;
		
		System.out.println("Introduce 10 numeros por teclado");
		for(i = 0; i < 10; i++) {
			
			array[i] = S.nextInt();
			if(array[i] > maximo) {
				maximo = array[i];
			}
			if(array[i] < minimo) {
				minimo = array[i];
			}
		}
		for(i = 0; i < 10; i++) {
			if(array[i] == maximo){
				System.out.println(maximo + " maximo");
			} else if(array[i] == minimo) {
				System.out.println(minimo + " minimo");
			} else {
				System.out.println(array[i]);
			}
		}
	}
}
			
