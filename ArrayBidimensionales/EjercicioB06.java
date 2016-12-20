/**
 * Modifica el programa anterior de tal forma que no se repita ningún número en
el array.
* 
* @author Raul Martin
*/
public class EjercicioB06 {
	public static void main(String[] args) {
		int [][] num = new int[6][10];
		int fila, columna;
		int maximo = 0;
		int minimo = 10000;
		
		for(fila = 0; fila < 6; fila++) {
			for(columna = 0; columna < 10; columna++) {
				num[fila][columna] = (int)(Math.random()*1000);
				for(int f = 0; f < fila; f++) {
					for(int c = 0; c < columna; c++) {
						if(num[fila][columna] == num[f][c]) {
							columna --;
						}
					}
				}
				if(maximo < num[fila][columna]) {
					maximo = num[fila][columna];
				}
				if(minimo > num[fila][columna]) {
					minimo = num[fila][columna];
				}
			}
		}
		for(fila = 0; fila < 6; fila++) {
			System.out.print("Fila[" + fila + "]: ");
			for(columna = 0; columna < 10; columna++) {
				System.out.printf("%-5d",num[fila][columna]);
				if(columna == 9) {
					System.out.println();
				}
			}
		}
		for(fila = 0; fila < 6; fila++) {
			for(columna = 0; columna < 10; columna++) {
				if(maximo == num[fila][columna]) {
					System.out.println("numero maximo: Fila[" + fila + "]  columna[" + columna + "] = " + num[fila][columna]);
				}
				if(minimo == num[fila][columna]) {
					System.out.println("numero minimo: Fila[" + fila + "]  columna[" + columna + "] = " + num[fila][columna]);
				}
			}
		}
		
	}
}
