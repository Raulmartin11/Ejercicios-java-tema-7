/**
 * Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array.
* 
* @author Raul Martin
*/
import java.util.Scanner;
public class Ejercicio06 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int i;
		int n;

		int[] array = new int[15];
		System.out.println("Introduce 15 valores para array");
		for(i = 0; i < 15; i++) {
			
			array[i] = S.nextInt();
		}
		n = array[14]; // Guardamos el valor de i14 para darselo a i0
		for(i = 14; i > 0; i--) {// reducimos el bucle a 14 porque ya tenemos el valor de i0 por eso invertimos i, para cerrar antes del i0
			array[i] = array[i - 1]; //vamos dandole el valor del i anterior (en i13 = i14)
		}
		array[0] = n;
		for(i = 0; i < 15; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
			
		}
	}
} 
