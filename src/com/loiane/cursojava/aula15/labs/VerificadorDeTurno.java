package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class VerificadorDeTurno {

	public static void main(String[] args) {

		System.out.println("Programa de Verificação de turno");
		
		System.out.println("Digite o Turno no qual você estuda: M - Matutino ou V - Vespetino ou N - Noturno");
		
		@SuppressWarnings("resource")
		Scanner programa = new Scanner(System.in);
		
		String turno;
		
		turno = programa.nextLine();
		
		switch (turno) {
		case "M" : System.out.println("M - Matutino: Bom Dia!"); break;
		case "m" : System.out.println("M - Matutino: Bom Dia!"); break;
		case "matutino" : System.out.println("M - Matutino: Bom Dia!"); break;
		case "Matutino" : System.out.println("M - Matutino: Bom Dia!"); break;
		case "V" : System.out.println("V - Vesperino: Boa Tarde"); break;
		case "v" : System.out.println("V - Vesperino: Boa Tarde"); break;
		case "vespertino" : System.out.println("V - Vespertino: Boa Tarde"); break;
		case "Vespertino" : System.out.println("V - Vespertino: Boa Tarde"); break;
		case "N" : System.out.println("N - Noturno: Boa Noite"); break;
		case "n" : System.out.println("N - Noturno: Boa Noite"); break;
		case "noturno" : System.out.println("N - Noturno: Boa Noite"); break;
		case "Noturno" : System.out.println("N - Noturno: Boa Noite"); break;
		
		default: System.out.println("Valor Inválido!");
		}
		
		
		
	}

}
