package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num;

		System.out.println("Digite o primeiro número da série: ");
		num = input.nextInt();

		for (int i = 1, j = 1; i <= num; i++, j += 2) {
			System.out.print("S = " + i + "/" + j + " ");
		}
		if (num == num) {
			System.out.print(".");
		}

	}

}
