//Lojas do Shopping

public class Loja 
{
   private String nome;
   private int quantidadeFuncionarios;
   private double salarioBaseFuncionario;
   private Endereco endereco;
   private Data dataFundacao;
   private Produto estoqueProdutos[];
   private int quantidadeMaximaProdutos;
   
   //construtores 1
   public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos) {
       this.nome = nome;
       this.quantidadeFuncionarios = quantidadeFuncionarios;
       this.salarioBaseFuncionario = salarioBaseFuncionario;
       this.endereco = endereco;
       this.dataFundacao = dataFundacao;
       estoqueProdutos = new Produto[quantidadeMaximaProdutos];
   }
   
   //construtores 2  
   //Loja loja1 = new Loja ("E3", 5, e1, d1);
   public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos) {
       this.nome = nome;
       this.quantidadeFuncionarios = quantidadeFuncionarios;
       this.salarioBaseFuncionario = -1;
       this.endereco = endereco;
       this.dataFundacao = dataFundacao;
       this.quantidadeMaximaProdutos = quantidadeMaximaProdutos;
       this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
   }
    
   
    // getters
   public String getNome() {
        return nome;
   }
       
   public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
   }
        
   public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
   } 
   
   public Endereco getEndereco() {
       return endereco;
   }
   
   public Data getDataFundacao() {
       return dataFundacao;
   }
   
   public Produto[] getEstoqueProdutos()  {
        return estoqueProdutos;
    }
   
   
    //setters
   public void setNome(String nome) {
        this.nome = nome;
   }
    
   public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
       this.quantidadeFuncionarios = quantidadeFuncionarios;
   }
    
   public void setSalarioBaseFuncionario(double salarioBaseFuncionario) { 
        this.salarioBaseFuncionario = salarioBaseFuncionario;
   }
   
   public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
   }
       
   public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
   }
         
   public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }
        
    // metodo gastosComSalario 
   public double gastosComSalario() {
        if (salarioBaseFuncionario == -1) {
            return -1;
        } else {
            return quantidadeFuncionarios * salarioBaseFuncionario;
        }
   }
   
   // metodo tamanhoDaLoja
   public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10) {
            return 'P';
        } else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }
   }     
      
   //arrays
   //este método não recebe parâmetros e imprime a informação de todos os produtos da loja
   public void imprimeProdutos() {
        for (Produto produto : estoqueProdutos) {
            if (produto != null) {
                System.out.println(produto.toString()+estoqueProdutos.length);
            }
        }
   }
   
   
   //este método recebe um Produto por parâmetro e insere-o na primeira posição livre do array de estoque desta loja
   public boolean insereProduto(Produto nomeProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = nomeProduto;
                return true;
            }
        }
        return false; // Não há espaço disponível no estoque
   }
       
   
   //este método recebe uma String que representa o nome de um produto e remove o produto correspondente do estoque. 
   public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)) {
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false; // Produto não encontrado no estoque
   }
         
   //toString
   public String toString() {
        return ("Nome da Loja: " + nome + ". Tem fuincionários: " + quantidadeFuncionarios + ". E tem de gasto com o salário dos funcionários: R$ " 
        + salarioBaseFuncionario + "\nFica no endereço: " + endereco.toString() + "\nE a loja foi fundada em: " + dataFundacao.toString() 
        + "Quantidade de produtos no estoque: " + estoqueProdutos.length); 
   }
}