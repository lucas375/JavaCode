import java.util.Scanner;

public class EstoqueVetor {
    private Estoque vetor[];
    private int quantVetor;
    
    
    
    public EstoqueVetor( int tamanho) {
        super();
        this.vetor = new Estoque [tamanho];
        this.quantVetor = 0;
    }


    public Estoque getVetor(int indice) {
        return this.vetor[indice];
    }

  
    public void setVetor (int indice, Estoque vetor) {
        this.vetor[indice] = vetor;
    }

    public int getQuantVetor() {
        return quantVetor;
    }

    public void setQuantVetor(int quantVetor) {
        this.quantVetor = quantVetor;
    }


    @Override
    public String toString() {
        String resposta=" ";
        for(int i=0;i<this.quantVetor;i++){
            resposta += (i+1)+ "."+"Nome: "+ this.vetor[i].getDescriçao() +" "+"\n Quantidade: " +  this.vetor[i].getQuantEstoque() ; 
        }
        return resposta;
    }
    


    public void DiferencaProduto() {
        Scanner scan = new Scanner(System.in); 
            int codigo;
            double diferenca;
            System.out.println("Informe o codigo:");
            codigo = scan.nextInt();
           
        try {
            int i = pesquisarCodigo(codigo);
            diferenca = (this.vetor[i].getPreçoFinal() - this.vetor[i].getPreçoInical()); 
            
            if(codigo >1){
              System.out.println("O lucro do produto é:R$"+diferenca);
            }
             
        }catch(Exception e){
            System.out.println("O codigo informado era nulo ou nao existe");
        }
           
           
    }  
    public boolean inserirDados(Estoque novo){
        if(this.quantVetor==this.vetor.length){
            return false;
        }else {
            this.vetor[this.quantVetor]= novo;
            this.quantVetor++;
            return true;
        }
    }     
       // PESQUISAR A POSIÇÃO DE UM ALUNO NO VETOR;
       public int pesquisarCodigo(int codigo){
        for(int i=0;i<this.quantVetor; i++){
            if (this.vetor[i].getCodigo()==codigo){
            return i;
        }
    }
    return this.quantVetor; 
  }

  
}
    