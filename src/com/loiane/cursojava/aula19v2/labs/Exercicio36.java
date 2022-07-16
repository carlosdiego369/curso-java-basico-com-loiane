package com.loiane.cursojava.aula19v2.labs;

public class Exercicio36 {

	public static void main(String[] args) {

		double[] vetorA = new double[11];

		for (int i = 0; i < vetorA.length; i++) {

			vetorA[i] = Math.pow(2, i);
			System.out.print(vetorA[i] + " ");
		}
	}

}
