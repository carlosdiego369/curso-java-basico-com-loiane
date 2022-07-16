package com.loiane.cursojava.aula19.labs;

import java.util.Random;

public class Exercicio22 {

	public static void main(String[] args) {

		int [] vetorA = new int [10];
		int x = 0, y = 0;
		
		Random random = new Random();
		
		for(int i = 0; i < vetorA.length; i++) {
			
			vetorA[i] = random.nextInt(2);
			if(vetorA[i] == 0) {
				x++; 
			}else {
				y++;
			}
			
		}
		System.out.print("Vetor A: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Quantidades de 0: " + x);
		System.out.println("Quantidades de 1: " + y);
		
		x = x * 100 / vetorA.length;
		y = y * 100 / vetorA.length;
		
		System.out.println("Porcentual de 0: " + x + "%");
		System.out.println("Porcentual de 1: " + y + "%");
		
	}

}
