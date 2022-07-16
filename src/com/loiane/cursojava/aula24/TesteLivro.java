package com.loiane.cursojava.aula24;

import java.sql.Date;

public class TesteLivro {

	public static void main(String[] args) {

		Livro livro = new Livro();

		livro.oid = 001;
		livro.titulo = "A menina que roubava livros";
		livro.autor = "Markus Zusak";
		livro.descricao = "A menina que roubava livros";
		livro.editora = "Intríseca";
		livro.dataPublicacao = "14/02/2007";
		livro.idioma = "Portugues";
		livro.qtdPaginas = 480;

		System.out.println(livro.oid);
		System.out.println(livro.titulo);
		System.out.println(livro.autor);
		System.out.println(livro.descricao);
		System.out.println(livro.editora);
		System.out.println(livro.dataPublicacao);
		System.out.println(livro.idioma);
		System.out.println(livro.qtdPaginas);

	}

}
