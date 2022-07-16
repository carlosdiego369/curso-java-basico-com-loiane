package com.loiane.cursojava.aula33.labs;

import java.util.Random;
import java.util.Scanner;

public class ContaCorrenteController {

	ContaCorrente cc = new ContaCorrente();

	Scanner input;
	Random random;

	public ContaCorrenteController(Scanner scanner, Random random) {
		this.input = scanner;
		this.random = random;
	}

	String input(String text) {
		return input.nextLine();
	}

	int geradorRandomico() {
		return random.nextInt(99999);
	}

	int geradorDigito() {
		return random.nextInt(10);
	}

	double verificadorSaldo(double saldo) {
		System.out.println("Digite o valor do saldo");
		cc.setSaldo(input.nextDouble());
		return cc.getSaldo();
	}

	void mostrarSaldo() {
		System.out.println("Saldo atual: " + cc.getSaldo());
	}

	void invalidarOpcao() {
		System.out.println("Opção Inválida, digite novamente");
	}

	void invalidarSaque() {
		System.out.println("Saldo Insuficiente.");
	}

	double validarLimiteEspecial(double limite) {
		boolean validaLimite = false;
		while (!validaLimite) {

			System.out.println("Informe se contém limite especial: 1 - Sim 0 - Não");
			limite = input.nextDouble();

			if (limite == 1) {
				System.out.println("Qual é o valor do limite especial?");
				cc.setLimiteEspecial(input.nextDouble());
				cc.setSaldo(cc.getSaldo() + cc.getLimiteEspecial());
				validaLimite = true;
			} else if (limite == 0) {
				cc.setLimiteEspecial(0);
				validaLimite = true;
			} else if (limite < 0 && limite > 1) {
				invalidarOpcao();
				validaLimite = false;
			}
		}
		return cc.getSaldo() + cc.getLimiteEspecial();
	}

	double retirarDinheiro(double saque) {
		boolean validarSaque = false;
		while (!validarSaque) {
			System.out.println("Informe o valor do saque");
			saque = input.nextDouble();

			if (saque <= 0 && saque > (cc.getSaldo() + cc.getLimiteEspecial())) {
				invalidarOpcao();
				cc.setSaldo(cc.getSaldo() + saque);
				validarSaque = false;
			} else {
				validarSaque = true;
			}
		}
		cc.setSaldo(cc.getSaldo() - saque);
		return cc.getSaldo();
	}

	double depositarDinheiro(double deposito) {
		boolean validarDeposito = false;
		while (!validarDeposito) {
			System.out.println("Informe o valor do deposito");
			deposito = input.nextDouble();
			if (deposito <= 0) {
				invalidarOpcao();
				validarDeposito = false;
			} else {
				validarDeposito = true;
			}
		}
		cc.setSaldo(cc.getSaldo() + deposito);
		return cc.getSaldo();
	}

	void sairSistema() {
		System.out.println("Sistema Encerrado!");
	}

	void showForm(ContaCorrente contaCorrente) {
		cc.setNumConta(geradorRandomico());
		cc.setNumDigito(geradorDigito());
		cc.setNmCliente("Carlos Diego de Freitas Silva");
		cc.setNmUsuario("carlosdiego");

		String head = "";

		head += "Bem-Vindo(a) " + cc.getNmCliente();
		head += "\nUsuário: " + cc.getNmUsuario();
		head += "\nConta: " + cc.getNumConta() + "-" + cc.getNumDigito();

		System.out.println(head);

	}
}
