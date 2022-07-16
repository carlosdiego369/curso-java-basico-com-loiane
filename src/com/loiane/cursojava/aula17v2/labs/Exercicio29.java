package com.loiane.cursojava.aula17v2.labs;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {

		int num;

		Scanner chave = new Scanner(System.in);

		System.out.println("Digite um valor para montar a lista factorial: ");
		num = chave.nextInt();

		for (int i = 2; i <= num; i++) {

			boolean primo = true;

			for (int x = 2; x < i; x++) {
				if (i % x == 0) {
					primo = false;
				}
			}
			if (primo && num > 1) {
				System.out.println(i);
			}
		}
	}
}
