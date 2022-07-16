package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class SomaDeNumeros {

	public static void main(String[] args) {

		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número");
		
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo número");
		
		int num2 = scan.nextInt();
		
		
		
		
		
		System.out.println("A soma dos dos numeros é: " + (num1+num2));
		
	}

}
