package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o elemento " + i + " do vetor A");
			vetorA[i] = input.nextInt();

			System.out.println("Digite o elemento " + i + " vo vetor B");
			vetorB[i] = input.nextInt();

			vetorC[i] = vetorA[i] * vetorB[i];
		}

		System.out.print("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.print("Vetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
		System.out.print("Vetor C: ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
	}
}
