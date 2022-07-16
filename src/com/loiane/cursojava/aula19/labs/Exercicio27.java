package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[4];
		char[] vetorB = new char[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = (int) Math.round(Math.random() * 12);

			if (vetorA[i] < 7) {
				vetorB[i] = 'a';
			} else if (vetorA[i] == 7) {
				vetorB[i] = 'A';
			} else if (vetorA[i] > 7 && vetorA[i] <= 10) {
				vetorB[i] = 'c';
			} else if (vetorA[i] == 10) {
				vetorB[i] = 'd';
			} else if (vetorA[i] > 10) {
				vetorB[i] = 'e';
			}
			System.out.println("Valor do vetor A: " + vetorA[i]);
			System.out.println("Valor do vetor B: " + vetorB[i]);
		}
	}
}
