package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[10];
		boolean palindromo = true;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o " + (i + 1) + "º valor: ");
			vetorA[i] = input.nextInt();
		}

		for (int i = 0; i < vetorA.length / 2; i++) {
			if (vetorA[i] != vetorA[vetorA.length - 1 - i]) {
				palindromo = false;
				break;
			}
		}

		System.out.print("Verificado de Palindromo: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		if (palindromo) {
			System.out.println("É um número palindromo");
		} else {
			System.out.println("Não é palindromo");
		}

	}

}
