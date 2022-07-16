package com.loiane.cursojava.aula36v2.labs.curso;

public class CursoService {

	public static void main(String[] args) {

		Curso c = new Curso();
		Professor p = new Professor();
		CursoController cC = new CursoController();
		ProfessorController pC = new ProfessorController();
		AlunoController aC = new AlunoController();

		cC.definirNmCurso(c);
		pC.definirDadosProfessor(p);
		c.setProfessor(p);
		aC.definirDadosAlunos(c);

		if (cC.infoCurso(c) != null) {
			System.out.println(cC.infoCurso(c));
		}
		if (pC.infoProfessor(p) != null) {
			System.out.println(pC.infoProfessor(p));
		}

		for (int i = 0; i < c.getAlunos().length; i++) {
			System.out.println(c.getAlunos()[i].infoAluno());

		}
		System.out.println("Média da Classe: " +c.getAlunos()[0].mediaClasse(c));
	}

}
