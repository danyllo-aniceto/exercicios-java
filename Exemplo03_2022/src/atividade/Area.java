
package atividade;

import javax.swing.JOptionPane;


public class Area {

   
    public static void main(String[] args) {
         float base, altura, area;
         String aux;
     
         aux = JOptionPane.showInputDialog(null, "Informe a base de um triangulo: ");
         base = Float.parseFloat(aux);
         aux = JOptionPane.showInputDialog(null, "Informe a altura de um triangulo: ");
         altura = Float.parseFloat(aux);
     
         area = (base * altura) / 2;
     
         JOptionPane.showMessageDialog(null, "A area do triangulo é: " + area + " m².");
     
    }
    
}
