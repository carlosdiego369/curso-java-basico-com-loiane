package com.loiane.cursojava.aula36v3.labs.curso;

import java.util.Scanner;

public class ProfessorController {
	
	public String input(String text) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print(text);
		return input.nextLine();
	}
	
	public Professor obterInfoProfessor(Professor p) {
		
		p.setNmProfessor(input("Informe o nome do professor: "));
		p.setDepartamento(input("Informe o departamento do professor: "));
		p.setEmail(input("Informe o email do professor: "));
		
		return p;
	}
	
}
