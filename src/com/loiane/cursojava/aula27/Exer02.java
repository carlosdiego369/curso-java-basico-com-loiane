package com.loiane.cursojava.aula27;

import java.text.DecimalFormat;

public class Exer02 {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();
		
		DecimalFormat df = new DecimalFormat("0000");
		DecimalFormat df2 = new DecimalFormat("000");
		DecimalFormat df3 = new DecimalFormat("#,###,##0.00");
		
		conta.oid = 0001;
		conta.numConta = 38613;
		conta.digito = 8;
		conta.operacao = 001;
		conta.saldo = 0.01;
		conta.contaEspecial = false;
		conta.limite = 200.00;
		
		System.out.println(df.format(conta.oid));
		System.out.println(conta.numConta + "-"+conta.digito);
		System.out.println(df2.format(conta.operacao));
		System.out.println(df3.format(conta.saldo));
		System.out.println(conta.contaEspecial);
		System.out.println(df3.format(conta.limite));
		
	}

}
