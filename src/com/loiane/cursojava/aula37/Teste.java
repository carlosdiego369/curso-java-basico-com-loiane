package com.loiane.cursojava.aula37;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		Pessoa professor = new Professor(); // se usa Pessoa quando é polimorfismo
		Pessoa pessoa = new Pessoa();
		
		aluno.setNome("Maria");
		professor.setNome("Ismar");
		pessoa.setNome("Estudante");
		
		
	
	}

}
