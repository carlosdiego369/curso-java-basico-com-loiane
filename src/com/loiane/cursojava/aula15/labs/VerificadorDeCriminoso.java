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
				.println("Você será interrogado(a)! Ocorreu um crime na cidade e o delegado está atrás do criminoso!");

		System.out.println("Você telefonou para vítima? Sim ou Não");
		pgt1 = programa.nextLine();
		if (pgt1.equalsIgnoreCase("Sim")) {
			resposta++;
		}
		System.out.println("Esteve no local do crime? Sim ou Não");
		pgt2 = programa.nextLine();
		if (pgt2.equalsIgnoreCase("Sim")) {
			resposta++;
		}

		System.out.println("Mora perto da vítima? Sim ou Não");
		pgt3 = programa.nextLine();

		if (pgt3.equalsIgnoreCase("Sim")) {
			resposta++;
		}

		System.out.println("Devia para a vítima? Sim ou Não");
		pgt4 = programa.nextLine();
		if (pgt4.equalsIgnoreCase("Sim")) {
			resposta++;
		}

		System.out.println("Já trabalhou com a vítima? Sim ou Não");
		pgt5 = programa.nextLine();
		if (pgt5.equalsIgnoreCase("Sim")) {
			resposta++;
		}

		// Julgamento
		if (resposta == 2) {
			System.out.println(
					"Você foi classificado(a) como suspeito(a), não poderá sair da delegacia, tem direito de chamar um advogado!");
			
		} else if (resposta >= 3 && resposta <= 4) {
			System.out.println(
					"Você foi classificado(a) como cúmplice, estará sendo detido para mais investigações, tem direito de chamar um advogado!");
			
		} else if (resposta >= 5) {
			System.out.println(
					"Você foi classificado(a) como assassino(a), estará sendo detido para mais investigações, tem direito de chamar um advogado!");
			
		} else {
			System.out.println("Você foi classificado(a) como inocente, está liberado(a)!");
			
		}

	}
}
