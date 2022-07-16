package com.loiane.cursojava.aula17v2.labs;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner programa = new Scanner(System.in);

		String usuario, senha;
		boolean validaUsuario = false;

		do {

			System.out.println("Digite o usuário para ser cadastrado");
			usuario = programa.next();

			System.out.println("Digite o senha para ser cadastrado");
			senha = programa.next();

			if (usuario.equalsIgnoreCase(senha)) {
				System.out.println("A senha não pode ser igual ao usuário, digite novamente!");
			} else {
				validaUsuario = true;
				System.out.println("Cadastro realizado com sucesso!");
			}
		} while (!validaUsuario);
	}
}
