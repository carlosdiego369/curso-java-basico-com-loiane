package com.loiane.cursojava.aula36.labs;

public class CursoController {


	public Curso dadosCurso(Curso c) {

		String nome = c.input("Digite o nome do curso:");
		c.setNome(nome);
		
		System.out.println(c.getNome());

		String hrCurso = c.input("Digite o horário do curso: ");
		c.setHorario(hrCurso);
		
		return c;
	}
	
	
}
