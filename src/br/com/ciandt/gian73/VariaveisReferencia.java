package br.com.ciandt.gian73;

import br.com.ciandt.login.models.Pessoa;

public class VariaveisReferencia {

	public static void main(String[] args) {
		
		Pessoa joao = new Pessoa();
		joao.setNome("João");
		
		Pessoa pedro = joao;
		pedro.setNome("Pedro");
		
		System.out.println("O nome do João é " + joao.getNome());
		System.out.println("O nome do Pedro é " + pedro.getNome());
	}
}
