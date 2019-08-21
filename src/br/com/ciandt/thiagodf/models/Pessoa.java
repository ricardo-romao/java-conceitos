package br.com.ciandt.thiagodf.models;

/**
 * Class de Pessoa
 * 
 * @author thiagodf
 *
 */
public class Pessoa {

	private String nome;
	private int idade;
	
	/**
	 * Método Get com return nome
	 * 
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Método Set da variavel nome
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Método Get com o return idade
	 * 
	 * @return idade
	 */
	public int getIdade() {
		return idade;
	}
	
	/**
	 * Método Set da variavel idade
	 * 
	 * @param idade
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
