public class Estoque {
 private int codigo;
 private String descriçao;
 private double preçoInical;
 private double preçoFinal;
 private int quantEstoque;
 private int estoqueMinimo;
  
  
    public Estoque(int codigo, String descriçao, double preçoInical, double preçoFinal, int quantEstoque,
            int estoqueMinimo) {
        this.codigo = codigo;
        this.descriçao = descriçao;
        this.preçoInical = preçoInical;
        this.preçoFinal = preçoFinal;
        this.quantEstoque = quantEstoque;
        this.estoqueMinimo = estoqueMinimo;
    }

    public Estoque(){
        this.codigo = 0;
        this.descriçao = " ";
        this.preçoInical = 0;
        this.preçoFinal = 0;
        this.quantEstoque = 0;
        this.estoqueMinimo = 0;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public double getPreçoInical() {
        return preçoInical;
    }

    public double getPreçoFinal() {
        return preçoFinal;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }

    public void setPreçoInical(double preçoInical) {
        this.preçoInical = preçoInical;
    }

    public void setPreçoFinal(double preçoFinal) {
        this.preçoFinal = preçoFinal;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public String toString() {
        return "Estoque [codigo=" + codigo + ", descriçao=" + descriçao + ", estoqueMinimo=" + estoqueMinimo
                + ", preçoFinal=" + preçoFinal + ", preçoInical=" + preçoInical + ", quantEstoque=" + quantEstoque
                + "]";
    }


    



}
