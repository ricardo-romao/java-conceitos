package br.com.ciandt.thiagodf;

import br.com.ciandt.thiagodf.models.Pessoa;

public class VariaveisReferencia {

	public static void main(String[] args) {
		
		Pessoa joao = new Pessoa();
		joao.setNome("Jo�o");
		
		Pessoa pedro = joao;
		pedro.setNome("Pedro");
		
		System.out.println("O nome do Jo�o � " + joao.getNome());
		System.out.println("O nome do Pedro � " + pedro.getNome());
	}
}
