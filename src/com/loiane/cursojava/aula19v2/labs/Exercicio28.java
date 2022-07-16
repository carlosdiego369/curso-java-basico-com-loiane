package com.loiane.cursojava.aula19v2.labs;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[4];
		int[] vetorB = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o " + (i + 1) + "º valor: ");
			vetorA[i] = input.nextInt();
			
			vetorB[vetorA.length -i -1] = vetorA[i];
		}

		System.out.print("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(" " + vetorA[i]);
		}
		System.out.println();
		System.out.print("Vetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(" " + vetorB[i]);
		}
	}

}
