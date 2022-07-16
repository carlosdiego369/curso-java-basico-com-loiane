package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];

		for (int i = 0; i < vetorA.length; i++) {

			vetorA[i] = (int) Math.round(Math.random() * 10);
			vetorB[i] = (int) Math.round(Math.random() * 10);

			if (vetorA[i] > vetorB[i]) {
				vetorC[i] = 1;
			} else if (vetorA[i] == vetorB[i]) {
				vetorC[i] = 0;
			} else if (vetorA[i] < vetorB[i]) {
				vetorC[i] = -1;
			}

			System.out.println("Valor do vetor A: " + vetorA[i]);
			System.out.println("Valor do vetor B: " + vetorB[i]);
			System.out.println("Valor do vetor C: " + vetorC[i]);
		}

	}

}
