package com.loiane.cursojava.aula20.labs;

import java.util.Random;

public class Exercicio03 {

	public static void main(String[] args) {

		int[][] matrizM = new int[3][3];

		Random random = new Random();
		int qtdPar = 0, qtdImpar = 0, neutro = 0;

		for (int i = 0; i < matrizM.length; i++) {
			for (int j = 0; j < matrizM[i].length; j++) {
				matrizM[i][j] = random.nextInt(10);
			}
		}
		for (int i = 0; i < matrizM.length; i++) {
			for (int j = 0; j < matrizM[i].length; j++) {
				if (matrizM[i][j] == 0) {
					neutro++;
				} else if (matrizM[i][j] % 2 == 0) {
					qtdPar++;
				} else {
					qtdImpar++;
				}
			}
		}

		for (int i = 0; i < matrizM.length; i++) {
			for (int j = 0; j < matrizM[i].length; j++) {
				System.out.print(matrizM[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Quantidade de pares: " + qtdPar);
		System.out.println("Quantidade de impares: " + qtdImpar);
		System.out.println("Quantidade de Neutros(0): " + neutro);
	}

}
