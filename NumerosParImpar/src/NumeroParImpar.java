import java.util.Scanner;

/*
 * Hacer un programa que pida un numero por teclado
 * se tiene que hacer un recorrido desde 1 hasta el numero introducido
 * tiene que imprimir la suma de los numeros pares e impares
 * 
 * */

public class NumeroParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner (System.in);
		System.out.println("Ingresa un número");
		
		int n = num.nextInt();
		
		resultado (n);
		
		num.close();
		
	} // fin main
	
	
	public static void resultado (int n) {
		int sumPar= 0;
		int sumImpar = 0;
		
		for (int i=1; i<=n; i++) {			
			
			if(i % 2 == 0) {
				sumPar+=i;
				
			}else {
				sumImpar+=i;
			}
			
		}
		
		System.out.println("la suma de los numeros par es :" + sumPar);
		System.out.println("La suma de los números impares es: " + sumImpar);
		//System.out.println("La lista de números: "i);
		

	}

}
