//Marcelle Paiva ADS noturno 2 semestre

public class Eletrodomestico {
    
    public String descricao;
    public double valor;
    private int voltagem; 
    private int potencia; 
    public double calculardesconto; 
    
      public double getvoltagem()
    {
        return this.voltagem;
    }

    public void setvoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public double getpotencia() {
        return this.potencia;
    }

    public void setpotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getCalculardesconto() {
        return calculardesconto;
    }

    public void Calculardesconto(double Calculardesconto) {
        this.calculardesconto = Calculardesconto;
    } 
    
    
}
    

