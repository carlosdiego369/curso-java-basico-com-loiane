package com.loiane.cursojava.aula36v3.labs.curso;

import java.util.Scanner;

public class CursoController {
	
	public String input(String text) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print(text);
		return input.nextLine();
	}
	
	public Curso obterInfoCurso(Curso c) {
		
		c.setNmCurso(input("Informe o nome do curso: "));
		c.setHorario(input("Digite o horario do curso: "));
		return c;
	}

}
