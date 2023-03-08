import java.util.Arrays;

public class VetVendedor {
    
    private Vendedor vetor[];
    private int nElem;
 
  
    public VetVendedor(int tamanho) {
        super();
        this.vetor = new Vendedor[tamanho];
        this.nElem = 0;
    }

    
    public Vendedor getVetor(int indice) {
        return this.vetor[indice];
    }

   
    public void setVetor(int indice, Vendedor novo) {
        this.vetor[indice] = novo;
    }

    
    public int getNElem() {
        return nElem;
    }

    public void setNElem(int novo) {
        this.nElem = novo;
    }


    @Override
    public String toString() {
        return "VetVendedor [nElem=" + nElem + ", vetor=" + Arrays.toString(vetor) + "]";
    }


    //inserindo doados do meu vetor 
    public boolean inserirUsuario(Vendedor novo){
        if(this.nElem==this.vetor.length){
            return false;
        }else {
            this.vetor[this.nElem]= novo;
            this.nElem++;
            return true;
        }
    }

          // PESQUISAR  FUNCIONARIO NO VETOR PELO NOME
    public int pesquisarNome(String nome){
        for(int i=0;i<this.nElem;i++){
            if(this.vetor[i].getNome()==nome){
                return i;
            }
        }
        return this.nElem;
    }

    //REMOVER FUNCIONARIO DO VETOR;
    public boolean removerDados(String nome){
        if(this.nElem==0){
            return false;
        }else{
            for(int i=0;i<this.nElem && this.vetor[i].getNome()!= nome;i++) {
            
            
                if(i==this.nElem){
                    return false;
                }else{
                    this.vetor[i]=this.vetor[this.nElem-1];
                    this.nElem--;
                    return true;
                    
                }
            }
            return true;
        }
    }

    
}
