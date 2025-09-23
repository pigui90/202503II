package service;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite un valor");
		int valor = scan.nextInt();
		
		calculaVector(valor);
		
		scan.close();

	}
	
	
	public static void calculaVector(int valor) {
		Scanner scan2 = new Scanner(System.in);
		
		int numeros[] = new int[5];

		for(int i = 0; i < 5; i++) {
			System.out.println("Digite un valor para el vector en la posicion " + i);
			numeros[i] = scan2.nextInt();
		}
		
		for(int j=0;j<5;j++) {
			System.out.println("El resultado es: " + numeros[j] * valor);
		}
			
	}

}
