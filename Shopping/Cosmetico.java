

public class Cosmetico extends Loja
{
   private double taxaComercializacao;
   
   
   //construtor
   public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco enderecoLoja, Data dataFundacao, int quantidadeMaximaProdutos, double taxaComercializacao){
       super(nome, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataFundacao, quantidadeMaximaProdutos);
       this.taxaComercializacao = taxaComercializacao;
   }
   
   //get e set
    public double getTaxaComercializacao(){
       return taxaComercializacao;
   }
   
   public void setTaxaComercializacao(double taxaComercializacao){
        this.taxaComercializacao = taxaComercializacao;
   }
   
    public double taxaComercializacao(){
        if (taxaComercializacao == -1){
            return -1;
        } else {
            return taxaComercializacao * 30;
        }
   }
   
   //super toString polimorfismo sobrescrita 
   public String toString(){
        return(super.toString() + "\nA taxa de comercialização foi de: " + taxaComercializacao); 
   }
}