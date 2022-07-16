package com.loiane.cursojava.aula43v2.labs.exer02;

public class ReceitaFederalService {
	public static void main(String[] args) {

		
		PessoaFisica p1 = new PessoaFisica();
		p1.setNome("Carlos Diego");
		p1.setRendaBruta(1000);
		p1.setCpf("141.937.855-48");
		
		PessoaJuridica p2 = new PessoaJuridica();
		p2.setNome("Danielle");
		p2.setRendaBruta(5000);
		p2.setCnpj("15.291.442/0001-01");
		
		Contribuinte[] contribuintes = new Contribuinte[2];
		
		contribuintes[0] = p1;
		contribuintes[1] = p2;
		
		for(Contribuinte c : contribuintes) {
			System.out.println(c.toString());
		}
	}
}
