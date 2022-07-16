package com.loiane.cursojava.aula19v2.labs;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[10];
		int percentualZero = 0, percentualUm = 0;

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = (int) Math.round(Math.random() * 1);
		}

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i]);
			if (vetorA[i] == 0) {
				percentualZero++;
			} else {
				percentualUm++;
			}
		}
		percentualZero = percentualZero * 100 / vetorA.length;
		percentualUm = percentualUm * 100 / vetorA.length;
		System.out.println("Percentual de 0: " + percentualZero + "%");
		
		System.out.println("Percentual de 1: " + percentualUm + "%");
	}

}
