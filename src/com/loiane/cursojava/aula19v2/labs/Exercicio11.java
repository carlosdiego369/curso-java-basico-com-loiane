package com.loiane.cursojava.aula19v2.labs;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[10];
		int pares = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o "+ (i + 1) + " � elemento do vetor");
			vetorA[i] = input.nextInt();
			
			if(vetorA[i] % 2 == 0) {
				pares++;
			}
		}

		System.out.print("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(" " + vetorA[i]);
		}
		System.out.println();
		System.out.println("Quantidade de pares: " + pares);

	}

}
