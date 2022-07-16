package com.loiane.cursojava.aula36v2.labs.curso;

import java.util.Scanner;

public class CursoController {

	public String input(String text) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print(text);
		return input.nextLine();
	}

	public Curso definirNmCurso(Curso c) {

		c.setNmCurso(input("Digite o nome do curso: "));
		c.setHorario(input("Digite o hor�rio do curso: "));

		return c;
	}

	public String infoCurso(Curso c) {
		return "*********** INFORMA��ES DO CURSO *********** \n" +
			   "Nome Curso: " + c.getNmCurso() + "; \n" + 
			   "Hor�rio do Curso: "	+ c.getHorario() + "; \n";
	}
}
