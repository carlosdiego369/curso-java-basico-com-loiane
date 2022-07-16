package com.loiane.cursojava.aula19v2.labs;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int [] vetorA = new int [5];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o " + ( i + 1) + "º valor: ");
			vetorA[i] = input.nextInt();
		}
		
		for(int i = 0;i < vetorA.length; i++) {
			
			System.out.println("Tabuada do : " + vetorA[i]);
			
			for(int x = 1; x <= 10; x++) {
				System.out.println(vetorA[i] + " * " + x + " = " + (vetorA[i] * x));
			}
			
			System.out.println();
		}
		
	}

}
