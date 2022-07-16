package com.loiane.cursojava.aula19v2.labs;

public class Exercicio23 {

	public static void main(String[] args) {

		int[] vetorA = new int[10];
		boolean verificador = true;

		System.out.println("Gerador de números randomicos");
		do {

			for (int i = 0; i < vetorA.length; i++) {

				vetorA[i] = (int) Math.round(Math.random() * 100);
				System.out.println(vetorA[i]);
			}

			for (int i = 0; i < vetorA.length; i++) {
				if (vetorA[i] % 2 == 0) {
					verificador = true;
				} else {
					verificador = false;
					System.out.println("Sequencia Inválida");
					break;
				}

			}
		} while (!verificador);

	}

}
