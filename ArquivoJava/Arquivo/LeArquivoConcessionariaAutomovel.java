package io;
/**
 * @author Cinthia
 *
 * TODO Classe para criar um objeto do tipo arquivo de leitura
 */
import java.io.*;
import java.util.*;

import automovel.Automovel;
import automovel.AutomovelBasico;
import automovel.AutomovelDeLuxo;

public class LeArquivoConcessionariaAutomovel {
	private Scanner entrada;
	/**
	 * Construtor
	 * @param nome => Nome do arquivo que sera aberto para leitura
	 * @throws FileNotFoundException => Excecao se nao encontrar o arquivo
	 */
	public LeArquivoConcessionariaAutomovel (String nome) throws FileNotFoundException{
		try{
			this.entrada = new Scanner (new File (nome));
		}
		catch (FileNotFoundException e){
			throw new FileNotFoundException ("ARQUIVO NAO ENCONTRADO");
		}
	}
	/**
	 * Metodo para ler os dados contidos no arquivo
	 * @param alunos => Vetor de alunos que sera preenchido durante a 
	 * 						leitura do arquivo
	 * @throws IllegalStateException => Excecao se houver erro ao ler o arquivo 
	 */
	public ArrayList<Automovel> leArquivo ()throws ArrayIndexOutOfBoundsException, 
										NumberFormatException{
		ArrayList<Automovel> automovel=  null;
		String linha;
		automovel = new ArrayList<>();
		while (this.entrada.hasNext()){
			linha = this.entrada.nextLine();
			automovel.add(separaDados(linha));
		}
		return automovel;
	}

	/**
	 * Metodo para transformar uma linha do arquivo em um objeto
	 * do tipo aluno
	 * @param linha => String contendo a linha do arquivo que sera transformada
	 * @return => O aluno criado a partir do linha passada
	 * @throws NoSuchElementException => Excecao causada por elementos insuficientes
	 * 					na String, durante a transoformacao
	 */
	private Automovel separaDados (String linha)throws ArrayIndexOutOfBoundsException{
		String[] dados;
		String modelo, cor;
		byte combustivel;
		boolean retrovisor, limpador, radio, direcao, cambio, trava;
		
		//str.useLocale(Locale.US);
		
		try{
			dados = linha.split(";");
			modelo = dados[0];
			cor = dados[1];
			combustivel = Byte.parseByte(dados[2]);
			if (dados.length==3){
				return (new Automovel (modelo, cor, combustivel));
			}else{
				retrovisor = Boolean.parseBoolean(dados[3]);
				limpador = Boolean.parseBoolean(dados[4]);
				radio = Boolean.parseBoolean(dados[5]);
				if (dados.length==6){
					return (new AutomovelBasico (modelo, cor, combustivel,
							retrovisor, limpador, radio));					
				}else{
					direcao = Boolean.parseBoolean(dados[6]);
					cambio = Boolean.parseBoolean(dados[7]);
					trava = Boolean.parseBoolean(dados[8]);
					return (new AutomovelDeLuxo (modelo, cor, combustivel,
								retrovisor, limpador, radio, direcao,
								cambio, trava));					
				}
			}
		}
		catch (NoSuchElementException erro){
			throw new NoSuchElementException ("ARQUIVO DIFERENTE DO REGISTRO");
		}
	}
	/**
	 * Metodo para fechar o arquivo de leitura
	 * @throws IllegalStateException => Excecao causada se nao conseguir fechar o arquivo.
	 */
	public void fechaArquivo ()throws IllegalStateException{
		try{
			this.entrada.close();
		}
		catch (IllegalStateException e){
			throw new IllegalStateException ("ERRO AO FECHAR O ARQUIVO");
		}
	}

}
