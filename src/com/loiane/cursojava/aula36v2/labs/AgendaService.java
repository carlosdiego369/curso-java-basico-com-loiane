package com.loiane.cursojava.aula36v2.labs;

import java.util.Scanner;

public class AgendaService {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o nome da sua agenda: ");
		String nome = input.nextLine();

		Agenda ag = new Agenda();
		ag.setNome(nome);

		Contato[] contatos = new Contato[3];

		for (int i = 0; i < contatos.length; i++) {
			Contato c = new Contato();

			System.out.println("Digite o nome do " + (i + 1) + "º contato");
			nome = input.nextLine();
			c.setNmContato(nome);

			System.out.println("Digite o telefone do " + (i + 1) + "º contato");
			String telefone = input.nextLine();
			c.setTelefone(telefone);

			System.out.println("Digite o email do " + (i + 1) + "º contato");
			String email = input.nextLine();
			c.setEmail(email);
			System.out.println();

			contatos[i] = c;
		}
		System.out.println();
		ag.setContatos(contatos);

		if (ag.showNoteBook() != null) {
			System.out.println(ag.showNoteBook());
		}

	}

}
