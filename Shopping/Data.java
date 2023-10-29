
// dia, mes, ano e ano bissexto
 
public class Data 
{
   private int dia;
   private int mes;
   private int ano;  
    
    
    //construtor
   public Data(int dia, int mes, int ano)
   {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        if (dataValida(dia, mes, ano)){
         } else {
            System.out.println("Data inválida! Alterando para a data padrão: 1/1/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
   }
    
   private boolean dataValida(int dia, int mes, int ano){
        if (mes < 1 || mes > 12 || dia < 1 || dia > diasMes(mes, ano)){
            return false;
        }
        return true;
   }
    
   private boolean verificaData(int dia, int mes, int ano){
        if (ano < 1){
            return false;
        }
        if (mes < 1 || mes > 12){
            return false;
        }
        if (dia < 1 || dia > diasMes(mes, ano)){
            return false;
        }
        return true;
   }
    
   private int diasMes(int mes, int ano){
        switch (mes){
            case 2:
            if (verificaAnoBissexto()){
                    return 29;
             } else {
                    return 28;
             }
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
   }
    
    // getters e setters
   public int getDia(){
        return dia;
   }
   public void setDia(int dia){
        this.dia = dia;
   }
    
   public int getMes(){
        return mes;
   }
   public void setMes(int mes){
        this.mes = mes;
   }
    
   public int getAno(){
        return ano;
   }
   public void setAno(int ano){
        this.ano = ano;
   }
          
   
    //metodo verifica se ano é bissexto
   public boolean verificaAnoBissexto(){
        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0){
            return true;
        } else {
            return false;
        }
   }
   
   
    //toString
   public String toString(){
        return (dia + "/" + mes + "/" + ano);
   }
}