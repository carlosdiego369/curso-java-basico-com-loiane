package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[10];
		int idade = 0;

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Digite " + (i + 1) + " ª idade: ");
			vetorA[i] = input.nextInt();

			if (vetorA[i] > 35) {
				idade++;
			}

		}
		System.out.print("Idades correspondentes: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.println(idade + " Pessoas são acima de 35 anos");
	}

}
