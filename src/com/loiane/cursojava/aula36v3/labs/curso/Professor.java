package com.loiane.cursojava.aula36v3.labs.curso;

public class Professor {
	
	private String nmProfessor;
	private String departamento;
	private String email;
	
	public String getNmProfessor() {
		return nmProfessor;
	}
	public void setNmProfessor(String nmProfessor) {
		this.nmProfessor = nmProfessor;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	public String infoProfessor() {
		return "\n********** INFORMAÇÕES DO PROFESSOR **********\n\n" + 
			   "Nome do professor: " + getNmProfessor() + "; \n" + 
			   "Departamento do professor: " + getDepartamento() + "; \n" + 
			   "E-mail do professor: " + getEmail() + "; \n";
		
		
	}
}
