
package exemplo;


import javax.swing.JOptionPane;


public class Boletim {

   
    public static void main(String[] args) {// abertura da função principal
        float bim1, bim2, bim3, bim4, notaTotal;
        String aux, nome;
        
        nome = JOptionPane.showInputDialog(null, "Informe o nome do aluno(a): ");
        aux = JOptionPane.showInputDialog(null, "Informe a nota do 1º bimestre");
        bim1 = Float.parseFloat(aux);
        aux = JOptionPane.showInputDialog(null, "Informe a nota do 2º bimestre");
        bim2 = Float.parseFloat(aux);
        aux = JOptionPane.showInputDialog(null, "Informe a nota do 3º bimestre");
        bim3 = Float.parseFloat(aux);
        aux = JOptionPane.showInputDialog(null, "Informe a nota do 4º bimestre");
        bim4 = Float.parseFloat(aux);
        
        notaTotal = bim1 + bim2 + bim3 + bim4;
        
        if(notaTotal >= 60){
            JOptionPane.showMessageDialog(null, "\n Nome: " + nome + "\n Nota total: " + notaTotal + " pontos \n Situação: Aprovado");
        }else if(notaTotal < 30){
            JOptionPane.showMessageDialog(null, "\n Nome: " + nome + "\n Nota total: " + notaTotal + " pontos \n Situação: Reprovado");
        }else{
            JOptionPane.showMessageDialog(null, "\n Nome: " + nome + "\n Nota total: " + notaTotal + " pontos \n Situação: Recuperação");
        }
    }//fechamento da função principal
    
}
