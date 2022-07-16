package com.loiane.cursojava.aula36v3.labs;

import java.util.Scanner;

public class CursoService {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o nome do curso");
		String nmCurso = input.nextLine();
		
		System.out.println("Digite o horário do curso");
		String horario = input.nextLine();
		
		System.out.println("Digite o nome do professor");
		String nmProfessor = input.nextLine();
		
		System.out.println("Digite o departamento do professor");
		String departamento = input.nextLine();
		
		System.out.println("Digite o email do professor");
		String email = input.nextLine();
		
		Curso c = new Curso();
		c.setNmCurso(nmCurso);
		c.setHorario(horario);
		
		Professor p = new Professor();
		p.setNmProfessor(nmProfessor);
		p.setDepartamento(departamento);
		p.setEmail(email);
		
		c.setProfessor(p);
		
		
		Aluno[] alunos = new Aluno[2];
		for(int i = 0; i < alunos.length; i++) {
			System.out.println("Digite o nome do " + (i + 1) + "º aluno");
			String nmAluno = input.nextLine();
			
			System.out.println("Digite a matricula do " + (i + 1) + "º aluno");
			String matricula = input.nextLine();
			
			double[] notas = new double[4];
			
			for(int j = 0; j < 4; j++) {
				System.out.println("Digite a " + (j + 1) + "ª nota do aluno");
				notas[j] = input.nextDouble();
			}
			
			Aluno a = new Aluno();
			a.setNmAluno(nmAluno);
			a.setMatricula(matricula);
			a.setNotas(notas);
			
			alunos[i] = a;
		}
		
		c.setAlunos(alunos);
		
		System.out.println(c.infoCurso());
		
		
	}
	
}
