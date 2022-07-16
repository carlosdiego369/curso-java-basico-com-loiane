package com.loiane.cursojava.aula24;

public class TesteContato {

	public static void main(String[] args) {

		
		Contato contato1 = new Contato();
		contato1.nome = "João";
		contato1.endereco = "Av Paulista, 1000";
		contato1.email = "joao@gmail.com";
		
		contato1.telefones = new String[5];
		contato1.telefones[0] = "34 991474214";
		contato1.telefones[1] = "34 996917472";
		
	
		
	}

}
