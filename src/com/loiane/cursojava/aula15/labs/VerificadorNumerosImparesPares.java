package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class VerificadorNumerosImparesPares {

	public static void main(String[] args) {

		
		@SuppressWarnings("resource")
		Scanner programa = new Scanner(System.in);
		
		System.out.println("Programa Verificador de N�meros Impares e Pares");
		System.out.println("Digite um n�mero para ser averiguado!");
		
		int num = programa.nextInt();
		
		if(num % 2 == 0) {
			
			System.out.println("Est� n�mero � par! ");
		}else {
			
			System.out.println("Este n�mero � impar! ");
		}
		
	}

}
