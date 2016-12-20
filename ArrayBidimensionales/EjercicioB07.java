/**
 * Mejora el juego “Busca el tesoro” de tal forma que si hay una mina a una casilla
de distancia, el programa avise diciendo ¡Cuidado! ¡Hay una mina cerca!
* 
* @author Raul Martin
*/
import java.util.Scanner;
public class EjercicioB07 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		int [][] num = new int[10][10];
		int fila = 0;
		int columna = 0;
		int fTesoro = 0;
		int cTesoro = 0;
		int fMina = 0;
		int cMina = 0;
		int f, c;
		int [][] nIntroducido = new int[10][10];
		boolean tesoro = false;
		boolean mina = false;
		boolean ganar = false;
		
		for(fila = 0; fila < 10; fila++) {
			for(columna = 0; columna < 10; columna++) {
				num[fila][columna] = (int)(Math.random()*2);
				if(num[fila][columna] == 1) {
					fTesoro = fila;
					cTesoro = columna;
					tesoro = true;
				}
				if(num[fila][columna] == 2) {
					fMina = fila;
					cMina = columna;
					mina = true;
				}
				if(tesoro) {
					if(num[fila][columna] == 1) {
						columna--;
					}
				}
				if(mina) {
					if(num[fila][columna] == 2) {
						columna--;
					}
				}
			}
		}
		System.out.println(fTesoro + " " + cTesoro);
		System.out.println(fMina + " " + cMina);
		if(ganar == false) {
			
			for(int intentos = 3; intentos > 0; intentos--) {
				System.out.print("Introduzca la fila: ");
				f = S.nextInt();
				System.out.print("Introduzca la columna: ");
				c = S.nextInt();
				nIntroducido[f][c] = 3;
				if(f == fTesoro && c == cTesoro) {
					ganar = true;
				}
				if(f == fMina && c == cMina) {
					intentos = 0;
				}
				
				for(fila = 0; fila < 10; fila++) {
					System.out.print("|");
					for(columna = 0; columna < 10; columna++) {
						System.out.printf("  |"); //que se vea por pantalla
					}
					System.out.println();
				}
			}
		}
		
	}
}
