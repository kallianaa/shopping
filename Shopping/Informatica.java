
public class Informatica extends Loja
{
   private double seguroEletronicos;
    
     
   //construtor
   public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos, int quantidadeMaximaProdutos){
       super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
       this.seguroEletronicos = seguroEletronicos;
   }
   
   //get e set
    public double getSeguroEletronicos(){
       return seguroEletronicos;
   }
   
   public void setSeguroEletronicos(double seguroEletronicos){
        this.seguroEletronicos = seguroEletronicos;
   }
     
   //super toString polimorfismo 
   public String toString(){
        return(super.toString() + "\nO valor do seguro a ser pago neste mês, é de: R$ " + seguroEletronicos); 
   }
}