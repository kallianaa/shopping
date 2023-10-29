
public class Vestuario extends Loja{

    private boolean produtosImportados;
    
     
   //construtor
   public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados, int quantidadeMaximaProdutos){
       super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
       this.produtosImportados = produtosImportados;
   }
   
   //get e set
   public boolean getProdutosImportados(){
       return produtosImportados;
   }
    public void setProdutosImportados(boolean produtosImportados){
       this.produtosImportados = produtosImportados;
   }


   //super toString polymorphism
   public String toString(){
        return(super.toString() + "Nome='" + getNome() + '\'' + ", endereco='" + getEndereco() + '\'' + ", produtosImportados=" + produtosImportados);
   }

}