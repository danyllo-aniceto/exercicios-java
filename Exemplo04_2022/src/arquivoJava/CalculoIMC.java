package arquivoJava;

import javax.swing.JOptionPane;


public class CalculoIMC {// ABERTURA DA CLASSE CalculoIMC

    
    public static void main(String[] args) {// ABERTURA DA "função" MÉTODO PRINCIPAL MAIN 
        
        double peso, altura, imc;
        String nome, aux, situacao;
        
        nome   =  JOptionPane.showInputDialog(null, "Digite seu nome: ");
        aux    =  JOptionPane.showInputDialog(null, "Digite seu peso: ");
        peso   =  Double.parseDouble(aux);
        aux    =  JOptionPane.showInputDialog(null, "Digite sua altura: ");
        altura =  Double.parseDouble(aux);
        
        imc = peso / (altura * altura);
        
        if(imc < 18.5)
        {
            situacao = "Magro";
        }
        else if(imc >= 18.5 && imc <= 24.9)
        {
            situacao = "Normal";
        }
        else if(imc >= 25 && imc <= 29.9)
        {
            situacao = "Sobrepeso";
        }    
        else if(imc >= 30 && imc <= 39.9)
        {
            situacao = "Obesidade";
        }    
        else
        {
            situacao = "Obesidade grave";
        }    
        
        JOptionPane.showMessageDialog(null, " Nome: " + nome + "\n Peso: " + peso + " Kg\n Altura: " + altura + " cm\n IMC: " + imc + "\n Situação: " + situacao );
    }// FECHAMENTO DA "função" MÉTODO PRINCIPAL MAIN 
    
}// FECHAMENTO DA CLASSE CalculoIMC
