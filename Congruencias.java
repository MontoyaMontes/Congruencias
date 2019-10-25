import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.lang.*;

/**
 * 
 * Montoya Montes Pedro
 * pmontoyam@ciencias.unam.mx
 *
 * <p>Clase que se encarga de solucionar operaciones de modularidad y congruencias.</p>
 *
 */
public class Congruencias{

	/**
	 * Método que calcula el modulo m de un número n.
	 * @param n,m
	 * @return un entero el cual es el resultado de n (modulo m).
	 */
	public static int modulo(int n, int m){
		return (n < 0) ? (m - (Math.abs(n) % m) ) %m : (n % m);		
	}


	/**
	 * Método que ayudado del método modulo(n,m), resuelve la operación del tipo:
	 * n*k congruente resultado (modulo m)
	 * donde n,m,k son valores dados por el usuario y k es el valor a buscar.
     */
	public static int congruencia(int n, int m, int resultado){
    	int k = 0;
		while(modulo(n*k,m) != resultado){
			k++;
		}   	
		return k;		
	}


	/**
	 * Método main donde se corre ejecutan los metodos para encontrar el resultado de la congruencia.
	 * Falta agregar los casos donde la congruencia no es posible con mcd(n,m).
	 */
    public static void main(String[] arg){ 
    	try{
    		//Valores que se pueden cambiar.
    		/**
    		int n = 143;
    		int modulo = 391;
    		int resultado = 259;
			*/
			int n = 4;
			int modulo = 35;
			int resultado = modulo(-7,35);
			System.out.println("El valor de k de la siguiente formula: \n" 
								+ n + "*k congruente " + resultado + "(modulo " + modulo+")");
			
			int resultadoK = congruencia(n, modulo, resultado);
			
			System.out.println("es: " + resultadoK);
			//Con este ejemplo, k = 360, ya que 143*360 congruente 259 (modulo 391).

    	}catch (Exception e){
			System.out.println("Algo salió mal.");
    	}
   	}	
}