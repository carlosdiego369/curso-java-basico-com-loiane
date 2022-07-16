package com.loiane.cursojava.aula19v2.labs;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[10];
		int pares = 0, impares = 0, mediaImpar = 0, mediaPar = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o " + (i + 1) + " º elemento do vetor");
			vetorA[i] = input.nextInt();

			if (vetorA[i] % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}

		System.out.print("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(" " + vetorA[i]);
		}

		mediaPar = (pares * 100) / vetorA.length;
		mediaImpar = (impares * 100) / vetorA.length;

		System.out.println();
		System.out.println("Quantidade de pares: " + pares);
		System.out.println("Porcentual de pares: " + mediaPar +"%");
		System.out.println("Quantidade de pares: " + impares);
		System.out.println("Porcentual de pares: " + mediaImpar+"%");

	}

}
