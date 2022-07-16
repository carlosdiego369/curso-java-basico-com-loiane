package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		boolean sair = false, mesValido = true, diaValido = true, hrValida = true;

		int operacao, mes = 0, dia = 0, hora = 0;

		String[][][] agendaOnline = new String[12][31][8];

		System.out.println("*******************************************************");
		System.out.println("******************** AGENDA ONLINE ********************");
		System.out.println("*******************************************************");

		while (!sair) {

			System.out.println("Digite: 1 - Cadastrar / 2 - Consultar / 0 - Sair");
			operacao = input.nextInt();

			switch (operacao) {
			// Cadastro
			case 1: {
				do {
					System.out.println("Digite o mês para ser agendado");
					mes = input.nextInt();
					if (mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("Opção Inválida! Digite Novamente.");
						mesValido = false;
					}
					System.out.println();
				} while (!mesValido);

				do {
					System.out.println("Digite o dia para ser agendado");
					dia = input.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Opção Inválida! Digite Novamente.");
						diaValido = false;
					}
					System.out.println();
				} while (!diaValido);

				do {
					System.out.println("Digite o horario para ser agendado: (09:00 ~ 17:00)");
					hora = input.nextInt();
					if (hora >= 9 && hora < 17) {
						hrValida = true;
					} else {
						System.out.println("Opção Inválida! Digite Novamente.");
						hrValida = false;
					}
					System.out.println();
				} while (!hrValida);

				mes--;
				dia--;
				hora -= 9;

				System.out.println("Informe a descrição do agendamento: ");
				agendaOnline[mes][dia][hora] = input.next();

				sair = false;
			}

				break;

			// Consulta
			case 2: {
				do {
					System.out.println("Digite o mês para ser consultado");
					mes = input.nextInt();
					if (mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("Opção Inválida! Digite Novamente.");
						mesValido = false;
					}
					System.out.println();
				} while (!mesValido);

				do {
					System.out.println("Digite o dia para ser consultado");
					dia = input.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Opção Inválida! Digite Novamente.");
						diaValido = false;
					}
					System.out.println();
				} while (!diaValido);
				
				do {
					System.out.println("Digite o horario para ser consultado: (09:00 ~ 17:00)");
					hora = input.nextInt();
					if (hora >= 9 && hora < 17) {
						hrValida = true;
					} else {
						System.out.println("Opção Inválida! Digite Novamente.");
						hrValida = false;
					}
					System.out.println();
				} while (!hrValida);
				
				mes--;
				dia--;
				hora -= 9;
				System.out.println("***************************************************************");
				System.out.println("******************** Resultado da Consulta ********************");
				System.out.println("***************************************************************");
				if (agendaOnline[mes][dia][hora] != null) {
					System.out.println("Mês: " + (mes + 1) + " Dia: " + (dia + 1) + " Hora: " + (hora + 9) + " Compromisso: " + agendaOnline[mes][dia][hora]);
				} else {
					System.out.println("Não há agendamento para esse dia!");
				}
				System.out.println();
				sair = false;
			}
				break;

			// Sair
			case 0: {
				System.out.println("Sistema Encerrado! ");
				sair = true;
				break;
			}
			default:
				System.out.println("Opção Inválida! Digite novamente");
			}
		}

	}

}
