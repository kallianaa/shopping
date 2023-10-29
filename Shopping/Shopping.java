import java.util.Arrays;

public class Shopping{
    private String nome;
    private Endereco endereco;
    private Loja lojas[];

    public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas){
        this.nome = nome;
        this.endereco = endereco;
        lojas = new Loja[quantidadeMaximaLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }
    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }


    //insereLoja
    public boolean insereLoja(Loja nomeLoja){
        for (int i = 0; i < lojas.length; i++){
            if(lojas[i] == null){
                lojas[i] = nomeLoja;
                return true;
            }
        }
        return false;
    }

    //removeLoja
    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    //quantidadeLojasPorTipo
    public int quantidadeLojasPorTipo(String tipoLoja) {
        int cont = 0;
        for (Loja loja : lojas) {
            if (loja != null) {
                if (loja instanceof Cosmetico && tipoLoja.equalsIgnoreCase("Cosmético")) {
                    cont++;
                } else if (loja instanceof Vestuario && tipoLoja.equalsIgnoreCase("Vestuário")) {
                    cont++;
                } else if (loja instanceof Bijuteria && tipoLoja.equalsIgnoreCase("Bijuteria")) {
                    cont++;
                } else if (loja instanceof Alimentacao && tipoLoja.equalsIgnoreCase("Alimentação")) {
                    cont++;
                } else if (loja instanceof Informatica && tipoLoja.equalsIgnoreCase("Informática")) {
                    cont++;
                }
            }
        }
        if (cont > 0) {
            return cont;
        } else {
            return -1;
        }
    }

    //lojaSeguroMaisCaro
    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaSeguroMaisCaro = null;
            double maisCaro = 0;
        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica informatica = (Informatica) loja;
                if (informatica.getSeguroEletronicos() > maisCaro) {
                    maisCaro = informatica.getSeguroEletronicos();
                    lojaSeguroMaisCaro = informatica;
                }
            }
        }
        return lojaSeguroMaisCaro;
    }


    // public String toString()
    public String toString(){
        return "Shopping(" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", lojas=" + Arrays.toString(lojas) +
                ')';
    }
}