package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class VerificadorDeNumerosIguais {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner programa = new Scanner(System.in);

		int num1, num2, num3;

		System.out.println("Programa Verificador de N�meros: ");

		System.out.println("Entre com o primeiro n�mero: ");
		num1 = programa.nextInt();

		System.out.println("Entre com o segundo n�mero: ");
		num2 = programa.nextInt();

		System.out.println("Entre com o terceiro n�mero: ");
		num3 = programa.nextInt();
		
		
		//Anti Moleque verificador de n�meros iguais
		if(num1 == num2) {
			System.out.println("O primeiro n�mero e o segundo s�o iguais!");
		}else if (num1 == num3) {
			System.out.println("O primeiro n�mero e o terceiro s�o iguais!");
		}else if(num2 == num3) {
			System.out.println("O segundo n�mero e igual o terceiro");
		}

		// Numero maior
		if (num1 > num2) {
			System.out.println("O primeiro n�mero � o maior! " + num1);

		} else if (num2 > num3) {
			System.out.println("O segundo n�mero � o maior! " + num2);

		} else {
			System.out.println("O terceiro n�mero � o maior:!" + num3);
		}
		// Numero menor
		if (num1 < num2) {
			System.out.println("O primeiro n�mero � menor! " + num1);
		} else if (num2 < num3) {
			System.out.println("O segundo n�mero � menor! " + num2);
		} else if (num3 >= num2 || num3 >= num1) {
			System.out.println("O terceiro n�mero � menor! " + num3);
		}

		System.out.println("Sistema ser� encerrado!");
	}

}
