package com.loiane.cursojava.aula17v2.labs;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num;
		
		boolean primo = true;

		System.out.println("Entre com um n�mero: ");
		num = input.nextInt();

		for (int i = 2; i < num; i++) {
			if(num % i == 0) {
				System.out.println("N�o � primo - divis�vel por! " + i);
				primo = false;
			}
			
		}
		if(primo && num > 1) {
			System.out.println("� n�mero primo!");
		}else {
			System.out.println("N�o � primo");
		}
	}

}
