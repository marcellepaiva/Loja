//Marcelle Paiva ADS noturno 2 semestre

import javax.swing.JOptionPane;


public class Principal {


    public static void main(String[] args) {
        
    Eletrodomestico ele = new Eletrodomestico();
    
        ele.descricao = JOptionPane.showInputDialog("Digite a descrição do produto: ");
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "));
        ele.setvoltagem(Integer.parseInt(JOptionPane.showInputDialog("Digite a voltagem : ")));
        ele.setpotencia(Integer.parseInt(JOptionPane.showInputDialog("Digite a potencia: ")));
        double calculardesconto=preco-preco*0.10; 
        ele.valor=preco;   
        JOptionPane.showMessageDialog(null, "[ELETRODOMESTICO]\n\nDescrição: "+ele.descricao+"\nValor do produto: "+ele.valor+"\nVoltagem: "+ele.getvoltagem()+"\nPotencia: "+ele.getpotencia()+"\nValor do desconto: "+calculardesconto); 
        
        
   Roupas rou = new Roupas(); 
   
        rou.descricao = JOptionPane.showInputDialog("Digite a descrição da roupa: ");
        double v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da roupa: "));
        rou.setsexo(JOptionPane.showInputDialog("Digite seu sexo: "));
        rou.settamanho(JOptionPane.showInputDialog("Digite o tamanho: "));
        double calcularacrescimo =v2+v2*0.10;
        rou.vl=v2; 
        JOptionPane.showMessageDialog(null, "[ROUPAS]\n\nDescrição: "+rou.descricao+"\nValor da roupa: "+rou.vl+"\nSexo: "+rou.getsexo()+"\nTamanho: "+rou.gettamanho()+"\nValor do acrescimo: "+calcularacrescimo); 
   
       
        
    }
      
}

