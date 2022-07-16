package com.loiane.cursojava.aula17v2.labs;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner programa = new Scanner(System.in);

		double nota = 0;
		boolean notaValida = false;


			do {
				
			System.out.println("Digite a nota! ");
			nota = programa.nextInt();
			
			if (nota >= 0 && nota <= 10) {
				notaValida = true;;
				System.out.println("Nota: " + nota);

			} else {
				System.out.println("Nota Inválida");
			}

		}while(!notaValida);
	}

}
