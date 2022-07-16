package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num;

		System.out.println("Digite o valor do H para verificar N Termos");
		num = input.nextInt();
		System.out.print("H = 1 ");
		for (int i = 1, j = 1; j <= num; j++) {
			System.out.print("+ " + i + "/" + j + " ");
		}
	}

}
