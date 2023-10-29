
public class Bijuteria extends Loja
{
   private double metaVendas;
    
     
   //construtor
   public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos, double metaVendas){
       super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
       this.metaVendas = metaVendas;
   }
   
   //get e set
    public double getMetaVendas(){
       return metaVendas;
   }
   
   public void setMetaVendas(double metaVendas){
        this.metaVendas = metaVendas;
   }
   
   public double metaVendas(){
        if (metaVendas == -1){
            return -1;
        } else {
            return metaVendas * 30;
        }
   }
   
   //super toString polimorfismo
   public String toString(){
        return(super.toString() + "\nA meta de vendas do mês, foi de: R$ " + metaVendas); 
   }
}