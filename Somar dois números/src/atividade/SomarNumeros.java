package atividade;

import javax.swing.JOptionPane;

public class SomarNumeros {
    /*** ATRIBUTOS ***/
    public float n1;
    public float n2;
    public float soma;
    
    /*** METODOS ***/
    public void somaDoisNumeros()
    {// abertura do metodo
        String aux;
        aux = JOptionPane.showInputDialog(null, "Informe o primeiro valor: ");
        this.n1 = Float.parseFloat(aux);
        aux = JOptionPane.showInputDialog(null, "Informe o segundo valor: ");
        this.n2 = Float.parseFloat(aux);
        this.soma = this.n1 + this.n2;
        JOptionPane.showMessageDialog(null, "A soma de "+this.n1+" + " +this.n2+ " = " +this.soma);
    }// fechamento do metodo 
}
