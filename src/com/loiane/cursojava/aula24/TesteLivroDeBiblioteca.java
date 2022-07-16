package com.loiane.cursojava.aula24;

import java.sql.Date;

public class TesteLivroDeBiblioteca {
	public static void main(String[] args) {
		LivroDeBiblioteca livroDeBiblioteca = new LivroDeBiblioteca();

		livroDeBiblioteca.oid = 001;
		livroDeBiblioteca.titulo = "A menina que roubava livros";
		livroDeBiblioteca.autor = "Markus Zusak";
		livroDeBiblioteca.descricao = "A menina que roubava livros";
		livroDeBiblioteca.editora = "Intríseca";
		livroDeBiblioteca.dataPublicacao = "14/02/2007";
		livroDeBiblioteca.idioma = "Portugues";
		livroDeBiblioteca.paginas = 480;
		livroDeBiblioteca.codLeitor = "08520606610";
		livroDeBiblioteca.emprestado = true;
		livroDeBiblioteca.dataEntrega = new Date(15, 03, 2022);
		
		
		
		System.out.println(livroDeBiblioteca.oid);
		System.out.println(livroDeBiblioteca.titulo);
		System.out.println(livroDeBiblioteca.autor);
		System.out.println(livroDeBiblioteca.descricao);
		System.out.println(livroDeBiblioteca.editora);
		System.out.println(livroDeBiblioteca.dataPublicacao);
		System.out.println(livroDeBiblioteca.idioma);
		System.out.println(livroDeBiblioteca.paginas);
		System.out.println(livroDeBiblioteca.codLeitor);
		System.out.println(livroDeBiblioteca.emprestado);
		System.out.println(livroDeBiblioteca.dataEntrega);

	}
}
