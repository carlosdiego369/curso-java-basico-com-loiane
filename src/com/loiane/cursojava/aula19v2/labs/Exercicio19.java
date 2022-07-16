package com.loiane.cursojava.aula19v2.labs;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		double [] notas1 = new double[10];
		double [] notas2 = new double[notas1.length];
		double [] result = new double[notas1.length];
		double media = 0;
		
		for(int i = 0; i < notas1.length; i++) {
			System.out.println("Digite a 1 ª nota do " + (i + 1) + "º aluno");
			notas1[i] = input.nextInt();
			
			System.out.println("Digite a 2 ª nota do " + (i + 1) + "º aluno");
			notas2[i] = input.nextInt();
			
			result[i] = notas1[i] + notas2[i];
		}
		
		System.out.println("Notas Bimestrais!");
		for(int i = 0; i < notas1.length; i++) {
			System.out.println("Notas do " + (i + 1) + "º aluno: ");
			System.out.println("1 ª Nota: " + notas1[i]);
			
			System.out.println("Notas do " + (i + 1) + "º aluno: ");
			System.out.println("2 ª Nota: " + notas2[i]);
			
			media = result[i] / 2;
			
			System.out.println("Média do aluno: " + media);
			
			if(media >= 7) {
				System.out.println("Aluno aprovado!");
				System.out.println();
			}else {
				System.out.println("Aluno reprovado!");
				System.out.println();
			}
		}

	}

}
