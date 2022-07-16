package com.loiane.cursojava.aula19v2.labs;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] idades = new int[10];
		int idadeSuperior = 0;

		for (int i = 0; i < idades.length; i++) {
			System.out.println("Digite o " + (i + 1) + " º elemento do vetor");
			idades[i] = input.nextInt();

			if (idades[i] > 35) {
				idadeSuperior++;
			}

		}

		System.out.print("Idades respectivas do grupo: ");
		for (int i = 0; i < idades.length; i++) {
			System.out.print(" " + idades[i]);
		}
		System.out.println();
		System.out.println("Soma das das pessoas que tem a idade superior a 35: " + idadeSuperior);

	}

}
