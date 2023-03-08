package Cadastro;


/**
 * Classe pessoa Juridica, que cadastra nome numero da classe abstrata e tem seu atributo cnpj e nome da empresa.
 * 
 */

public class PessoaJuridica  extends Pessoa{

	private String CNPJ;
	private String NomeDaEmpresa;


	public PessoaJuridica(String nome,String cnpj,String NomeDaEmpresa, String numero ) {
		super(nome, numero);
		this.CNPJ = cnpj;
		this.NomeDaEmpresa = NomeDaEmpresa;
	}


	public String getCNPJ() {
		return CNPJ;
	}


	public void setCNPJ(String cnpj) {
		this.CNPJ = cnpj;
	}


	public String getNomeDaEmpresa() {
		return NomeDaEmpresa;
	}


	public void setEmpresa(String NomeDaEmpresa) {
		this.NomeDaEmpresa = NomeDaEmpresa;
	}


	
	
	@Override
	public String toString() {
		String str = super.getNome() + "," + this.CNPJ +"," + this.NomeDaEmpresa +"," + super.getNumero() +",";
		return str;
	}






}
