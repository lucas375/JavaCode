package Cadastro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LerArquivo {

	private Scanner entrada; 

	/**
	 * Construtor
	 * @param nome => Nome do arquivo que sera aberto para leitura
	 */
	public LerArquivo (String nome)throws FileNotFoundException{
		try {
			this.entrada = new Scanner(new File(nome));
		}
		catch (FileNotFoundException e) {
			throw new FileNotFoundException("ARQUIVO NAO ENCONTRADO");
		}
	}
	/**
	 * Metodo para ler os dados contidos no arquivo
	 *  Pessoa => Array de pessoa que sera preenchido durante a leitura do arquivo
	 * @throws IllegalAccessException 
	 * @throws IllegalStateException caso tenha houver erro ao ler o arquivo 
	 */

	public ArrayList<Pessoa>lerArquivo() throws ArrayIndexOutOfBoundsException, NumberFormatException{
		ArrayList<Pessoa> pessoa = null;
		String linha;
		pessoa =  new ArrayList<>();
		while(this.entrada.hasNext()) {
			linha =  this.entrada.nextLine();
			pessoa.add(separarDados(linha));
		}
		return pessoa;
	}
	/**
	 * Metodo para transformar uma linha do arquivo em um objeto
	 * do tipo aluno
	 *  linha => String contendo a linha do arquivo que sera transformada  a pessoa  criado a partir do linha passada
	 *  NoSuchElementException => Excecao causada por elementos insuficientes
	 * 					na String, durante a transoformacao
	 */

	
	
	
	public static Pessoa separarDados (String linha )throws ArrayIndexOutOfBoundsException{
		String [] dados;
		String nome,cpf,numeroDeContato,cnpj, nomeDaEmpresa;
		
		dados = linha.split(",");
		nome = dados [0];
		cpf = dados[1];
		numeroDeContato = dados[2];
	
		
		if(dados.length==3) {
			return (new PessoaFisica(nome,cpf, numeroDeContato));
		}
		else {
			nome = dados [0];
			cnpj = dados[1];
			nomeDaEmpresa = dados [2];
			numeroDeContato = dados[3];
			return (new PessoaJuridica(nome, cnpj,
					 nomeDaEmpresa, numeroDeContato));		
		}
	}


	/**
	 * Metodo para fechar o arquivo de leitura
	 *  IllegalStateException  Excecao causada se nao conseguir fechar o arquivo.
	 */
	public void fecharArquivo() throws IllegalAccessException{
		this.entrada.close();
	}



}
