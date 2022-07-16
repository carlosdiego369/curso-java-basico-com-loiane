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

				System.out.println("Nome inv�lido, digite novamente!");
			} else {
				System.out.println("Nome: " + nome);
			}
		} while (nome.length() < 3);
		
		
		do {
			System.out.println("Digite a idade");
			idade = programa.nextInt();
			
			if(idade < 0 || idade > 150) {
				System.out.println("Idade inv�lida, digite novamente!");
			}else {
				System.out.println("Idade: " + idade);
			}
		}
		while(idade < 0 || idade > 150);
		
		do {
			System.out.println("Digite o sal�rio");
			salario = programa.nextDouble();
			
			if(salario < 0) {
				System.out.println("Sal�rio inv�lido, digite novamente!");
			}else {
				System.out.println("Sal�rio: " + salario);
			}
		}
		while(salario < 0);
		
		
		do {
			System.out.println("Digite o sexo");
			sexo = programa.next();
			
			if(!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m")) {
				System.out.println("Sexo inv�lido, digite novamente!");
			}else {
				System.out.println("Sexo: " + sexo);
			}
		}
		while(!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m"));
		
		do {
			System.out.println("Digite o Estado Civil");
			estadoCivil = programa.next();
			
			if(!estadoCivil.equalsIgnoreCase("s") || !sexo.equalsIgnoreCase("c") || !sexo.equalsIgnoreCase("v") || !sexo.equalsIgnoreCase("d")) {
				System.out.println("Estado Civil inv�lido, digite novamente!");
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
