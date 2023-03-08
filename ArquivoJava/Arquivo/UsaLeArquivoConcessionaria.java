package automovel;
import io.*;
import java.io.*;
import java.util.*;

public class UsaLeArquivoConcessionaria {

	public static void main(String[] args) {
		LeArquivoConcessionariaAutomovel entrada=null;
		String arquivo;
		ArrayList<Automovel> carro = null;
		
		try{
			arquivo = "concessionaria.txt";
			entrada = new LeArquivoConcessionariaAutomovel(arquivo);
			carro = entrada.leArquivo();
			entrada.fechaArquivo();
		}
		catch (FileNotFoundException erro){
			InOut.msgDeErro("ERRO", erro.getMessage());
			System.exit(1);
		}
		catch (ArrayIndexOutOfBoundsException erro){
			InOut.msgDeErro("ERRO",erro.getMessage());
			entrada.fechaArquivo();
			System.exit(1);
		}
		catch (NumberFormatException erro){
			InOut.msgDeErro("ERRO",erro.getMessage());
			entrada.fechaArquivo();
			System.exit(1);
		}
		if (carro!=null){
			for (Automovel a: carro)
				InOut.msgDeInformacao("CARROS", a.toString());						
		}
		System.exit(0);
	}
}
