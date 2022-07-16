package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class VerificadorDeNotasParciais {

	public static void main(String[] args) {

		System.out.println("Sistema de Notas Parciais");

		@SuppressWarnings("resource")
		Scanner programa = new Scanner(System.in);

		System.out.println("Digite a primeira nota do aluno: Ex.: 0 - 10");

		double media;

		double nota1 = programa.nextDouble();

		System.out.println("Digite a seguda nota do aluno: Ex.: 0 - 10");

		double nota2 = programa.nextDouble();

		media = (nota1 + nota2) / 2;

		if (media <= 4) {

			System.out.println("Reprovado Conceito: E" + " Nota: " + media);
		} else if (media > 4 && media <= 6) {

			System.out.println("Reprovado Conceito: D" + " Nota: " + media);
		} else if (media > 6 && media <= 7.5) {
			
			System.out.println("Aprovado Conceito: C" + " Nota: " + media);
		} else if (media > 7.5 && media <= 9) {
			
			System.out.println("Aprovado Conceito: B" + " Nota: " + media);
		} else if (media > 9 && media >= 10) {
			System.out.println("Aprovado Conceito: A" + " Nota: " + media);
		}

	}

}
