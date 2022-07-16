package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class EntradasDeNumeros {

	public static void main(String[] args) {

		
		System.out.println("Entre com um numero:");
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		System.out.println("O numero digitado é: " + num);
		
		
		
		
	}

}
