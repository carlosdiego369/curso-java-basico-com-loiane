package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

		int num;
		boolean primo = true; // flag de verifica��o
		
		Scanner chave = new Scanner(System.in);

		System.out.println("Digite um valor: ");
		num = chave.nextInt();

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("N�o � primo!");
				primo = false;
			}
		}
		if (primo && num > 1) {
			System.out.println("N�mero � primo!");
		}else {
			System.out.println("N�o � um n�mero primo");
		}
	}
}