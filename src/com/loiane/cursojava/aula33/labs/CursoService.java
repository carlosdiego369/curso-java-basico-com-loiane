package com.loiane.cursojava.aula33.labs;

import java.util.Random;
import java.util.Scanner;

public class CursoService {

	public static void main(String[] args) {
		
		CursoController cc = new CursoController(new Scanner(System.in), new Random());
		
		
		cc.cadastrarGrauEscolaridade(null);
		cc.cadastrarAluno(null);
		cc.cadastrarDisciplinas();
		cc.cadastrarNotas(new double [3][4]);
		
		cc.showForm();
	}

}
