package atividade;

import javax.swing.JOptionPane;

public class Dog {
    private String nome;
    private int idade;
    private String raca;
    private float tamanho;
    private int sexo;
 
    public void pegarDados(){
        String aux;
        this.nome    =  JOptionPane.showInputDialog(null, "Informe o nome do cachorro");
        aux          =  JOptionPane.showInputDialog(null, "Informe a idade do cachorro");
        this.idade   =  Integer.parseInt(aux);
        this.raca    =  JOptionPane.showInputDialog(null, "Informe a raça do cachorro");
        aux          =  JOptionPane.showInputDialog(null, "Informe o tamanho do cachorro");
        this.tamanho =  Float.parseFloat(aux);
        aux          =  JOptionPane.showInputDialog(null, "Digite [1] para masculino \n[2] para feminino");
        this.sexo    =  Integer.parseInt(aux);
    }
    
    public void latir(){
        
        switch(this.sexo)
        {
            case 1:
                 JOptionPane.showMessageDialog(null, "Au au auuu! Nossa quando " + this.nome + " começa a latir ele não para mais... Essa raça "
                 + raca + " deveria ter um botão de volume de latido, que altura!!!" );
                 JOptionPane.showMessageDialog(null, "Fique quieto "+this.nome);
            break;
            
            case 2:
                 JOptionPane.showMessageDialog(null, "Au au auuu! Nossa quando " + this.nome + " começa a latir ela não para mais... Essa raça "
                 + raca + " deveria ter um botão de volume de latido, que altura!!!" );
                 JOptionPane.showMessageDialog(null, "Fique quieta "+this.nome);
            break;    
            
            default:
                JOptionPane.showMessageDialog(null, "Erro de digitação! Escolha entre 1 ou 2 para escolher o sexo do animal.");
                vericaSexo();
                rolar();
            break;        
        
        }
       
    }
    
    public void comer(){
        
        switch(this.sexo)
        {
            case 1:
                JOptionPane.showMessageDialog(null, "DING DING DING! Hora de comer, " + this.nome + " está faminto temos que sustentar esse " 
                + this.tamanho + " cm de altura!");
            break;
            
            case 2:
                JOptionPane.showMessageDialog(null, "DING DING DING! Hora de comer, " + this.nome + " está faminta temos que sustentar esse " 
                + this.tamanho + " cm de altura!");
            break;    
            
            default:
                JOptionPane.showMessageDialog(null, "Erro de digitação! Escolha entre 1 ou 2 para escolher o sexo do animal.");
                vericaSexo();
                rolar();
            break;
        }    
        
    }
    
    public void correr(){
        
        switch(this.sexo)
        {
            case 1:
                JOptionPane.showMessageDialog(null, "Você viu isso? " + this.nome + " já pode ser considerado o cachorro The Flash de tanto que "
                +"corre! Não importa idade, ele com seu(s) " + this.idade + " ano(s) de idade irá continar correndo pra sempre!!!");
            break;
            
            case 2:
                JOptionPane.showMessageDialog(null, "Você viu isso? " + this.nome + " já pode ser considerada a cadela The Flash de tanto que "
                +"corre! Não importa idade, ela com seu(s) " + this.idade + " ano(s) de idade irá continar correndo pra sempre!!!");
            break;
          
            default:
                JOptionPane.showMessageDialog(null, "Erro de digitação! Escolha entre 1 ou 2 para escolher o sexo do animal.");
                vericaSexo();
                correr();
            break;
        }    
        
    }
    
    public void rolar(){
        
        switch(this.sexo)
        {
            case 1:
                JOptionPane.showMessageDialog(null, "Nossa que sujeira de cachorro! Quem deixou o "+ this.nome +" ficar rolando no quintal?");
            break;
            
            case 2:
                JOptionPane.showMessageDialog(null, "Nossa que sujeira de cadela! Quem deixou a "+ this.nome +" ficar rolando no quintal?");
            break;
            
            default:
                JOptionPane.showMessageDialog(null, "Erro de digitação! Escolha entre 1 ou 2 para escolher o sexo do animal.");
                vericaSexo();
                rolar();
            break;
        }    
        
    }
    public void vericaSexo()
    {
        this.sexo =0 ;
        while(this.sexo<1 ||  this.sexo >2 )
        {
            this.sexo = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o sexo do cachorro"));
        }
            
    }

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
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
    
    
    
    
    
    
}   
