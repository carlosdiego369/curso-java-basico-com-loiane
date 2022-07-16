package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num;
		boolean primo = true;

		System.out.println("Digite um valor para verificar se é primo: ");
		num = input.nextInt();

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("Não é primo");
				primo = false;
			}

		}
		if (primo && num > 1) {
			System.out.println("É primo");
		}else {
			System.out.println("Não é primo");
		}
	}
}
