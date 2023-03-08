package Cadastro;

/**
 * Classe pessoa fisica, que cadastra nome numero da classe abstrata e tem seu atributo cpf.
 * 
 */

public class PessoaFisica extends Pessoa {

	private String cpf;

	public PessoaFisica(String nome, String numero, String cpf) {
		super(nome, numero);
		this.cpf = cpf;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	

	@Override
	public String toString() {
		String str =   super.getNome()+","+ cpf +","+super.getNumero() +","  ;
		return str;
	}



}
