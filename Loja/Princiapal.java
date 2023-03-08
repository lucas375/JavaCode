import java.util.Scanner;

public class Princiapal {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)  {
    int opcao;
    LojaVetor loja = new LojaVetor(30);
        do{
            
            switch(opcao = menu()){
                case 1:
                cadastrarVendedor(loja);
                break;
                case 2:
                pesquisarVendedor(loja);
                break;
                case 3:
                excluirVendedor(loja);
                break;
                case 4:
                System.out.println("FIM");
                default:
                System.out.println("Opção invalida");
            }                    
         }while(opcao !=4 );
  
    }

    public static int menu (){
        System.out.println( "1.Cadastrar um vendedor no arquivo(vetor)\n"+
                                "2.Consultar o total de vendedor de um determinado tipo mercadoria. .\n"+
                                "3.Excluir um vendedor do arquivo (Vetor)\n"+
                                "4.Finalizar operações");  
                                return(scan.nextInt());
 
     
    }

static void cadastrarVendedor(LojaVetor t){
        Loja loja = new Loja();
        int cod;
        String nome;
        char mercadoria;
        System.out.println("Informe o codigo do vendedor:");
        cod = scan.nextInt();
        loja.setCodigoFuncionario(cod);
        System.out.println("Informe o nome do vendedor:");
        nome = scan.next();
        loja.setNomeFuncionario(nome);
        System.out.println("Informe a mercadoria: P – perecível, N – não perecível ");
        mercadoria = scan.next().toUpperCase().charAt(0);
        loja.setMercadoria(mercadoria);
        
        if(t.inserisDados(loja)){
            System.out.println("Operação realizada com sucesso");
        }else{
            System.out.println("Operação nao realizada. Vendedor nao encontrado");
        }
         
 }
static void pesquisarVendedor(LojaVetor t){
   System.out.println(t.toString());

}
static void excluirVendedor(LojaVetor t){
    int cod;
    System.out.println("Digite o codigo do vendedro");
    cod = scan.nextInt();
    if(t.removerDados(cod)){
        System.out.println("Operação realizada com sucesso");
    }else{
        System.out.println("Operação nao realizada. Vendedor nao encontrado");
    }
}

}
