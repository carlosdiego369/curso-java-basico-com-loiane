package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio01_v2 {

	public static void main(String[] args) {

		Scanner programa = new Scanner(System.in);

		int num;

		do {
			System.out.println("Digite um n�mero: ");
			num = programa.nextInt();

			if (num > 10) {
				System.out.println("Este n�mero e inv�lido! Digite novamente.");

			} else {

				System.out.println("O valor digitado �: " + num);

			}
		} while (num > 10);
	}
}
