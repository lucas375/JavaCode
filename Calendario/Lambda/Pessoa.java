package Lambda;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;



class Pessoa {
	private String name;
	private int idade;

	public Pessoa(String nome, int idade) {
		this.name = nome;
		this.idade = idade;

	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String toString() {
		return name;
	}
	
	
}

class MaioresIdades implements Predicate<Pessoa>{
	public boolean test(Pessoa p) {
		return p.getIdade() >= 18;
	}
	
}


interface Matcher<T>{
	boolean test(T t);
}

class FiltradorDePessoa{

	public List<Pessoa> filter(List<Pessoa> todas,Predicate<Pessoa> matcher){
		List<Pessoa> resultado = new ArrayList<>();
		for (Pessoa p : todas) {
			if(matcher.test(p)){
				resultado.add(p);
			}
		}    
		return resultado;
	}
}






 