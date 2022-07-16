package com.loiane.cursojava.aula19v2.labs;

import java.util.Random;

public class Exercicio34 {

	public static void main(String[] args) {

		int[] vetorA = new int[10];

		Random random = new Random();
		int par = 0;
		System.out.print("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = random.nextInt(10);
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("VetorA : " + vetorA[i]);
			for (int x = 2; x <= vetorA[i]; x++) {
				if (x % 2 == 0) {
					System.out.println(x + " É par!");
				}
			}
			System.out.println();
		}
	}

}
