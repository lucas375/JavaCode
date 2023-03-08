package automovel;
import io.GravaArquivo;
import io.InOut;
import java.io.IOException;
import java.util.ArrayList;


public class UsaGravaArquivoConcessionaria {
	public static void main(String[] args){
		ArrayList<Automovel> carro = new ArrayList<Automovel>(100);
	
		carro.add(new Automovel ("Uno", "prata", Automovel.FLEX));
	
		carro.add(new AutomovelBasico ("Siena", "branco", 
				Automovel.GASOLINA));
		carro.add(new AutomovelBasico ("Classic", "preto", 
				Automovel.GASOLINA, false, false, true));
		carro.add(new AutomovelDeLuxo ("Civic", "grafite", 
				Automovel.GASOLINA));
		carro.add(new AutomovelDeLuxo ("A4", "preto", 
				Automovel.GASOLINA, true, true, false, true, false, true));

		for (Automovel a: carro){
			imprime (a);
		}
		grava (carro);
	}

	public static void imprime (Automovel carro){
		String aux = carro+"\n"+"Valor: "+carro.valor()+"\n\n"+
		carro.numeroPrestacoes()+" prestacoes de "+
		(carro.valor()/carro.numeroPrestacoes());
		InOut.msgDeInformacao("AUTOMOVEL ESCOLHIDO", aux);
	}
	public static void grava (ArrayList<Automovel> carro){
		try{
			GravaArquivo saida = new GravaArquivo ("concessionaria.txt");
			for (Automovel a: carro)
				saida.gravaArquivo(a.toStringArquivo()+"\n");
			saida.fechaArquivo();
	
		
		} catch (IOException erro){
			InOut.msgDeErro("ERRO", erro.getMessage());
		}
	}
}
