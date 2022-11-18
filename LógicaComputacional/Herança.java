package objetos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Janela extends javax.swing.JFrame {

    ArrayList<Aluno> lista = new ArrayList<>();

    public Janela() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        campoCpf = new javax.swing.JTextField();
        campoMatricula = new javax.swing.JTextField();
        campoIdade = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        labelCpf = new javax.swing.JLabel();
        labelMatricula = new javax.swing.JLabel();
        labelIdade = new javax.swing.JLabel();
        btnCadastra = new javax.swing.JButton();
        btnEdita = new javax.swing.JButton();
        btnLista = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        labelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        labelTitulo.setText("Cadastro de Alunos");
        jPanel1.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 390, 60));
        jPanel1.add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 240, -1));
        jPanel1.add(campoCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 240, -1));
        jPanel1.add(campoMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 110, -1));
        jPanel1.add(campoIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 60, -1));

        labelNome.setText("Nome:");
        jPanel1.add(labelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        labelCpf.setText("CPF:");
        jPanel1.add(labelCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        labelMatricula.setText("MatrÃ­cula:");
        jPanel1.add(labelMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        labelIdade.setText("Idade:");
        jPanel1.add(labelIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        btnCadastra.setText("Cadastrar");
        btnCadastra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCadastra.setBorderPainted(false);
        btnCadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastraActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 90, 30));

        btnEdita.setText("Editar");
        btnEdita.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEdita.setBorderPainted(false);
        btnEdita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditaActionPerformed(evt);
            }
        });
        jPanel1.add(btnEdita, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 90, 30));

        btnLista.setText("Listar");
        btnLista.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLista.setBorderPainted(false);
        btnLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaActionPerformed(evt);
            }
        });
        jPanel1.add(btnLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 90, 30));

        btnRemove.setText("Remover");
        btnRemove.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRemove.setBorderPainted(false);
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        jPanel1.add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 210, 90, 30));

        labelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/objetos/images/sala.png"))); // NOI18N
        labelFundo.setToolTipText("");
        jPanel1.add(labelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastraActionPerformed
        try {
            String nome = campoNome.getText();
            int idade = Integer.parseInt(campoIdade.getText());
            String cpf = campoCpf.getText();
            String matricula = campoMatricula.getText();
            Aluno a = new Aluno(nome, idade, cpf, matricula);
            JOptionPane.showMessageDialog(this, "Aluno " + a.getNome() + " Cadastrado com sucesso!");
            lista.add(a);
            campoNome.setText("");
            campoIdade.setText("");
            campoCpf.setText("");
            campoMatricula.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Verifique as informaÃ§Ãµes");
        }

    }//GEN-LAST:event_btnCadastraActionPerformed

    private void btnListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaActionPerformed
        String alunos = "Alunos";
        for (Aluno a : lista) {
            alunos += "\n_________\nNome: " + a.getNome() + "\nIdade: " + a.getIdade() + "\nCPF: " + a.getCpf() + "\nMatrícula: " + a.getMatricula();
        }
        JOptionPane.showMessageDialog(this, alunos);
    }//GEN-LAST:event_btnListaActionPerformed

    private void btnEditaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditaActionPerformed
        String Matricula = JOptionPane.showInputDialog(this, "Digite a matrícula que deseja editar:");
        String mensagem = "MatrÃ­cula nÃ£o encontrada";
        for (Aluno a : lista) {
            if (Matricula.equals(a.getMatricula())) {
                mensagem = "Aluno editado com sucesso!";
                String[] opcoes = {"Nome", "Idade", "CPF", "Matricula"};
                int opcao = JOptionPane.showOptionDialog(this, "O que deseja editar?", a.getNome(), WIDTH, WIDTH, null, opcoes, opcoes[0]);

                switch (opcao) {
                    case 0:
                        a.setNome(JOptionPane.showInputDialog(this, "Digite um novo nome:"));
                        break;
                    case 1:
                        try {
                            a.setIdade(Integer.parseInt(JOptionPane.showInputDialog(this, "Digite um novo nome:")));
                        } catch (Exception e) {
                            mensagem = "Valor invalido";
                        }

                        break;
                    case 2:
                        a.setCpf(JOptionPane.showInputDialog(this, "Digite o novo CPF:"));
                        break;
                    case 3:
                        a.setMatricula(JOptionPane.showInputDialog(this, "Digite uma nova matrícula:"));
                        break;
                }

            }
        }
        JOptionPane.showInputDialog(this, mensagem);
    }//GEN-LAST:event_btnEditaActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        String Matricula = JOptionPane.showInputDialog(this, "Digite a matrícula que deseja remover:");
        String mensagem = "Matrícula não encontrada";

        for (Aluno a : lista) {
            if (Matricula.equals(a.getMatricula())) {
                lista.remove(a);
                mensagem = " Aluno removido do sistema!";
                break;

            }

        }
        JOptionPane.showMessageDialog(this, mensagem);

    }//GEN-LAST:event_btnRemoveActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastra;
    private javax.swing.JButton btnEdita;
    private javax.swing.JButton btnLista;
    private javax.swing.JButton btnRemove;
    private javax.swing.JTextField campoCpf;
    private javax.swing.JTextField campoIdade;
    private javax.swing.JTextField campoMatricula;
    private javax.swing.JTextField campoNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelFundo;
    private javax.swing.JLabel labelIdade;
    private javax.swing.JLabel labelMatricula;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
