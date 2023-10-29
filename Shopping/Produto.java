
public class Produto
{
    private String nome;
    private double preco;
    public Data dataValidade;
    
    //construtor
    public Produto(String nome, double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }  
       
    // getters e setters
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
        
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public Data getDataValidade(){
        return dataValidade;
    }
    public void setDataValidade(Data dataValidade){
        this.dataValidade = dataValidade;
    }
    
    
    //vencido
    public boolean estaVencido(Data recebeData){
        if(recebeData.getAno() < dataValidade.getAno())
          return false;
        else if(recebeData.getAno() == dataValidade.getAno())
            if(recebeData.getMes() < dataValidade.getMes())
                return false;
            else if(recebeData.getMes() == dataValidade.getMes())    
                if (recebeData.getDia() <= dataValidade.getDia())
                    return false;
        return true;
    }

    //toString
    public String toString(){
        return ("Nome do Produto: " + nome + " Custa: R$ " + preco + "\nE tem validade: " + dataValidade.toString()); 
    }
}