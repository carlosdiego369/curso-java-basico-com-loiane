package com.loiane.cursojava.aula36v2.labs;

public class Agenda {
	
	private String nome;
	private Contato[] contatos;

	public Agenda() {
}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Contato[] getContatos() {
		return contatos;
	}
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	
	public String showNoteBook() {
		String info = "Nome da Agenda: " + nome + "\n\n";
		if(contatos != null) {
			for(Contato c : contatos) {
				info += c.showContacts() + "\n";
			}
		}
		return info;
	}
	
}