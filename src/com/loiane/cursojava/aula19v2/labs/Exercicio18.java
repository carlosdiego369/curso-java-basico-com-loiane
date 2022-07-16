package com.loiane.cursojava.aula19v2.labs;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] idades = new int[10];
		

		for (int i = 0; i < idades.length; i++) {
			System.out.println("Digite a " + (i + 1) + " ª idade");
			idades[i] = input.nextInt();
		}
		int idadeMenor = idades[0], vetorMenor = 0, idadeMaior = idades[0], vetorMaior = 0;
		for (int i = 1; i < idades.length; i++) {
			if (idades[i] > idadeMaior) {
				idadeMaior = idades[i];
				vetorMaior = i;
			} else if (idades[i] < idadeMenor) {
				idadeMenor = idades[i];
				vetorMenor = i;
			}
		}

		System.out.print("Idades: ");
		for (int i = 0; i < idades.length; i++) {
			System.out.print(" " + idades[i]);
		}
		System.out.println();
		System.out.println("Maior idade: " + idadeMaior);
		System.out.println("Posição do vetor do maior: " + vetorMaior);
		System.out.println("Menor idade: " + idadeMenor);
		System.out.println("Posição do vetor do menor: " + vetorMenor);
	}

}
