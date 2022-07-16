package com.loiane.cursojava.aula36v3.labs;

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
		return "Nome do professor: " + nmProfessor + "\n";
		
	}
}
