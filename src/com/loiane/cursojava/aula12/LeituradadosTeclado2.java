package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituradadosTeclado2 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner criarEmail = new Scanner(System.in);
		
		System.out.println("Digite: Nome, Sobrenome, Nome do Usuário, Telefone, Email de Recuperação, Data Nascimento e Genero.");
		
		
		System.out.println("Digite seu nome: \n");
		String nome = criarEmail.nextLine();
		
		System.out.println("Digite seu sobrenome: ");
		String sobrenome = criarEmail.nextLine();
		
		System.out.println("Digite o Nome do Usuário do seu novo Email: ");
		String nomeUsuario = criarEmail.nextLine();
		
		System.out.println("Digite o número do seu Telefone");
		int numeroTelefone = criarEmail.nextInt();
		
		System.out.println("Digite um email para recuperação: ");
		String emailRecuperacao = criarEmail.nextLine();
		
		System.out.println("Digite sua Data de Nascimento");
		String dtNasc = criarEmail.nextLine();
		
		System.out.println("Digite seu Genero");
		String genero = criarEmail.nextLine();
		
		System.out.println("Este são os valores digitados: ");
		System.out.println("Nome: " + nome);
		System.out.println("Sobrenome: " + sobrenome);
		System.out.println("Nome do Usuário: " + nomeUsuario + "@gmail.com");
		System.out.println("telefone: " + numeroTelefone);
		System.out.println("Email de recuperação: " + emailRecuperacao);
		System.out.println("Data de Nascimento: " + dtNasc);
		System.out.println("Genero: " + genero);
		

	}

}
