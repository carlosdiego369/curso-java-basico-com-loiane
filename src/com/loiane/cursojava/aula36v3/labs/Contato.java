package com.loiane.cursojava.aula36v3.labs;

public class Contato {

	private String nmContato;
	private String telefone;
	private String email;


	public String getNmContato() {
		return nmContato;
	}

	public void setNmContato(String nmContato) {
		this.nmContato = nmContato;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String showContacts() {
		return "Nome: " + nmContato + "; \n" + 
			   "Telefone: " + telefone + "; \n" + 
			   "Email: " + email + "; \n"; 
		
	}

}
