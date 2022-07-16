package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class VerificadorDiaSemana {

	public static void main(String[] args) {

		System.out.println("Entre com o um número para saber o dia da semana");
		@SuppressWarnings("resource")
		Scanner programa = new Scanner(System.in);
		
		int diaDaSemana = programa.nextInt() ;
		
				
		switch (diaDaSemana) {
		case 1: System.out.println("1 - Domingo"); break;
		case 2: System.out.println("2 - Segunda"); break;
		case 3: System.out.println("3 - Terça"); break;
		case 4: System.out.println("4 - Quarta"); break;
		case 5: System.out.println("5 - Quinta"); break;
		case 6: System.out.println("6 - Sexta"); break;
		case 7: System.out.println("7 - Sábado"); break;
		
		default: System.out.println("Valor Inválido! ");
		
		}
		
	}

}
