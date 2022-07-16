package com.loiane.cursojava.aula20.labs;

import java.util.Random;

public class Exercicio01 {

	public static void main(String[] args) {

		int[][] valores = new int[4][4];
		int maior = 0, linha = 0, coluna = 0;

		Random numeroRandom = new Random();

		for (int i = 0; i < valores.length; i++) {
			for (int x = 0; x < valores[i].length; x++) {
				valores[i][x] = numeroRandom.nextInt(10);
			}
		}

		for (int i = 0; i < valores.length; i++) {
			for (int x = 0; x < valores[i].length; x++) {
				if (valores[i][x] > maior) {
					maior = valores[i][x];
					linha = i;
					coluna = x;
				}
			}
		}

		for (int i = 0; i < valores.length; i++) {
			for (int x = 0; x < valores[i].length; x++) {
				System.out.print(valores[i][x] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Número maior: " + maior);
		System.out.println("Linha: " + linha);
		System.out.println("Coluna: " + coluna);

	}

}
