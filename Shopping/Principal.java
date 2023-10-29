public class Principal
{
    public static void main(String[] args) {
        int menuLoja;
        // menuLoja 3 opções

        Loja loja1 = null;
        Produto produto1 = null;

        do {
            System.out.println("----- MENU -----");
            System.out.println("\n(1) Criar uma loja!");
            System.out.println("\n(2) Criar um produto!");
            System.out.println("\n(3) Sair");
            menuLoja = ClasseTeclado.leInt("\nQual dos itens você deseja criar? ");

            if (menuLoja == 1){
                System.out.println("\nCriando loja");
                System.out.println("------------");
                String nome = ClasseTeclado.leString("\nInforme o nome da Loja: ");
                int quantidadeFuncionarios = ClasseTeclado.leInt("\nInforme o número de funcionários: ");
                double salarioBaseFuncionario = ClasseTeclado.leDouble("\nInforme o salário dos funcionários: R$ ");

                System.out.println("\nQual o endereço da Loja?");
                Endereco endereco = new Endereco(ClasseTeclado.leString("Qual o nome da Rua: "), ClasseTeclado.leString("Qual o número? "), 
                        ClasseTeclado.leString("Qual o complemento? "), 
                        ClasseTeclado.leString("Qual o CEP da Rua? "),
                        ClasseTeclado.leString("Digite o nome da cidade: "), 
                        ClasseTeclado.leString("Digite o nome do Estado: "),
                        ClasseTeclado.leString("Digite o nome do País: "));

                System.out.println("\nInforme a data de fundação da loja?");
                Data dataFundacao = new Data(ClasseTeclado.leInt("Dia: "), ClasseTeclado.leInt("Mês: "), ClasseTeclado.leInt("Ano: "));

                loja1 = new Loja (nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
                System.out.println(loja1.toString());

            } else if (menuLoja == 2) {
                System.out.println("\nCriando produto");
                System.out.println("---------------");
                String nome = ClasseTeclado.leString("\nInforme um produto: ");
                double preco = ClasseTeclado.leDouble("\nInforme o preço do produto: R$ ");

                System.out.println("\nInforme a data de validade do produto:");
                Data dataValidade = new Data(ClasseTeclado.leInt("Dia: "), ClasseTeclado.leInt("Mês: "), ClasseTeclado.leInt("Ano: "));

                produto1 = new Produto(nome, preco, dataValidade);  
                System.out.println(produto1.toString());

            } else if (menuLoja != 3) {
                System.out.println("\nOpção inválida!");
            }
        } while (menuLoja != 3);

        if (produto1.estaVencido(new Data(20, 10, 2023))){
            System.out.println("\nPRODUTO VENCIDO");
            System.out.println(produto1.toString());
        } else {
            System.out.println("\nPRODUTO NÃO VENCIDO");
            System.out.println(produto1.toString());
        }
    }
}