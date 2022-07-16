package com.loiane.cursojava.aula19v2.labs;

import java.util.Random;

public class Exercicio35 {

	public static void main(String[] args) {

		Random random = new Random();
		int[] vetorA = new int [10];;
		
		System.out.print("VetorA");
		for(int i = 0;i < vetorA.length;i++) {
			vetorA[i] = random.nextInt(10);
			
			System.out.print(" " + vetorA[i]);
		}
		System.out.println();
		
		for(int i = 0; i < vetorA.length; i++) {
			
			for(int x = 1; x < vetorA[i]; x++) {
				if(vetorA[i] % x == 0) {
					System.out.println(vetorA[i] + " É divisor!");
				}
			}
		}
		
		
	}

}
