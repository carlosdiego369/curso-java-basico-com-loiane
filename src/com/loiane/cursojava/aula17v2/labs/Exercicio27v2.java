package com.loiane.cursojava.aula17v2.labs;

import java.util.Scanner;

public class Exercicio27v2 {

	public static void main(String[] args) {
		Scanner chave = new Scanner(System.in);
		int i = 1, qtdGraus = i;
		double min, max, graus, media;
		String fechar = null;

		System.out.println("Digite um n�mero: ");
		graus = chave.nextDouble();
		min = max = graus;

		while (i > 0) {
			
			System.out.println("Deseja inserir mais alguma temperatura? (Sim ou N�o)");
			fechar = chave.next();
		
			if (fechar.equalsIgnoreCase("Sim")) {
			System.out.println("Digite um n�mero: ");
			graus = chave.nextDouble();

			if (i != 0) {
				if (graus > max) {
					max = graus;
				} else if (graus < min) {
					min = graus;
				}
			}
			i++;
		}else {

			fechar.equalsIgnoreCase("N�o");

			media = graus / qtdGraus;

			System.out.println("Temperatura M�xima: " + max);
			System.out.println("Temperatura M�nima: " + min);
			System.out.println("M�dia de temperatura: " + media);

			i = 0;
		}
		}
	}
}