package com.loiane.cursojava.aula36.labs;

import java.util.Random;

public class AlunoController {

	public void dadosAluno(Curso c2, Professor p, Aluno a2) {

		Random random = new Random();

		double[] notas = new double[4];


			String nome = c2.input("Digite o nome do aluno");
			c2.setNome(nome);

			c2.showText("Matricula: ");
			a2.setMatricula(random.nextInt(99999));
			System.out.println(a2.getMatricula());

			for (int j = 0; j < notas.length; j++) {

				notas[j] = c2.inputNotas("Digite o valor da " + (j + 1) + "ª nota");
				

				a2.setNotas(notas);
			}
			//c2.setAlunos();
		}
	
}
