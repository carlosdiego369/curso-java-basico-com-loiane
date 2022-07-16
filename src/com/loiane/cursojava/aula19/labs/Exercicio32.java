package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[5];


		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o " + (i + 1) + "º valor: ");
			vetorA[i] = input.nextInt();
		}
		
		
		for (int i = 0; i <= 10; i++) {
			
			System.out.println("Tabuada: " + vetorA[i]);
			
			for(int j = 1; j<= 10; j++) {
			System.out.println(j + " * " + vetorA[i] + " = " + (vetorA[i] * j));
			}
			System.out.println();
		}
	}

}
