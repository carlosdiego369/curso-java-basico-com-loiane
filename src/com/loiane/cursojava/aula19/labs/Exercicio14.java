package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[10];
		

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o elemento " + i + " do vetor A");
			vetorA[i] = input.nextInt();
		}
		
		int impar = 0, soma = 0;
		System.out.print("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			if( vetorA[i] % 2 != 0) {
				soma += vetorA[i];
				impar++;
			}
		}
		
		System.out.print("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.println("Soma " + soma);
		System.out.println("Média dos vetores impares: " + (soma / impar));
	}
}
