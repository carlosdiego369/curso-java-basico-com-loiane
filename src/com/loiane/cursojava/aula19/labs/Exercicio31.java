package com.loiane.cursojava.aula19.labs;

import java.util.Random;

public class Exercicio31 {

	public static void main(String[] args) {

		Random random = new Random();

		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];
		int posB = 0, par = 0, impar = 0;

		System.out.print("Valor do elemento: ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = random.nextInt(21);
			System.out.print(vetorA[i] + " ");

			if (vetorA[i] % 2 == 0) {
				vetorB[posB] = vetorA[i];
				posB++;
				par++;
			}
		}
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 != 0) {
				vetorB[posB] = vetorA[i];
				posB++;
				impar++;
			}
		}
		System.out.println();
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
		
		System.out.println("Quantidade de pares: " + par);
		System.out.println("Quantidade de impares: " + impar);
	}
}
