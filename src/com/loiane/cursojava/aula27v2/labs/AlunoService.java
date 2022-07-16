package com.loiane.cursojava.aula27v2.labs;

import java.util.Scanner;

public class AlunoService {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		AlunoController aC = new AlunoController(new Scanner(System.in));
		
		a.nome = aC.cadastrarNome(null);
		a.nomeCurso = aC.cadastrarCurso(null);
		a.matricula = aC.cadastrarMatricula(null);
		a.nomeDisciplinas = aC.cadastrarDisciplinas(new String[3]);
		a.notasDisciplinas = aC.cadastrarNotas(new double[3][4]);
		
		aC.showForm();
	}

}
