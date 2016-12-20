/**
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con
números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
A continuación, el programa deberá dar la posición tanto del máximo como
del mínimo.
* 
* @author Raul Marrtin
*/
public class EjercicioB05 {
	public static void main(String[] args) {
		
		int [][] num = new int[6][10];
		int fila, columna;
		int maximo = 0;
		int minimo = 10000;
		
		for(fila = 0; fila < 6; fila++) {
			System.out.print("Fila[" + fila + "]: ");
			for(columna = 0; columna < 10; columna++) {
				num[fila][columna] = (int)(Math.random()*1000);
				System.out.printf("%-5d",num[fila][columna]);
				if(columna == 9) {
					System.out.println();
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
