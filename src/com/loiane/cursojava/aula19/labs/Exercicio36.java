package com.loiane.cursojava.aula19.labs;

public class Exercicio36 {

	public static void main(String[] args) {

		double[] vetorA = new double[11];

		for (int i = 0; i < vetorA.length; i++) {

			vetorA[i] = Math.pow(2, i);
		}
		System.out.print("Vetor A:");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(" " + vetorA[i]);
		}
	}
}
