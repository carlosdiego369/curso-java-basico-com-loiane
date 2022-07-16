package com.loiane.cursojava.aula43;

public class Teste {

	public static void main(String[] args) {

		Aluno a = new Aluno();
		
		a.setCurso("Ciência da Computação");
		double notas[] = {10, 9, 8, 7};
		a.setNotas(notas);
		
		System.out.println(a);
		
		String s1 = "asdasdoias";
		String s2 = "asdasdoiaS";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		Aluno a2 = new Aluno();
		a2.setCurso("Ciência da Computação");
		double notas2[] = {5, 4, 3, 2};
		a2.setNotas(notas2);
		
		System.out.println(a.equals(a2));
		
		
		
		
	}

}
