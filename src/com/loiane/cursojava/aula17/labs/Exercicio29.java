package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio29 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num;

		System.out.println("Digite um valor para montar uma lista do factorial");
		num = input.nextInt();

		for (int i = 2; i <= num; i++) {
			boolean primo = true;
			for (int x = 2; x < i; x++) {
				if (i % x == 0) {
					primo = false;
				}
			}
			if (primo && num > 1) {
				System.out.println(i);
			}
		}
	}
}
