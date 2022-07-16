package com.loiane.cursojava.aula27.labs;

public class ContaCorrente {

	int oid;
	int numConta, numDigito, operacao;
	String nmCliente = "Carlos Diego de Freitas Silva", nmUsuario = "carlosdiego";
	boolean contaEspecia;
	double saldo, limiteEspecial;

	double sacarDinheiro(double valorSaque) {

		if (valorSaque > saldo) {
			if (contaEspecia == true && saldo - valorSaque <= 0) {
				saldo = saldo + limiteEspecial;
				System.out.println("Entrou no limite especial: " + limiteEspecial);
				System.out.println();

			} else {
				System.out.println("Saldo Insuficiente!");
				saldo = saldo + valorSaque;
				System.out.println();
			}
		}
		return saldo - valorSaque;
	}

	double depositarDinheiro(double valorDeposito) {
		return saldo + valorDeposito;
	}

	void extratoSaldo() {
		System.out.println("Saldo: R$" + saldo);
		System.out.println();
	}

	void sair() {
		System.out.println("Sistema Encerrado!");
	}
	
	

}
