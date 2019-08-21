package br.com.ciandt.thiagodf;

import br.com.ciandt.thiagodf.models.Pessoa;

/**
 * Class de ModificadoresDeAcesso
 * @author thiagodf
 *
 */
public class ModificadoresDeAcesso extends Pessoa {
	
	/**
	 * Método que 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Crie a variável joao usando a classe Pessoa
		Pessoa joao = new Pessoa();
		joao.setNome("João");
		joao.setIdade(25);
		
		// Print João tem 25 anos
		System.out.println(joao.getNome() + " tem " + joao.getIdade() + " anos");
	}
}
