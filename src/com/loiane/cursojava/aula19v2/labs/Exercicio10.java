package com.loiane.cursojava.aula19v2.labs;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o " + (i + 1) + " º elemento do vetor A");
			vetorA[i] = input.nextInt();

			System.out.println("Digite o " + (i + 1) + " º elemento do vetor B");
			vetorB[i] = input.nextInt();
			
			vetorB[i] = vetorA[i] % 2;
		}

		System.out.print("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(" " + vetorA[i]);
		}
		System.out.println();
		System.out.print("Vetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(" " + vetorB[i]);
		}

	}

}
