package com.loiane.cursojava.aula24;

import java.text.DecimalFormat;

public class TesteLivroDeLivraria {

	public static void main(String[] args) {

		LivroDeLivraria livroDeLiraria = new LivroDeLivraria();
		
		livroDeLiraria.oid = 001;
		livroDeLiraria.titulo = "A menina que roubava livros";
		livroDeLiraria.autor = "Markus Zusak";
		livroDeLiraria.descricao = "A menina que roubava livros";
		livroDeLiraria.editora = "Intríseca";
		livroDeLiraria.dataPublicacao = "14/02/2007";
		livroDeLiraria.idioma = "Portugues";
		livroDeLiraria.paginas = 480;
		livroDeLiraria.preco = 49.90;

		System.out.println(livroDeLiraria.oid);
		System.out.println(livroDeLiraria.titulo);
		System.out.println(livroDeLiraria.autor);
		System.out.println(livroDeLiraria.descricao);
		System.out.println(livroDeLiraria.editora);
		System.out.println(livroDeLiraria.dataPublicacao);
		System.out.println(livroDeLiraria.idioma);
		System.out.println(livroDeLiraria.paginas);
		
		DecimalFormat df = new DecimalFormat("#,##0.00");
		System.out.println(df.format(livroDeLiraria.preco));
		
		
	}

}
