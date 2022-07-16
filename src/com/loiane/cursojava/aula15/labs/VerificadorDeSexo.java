package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class VerificadorDeSexo {

	public static void main(String[] args) {
		
		System.out.println("Programa de verificação do sexo: ");

		
		@SuppressWarnings("resource")
		Scanner programa = new Scanner(System.in);
		
		String entrada;
		
		System.out.println("Digite a inicial do seu sexo para ser identificado: Ex.: M ou F");
		entrada = programa.nextLine();
		
		switch (entrada) {
		case "M" : System.out.println("Masculino" + entrada); break;
		case "F" : System.out.println("Feminino" + entrada); break;
			
		
		default: System.out.println("Sexo Inválido!");
		}
			}
		
}


