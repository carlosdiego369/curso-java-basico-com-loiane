package com.loiane.cursojava.aula36v3.labs.curso;

public class CursoService {

	public static void main(String[] args) {

		Curso c = new Curso();
		Professor p = new Professor();
		CursoController cC = new CursoController();
		ProfessorController pC = new ProfessorController();
		AlunoController aC = new AlunoController();

		cC.obterInfoCurso(c);
		pC.obterInfoProfessor(p);
		c.setProfessor(p);
		aC.obterInfoAluno(c);

		if (c.infoCurso() != null) {
			System.out.println(c.infoCurso());
		}
		if (p.infoProfessor() != null) {
			System.out.println(p.infoProfessor());
		}

		for (int i = 0; i < c.getAlunos().length; i++) {
			if (c.getAlunos()[i].infoAluno() != null) {
				System.out.println(c.getAlunos()[i].infoAluno());
			}
		}
		System.out.println("Media da Classe: " + c.getAlunos()[0].mediaClasse(c));
	}
}
