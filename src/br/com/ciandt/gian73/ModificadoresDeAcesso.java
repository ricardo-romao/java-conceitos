package br.com.ciandt.gian73;

import br.com.ciandt.gian73.models.Pessoa;

public class ModificadoresDeAcesso {

public static Pessoa joao;

public static void main(String[] args) {
 
joao = new Pessoa();

joao.setNome("Jo�o");
joao.setIdade(25);

System.out.println(joao);

  
 }
}