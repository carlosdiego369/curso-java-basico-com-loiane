package com.loiane.cursojava.aula19.labs;

public class Exercicio34 {

	public static void main(String[] args) {

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = (int) Math.round(Math.random() * 10);
			System.out.println("N�mero randomico: " + vetorA[i]);
		}

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Analizando o n�mero " + vetorA[i]);
			for (int j = 2; j < vetorA[i]; j++) {
				if (j % 2 == 0) {
					System.out.println(j + " � par");
				}
			}
			System.out.println();
		}
	}

}
