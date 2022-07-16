package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio01_v2 {

	public static void main(String[] args) {

		Scanner programa = new Scanner(System.in);

		int num;

		do {
			System.out.println("Digite um número: ");
			num = programa.nextInt();

			if (num > 10) {
				System.out.println("Este número e inválido! Digite novamente.");

			} else {

				System.out.println("O valor digitado é: " + num);

			}
		} while (num > 10);
	}
}
