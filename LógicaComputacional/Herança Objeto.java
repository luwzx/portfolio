package javaapplication7;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class AlunoII {

    
    public static void main(String[] args) {
    cadastrapessoa();
        
    }
    public static void cadastrapessoa(){
          int qnt = Integer.parseInt(JOptionPane.showInputDialog(null,"Deseja cadastrar quantos alunos?"));
      
      ArrayList<Aluno> lista= new ArrayList<>();
 
      
      for(int i=0; i<qnt ;i++ ){
          String nome= JOptionPane.showInputDialog(null,"Digite o nome:");
          
          String matricula=JOptionPane.showInputDialog(null,"Digite a matricula de "+nome);
          
          int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a idade de "+nome));
          
          String cpf= JOptionPane.showInputDialog(null,"Digite o CPF de "+nome);
          
          Aluno p= new Aluno(nome, idade, cpf, matricula);
          lista.add(p);
          
      }
      for(Aluno p:lista){
            JOptionPane.showMessageDialog(null,"Nome: "+p.getNome()+"\nMatricula: "+p.getMatricula()+
             "\nIdade: "+p.getIdade()+"\nCPF: "+p.getCPF());
        }
          
    
}
    
}


