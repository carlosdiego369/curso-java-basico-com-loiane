package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

		int num;
		boolean primo = true; // flag de verificação
		
		Scanner chave = new Scanner(System.in);

		System.out.println("Digite um valor: ");
		num = chave.nextInt();

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("Não é primo!");
				primo = false;
			}
		}
		if (primo && num > 1) {
			System.out.println("Número é primo!");
		}else {
			System.out.println("Não é um número primo");
		}
	}
}