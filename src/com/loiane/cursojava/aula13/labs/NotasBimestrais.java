package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class NotasBimestrais {

	public static void main(String[] args) {

		
		@SuppressWarnings("resource")
		Scanner notasBimestrais = new Scanner (System.in);
		
		double nota1,  nota2, nota3, nota4, resultado;
		
		
		
		System.out.println("****Escola de Programação****");
		
		System.out.println("Digite a primeira nota: ");
		
		nota1 = notasBimestrais.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		
		nota2 = notasBimestrais.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		
		nota3 = notasBimestrais.nextDouble();
		
		System.out.println("Digite a quarta nota: ");
		
		nota4 = notasBimestrais.nextDouble();
		
		resultado = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A média das notas é: " + resultado);
	}

}
