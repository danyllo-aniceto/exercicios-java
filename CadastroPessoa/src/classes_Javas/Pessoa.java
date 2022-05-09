package classes_Javas;

import javax.swing.JOptionPane;

public class Pessoa {// Abertura da Classe Pessoa
    // Lista de Atributos
    private String nome;
    private int idade;
    private String endereco;
    private String telefone;
    // Metodos Getter e Setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        
        this.idade = idade;
        if(this.idade < 0)
        {
                JOptionPane.showMessageDialog(null, "Valor negativo para a idade!!!");
        }
        if(this.idade > 122)
        {
                JOptionPane.showMessageDialog(null, "Valor exagerado para a idade!");
        }
        while(this.idade < 0 || this.idade > 122)
        {
            this.idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade do Aluno: "));
            if(this.idade < 0)
            {
                JOptionPane.showMessageDialog(null, "Valor negativo para a idade!!!");
            }
            if(this.idade > 122)
            {
                JOptionPane.showMessageDialog(null, "Valor exagerado para a idade!");
            }    
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    
}// Fechamento da Classe Pessoa
