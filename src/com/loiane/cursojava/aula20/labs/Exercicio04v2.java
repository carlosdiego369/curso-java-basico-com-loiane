package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exercicio04v2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int consultar, operacao, dia = 0, horario = 0;
		boolean sair = false, dataValida = true, horarioValido = true;
		String[][] agenda = new String[31][24];

		while (!sair) {
			System.out.println("Deseja agendar um compromisso? Digite - 1");
			System.out.println("Deseja consultar um compromisso? Digite - 2");
			System.out.println("Deseja Sair? Digite - 0");

			operacao = input.nextInt();

			switch (operacao) {
			case 1: {
				do {
					System.out.println("Informe o dia para ser registrado na agenda: ");
					dia = input.nextInt();

					if (dia >= 0 && dia <= 31) {
						dataValida = true;
					} else {
						System.out.println("Dia inválido, digite novamente!");
						System.out.println();
						dataValida = false;
					}
				} while (!dataValida);

				do {
					System.out.println("Informe o horario para ser registrado na agenda: ");
					horario = input.nextInt();

					if (horario >= 0 && horario <= 24) {
						horarioValido = true;
					} else {
						System.out.println("Horário inválido, digite novamente!");
						System.out.println();
						horarioValido = false;
					}
				
				} while (!horarioValido);
				
				//dia--;
				System.out.println("Digite o compromisso para ser salvo: ");
				agenda[dia][horario] = input.next();
				
				System.out.println("*********** AGENDADO CONFIRMADO! ***********");
				System.out.println("Dia / Horario / Assunto: ");
				System.out.println(dia + " / " + horario + " / " + agenda[dia][horario]);
				
				
				
				System.out.println();
				sair = false;

			}
				break;

			case 2: {

				do {
					System.out.println("Informe o dia para ser consultado na agenda: ");
					dia = input.nextInt();

					if (dia >= 0 && dia <= 31) {
						dataValida = true;
					} else {
						System.out.println("Dia inválido, digite novamente!");
						System.out.println();
						dataValida = false;
					}
				} while (!dataValida);

				do {
					System.out.println("Informe o horario para ser consultado na agenda: ");
					horario = input.nextInt();

					if (horario >= 0 && horario <= 24) {
						horarioValido = true;
					} else {
						System.out.println("Horário inválido, digite novamente!");
						System.out.println();
						horarioValido = false;
					}
				
				} while (!horarioValido);
				 
				System.out.println("*********** RESULTADO DA AGENDA ***********");
				System.out.println("Dia / Horario / Compromisso: ");
				System.out.println(dia + " / " + horario + " / " + agenda[dia][horario]);
			}
				break;

			case 0: {

				System.out.println("Sistema Encerrado.");
				sair = true;
			}
				break;
			default:
				System.out.println("Operação Inválida, digite novamente! ");
			}
			System.out.println();
		}
	}

}
