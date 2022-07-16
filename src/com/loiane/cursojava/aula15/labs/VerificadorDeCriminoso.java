package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class VerificadorDeCriminoso {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner programa = new Scanner(System.in);

		String pgt1, pgt2, pgt3, pgt4, pgt5;
		int resposta = 0;
		System.out.println("Departamento de Policia do Estado de Minas Gerais");
		System.out
				.println("Voc� ser� interrogado(a)! Ocorreu um crime na cidade e o delegado est� atr�s do criminoso!");

		System.out.println("Voc� telefonou para v�tima? Sim ou N�o");
		pgt1 = programa.nextLine();
		if (pgt1.equalsIgnoreCase("Sim")) {
			resposta++;
		}
		System.out.println("Esteve no local do crime? Sim ou N�o");
		pgt2 = programa.nextLine();
		if (pgt2.equalsIgnoreCase("Sim")) {
			resposta++;
		}

		System.out.println("Mora perto da v�tima? Sim ou N�o");
		pgt3 = programa.nextLine();

		if (pgt3.equalsIgnoreCase("Sim")) {
			resposta++;
		}

		System.out.println("Devia para a v�tima? Sim ou N�o");
		pgt4 = programa.nextLine();
		if (pgt4.equalsIgnoreCase("Sim")) {
			resposta++;
		}

		System.out.println("J� trabalhou com a v�tima? Sim ou N�o");
		pgt5 = programa.nextLine();
		if (pgt5.equalsIgnoreCase("Sim")) {
			resposta++;
		}

		// Julgamento
		if (resposta == 2) {
			System.out.println(
					"Voc� foi classificado(a) como suspeito(a), n�o poder� sair da delegacia, tem direito de chamar um advogado!");
			
		} else if (resposta >= 3 && resposta <= 4) {
			System.out.println(
					"Voc� foi classificado(a) como c�mplice, estar� sendo detido para mais investiga��es, tem direito de chamar um advogado!");
			
		} else if (resposta >= 5) {
			System.out.println(
					"Voc� foi classificado(a) como assassino(a), estar� sendo detido para mais investiga��es, tem direito de chamar um advogado!");
			
		} else {
			System.out.println("Voc� foi classificado(a) como inocente, est� liberado(a)!");
			
		}

	}
}
