package com.loiane.cursojava.aula19v2.labs;

import java.util.Random;
import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		Random random = new Random();

		int[] vetorA = new int[10];
		int somaMaior = 0, qtdMaior15 = 0, qtdMenor15 = 0, qtdIgual15 = 0;

		System.out.print("Números: ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = random.nextInt(100);
			System.out.print(vetorA[i] + " ");

			if (vetorA[i] == 15) {
				qtdIgual15++;
			} else if (vetorA[i] < 15) {
				qtdMenor15 += vetorA[i];
			} else {
				somaMaior += vetorA[i];
				qtdMaior15++;
			}
		}
		System.out.println();
		System.out.println("Vetor A: ");
		System.out.println("Soma dos valores igual a: " + qtdIgual15);
		System.out.println("Soma dos valores menor que 15: " + qtdMenor15);
		System.out.println("Soma dos valores maior que 15: " + somaMaior);
		System.out.println("Media: " + (somaMaior / qtdMaior15));
	}

}
