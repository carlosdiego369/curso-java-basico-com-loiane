package com.loiane.cursojava.aula27.labs;

import java.util.Scanner;

public class TesteContaCorrente {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int acaoUsuario;

		ContaCorrente cc = new ContaCorrente();

		cc.oid = 001;
		cc.nmUsuario = "carlosdiego";
		cc.nmCliente = "Carlos Diego de Freitas Silva";
		cc.numConta = 38613;
		cc.numDigito = 8;
		cc.saldo = 2175.08;
		cc.contaEspecia = true;
		cc.limiteEspecial = 200.00;

		boolean encerrar = false;

		System.out.println("Caixa Ecônomica Federeral (Réplica)");
		System.out.println("INTERNET BANKING CAIXA");
		System.out.println("Login: " + cc.nmUsuario);
		System.out.println("Saldo: " + cc.saldo);
		System.out.println("Saldo do Limite Especial: R$" + cc.limiteEspecial + " Saldo total: " + (cc.saldo + cc.limiteEspecial));
		System.out.println();

		while (!encerrar) {

			System.out.println("Digite 1 - Sacar");
			System.out.println("Digite 2 - Depositar");
			System.out.println("Digite 3 - Extrato");
			System.out.println("Digite 0 - Sair");

			acaoUsuario = input.nextInt();

			switch (acaoUsuario) {
			case 1: {
				System.out.println("Informe o valor que deseja sacar na sua conta: ");
				double valorSaque = input.nextDouble();

				double valorDoSaque = cc.sacarDinheiro(valorSaque);

				cc.saldo = valorDoSaque;
				encerrar = false;
				break;
			}
			case 2: {
				boolean validaDeposito = false;
				while (!validaDeposito) {

					System.out.println("Informe o valor que deseja depositar na sua conta: ");
					double valorDeposito = input.nextDouble();

					if (valorDeposito <= 0) {
						System.out.println("Valor inserido de deposito inválido");
						System.out.println();
						validaDeposito = false;
					} else {
						double valorDoDeposito = cc.depositarDinheiro(valorDeposito);
						cc.saldo = valorDoDeposito;
						System.out.println("Saldo Atual R$" + cc.saldo);
						System.out.println();
						validaDeposito = true;
					}
				}
				break;

			}
			case 3: {
				cc.extratoSaldo();
				break;
			}
			case 0: {
				cc.sair();
				encerrar = true;
				break;
			}
			default:
				System.out.println("Opção Inválida, Digite novamente!");
				System.out.println();
			}

		}

	}

}
