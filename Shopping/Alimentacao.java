
public class Alimentacao extends Loja
{
   private Data dataAlvara;
         
   //construtor
   public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara, int quantidadeMaximaProdutos){
       super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
       this.dataAlvara = dataAlvara;
   }
   
   //get e set
    public Data getDataAlvara(){
       return dataAlvara;
   }
   
   public void setDataAlvara(Data dataAlvara){
        this.dataAlvara = dataAlvara;
   }
   
   
   //super toString polimorfismo 
   public String toString(){
        return(super.toString() + "\nData Alvara: " + dataAlvara.toString()); 
   }
}