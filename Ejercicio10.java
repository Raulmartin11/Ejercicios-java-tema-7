/**
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array. El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
es necesario.
*
* @author Raul Martin
*/
public class Ejercicio10 {
	public static void main(String[] args) {
		int num[] = new int[20];
		int par[] = new int[20];
		int impar[] = new int[20];
		int a;
		int cont = 0;
		int cont2 = 0;
		int aux;

		for(a = 0; a < num.length; a++) {
			num[a] = (int)(Math.random()*100);
			System.out.print(num[a] + " ");

		}
		System.out.println();
		for(a = 0; a < 20; a++) {
			if(num[a] % 2 == 0) {
				par[cont] = num[a];
				cont++;
			}
		}

		for(a = 0; a < num.length; a++) {
			if( num[a] % 2 != 0) {
				impar[cont2] = num[a];
				cont2++;
			}
		}

		for(a = 0; a < num.length ; a++){
			num[a] = par[a];
		}

		for(a = cont ;a < num.length ; a++){
			num[a] = impar[a - cont];
		}
		for(a = 0; a < num.length; a++) {
			System.out.print(num[a]+ " ");
		}
	}
}
