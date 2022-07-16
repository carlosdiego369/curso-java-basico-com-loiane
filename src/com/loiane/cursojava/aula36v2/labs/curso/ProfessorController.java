package com.loiane.cursojava.aula36v2.labs.curso;

import java.util.Scanner;

public class ProfessorController {
	
	public String input(String text) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print(text);
		return input.nextLine();
	}
	
	public Professor definirDadosProfessor(Professor p) {
		p.setNmProfessor(input("Digite o nome do professor: "));
		p.setDepartamento(input("Digite o departamento do professor: "));
		p.setEmail(input("Digite o e-mail do professor: "));
		return p;
	}
	
	public String infoProfessor(Professor p) {
		return "*********** INFORMAÇÕES DO PROFESSOR *********** \n" + 
			   "Nome do professor: " + p.getNmProfessor() + "; \n" +
			   "Departamento do professor: " + p.getDepartamento() + "; \n" +
			   "E-mail do professor: " + p.getEmail() + "; \n";
		
	}
}
