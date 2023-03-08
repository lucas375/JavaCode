package Cadastro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Classe main aonde funciona todo programa.
 * 
 */
public class Tela {

	static Scanner scan = new Scanner(System.in);
	public static void main (String [] args ) throws IOException, IllegalAccessException {
		ArrayList<Pessoa> cad = new ArrayList<>();
		
		cad = lerArquivo1();
		System.out.println("\n*************************************");
		int opc;
		do {
			

			switch (opc = menu()) {
			case 1:
				cadastro(cad);
				break;
			case 2:
				Imprimirpessoa(cad);
				break;
			case 3:
				gravar(cad);
				System.out.println("fim");
				break;
			default:
				System.out.println("Dados invalidos");
				break;
			}
		}while(opc !=3);

	}
	private static int menu () {
		System.out.println(
				"1.Cadastra: \n"+
				"2.Mostrar lista  \n"+
				"3.sair e gravar \n");
		return (scan.nextInt());
	}



	/**
	 * metodo para selecionar o tipo de pessoa para cadastrar
	 * 
	 */
	private static void cadastro (ArrayList<Pessoa> cad) throws IOException {
		Pessoa pessoa = null;
		int tipoDePessoa;
		System.out.println("1- Pessoa fisica.\n2- Pessoa Juridica:");
		tipoDePessoa = scan.nextInt();
		if(tipoDePessoa == 1) {
			pessoa = pessoaFisica();

		}else if(tipoDePessoa ==2 ) {
			pessoa =  pessoaJuridica();

		}else {
			return;
		}  

		boolean existe = true;
		if(existe) {
			cad.add(pessoa);
			System.out.println("Cadastro efetuado com sucesso.");
		}else {
			System.out.println("Erro ao cadastrar");
		}
	}

	
	/**
	 * Cadastro de pessoa fisica:
	 */
	private static Pessoa pessoaFisica() {
		System.out.println("Nome: ");
		String nome = scan.next();
		System.out.println("CPF: ");
		String cpf = scan.next();
		System.out.println("Numero de contato: ");
		String numero = scan.next();
		return new PessoaFisica(nome, numero, cpf);

	}
	/**
	 * Cadastro de pessoa Juridica:
	 */
	private static Pessoa pessoaJuridica() {
		System.out.println("Nome: ");
		String nome = scan.next();
		System.out.println("CNPJ: ");
		String cnpj = scan.next();
		System.out.println("Nome da empresa: ");
		String NomeDaEmpresa = scan.next();
		System.out.println("Numero de contato: ");
		String numeroDeCotnato = scan.next();
		return new PessoaJuridica(nome,cnpj,NomeDaEmpresa,numeroDeCotnato);

	}

	/**
	 * Metodo que le o arquivo
	 * @throws FileNotFoundException 
	 */


	private static ArrayList<Pessoa> lerArquivo1() throws IllegalAccessException {
		LerArquivo entrada = null;
		String arquivo;
		ArrayList<Pessoa> pessoa = null;
		

		try {
			System.out.println("Entre com o caminho do arquivo");
			arquivo =  scan.next();
			entrada = new LerArquivo(arquivo);
			pessoa = entrada.lerArquivo();
			entrada.fecharArquivo();
			System.out.println("ARQUIVO CARREGADO COM SUCESSO.");
		}
		catch(FileNotFoundException e) {
			System.out.printf("FileNotFoundException", e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.printf("ArrayIndexOutOfBoundsException", e.getMessage());
			entrada.fecharArquivo();
			System.exit(1);
		}
		catch(NumberFormatException e) {
			System.out.printf("NumberFormatException", e.getMessage());		
			entrada.fecharArquivo();
			System.exit(1);
		}
		
		return pessoa;
		}
		

	/**
	 * Metodo que grava o arquivo no final do programa 
	 */
	private static void gravar(ArrayList<Pessoa> cad) {
		GravarArquivo gravar = null;
		String arquivo;
		
		try {
			arquivo = "C:\\Users\\Lucas\\OneDrive\\Documentos\\test.txt";
			gravar = new GravarArquivo(arquivo);
			for (Pessoa p : cad) {
				gravar.gravarArquivo(p.toString());
			}
			gravar.fecharArquivo();
		
		}catch(IOException e) {
			System.out.printf("ERRO:", e.getMessage());
		}

	}
	
	/**
	 * Metodo para imprimir ja formatado os dados de pessoas fisicas e juridica .
	 * 
	 */
	private static void  Imprimirpessoa (ArrayList<Pessoa> cad) {
		  
		for (Pessoa p : cad) {
			if(p instanceof PessoaFisica) {
				System.out.println("Pessoa fisica: "  );
				System.out.println("Nome: " + p.getNome()
				+ " CPF:" +((PessoaFisica)p).getCpf() 
				+ " Numero:" + p.getNumero());
			
				}else if (p instanceof PessoaJuridica){
				System.out.println("Pessoa Juridica:");
				System.out.println("Nome Proprietario:"+p.getNome()
				+" CNPJ:"+((PessoaJuridica)p).getCNPJ()
				+ " Nome da Empresa: " + ((PessoaJuridica)p).getNomeDaEmpresa()
				+ " Numero de contato:"+p.getNumero());

			}else {
				System.out.println("SEM CADASTRO");
			}


		}

	}
	
}
