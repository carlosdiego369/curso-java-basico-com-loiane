package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {

		
		int[] vetorA = new int [4];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o " + (i+1) + " º Número: ");
			vetorA[i] = (int)Math.round(Math.random()*10);
			System.out.println("Número randomico: " + vetorA[i]);
		}
		System.out.println();

		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Analisando o numero do vetor: " + vetorA[i]);
			
			for(int x = 1; x < vetorA[i]; x++) {
				if(vetorA[i] % x == 0) {
					System.out.println(x + " É divisor!");
				}
			}
			System.out.println();
		}
	}

}
