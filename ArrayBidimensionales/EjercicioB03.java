/**
 * Modifica el programa anterior de tal forma que los números que se introducen
en el array se generen de forma aleatoria (valores entre 100 y 999).
* 
* @author Raul Martin
*/
public class EjercicioB03 {
	public static void main(String[] args) {
		int [][] num = new int[4][5];
		int fila, columna;
		int valorFila = 0;
		int valorColumna = 0;
		int valorTotah = 0;
		boolean print = true;
		
		
		for(fila = 0; fila < 4; fila++) {
			
			for(columna = 0; columna < 5; columna ++) {
				num[fila][columna] = (int)(Math.random()*900)+100;
				
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
				System.out.printf(" %-5d", num[fila][columna]);
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
					System.out.printf(" %-5d" ,valorFila);
					valorFila = 0;
				}
			}
			
		}
		System.out.printf(" = %3d",valorTotah);
		
	}
}
