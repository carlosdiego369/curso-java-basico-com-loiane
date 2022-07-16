package com.loiane.cursojava.aula36v3.labs;

import java.util.Scanner;

public class AgendaService {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		Agenda ag = new Agenda();
		
		System.out.println("Digite o nome da sua agenda: ");
		String nome = input.nextLine();
		ag.setNome(nome);
		
		Contato [] contatos = new Contato[3];
		
		for(int i = 0; i < contatos.length; i++) {
			Contato c = new Contato();
			
			System.out.println("Digite o nome do " + (i + 1) + "º contato");
			String nmContato = input.nextLine();
			c.setNmContato(nmContato);
			
			System.out.println("Digite o telefone do " + (i + 1) + "º contato");
			String telefone = input.nextLine();
			c.setTelefone(telefone);
			
			System.out.println("Digite o e-mail do " + (i + 1) + "º contato");
			String email = input.nextLine();
			c.setEmail(email);
			System.out.println();
			
			contatos[i] = c;
		}
		
		ag.setContatos(contatos);
		
		if(contatos != null) {
			System.out.println(ag.showNoteBook());
		}
		
	}

}
