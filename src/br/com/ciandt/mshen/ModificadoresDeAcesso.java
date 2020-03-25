package br.com.ciandt.mshen;

import br.com.ciandt.mshen.models.Pessoa;

public class ModificadoresDeAcesso {

	public static void main(String[] args) {

		Pessoa joao = new Pessoa();
		joao.setNome("João");
		joao.setIdade(25);

		System.out.println("Nome: " + joao.getNome());
		System.out.println("Idade: " + joao.getIdade());

	}
}
