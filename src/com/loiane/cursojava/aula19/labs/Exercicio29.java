package com.loiane.cursojava.aula19.labs;

public class Exercicio29 {

	public static void main(String[] args) {

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length * 2];

		for (int i = 1; i < vetorA.length; i++) {
			vetorA[i] = (int) Math.round(Math.random() * 10);

			vetorC[i] += vetorA[i];
		}
		
		for (int i = 1; i < vetorA.length; i++) {
			vetorB[i] = (int) Math.round(Math.random() * 10);

			vetorC[10 + i] += vetorB[i];
		}
		
		System.out.println("Valores do Vetor C: ");
		
		for (int i = 0; i < vetorA.length * 2 ; i++) {
			System.out.println("Posição: " + (i + 1) + " " + vetorC[i] + " ");
		}
	}

}
