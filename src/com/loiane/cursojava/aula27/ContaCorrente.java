package com.loiane.cursojava.aula27;

public class ContaCorrente {

		int oid;
		int numConta;
		int digito;
		int agencia;
		int operacao;
		double saldo;
		boolean contaEspecial;
		double limite;
		
		void realizarSaque(double quantiaASacar) {
			
			if(saldo >= quantiaASacar) {
				saldo -= quantiaASacar;
				
			}
		}
	}
	

