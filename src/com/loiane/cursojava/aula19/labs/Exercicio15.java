package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[5];
		int par = 0, impar = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o elemento " + i + " do vetor A");
			vetorA[i] = input.nextInt();

			if (vetorA[i] % 2 == 0) {
				par++;
			}else {
				impar++;
			}
		}

		System.out.print("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.println("Quantidade de vetores pares: " + par);
		par = (par * 100) / vetorA.length;
		System.out.println("Percentual de pares: " + par);
		
		System.out.println("Quantidade de vetores impares: " + impar);
		impar = (impar * 100) / vetorA.length;
		System.out.println("Percentual de impares: " + impar);
	}
}
