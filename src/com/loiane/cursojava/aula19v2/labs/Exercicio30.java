package com.loiane.cursojava.aula19v2.labs;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o " + (i + 1) + "? valor: ");
			vetorA[i] = input.nextInt();

			if (vetorA[i] % 2 == 0) {
				vetorB[i] = vetorA[i];
			} else {
				vetorC[i] = vetorA[i];
			}
		}

		System.out.print("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(" " + vetorA[i]);
		}
		System.out.println();
		System.out.print("Vetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			if(vetorB[i]!= 0) {
			System.out.print(" " + vetorB[i]);
			}
		}
		System.out.println();
		System.out.print("Vetor C: ");
		for (int i = 0; i < vetorC.length; i++) {
			if(vetorB[i]== 0) {
			System.out.print(" " + vetorC[i]);
			}
		}

	}

}
