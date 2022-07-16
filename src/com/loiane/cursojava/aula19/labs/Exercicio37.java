package com.loiane.cursojava.aula19.labs;

public class Exercicio37 {

	public static void main(String[] args) {

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = (int) Math.round(Math.random() * 10);
			System.out.println("Números randomicos: " + vetorA[i]);
			
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
