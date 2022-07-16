package com.loiane.cursojava.aula36;

public class ContatoService {

	public static void main(String[] args) {

		Contato contato = new Contato();

		contato.setNome("Abraa");
		// contato.setEndereco("Av. C");
		// contato.setTelefone("11 99999-9999");

		

		//Relacionamento tem-um endereço
		Endereco end = new Endereco();
		end.setNomeRua("Av. C");
		end.setNumero("N/A");
		end.setComplemento("-");
		end.setCidade("Caldas Novas");
		end.setEstado("GO");
		end.setCep("99999-999");

		contato.setEndereco(end);
		
		//Relacionamento tem-um telefone
		Telefone tel = new Telefone();
		tel.setTipo("Celular");
		tel.setDdd("11");
		tel.setNumero("99999-9999");
		
		Telefone tel2 = new Telefone();
		tel2.setTipo("Fixo");
		tel2.setDdd("11");
		tel2.setNumero("3283-2040");
		
		Telefone[] telefones = new Telefone[2];
		
		telefones[0] = tel;
		telefones[1] = tel2;
		
		//contato.setTelefone(tel);
		contato.setTelefones(telefones);
		
		//Teste saida no contole
		System.out.println(contato.getNome());
		//System.out.println(contato.getEndereco().getCidade());
		//System.out.println(contato.getTelefone());

		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		
		/*if(contato != null && contato.getTelefone() != null) {
			System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
		}*/
		
		if(contato != null && contato.getEndereco() != null) {
			for(Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero()); 
			}
		}

	}

}
