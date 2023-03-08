import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class app {
	static Scanner scan = new Scanner (System.in);

	public static void main(String[] args) {
	
			Pilha pilha = new Pilha ();
			FilaInteiro fila = new FilaInteiro();
			Integer elemento;
			
			elemento = InOut.LeInt("Entre com um numero inteiro ou 0 para sair ");
			while (elemento !=0) {
				if(elemento % 2 == 0) {
					pilha.push(elemento);
				}else {
					fila.enqueue(elemento);
				}
				elemento = InOut.LeInt("Entre com um numero inteiro ou 0 para sair ");

			}
		
		
			InOut.msgDeInformacao("Informação", "pilha é " + pilha.top());
			InOut.msgDeInformacao("Informação", "fila é " + pilha.top());s

	}
}
