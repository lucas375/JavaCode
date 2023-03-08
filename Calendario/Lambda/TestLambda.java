package Lambda;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestLambda {
	public static void main(String[] args) {
		List<Pessoa> pessoa = Arrays.asList(new Pessoa("Mario", 31),
											new Pessoa("Guilherme", 32),
											new Pessoa("Lucas",18),
											new Pessoa("Alex",15 ));
		
		
		
		
		FiltradorDePessoa filtrador =  new FiltradorDePessoa();
			
//		Predicate<Pessoa> criterio = new Predicate<Pessoa>() {
//			public boolean test (Pessoa p ) {
//				return p.getIdade() >=18;
//			}
//		};
//		
//		Lambda
		//Predicate<Pessoa> criterio = p -> p.getIdade() >=18;
		
		//Predicate<Pessoa> criterio = (Pessoa p) -> {return p.getIdade() >=18;};
		

		
		List<Pessoa> resultado = filtrador.filter(pessoa, p -> p.getIdade() >=18);
		
		List<Pessoa> resultado2 = filtrador.filter(pessoa, p -> p.getIdade() >=30);
		List<Pessoa> resultado3 = filtrador.filter(pessoa, p -> p.getName().startsWith("A"));

		System.out.println(resultado);
		System.out.println(resultado2);
		System.out.println(resultado3);
		
	}

	//Regras 
//	(String s1, String s2) -> { codigo };
//	(s1,s2) -> {codigo};
//	p -> codigo;

}	


