/**
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes
de un determinado año y que muestre a continuación un diagrama de barras
horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
de asteriscos o cualquier otro carácter.
* 
* @author Raul Martin
*/
import java.util.Scanner;
public class Ejercicio08 { 
	public static void main(String[] args) {
		Scanner S = new Scanner (System.in);
		
		int i,n;
		int temp[] = new int[12];
		
		System.out.println("Introduce la temp. media de cada mes ");
		for(i = 0; i < 12; i++) {
			temp[i] = S.nextInt();
		}
		for(i = 0; i < 12; i++){
			System.out.print("El " + i + "º mes: ");
			for(n = 0; n < temp[i]; n++) {
				System.out.print("→");
			}
			System.out.println();
		}
	}
}
