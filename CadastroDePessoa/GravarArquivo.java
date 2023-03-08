package Cadastro;
import java.io.*;

/**
 * 
 *
 *  classe cria um objeto que e um arquivo para gravacao
 */

public class GravarArquivo {

	private FileWriter writer;
	private PrintWriter saida;

	/**
	 * Construtor da classe
	 * 
	 */
	public GravarArquivo (String nome) throws IOException {
		try{
			writer = new FileWriter(new File(nome), false);
			saida = new PrintWriter (writer);

		}
		catch (IOException e) {
			throw new IOException("ARQUIVO NAO PODE SER ABERTO PARA GRAVAR ");
		}
	}
	
	/**
	 * Este metodo grava uma String qualquer em um arquivo tipo texto
	 * @param str => String a ser gravada no arquivo
	 * @throws IOException 
	 */
	public void gravarArquivo (String str ) throws IOException {
		this.saida.print(str);
		saida.println();

	}
	
	
	/**
	 * Metodo para fechar o arquivo de gravacao
	 */
	public void fecharArquivo() throws IOException {
		try {
			this.saida.close();
			this.writer.close();
		}catch (IOException e) {
			throw new IOException("ERRO AO FECHAR ARQUIVO");
		}
	}

}
