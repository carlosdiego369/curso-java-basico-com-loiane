package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class VerificadorDeLetras {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner programa = new Scanner(System.in);
		
		System.out.println("Programa para idenificar se a letra digita é vogal ou consoante");
		
		String entrada;
		
		System.out.println("Digite a letra para ser verificada");
		
		entrada = programa.nextLine();
		
		switch (entrada) {
		case "A", "a", "E", "e", "I", "i", "O", "o", "U", "u" : System.out.println("A letrada digitada é uma vogal! " + entrada); break;

		default: System.out.println("A letra é uma consoante!");
			
		}
		
		
	}

}
