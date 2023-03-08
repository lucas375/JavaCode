package Cadastro;


/**
 * Classe abstrata de Pessoa com os atributos que extende para outras classes 
 */


public abstract class Pessoa {

	private String nome;
	private String numero;


	public Pessoa(String nome, String numero) {
		super();
		this.nome = nome;
		this.numero = numero;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	
	
	
	public String toString () {
		String str = nome +","+ numero+",";
		return str;
	}



}
