package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner programa = new Scanner(System.in);

		String nome, sexo, estadoCivil;
		int idade;
		double salario;

		do {
			System.out.println("Digite o nome: ");
			nome = programa.nextLine();

			if (nome.length() < 3) {

				System.out.println("Nome inválido, digite novamente!");
			} else {
				System.out.println("Nome: " + nome);
			}
		} while (nome.length() < 3);
		
		
		do {
			System.out.println("Digite a idade");
			idade = programa.nextInt();
			
			if(idade < 0 || idade > 150) {
				System.out.println("Idade inválida, digite novamente!");
			}else {
				System.out.println("Idade: " + idade);
			}
		}
		while(idade < 0 || idade > 150);
		
		do {
			System.out.println("Digite o salário");
			salario = programa.nextDouble();
			
			if(salario < 0) {
				System.out.println("Salário inválido, digite novamente!");
			}else {
				System.out.println("Salário: " + salario);
			}
		}
		while(salario < 0);
		
		
		do {
			System.out.println("Digite o sexo");
			sexo = programa.next();
			
			if(!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m")) {
				System.out.println("Sexo inválido, digite novamente!");
			}else {
				System.out.println("Sexo: " + sexo);
			}
		}
		while(!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m"));
		
		do {
			System.out.println("Digite o Estado Civil");
			estadoCivil = programa.next();
			
			if(!estadoCivil.equalsIgnoreCase("s") || !sexo.equalsIgnoreCase("c") || !sexo.equalsIgnoreCase("v") || !sexo.equalsIgnoreCase("d")) {
				System.out.println("Estado Civil inválido, digite novamente!");
			}else {
				System.out.println("Estado civil: " + estadoCivil);
			}
		}
		while(!estadoCivil.equalsIgnoreCase("s") || !sexo.equalsIgnoreCase("c") || !sexo.equalsIgnoreCase("v") || !sexo.equalsIgnoreCase("d"));

		
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(salario);
		System.out.println(sexo);
		System.out.println(estadoCivil);
		
		
	}

}
