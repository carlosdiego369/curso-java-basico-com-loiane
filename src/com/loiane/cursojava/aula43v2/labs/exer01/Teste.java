package com.loiane.cursojava.aula43v2.labs.exer01;

public class Teste {

	public static void main(String[] args) {

		imprimir("*** Teste ContaBancaria ***");

		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setNomeCliente("Carlos Diego de Freitas Silva");
		contaSimples.setNumConta("38613-8");

		realizarDeposito(contaSimples, 100.00);
		imprimirSaldo(contaSimples);
		realizarSaque(contaSimples, 50);
		imprimirSaldo(contaSimples);
		realizarSaque(contaSimples, 70);
		imprimirSaldo(contaSimples);

		
		
		imprimir("*** Teste ContaPoupan�a ***");

		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNomeCliente("Danielle Sousa Rodrigues");
		contaPoupanca.setNumConta("38445-8");
		contaPoupanca.setDiaRendimento(15);

		realizarDeposito(contaPoupanca, 100.00);
		imprimirSaldo(contaPoupanca);
		realizarSaque(contaPoupanca, 50);
		imprimirSaldo(contaPoupanca);
		realizarSaque(contaPoupanca, 70);
		
		if(contaPoupanca.calcularNovoSaldo(0.03)) {
			imprimir("Rendimento aplicado, novo saldo � de = " + contaPoupanca.getSaldo());
		}else {
			imprimir("Hoje n�o e dia de rendimento, novo aldo n�o calculado");
		}
		imprimirSaldo(contaPoupanca);
		
		
		
		imprimir("*** Teste ContaEspecial ***");

		ContaEspecial contaEspecial = new ContaEspecial();
		contaEspecial.setNomeCliente("Danielle Sousa Rodrigues");
		contaEspecial.setNumConta("38667-0");
		contaEspecial.setLimite(50);

		realizarDeposito(contaEspecial, 100.00);
		imprimirSaldo(contaEspecial);
		realizarSaque(contaEspecial, 50);
		imprimirSaldo(contaEspecial);
		realizarSaque(contaEspecial, 70);
		imprimirSaldo(contaEspecial);
		realizarSaque(contaEspecial, 80);
		
		if(contaPoupanca.calcularNovoSaldo(0.03)) {
			imprimir("Rendimento aplicado, novo saldo � de = " + contaPoupanca.getSaldo());
		}else {
			imprimir("Hoje n�o e dia de rendimento, novo aldo n�o calculado");
		}
		imprimirSaldo(contaPoupanca);

	}

	public static void realizarSaque(ContaBancaria conta, double valor) {
		if (conta.sacar(valor)) {
			imprimir("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
		} else {
			imprimir("Saldo insuficiente para saque de " + valor + "; saldo de = " + conta.getSaldo());
		}
		;
	}

	public static void realizarDeposito(ContaBancaria conta, double valor) {
		conta.depositar(valor);
		imprimir("Deposito de " + valor + " realizado com sucesso!");
	}

	public static void imprimirSaldo(ContaBancaria conta) {
		System.out.println(conta);
	}

	public static void imprimir(String texto) {
		System.out.println(texto);
	}

}
