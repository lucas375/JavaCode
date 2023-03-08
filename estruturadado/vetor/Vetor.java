package com.lucas.estruturadado.vetor;

import java.util.Arrays;

public class Vetor {

	private int tamanho;
	private int[] elementos;

	//CONTRUTOR
	public Vetor(int capacidade) {
		this.elementos = new int[capacidade];
		this.tamanho =0;	
	}

	//	public void adciona(int elemento) {
	//		
	//		// for percorre o vetor, faz a validação aonde esta vazio, e coloca a informação, ele da
	//		//um break para parar de percorrer se for achado
	//		
	//	for (int i=0; i<this.elementos.length; i++) {
	//			if(this.elementos[i]== 0) {
	//				this.elementos[i] = elemento;
	//				break;
	//			}
	//		}
	//	}
	//	public void adiciona(int elemento) throws Exception{
	//	
	//	if(this.tamanho < this.elementos.length) {
	//		this.elementos[this.tamanho]= elemento;
	//		this.tamanho++;	 
	//	}else {
	//			throw new Exception("Vetor já esta cheio, não é possivel cadastrar");
	//		}
	//	}

	public int busca1(int posicao) {

	
		return this.elementos[posicao];		
	}
	
	public int busca(int elemento) {
		for(int i=0;i<this.tamanho;i++) {
			// == por ser inteiro se fosse string .equals 
			if(this.elementos[i] == elemento) {
				// posição do vetor
				return i;
			}
		}
		return -1;
	}
	
	private void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			int [] elementosNovos = new int[this.elementos.length*2];
				for(int i = 0; i<this.elementos.length;i++) {
					elementosNovos[i] = this.elementos[i];
			}	 
				this.elementos = elementosNovos;
		}	
	}
	
	public boolean adiciona(int posicao, int elemento ) {
		if(!(posicao >=0 && posicao< tamanho)) {
			throw new IllegalArgumentException("Posição invalida");
		}
		//mover todos os elementos.
		this.aumentaCapacidade();
		for (int i= this.tamanho-1; i>=posicao; i--) {
			this.elementos[i+1] =  this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;    
		return false ;
	}
	
	public boolean adiciona(int elemento) {
		this.aumentaCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho]= elemento;
			tamanho++;
			return true;
		}else {
			return false;
		}
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	@Override
	public String toString() {
		//String biuder fazendo a formatação do vetor no toString,
		// se enquanto i for menor que tamanho encrementa o elemento na posição i, e formata
		//no toStrign

		StringBuilder s = new StringBuilder();
		s.append("[");

		for(int i=0;i<this.tamanho-1;i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		if(this.tamanho>0){
			s.append(this.elementos[this.tamanho-1]);
		}
		s.append("]");

		return s.toString();
	}
	
	public void remove(int posicao) {
		// valida se a posição é valida
		if(!(posicao >=0 && posicao< tamanho)) {
			throw new IllegalArgumentException("Posição invalida");
		}
		//B G D E F -> PISIÇÃO A SER REMOVIDA É 1 (G) == B D E F 
		//0 1 2 3 4 -> TAMANHO É 5
		// VETOR[1] = VETOR [2] == this.elementos[i] = this.elementos[i+1];
		// VETOR[2] = VETOR [3] == this.elementos[i] = this.elementos[i+1];
		// VETOR[3] = VETOR [4] == this.elementos[i] = this.elementos[i+1];
		
		for(int i = posicao; i<this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
	}

} 
