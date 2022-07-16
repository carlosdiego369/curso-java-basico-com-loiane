package com.loiane.cursojava.aula36.labs;

import java.util.Scanner;

public class AgendaService {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o nome da sua agenda.");
		String nome = input.nextLine();
		

		Agenda agenda = new Agenda();
		agenda.setNome(nome);
		
		//Passando a quantidade do vetor
		Contato[] contatos = new Contato[3];
		
		for(int i = 0; i < 3; i++) {
			//estanciando a classe contato
			Contato c = new Contato();
			
			System.out.println("Digite o nome do " + (i+1) + "º contato:" );
			nome = input.nextLine();
			c.setNmContato(nome);
			
			System.out.println("Digite o telefone do " + (i+1) + "º contato:" );
			String telefone = input.nextLine();
			c.setTelefone(telefone);
			
			System.out.println("Digite o email do " + (i+1) + "º contato:" );
			String email = input.nextLine();
			c.setEmail(email);
			System.out.println();
			
			//setar as informações no array
			contatos[i] = c;
		}
		System.out.println();
		agenda.setContatos(contatos);
		
		if(agenda.showNoteBook() != null) {
			System.out.println(agenda.showNoteBook());
		}

	}

}
