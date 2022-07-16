package com.loiane.cursojava.aula17v2.labs;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner programa = new Scanner(System.in);

		int num = 0, maior = Integer.MIN_VALUE;

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um número");
			num = programa.nextInt();

			if (num > maior) {
				maior = num;
				System.out.println("O número maior agora é: " + num);
			}
		}

		System.out.println("O maior número digitado foi: " + maior);
	}

}
