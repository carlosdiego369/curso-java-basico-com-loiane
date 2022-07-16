package com.loiane.cursojava.aula19v2.labs;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[10];
		int soma = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o " + (i + 1) + " º elemento do vetor");
			vetorA[i] = input.nextInt();
			
			soma += vetorA[i];
		}

		System.out.print("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(" " + vetorA[i]);
		}
		System.out.println();
		System.out.println("Quantidade da soma: " + soma);

	}
}
