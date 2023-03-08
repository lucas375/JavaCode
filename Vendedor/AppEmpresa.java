import java.util.Scanner;

public class AppEmpresa extends Vendedor  {
    static Scanner scan = new Scanner(System.in);

    public static void main (String[]args){
       int opcao; 
       VetVendedor vendedor = new VetVendedor(30);
       do{
        switch(opcao = menu()){
            case 1:
            break;
            case 2:
            break;
            case 4:
            break;
            default:
            System.out.println("Opção invalida");
        }
    } while(opcao!=4);

 }
       
        public static int menu() {
       
        System.out.println( "1.Cadastrar um vendedor no arquivo:\n"+
                            "2.Consultar o total de vendedor de uma determinada categoria\n"+
                            "3.Media de vendas das categorias.\n"+
                            "4.Excluir um vendedor do arquivo.\n"+
                            "5.Finalizar operaçôes");
                            return(scan.nextInt());
       
        }


    static void cadastrarVendedor(){

    }
    
    public String Resposta(){
        Scanner scan = new Scanner(System.in);
        String resposta = " ";
        char categoria;
        System.out.println("Informe a categoria: A - B - C");
        categoria = scan.next().toUpperCase().charAt(0);
        for(int i=0;i<this.nElem;i++){
            if(categoria == this.vetor[i].getCategoria){
                resposta += (i+1)+ "."+ this.vetor[i].getCategoria()+"."+"NOME: "+ this.vetor[i].getNome
            }else{

            }
        }
        return resposta;
    }





}
