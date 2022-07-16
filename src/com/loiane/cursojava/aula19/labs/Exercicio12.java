package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o elemento " + i + " do vetor A");
			vetorA[i] = input.nextInt();

			vetorB[0] += vetorA[i];
		}

		System.out.print("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.println("A soma dos vetores: " + vetorB[0]);
	}

}
