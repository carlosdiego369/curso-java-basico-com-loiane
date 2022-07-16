package com.loiane.cursojava.aula19v2.labs;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[4];
		boolean primo;
		String msg;
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o número do elemento: ");
			vetorA[i] = input.nextInt();
		}

		for(int i = 0; i < vetorA.length; i++) {
			primo = true;
			for(int x = 2; x < vetorA[i]; x++) {
				if(vetorA[i] % x == 0) {
					primo = false;
					break;
				}
			}
			
			if(vetorA[i] == 1) {
				msg = " Não é primo!";
			}else if(primo) {
				msg = " Primo!";
			}else {
				msg = " Não é primo!";
			}
			
			System.out.println(vetorA[i] + msg);
		}
	}
}
