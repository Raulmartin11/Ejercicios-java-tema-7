/**
 * Modifica el programa anterior de tal forma que las sumas parciales y la suma
total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
que el ordenador se queda “pensando” antes de mostrar los números.
* 
* @author Raul Martin
*/
public class EjercicioB04 {
	public static void main(String[] args) throws InterruptedException {
		
		
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
					Thread.sleep(1000);
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
					Thread.sleep(1000);
					System.out.printf(" %-5d" ,valorFila);
					valorFila = 0;
				}
			}
			
		}
		Thread.sleep(1000);
		System.out.printf(" = %3d",valorTotah);
		
	}
}
