package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituradadosTeclado2 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner criarEmail = new Scanner(System.in);
		
		System.out.println("Digite: Nome, Sobrenome, Nome do Usu�rio, Telefone, Email de Recupera��o, Data Nascimento e Genero.");
		
		
		System.out.println("Digite seu nome: \n");
		String nome = criarEmail.nextLine();
		
		System.out.println("Digite seu sobrenome: ");
		String sobrenome = criarEmail.nextLine();
		
		System.out.println("Digite o Nome do Usu�rio do seu novo Email: ");
		String nomeUsuario = criarEmail.nextLine();
		
		System.out.println("Digite o n�mero do seu Telefone");
		int numeroTelefone = criarEmail.nextInt();
		
		System.out.println("Digite um email para recupera��o: ");
		String emailRecuperacao = criarEmail.nextLine();
		
		System.out.println("Digite sua Data de Nascimento");
		String dtNasc = criarEmail.nextLine();
		
		System.out.println("Digite seu Genero");
		String genero = criarEmail.nextLine();
		
		System.out.println("Este s�o os valores digitados: ");
		System.out.println("Nome: " + nome);
		System.out.println("Sobrenome: " + sobrenome);
		System.out.println("Nome do Usu�rio: " + nomeUsuario + "@gmail.com");
		System.out.println("telefone: " + numeroTelefone);
		System.out.println("Email de recupera��o: " + emailRecuperacao);
		System.out.println("Data de Nascimento: " + dtNasc);
		System.out.println("Genero: " + genero);
		

	}

}
