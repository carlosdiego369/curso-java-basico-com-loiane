package com.loiane.cursojava.aula19v2.labs;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length * 2];

		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o " + (i + 1) + "º valor: ");
			vetorA[i] = input.nextInt();
			
			if(vetorA[i] % 2 == 0) {
				vetorB[i] = vetorA[i];
			}else {
				vetorB[(vetorB.length / 2) + i] = vetorA[i];
			}
		}
		
		System.out.print("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(" " + vetorA[i]);
		}
		System.out.println();
		System.out.print("Vetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			if(vetorB[i]!= 0) {
			System.out.print(" " + vetorB[i]);
			}
		}
	}

}
