package com.loiane.cursojava.aula36.labs;

import java.util.Scanner;

public class ProfessorController {

	public Professor dadosProfessor(Professor p) {

		String nomeProfessor = input("Informe o nome do professor do curso: ");
		p.setNome(nomeProfessor);

		String departamento = input("Informe o departamento do professor: ");
		p.setDepartamento(departamento);

		String email = input("Informe o email do professor: ");
		p.setEmail(email);
		return p;

	}

	public String input(String text) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println(text);
		return input.nextLine();
	}
}
