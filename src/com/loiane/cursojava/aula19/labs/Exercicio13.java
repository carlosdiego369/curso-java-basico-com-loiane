package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[10];
		int soma = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o elemento " + i + " do vetor A");
			vetorA[i] = input.nextInt();
			if (vetorA[i] % 5 == 0) {
			soma += vetorA[i];
			}
		}

		System.out.print("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.println("A soma dos vetores: " + soma);
		
			System.out.println("� um n�mero m�ltiplo de 5");
		}
	}


