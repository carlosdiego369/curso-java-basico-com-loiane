package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class VerificadorNumerosImparesPares {

	public static void main(String[] args) {

		
		@SuppressWarnings("resource")
		Scanner programa = new Scanner(System.in);
		
		System.out.println("Programa Verificador de Números Impares e Pares");
		System.out.println("Digite um número para ser averiguado!");
		
		int num = programa.nextInt();
		
		if(num % 2 == 0) {
			
			System.out.println("Esté número é par! ");
		}else {
			
			System.out.println("Este número é impar! ");
		}
		
	}

}
