package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		
		Scanner programa = new Scanner(System.in);
		
		String login, senha;
		
		System.out.println("Sistema de Cadastro");
	
		
		do {
		System.out.println("Digite um login para ser cadastrado: ");
		login = programa.nextLine();
		
		
		System.out.println("Digite uma senha para ser cadastrado: ");
		senha = programa.nextLine();
		
		if(login.equalsIgnoreCase(senha)) {
			System.out.println("Login e senha não podem ser iguais!");
			System.out.println("Digite Novamente");
		}else {
			System.out.println("Cadastro com sucesso!");
		}
		}while (login.equalsIgnoreCase(senha));
	
	
	}

}
