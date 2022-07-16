package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int dia, horario, iniciarAgendamento, consultarAgendamento;
		boolean diaValido = true, hrValida = true, sair = false;

		String[][] agendamentoConfirmado = new String[31][24];

		while (!sair) {
			System.out.println("Deseja agendar um compromisso? 1 - Sim ou 2 - N�o ou 0 - Sair");
			iniciarAgendamento = input.nextInt();

			switch (iniciarAgendamento) {
			case 1: {

				do {
					System.out.println("Informe o dias do m�s que deseja realizar o agendamento: ");
					dia = input.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						diaValido = false;
						System.out.println("Data informada inv�lida! Entre com uma data v�lida: 1 - 31 ");
					}
				} while (!diaValido);

				do {
					System.out.println("Informe a hora do dia que deseja agendar");
					horario = input.nextInt();
					if (horario >= 0 && horario <= 24) {
						hrValida = true;
					} else {
						hrValida = false;
						System.out.println("Hora informada inv�lida! Entre com um hor�ri v�lido: 1 - 24");
					}
				} while (!hrValida);

				dia--;
				System.out.println("Informe a descri��o do Agendamento: ");
				agendamentoConfirmado[dia][horario] = input.next();

				System.out.println("****** AGENDADO! ******");
				System.out.println("Dia do Agendamento: " + dia);
				System.out.println("Hor�rio do Agendamento: " + horario);
				System.out.println("Descri��o do Agendamento: " + agendamentoConfirmado[dia][horario]);
				System.out.println();

			}
				break;

			// CONSULTA
			case 2: {
				System.out.println("Deseja consultar um agendamento? 1 - Sim ou 2 - N�o");
				consultarAgendamento = input.nextInt();
				switch (consultarAgendamento) {
				case 1: {
					do {
						System.out.println("Informe o dias do m�s que deseja consultar ");
						dia = input.nextInt();
						if (dia > 0 && dia <= 31) {
							diaValido = true;
						} else {
							diaValido = false;
							System.out.println("Data informada inv�lida! Entre com uma data v�lida: 1 - 31 ");
						}
					} while (!diaValido);

					do {
						System.out.println("Informe a hora do dia que deseja consultar");
						horario = input.nextInt();
						if (horario > 0 && horario <= 24) {
							hrValida = true;
						} else {
							hrValida = false;
							System.out.println("Hora informada inv�lida! Entre com um hor�ri v�lido: 1 - 24");
						}

						System.out.println("****** CONSULTA DO AGENDAMENTO! ******");
						System.out.println("Dia do Agendamento: " + dia);
						System.out.println("Hor�rio do Agendamento: " + horario);

						if (agendamentoConfirmado[dia][horario] == null) {
							System.out.println("N�o h� registros para este dia/hora");
						} else {
							System.out.println("Descri��o do Agendamento: " + agendamentoConfirmado[dia][horario]);
						}
						System.out.println();

					} while (!hrValida);
					break;
				}
				case 2: {
					System.out.println("Sistema Encerrado!");
					sair = true;
				}
					break;
				default:
					System.out.println("Op��o Inv�lida!");
				}
				break;
			}
			case 0: {
				System.out.println("Sistema Encerrado.");
				sair = true;
			}
				break;

			default:
				System.out.println("Op��o Inv�lida!");
			}

		}
	}

}
