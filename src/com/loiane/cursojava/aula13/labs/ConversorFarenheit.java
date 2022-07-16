package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class ConversorFarenheit {

	public static void main(String[] args) {

		System.out.println("**** Sistema de Convers�o Farenheit para Graus Celsius ****");
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int farenheit;
		int conversor;
		
		System.out.println("Digite o valor em Farenheit para ser convertido: ");
		
		farenheit = scan.nextInt();
		
		conversor = (farenheit - 32) * 5/9;
		
		
		System.out.println("A convers�o foi realizada par graus Celsios: " + conversor + " �C");
		
		
		
	}

}
