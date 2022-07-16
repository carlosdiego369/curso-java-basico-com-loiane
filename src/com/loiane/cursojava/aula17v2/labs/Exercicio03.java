package com.loiane.cursojava.aula17v2.labs;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner programa = new Scanner(System.in);

		String nome, sexo, estadoCivil;
		int idade;
		double salario;
		boolean validaDados = false;

		do {
			System.out.println("Digite o nome");
			nome = programa.next();

			if (nome.length() >= 3) {
				validaDados = true;
			} else {
				System.out.println("Nome inválido, precisa acima de 3 caracteres! Digite novamente.");
			}
		} while (!validaDados);

		validaDados = false;

		do {
			System.out.println("Digite a idade");
			idade = programa.nextInt();

			if (idade >= 0 && idade < 150) {
				validaDados = true;
			} else {
				System.out.println("Idade inválida! Digite novamente.");
			}
		} while (!validaDados);

		validaDados = false;

		do {
			System.out.println("Digite salário");
			salario = programa.nextDouble();

			if (salario > 0) {
				validaDados = true;
			} else {
				System.out.println("Salário Inválido! Digite novamente.");
			}
		} while (!validaDados);

		validaDados = false;

		do {
			System.out.println("Digite o Sexo (F - Feminino) ou (M - Masculino) ou (O - Outro)");
			sexo = programa.next();

			switch (sexo) {
			case ("F"):
				sexo = "Feminino";
				validaDados = true;
				break;
			case ("f"):
				sexo = "Feminino";
				validaDados = true;
				break;
			case ("M"):
				sexo = "Masculino";
				validaDados = true;
				break;
			case ("m"):
				sexo = "Masculino";
				validaDados = true;
				break;
			case ("O"):
				sexo = "Outro";
				validaDados = true;
				break;
			case ("o"):
				sexo = "Outro";
				validaDados = true;
				break;

			default:
				System.out.println("Sexo Inváldo!");
			}
		} while (!validaDados);

		do {
			System.out.println("Digite o Estado Civil");
			estadoCivil = programa.next();

			switch (estadoCivil) {
			case ("S"):
				estadoCivil = "Solteiro";
				validaDados = true;
				break;
			case ("s"):
				estadoCivil = "Solteiro";
				validaDados = true;
				break;
			case ("C"):
				estadoCivil = "Casado";
				validaDados = true;
				break;
			case ("c"):
				estadoCivil = "Casado";
				validaDados = true;
				break;
			case ("V"):
				estadoCivil = "Viúvo";
				validaDados = true;
				break;
			case ("v"):
				estadoCivil = "Viúvo";
				validaDados = true;
				break;
			case ("D"):
				estadoCivil = "Divorciado";
				validaDados = true;
				break;
			case ("d"):
				estadoCivil = "Divorciado";
				validaDados = true;
				break;

			default:
				System.out.println("Estado Civil Inváldo!");
			}
		} while (!validaDados);

		System.out.println("\nDados Coletados");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + new DecimalFormat("##.00").format(salario));
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);
	}
}
