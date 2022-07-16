package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio18v2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] idades = new int[5];

		for (int i = 0; i < idades.length; i++) {

			System.out.println("Digite " + (i + 1) + " ª idade: ");
			idades[i] = input.nextInt();
		}

		int idadeMin = idades[0], vetorMin = 0, idadeMax = idades[0], vetorMax = 0;

		for (int i = 1; i < idades.length; i++) {
			if (idades[i] < idadeMin) {
				idadeMin = idades[i];
				vetorMin = i;
			}else if(idades[i] > idadeMax) {
				idadeMax = idades[i];
				vetorMax = i;
			}
		}

		System.out.print("Idades correspondentes: ");
		for (int i = 0; i < idades.length; i++) {
			System.out.print(idades[i] + " ");
		}
		System.out.println();
		System.out.println("A maior idade é: " + idadeMax);
		System.out.println("A menor idade é: " + idadeMin);
	}

}
