package br.com.ciandt.mshen;

import br.com.ciandt.mshen.models.Pessoa;

public class VariaveisReferencia {

	public static void main(String[] args) {

		Pessoa joao = new Pessoa();
		joao.setNome("Jo�o");

		Pessoa pedro = new Pessoa();
		pedro.setNome("Pedro");

		System.out.println("O nome do Jo�o � " + joao.getNome());
		System.out.println("O nome do Pedro � " + pedro.getNome());
	}
}
