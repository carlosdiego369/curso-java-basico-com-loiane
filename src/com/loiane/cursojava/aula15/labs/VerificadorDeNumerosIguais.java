package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class VerificadorDeNumerosIguais {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner programa = new Scanner(System.in);

		int num1, num2, num3;

		System.out.println("Programa Verificador de Números: ");

		System.out.println("Entre com o primeiro número: ");
		num1 = programa.nextInt();

		System.out.println("Entre com o segundo número: ");
		num2 = programa.nextInt();

		System.out.println("Entre com o terceiro número: ");
		num3 = programa.nextInt();
		
		
		//Anti Moleque verificador de números iguais
		if(num1 == num2) {
			System.out.println("O primeiro número e o segundo são iguais!");
		}else if (num1 == num3) {
			System.out.println("O primeiro número e o terceiro são iguais!");
		}else if(num2 == num3) {
			System.out.println("O segundo número e igual o terceiro");
		}

		// Numero maior
		if (num1 > num2) {
			System.out.println("O primeiro número é o maior! " + num1);

		} else if (num2 > num3) {
			System.out.println("O segundo número é o maior! " + num2);

		} else {
			System.out.println("O terceiro número é o maior:!" + num3);
		}
		// Numero menor
		if (num1 < num2) {
			System.out.println("O primeiro número é menor! " + num1);
		} else if (num2 < num3) {
			System.out.println("O segundo número é menor! " + num2);
		} else if (num3 >= num2 || num3 >= num1) {
			System.out.println("O terceiro número é menor! " + num3);
		}

		System.out.println("Sistema será encerrado!");
	}

}
