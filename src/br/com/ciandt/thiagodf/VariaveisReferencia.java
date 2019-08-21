package br.com.ciandt.thiagodf;

import br.com.ciandt.thiagodf.models.Pessoa;

/**
 * Classe de VariaveisReferencia.
 * 
 * @author thiagodf
 *
 */
public class VariaveisReferencia {
	
	/**
	 * Método que intancia a classe pessoa
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Pessoa joao = new Pessoa();
		joao.setNome("João");
		
		Pessoa pedro = new Pessoa();
		pedro.setNome("Pedro");
		
		System.out.println("O nome do João ? " + joao.getNome());
		System.out.println("O nome do Pedro ? " + pedro.getNome());
	}
}
