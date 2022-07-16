package com.loiane.cursojava.aula36.labs;

public class CursoService {

	public static void main(String[] args) {

		Curso c = new Curso();
		Professor p = new Professor();
		//Aluno a = new Aluno();
		
		CursoController cC = new CursoController();
		ProfessorController pC = new ProfessorController();
		//AlunoController aC = new AlunoController();

		c = cC.dadosCurso(c);
		p = pC.dadosProfessor(p);
		//a = aC.dadosAluno(c,p,a);
		
		System.out.println(c.infoCurso());

	}

}
