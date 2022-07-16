package com.loiane.cursojava.aula17v2.labs;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num, idade, soma = 0, media;

		System.out.println("Entre com um número de pessoas: ");
		num = input.nextInt();

		for (int i = 0; i < num; i++) {

			System.out.println("Entre com a primeira idade " + (i + 1));
			idade = input.nextInt();
			soma += idade;
		}
		media = soma / num;

		System.out.println("Soma: " + soma);
		System.out.println("Soma: " + media);

	}
}
