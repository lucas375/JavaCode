
public class Loja {
    
    private String nomeFuncionario;
    private int codigoFuncionario;
    private char mercadoria;
    
    // CONSTRUTOR 

    public Loja(String nomeFuncionario, int codigoFuncionario, char mercadoria) {
        this.nomeFuncionario = nomeFuncionario;
        this.codigoFuncionario = codigoFuncionario;
        this.mercadoria = mercadoria;
    }
  
    public Loja(){
        this.nomeFuncionario = " ";
        this.codigoFuncionario = 0;
        this.mercadoria = ' ';
    }  

    // GET E SET 

    
  
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

   
    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    
    public char getMercadoria() {
        return mercadoria;
    }

  
    public void setMercadoria(char mercadoria) {
        this.mercadoria = mercadoria;
    }

    // TOSTRING 


    @Override
    public String toString() {
        return "Loja [codigoFuncionario=" + codigoFuncionario + ", mercadoria=" + mercadoria + ", nomeFuncionario="
                + nomeFuncionario + "]";
    }


    
    


}
