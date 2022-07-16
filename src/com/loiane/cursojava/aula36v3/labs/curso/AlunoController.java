package com.loiane.cursojava.aula36v3.labs.curso;

import java.util.Random;
import java.util.Scanner;

public class AlunoController {

	public String input(String text) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print(text);
		return input.nextLine();
	}

	public double inputDoble(String text) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print(text);
		return input.nextDouble();
	}
	
	public int geradorRandomico() {
		Random random = new Random();
		return random.nextInt(99999);
		
	}
	
	public Aluno [] obterInfoAluno(Curso c) {
		Aluno [] alunos = new Aluno[2];
		
		for(int i = 0; i < alunos.length; i++) {
			Aluno a = new Aluno();
			
			a.setNmAluno(input("Digite o nome do " + (i + 1) + "º aluno: "));
			a.setMatricula(geradorRandomico());
			
			double [] notas = new double[4];
			
			for(int j = 0; j < notas.length; j++) {
				notas[j] = inputDoble("Informe a " + (j + 1) + "ª nota do " + (i + 1) + "º aluno: ");
			}
			
			a.setNotas(notas);
			alunos[i] = a;
			c.setAlunos(alunos);
			
			System.out.println();
		}
		
		return alunos;
		
	}
}
