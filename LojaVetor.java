import java.util.Scanner;
public class LojaVetor {
    
    private Loja [] vetor;
    private int quantVetor;
    
    
    
    public LojaVetor( int quantVetor) {
        super ();
        this.vetor = new Loja[quantVetor];
        this.quantVetor = 0;
    }

   
    public Loja [] getVetor(int posicao) {
        return vetor;
    }

   
    public void setVetor(Loja [] vetor) {
        this.vetor = vetor;
    }

  
    public int getQuantVetor() {
        return quantVetor;
    }

    
    public void setQuantVetor(int quantVetor) {
        this.quantVetor = quantVetor;
    }

    //inserris um funcionario no vetor;
    public boolean inserisDados(Loja novo){
        if(this.quantVetor==this.vetor.length){
            return false;
        }else{
            this.vetor[this.quantVetor] = novo;
            this.quantVetor++;
            return true;
        }
    }

  // PESQUISAR  FUNCIONARIO NO VETOR PELA MATRICULA 
public int pesquisarCodigo(int codigo){
    for (int i=0;i<this.quantVetor;i++){
        if (this.vetor[i].getCodigoFuncionario() == codigo){
            return i;
        }
    }
    return this.quantVetor;
}

//REMOVER FUNCIONARIO DO VETOR;
public boolean removerDados(int codigo){
    if(this.quantVetor==0){
        return false;
    }else{
        int i=0;
        while (i < this.quantVetor && this.vetor[i].getCodigoFuncionario()!= codigo){
            i++;
        }
        if (i==this.quantVetor){
            return false;

        }else{
            this.vetor[i]=this.vetor[this.quantVetor-1];
            this.quantVetor--;
            return true;
        }
    }
}
@Override
public String toString() {
    Scanner scan = new Scanner(System.in);
    String resposta=" ";
    char mercadoria;
    System.out.println("Informe a mercadoria: P – perecível, N – não perecível ");
    mercadoria = scan.next().toUpperCase().charAt(0);
    for(int i=0;i<this.quantVetor;i++){
        
        if(mercadoria == this.vetor[i].getMercadoria()){
            resposta += (i+1)+ "."+ this.vetor[i].getMercadoria()+"."+" Nome: "+ this.vetor[i].getNomeFuncionario(); 
        }else {
            
        }
        
    }
    return resposta;
  
   
  
  
}



}
