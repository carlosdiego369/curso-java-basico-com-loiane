package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[5];
		boolean primo;
		String msg;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o " + (i + 1) + "� valor: ");
			vetorA[i] = input.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			primo = true;
			for (int x = 2; x < vetorA[i]; x++) {
				if (vetorA[i] % x == 0) {
					primo = false;
					break;
				}
			}

			if (vetorA[i] == 0) {
				msg = " N�o � primo";
			} else if (vetorA[i] == 1) {
				msg = " N�o � primo";
			} else if (primo) {
				msg = " � primo!";
			} else {
				msg = " N�o � primo";
			}

			System.out.println(vetorA[i] + msg);

		}
	}

}
