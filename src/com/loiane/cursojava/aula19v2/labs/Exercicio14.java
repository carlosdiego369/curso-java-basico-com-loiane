package com.loiane.cursojava.aula19v2.labs;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[10];
		int impares = 0, media = 0, soma = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o "+ (i + 1) + " º elemento do vetor");
			vetorA[i] = input.nextInt();
			
			if(vetorA[i] % 2 != 0) {
				impares++;
			}
			soma += vetorA[i];
			media = soma / impares;
		}

		System.out.print("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(" " + vetorA[i]);
		}
		System.out.println();
		System.out.println("Quantidade de impares: " + impares);
		System.out.println("Média: " + media);

	}


}
