package com.loiane.cursojava.aula17v2.labs;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {

		Scanner chave = new Scanner(System.in);

		int num;

		System.out.println("Digite um numero para factoriar: ");
		num = chave.nextInt();

		for (int fat = 1; num > 1; num--) {

			fat *= num;
			System.out.println(fat);
		}

	}

}
