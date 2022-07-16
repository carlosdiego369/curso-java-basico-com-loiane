package com.loiane.cursojava.aula20.labs;

import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio02 {

	public static void main(String[] args) {

		Random random = new Random();

		int[][] matrizM = new int[10][10];

		int maior = 0, linhaMaior = 0, colunaMaior = 0, menor = 11, linhaMenor = 0, colunaMenor = 0;

		for (int i = 0; i < matrizM.length; i++) {
			for (int j = 0; j < matrizM[i].length; j++) {
				matrizM[i][j] = random.nextInt(10);
			}
		}

		for (int i = 0; i < matrizM.length; i++) {
			for (int j = 0; j < matrizM[i].length; j++) {
				if (matrizM[i][j] > maior) {
					maior = matrizM[i][j];
					linhaMaior = i;
					colunaMaior = j;
				}
				if (matrizM[i][j] < menor) {
					menor = matrizM[i][j];
					linhaMenor = i;
					colunaMenor = j;
				}
			}
		}

		System.out.println("Matriz M");
		for (int i = 0; i < matrizM.length; i++) {
			for (int j = 0; j < matrizM[i].length; j++) {
				System.out.print(matrizM[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		DecimalFormat df = new DecimalFormat("00");
		
		System.out.println("Vetor Maior: " + df.format(maior));
		System.out.println("Linha do Maior: " + df.format(linhaMaior));
		System.out.println("Coluna do Maior: " + df.format(colunaMaior));
		System.out.println();
		System.out.println("Vetor Menor: " + df.format(menor));
		System.out.println("Linha do Menor: " + df.format(linhaMenor));
		System.out.println("Coluna do Menor: " + df.format(colunaMenor));
	}

}
