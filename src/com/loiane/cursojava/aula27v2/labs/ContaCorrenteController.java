package com.loiane.cursojava.aula27v2.labs;

import java.util.Scanner;

public class ContaCorrenteController {

	ContaCorrente conta = new ContaCorrente();

	String text = "";
	Scanner input;

	public ContaCorrenteController(Scanner scanner) {
		input = scanner;
	}

	double debitarConta(double debito) {
		return conta.saldo -= debito;

	}

	boolean realizarSaque(double quantiaASacar) {
		if (conta.saldo >= quantiaASacar) {
			conta.saldo -= quantiaASacar;
			return true;
		} else {// não tem saldo na conta
			if (conta.especial) {
				// verificar se o limite especial tem saldo
				conta.limite = conta.limiteEspecial + conta.saldo;
				if (conta.limite >= quantiaASacar) {
					conta.saldo -= quantiaASacar;
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
	}

	void showForm() {
		text += "Saldo da conta: " + conta.numero + " = " + conta.saldo;

		boolean saqueEfetuado = realizarSaque(10);
		if (saqueEfetuado) {
			text += "\nSaque efetuado com sucesso";
			consutarSaldo();
		} else {
			text += "\nNão foi possível realizar o saque. Saldo insuficiente";
		}

		boolean saqueEfetuado2 = realizarSaque(500);
		text += "\nTentativa de sacar 500";
		if (saqueEfetuado2) {
			text += "\nSaque efetuado com sucesso";
			text += "\nSaldo atual da conta = " + conta.saldo;
		} else {
			text += "\nNão foi possível realizar o saque. Saldo insuficiente";
		}

		text += "Depósito de 500 reais";
		depositar(500);
		consutarSaldo();

		if (verificarUsoChequeEspecial()) {
			text += "\nEstá usando cheque especial";
		} else {
			text += "\nNão está usando cheque especial";
		}

		System.out.println(text);
	}

	void depositar(double valorDepositado) {
		conta.saldo += valorDepositado;
	}

	void consutarSaldo() {
		text += "\nSaldo atual da conta = " + conta.saldo;
	}

	boolean verificarUsoChequeEspecial() {
		return conta.saldo < 0;
	}

}
