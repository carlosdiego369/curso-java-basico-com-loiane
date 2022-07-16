package com.loiane.cursojava.aula24;

import java.text.DecimalFormat;

public class TesteContaCorrente {

	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaCorrente();
		
		DecimalFormat df = new DecimalFormat("0000");
		DecimalFormat df2 = new DecimalFormat("000");
		DecimalFormat df3 = new DecimalFormat("#,###,##0.00");
		
		contaCorrente.oid = 0001;
		contaCorrente.numConta = 38613;
		contaCorrente.digito = 8;
		contaCorrente.operacao = 001;
		contaCorrente.saldo = 0.01;
		contaCorrente.contaEspecial = false;
		contaCorrente.limite = 200.00;
		
		System.out.println(df.format(contaCorrente.oid));
		System.out.println(contaCorrente.numConta + "-"+contaCorrente.digito);
		System.out.println(df2.format(contaCorrente.operacao));
		System.out.println(df3.format(contaCorrente.saldo));
		System.out.println(contaCorrente.contaEspecial);
		System.out.println(df3.format(contaCorrente.limite));
		
	}

}
