package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner programa = new Scanner(System.in);
		
		boolean validador = false;
		
		do {
		
		System.out.println("Entre com um valor entre 0-10");
		
		double num = programa.nextDouble();
		
		
		
		if(num >= 0 && num <= 10) {
			validador = true;
			System.out.println("Você digitou: " + num);
			
		}else {
			System.out.println("Valor Inválido, digite novamente.");
		}
		
		
		}while(!validador);
	}
}
	

