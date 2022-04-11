package main;

import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem vindo ao nosso cadastro de alunos! Cadastre seu filho ");
        String nome = JOptionPane.showInputDialog("Nome do Aluno:");
        String idade = JOptionPane.showInputDialog("Idade do Aluno:");
        String cpf = JOptionPane.showInputDialog("CPF do Aluno:");
        String confir = JOptionPane.showInputDialog("Deseja procurar algum aluno?");
        
        if (confir.equals("sim")||confir.equals("Sim")) {
            String cpf2 = JOptionPane.showInputDialog("Digite o CPF do aluno:");
            if(cpf.equals(cpf2)){
                JOptionPane.showMessageDialog(null,"Aluno: "+nome+", idade: "+idade+" anos,"+" CPF: "+cpf);
                }
            else{
                 JOptionPane.showMessageDialog(null, "Aluno não encontrado!");

            }
        } else {
            sair();
        }
    }
    public static void sair() {
        JOptionPane.showMessageDialog(null, "Até a próxima!");
    }

}
