package com.loiane.cursojava.aula27.labs;

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
		return cc.saldo = input.nextDouble();

	}

	void mostrarSaldo() {
		System.out.println("Saldo atual: " + cc.saldo);	}

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
				cc.limiteEspecial = input.nextDouble();
				cc.saldo = cc.saldo + cc.limiteEspecial;
				validaLimite = true;
			} else if (limite == 0) {
				cc.limiteEspecial = 0;
				validaLimite = true;
			} else if (limite < 0 && limite > 1) {
				invalidarOpcao();
				validaLimite = false;
			}
		}
		return cc.saldo + cc.limiteEspecial;
	}

	double retirarDinheiro(double saque) {
		boolean validarSaque = false;
		while (!validarSaque) {
			System.out.println("Informe o valor do saque");
			saque = input.nextDouble();
			
			if (saque <= 0 && saque > cc.saldo + cc.limiteEspecial) {
				invalidarOpcao();
				cc.saldo = cc.saldo + saque;
				validarSaque = false;
			} else {
				validarSaque = true;
			}
		}
		return cc.saldo = cc.saldo - saque;
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
		return cc.saldo = cc.saldo + deposito;
	}

	void sairSistema() {
		System.out.println("Sistema Encerrado!");
	}

	void showForm(ContaCorrente contaCorrente) {
		cc.numConta = geradorRandomico();
		cc.numDigito = geradorDigito();
		cc.oid = geradorRandomico();

		String head = "";

		head += "Bem-Vindo(a) " + cc.nmCliente;
		head += "\nUsuário: " + cc.nmUsuario;
		head += "\nConta: " + cc.numConta + "-" + cc.numDigito;

		System.out.println(head);

	}
}
