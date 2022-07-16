package com.loiane.cursojava.aula27.labs;

import java.util.Random;
import java.util.Scanner;

public class TesteCurso {

	public static void main(String[] args) {

		Curso curso = new Curso();
		CursoController cursoController = new CursoController(new Scanner(System.in), new Random());
		
		curso.matricula = cursoController.geradorMatricula();
		curso.grauEscolaridade = cursoController.cadastrarGrauEscolaridade("Digite o grau de escolaridade");
		curso.nmAluno = cursoController.input("Digite o nome do aluno: ");
		curso.nmDisciplinas = cursoController.cadastrarDisciplinas(new String[3]);
		curso.notasAluno = cursoController.cadastrarNotas(new double[3], curso.nmDisciplinas);
		
		

	}

}
