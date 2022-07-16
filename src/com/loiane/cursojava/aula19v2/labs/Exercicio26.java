package com.loiane.cursojava.aula19v2.labs;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o " + (i + 1) + "º valor de A: ");
			vetorA[i] = input.nextInt();
			
			System.out.println("Entre com o " + (i + 1) + "º valor de B: ");
			vetorB[i] = input.nextInt();
			
			if(vetorA[i] > vetorB[i]) {
				vetorC[i] = 1;
			}else if(vetorA[i] == vetorB[i]) {
				vetorC[i] = 0;
			}else if(vetorA[i] < vetorB[i]) {
				vetorC[i] = -1;
			}
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
		System.out.println();
		System.out.print("Vetor C: ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(" " + vetorC[i]);
		}
	}


}
