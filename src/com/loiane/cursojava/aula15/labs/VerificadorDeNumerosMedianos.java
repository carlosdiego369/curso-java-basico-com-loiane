package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class VerificadorDeNumerosMedianos {

	public static void main(String[] args) {

		System.out.println("Programa N�meros Decrescentes: ");

		int num1, num2, num3;

		@SuppressWarnings("resource")
		Scanner programa = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		num1 = programa.nextInt();

		System.out.println("Digite o segundo valor: ");
		num2 = programa.nextInt();

		System.out.println("Digite o terceiro valor:");
		num3 = programa.nextInt();

		// Numero maior
		if (num1 > num2 && num1 > num3) {
			System.out.println("O primeiro n�mero � o maior! " + num1);

		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O segundo n�mero � o maior! " + num2);

		} else {
			System.out.println("O terceiro n�mero � o maior:!" + num3);

		}

		// Numero medio
		if (num1 < num2 && num1 > num3 || num1 > num2 && num1 < num3) {
			System.out.println("O mediano: " + num1);
		}else if(num2 < num1 && num2 > num3 || num2 > num1 && num2 < num3) {
			System.out.println("O mediano: " + num2);
		}else if(num3 < num1 && num3 > num2 || num3 > num1 && num3 < num2 ) {
			System.out.println("O mediano: " + num3);
		}

		// Numero menor
		if (num1 < num2) {
			System.out.println("O primeiro n�mero � menor! " + num1);
		} else if (num2 < num3) {
			System.out.println("O segundo n�mero � menor! " + num2);
		} else if (num3 >= num2 || num3 >= num1) {
			System.out.println("O terceiro n�mero � menor! " + num3);
		}
	}
}
