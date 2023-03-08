package com.lucas.estruturadado.vetor;

public class Lista<T>  {



	private T[] elementos;
	private int tamanho;


	//CONTRUTOR
	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho =0;	
	}



	public int busca(T elemento) {
		for(int i=0;i<this.tamanho;i++) {
			if(this.elementos[i] == elemento) {
				return i;
			}
		}
		return -1;
	}

	private void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			T[] elementosNovos =(T[]) new Object[this.elementos.length*2];
			for(int i = 0; i<this.elementos.length;i++) {
				elementosNovos[i] = this.elementos[i];
			}	 
			this.elementos = elementosNovos;
		}	
	}



	public boolean adiciona(T elemento) {
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
		if(!(posicao >=0 && posicao< tamanho)) {
			throw new IllegalArgumentException("Posição invalida");
		}
		for(int i = posicao; i<this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
	}
	
	public boolean contem(T elemento) {
		return busca(elemento)> -1;
	}

} 



