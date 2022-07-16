package com.loiane.cursojava.aula19v2.labs;

import java.util.Scanner;

public class Exercicio37 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Fatorial do número: " + (i+1));
			vetorA[i] = input.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Fatorial do " + vetorA[i]);
			vetorB[i] = 1;
			for (int x = 1; x <= vetorA[i]; x++) {
				vetorB[i] *= x;
			}
		}

		System.out.print("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.print("Vetor B: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
	}
}
