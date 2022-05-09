package classes_Javas;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Pessoa Pes01 = new Pessoa(); // Criação do Objeto chamado Pes01 da Classe Pessoa
        Pes01.setNome(JOptionPane.showInputDialog(null, "Informe o nome do aluno(a) "));
        Pes01.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade do aluno(a): ")));
        Pes01.setEndereco(JOptionPane.showInputDialog(null, "Informe o endereço do aluno(a)"));
        Pes01.setTelefone(JOptionPane.showInputDialog(null,"Informe o telefone do açuno(a):"));
        
        JOptionPane.showMessageDialog(null, "Nome do Aluno(a): " + Pes01.getNome() + "\nIdade do Aluno(a): " + Pes01.getIdade()
        +" anos\nEndereço do Aluno(a): " + Pes01.getEndereco() + "\nTelefone do Aluno(a): " + Pes01.getTelefone()); 
    }
    
}
