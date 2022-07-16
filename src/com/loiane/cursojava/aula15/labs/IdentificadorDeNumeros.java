package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class IdentificadorDeNumeros {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner programa = new Scanner(System.in);
		
		System.out.println("Programa para identificação de qual é o número maior: ");
		
		int num1, num2;
		
		System.out.println("Digite o primeiro número para ser comparado");
		
		num1 = programa.nextInt();
		
		System.out.println("Digite o segundo número para ser comparado");
		
		num2 = programa.nextInt();
		
		if(num1 > num2) {
			System.out.println("Primeiro número é maior! " + num1);
		}else if (num1 < num2) {
			System.out.println("Segundo número é maior! " + num2);
		}else if (num1 == num2) {
			System.out.println("Os numeros são iguais");
		}
	}

}
