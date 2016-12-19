/**
 * Realiza un programa que pida 8 números enteros y que luego muestre esos
números junto con la palabra “par” o “impar” según proceda.
* 
* @Raul Martin
*/
import java.util.Scanner;
public class Ejercicio09 {
	public static void main(String[] args) {
		Scanner S = new Scanner (System.in);
		int num[] = new int[8];
		int i;
		System.out.println("Introduce 8 numeros para saber si son par o impar");
		for(i = 0; i < 8; i++) {
			num[i] = S.nextInt();
		}
		for(i = 0; i < 8; i++) {
			
			if(num[i] % 2 == 0) {
				System.out.println("num["+ i +"]:"+ num[i] +" Es par");
			} else {
				System.out.println("num["+ i +"]:"+ num[i] +" Es impar");
			}
		}
	}
}
