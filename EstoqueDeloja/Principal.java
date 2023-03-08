import java.util.Scanner;

public class Principal {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)  {
       
        int opcao;
        EstoqueVetor estoque = new EstoqueVetor(40);
        do{
            switch (opcao = menu()){
                case 1:
                cadastrarProduto(estoque);
                break;
                case 2:
                lucroDoProduto(estoque);
                break;
                case 3:
                Estoque(estoque);
                break;
                case 4:
                System.out.println("FIM");
                break;
                default:
                System.out.println("Opção incorreta");
                break;
                
            }
        }while(opcao !=4);
    }
    public static int menu(){
        System.out.println("1: Cadastrar produto:\n"+
                           "2: Lucro do produto \n"+     
                           "3: Mostrar todo estoque\n"+
                           "4: Finalizar operações" );
                           return(scan.nextInt());
    }

    public static void cadastrarProduto(EstoqueVetor t){
        Estoque estoque = new Estoque();
        int codigo;
        String descriçao;
        double preçoInical;
        double preçoFinal;
        int quantEstoque;
        System.out.println("Digite o codigo:");
        codigo = scan.nextInt();
        estoque.setCodigo(codigo);
        System.out.println("Descrição do produto:");
        descriçao = scan.next();
        estoque.setDescriçao(descriçao);
        System.out.println("Preço de compra:");
        preçoInical = scan.nextDouble();
        estoque.setPreçoInical(preçoInical);
        System.out.println("Preço de venda:");
        preçoFinal = scan.nextDouble();
        estoque.setPreçoFinal(preçoFinal);
        System.out.println("Quantidade do produto");
        quantEstoque = scan.nextInt();
        estoque.getQuantEstoque();
        t.inserirDados(estoque);



    }

    public static void lucroDoProduto(EstoqueVetor t){
        t.DiferencaProduto();
    }

    public static void Estoque (EstoqueVetor t){
        System.out.println(t.toString());
    }


}
