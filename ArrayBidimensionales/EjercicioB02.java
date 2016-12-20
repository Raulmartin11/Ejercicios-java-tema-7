/**
 * Escribe un programa que pida 20 números enteros. Estos números se deben
introducir en un array de 4 filas por 5 columnas. El programa mostrará las
sumas parciales de filas y columnas igual que si de una hoja de cálculo se
tratara. La suma total debe aparecer en la esquina inferior derecha.
* 
* @author Raul Martin
*/
import java.util.Scanner;
public class EjercicioB02 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int [][] num = new int[4][5];
		int fila, columna;
		int valorFila = 0;
		int valorColumna = 0;
		int valorTotah = 0;
		boolean print = true;
		System.out.println("Introduce 20 numeros enteros");
		
		
		for(fila = 0; fila < 4; fila++) {
			
			for(columna = 0; columna < 5; columna ++) {
				num[fila][columna] = S.nextInt();
				
			}
			
		}
		
		
		for(fila = 0; fila < 4; fila++) {
			
			for(columna = 0; columna < 5; columna ++) {
				valorColumna += num[fila][columna];
				valorTotah += num[fila][columna];
				
				if(print) {
					System.out.print("Fila[" +fila+ "] =");
					print = false;
				}
				System.out.printf(" %3d", num[fila][columna]);
				if(columna == 4) {
					System.out.println(" = " + valorColumna);
					valorColumna = 0;
					print = true;
				}
			}
			
		}
		
		
		System.out.print("Total   =");
		for(columna = 0; columna < 5; columna++) {
			for(fila = 0; fila < 4; fila++) {
				valorFila += num[fila][columna];
				
				if(fila == 3 ) {
					System.out.printf(" %3d" ,valorFila);
					valorFila = 0;
				}
			}
			
		}
		System.out.printf(" = %3d",valorTotah);
		
	}
}
