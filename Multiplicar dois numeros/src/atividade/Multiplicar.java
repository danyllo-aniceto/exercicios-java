package atividade;

import javax.swing.JOptionPane;

public class Multiplicar {
    /*** ATRIBUTOS DA CLASSE ***/
    public float n1;
    public float n2;
    public float mult;
    
    /*** METODOS CLASSE ***/
    public void multiplicacao(){
        String aux;
        aux = JOptionPane.showInputDialog(null, "Informe o primeiro número: ");
        this.n1 = Float.parseFloat(aux);
        aux = JOptionPane.showInputDialog(null, "Informe o segundo número: ");
        this.n2 = Float.parseFloat(aux);
        this.mult = this.n1 * this.n2;
        JOptionPane.showMessageDialog(null, "A multiplicação de: "+this.n1+" * "+this.n2+" = "+this.mult);
    }
    
}
