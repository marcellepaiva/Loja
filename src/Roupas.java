//Marcelle Paiva ADS noturno 2 semestre

public class Roupas {
    public String descricao;
    public double vl;
    private String sexo; 
    private String tamanho; 
    public double calcularacrescimo; 
    
       public String getsexo()
    {
        return this.sexo;
    }

    public String setsexo(String sexo) {
       return this.sexo = sexo;
    }

    public String gettamanho() {
        return this.tamanho;
    }

   public String settamanho(String tamanho) {
        return this.tamanho = tamanho;
    }

    public double getCalcularacrescimo() {
        return calcularacrescimo;
    }

    public void Calcularacrescimo(double Calcularacrescimo) {
        this.calcularacrescimo = Calcularacrescimo;
    } 
    
}