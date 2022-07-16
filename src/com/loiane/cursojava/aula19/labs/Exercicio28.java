package com.loiane.cursojava.aula19.labs;

public class Exercicio28 {

	public static void main(String[] args) {

		int[] vetorA = new int[4];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {

			vetorA[i] = (int) Math.round(Math.random() * 10);
			vetorB[i] = (int) Math.round(Math.random() * 10);

			System.out.println("Valor do " + (i + 1) + "º Vetor A: " + vetorA[i]);
			System.out.println("Valor do " + (i + 1) + "º Vetor B: " + vetorB[i]);
			System.out.println();

		}

		
		for (int i = 0, j = 1; i < vetorA.length; i++, j++) {
			
			vetorB[vetorA.length -j] = vetorA[i];
			System.out.println("Alternação do " + (i + 1) + "º Vetor A para o " + vetorB.length + " º Vetor B: " + vetorB[vetorB.length -j]);
			System.out.println();
			
		}
	}

}
