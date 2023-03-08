public class Vendedor {

	private String nome;
	private double salarioBase = 1500;
	private	int TempodeServico;
	private char categoria;
	private double salarioTotal;
	
	
	public Vendedor(String nome, int tempodeServico, double salarioTotal) {
		super();
		this.nome = nome;
		this.TempodeServico = tempodeServico;
		this.setCategoria();
		this.salarioTotal = salarioTotal;
	}

		
	
	public Vendedor() {
    }



    public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSalarioBase() {
		return salarioBase;
	}


	public double getTempodeServico() {
		return TempodeServico;
	}


	public void setTempodeServico(int tempodeServico) {
		TempodeServico = tempodeServico;
	}


	public char getCategoria() {
		return categoria;
	}


	private void setCategoria() {

		if(this.TempodeServico>60){
			this.categoria = 'A';

		}if(this.TempodeServico >=30){
			this.categoria = 'B';	

		}else {
			this.categoria ='C';
		}

	}
	
	public double getSalarioTotal() {
		return salarioTotal;
	}


	public void setSalarioTotal(double salarioTotal) {
		this.salarioTotal = salarioTotal;
	}



	@Override
	public String toString() {
		return "Vendedor [nome=" + nome + ", salarioBase=" + salarioBase
				+ ", TempodeServico=" + TempodeServico + ", categoria="
				+ categoria + ", salarioTotal=" + salarioTotal + "]";
	}


	
	public double comissao (){
		if(this.salarioTotal >20000){
			return (this.salarioTotal*0.2);
		
		}else if(this.salarioTotal >=10000){
			return(this.salarioTotal*0.15);

			}else {
				return this.salarioTotal*0.05;
			}
		}	
	
	

	public double gratificacao(){
	if(this.categoria=='A'){
		return this.salarioBase*0.15;
	}else if(this.categoria=='B'){
		return this.salarioBase*0.075;
	}else {
		return this.salarioBase;
	}
}
	

	public double salario(){
		return this.salarioBase + this.salarioTotal + gratificacao();
	}
}