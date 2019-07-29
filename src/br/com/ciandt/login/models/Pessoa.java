package br.com.ciandt.login.models;

public class Pessoa {

	private String nome;
	private int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	int getIdade() {
		return idade;
	}

	protected void setIdade(int idade) {
		this.idade = idade;
	}
	
}
