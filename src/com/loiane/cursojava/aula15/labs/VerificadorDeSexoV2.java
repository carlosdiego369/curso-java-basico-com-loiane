package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;
public class VerificadorDeSexoV2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner programa = new Scanner(System.in);
		
		System.out.println("Programa de verificação do sexo: ");
		
		
		System.out.println("Digite o seu sexo M ou F");
		
		String entrada = programa.next();
		
		if (entrada.equalsIgnoreCase("M")) {
			System.out.println("Masculino");
		}
		else if(entrada.equalsIgnoreCase("F")){
			System.out.println("Feminino");
		}
		
		else {
			
			System.out.println("Caracter inválido");
		}
		
		
		
	}

}