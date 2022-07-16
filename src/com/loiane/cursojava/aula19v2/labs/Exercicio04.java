package com.loiane.cursojava.aula19v2.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int [] vetorA = new int[15];
		double [] vetorB = new double[vetorA.length];
		
		for(int i = 0; i < vetorA.length ; i++) {
			System.out.println("Digite o " + (i+1) +" º elemento do vetor");
			vetorA[i] = input.nextInt();
			
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		
		System.out.print("Vetor A: ");
		for(int i = 0; i < vetorA.length ; i++) {
			System.out.print(" " + vetorA[i]);
			
		}
		
		System.out.println();
		System.out.print("Vetor B: ");
		for(int i = 0; i < vetorB.length ; i++) {
			System.out.print(" " + new DecimalFormat("###,###.###").format(vetorB[i]));
			
		}
	}

}
