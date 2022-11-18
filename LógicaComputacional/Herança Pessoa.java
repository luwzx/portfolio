package javaapplication7;


public class Pessoa {
    
    String nome;
    int idade;
    String CPF;

    public Pessoa(String nome, int idade, String CPF) {
        
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
        
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

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

   
    
}


