package com.projeto_clinicahospitalar.front_end;

import com.projeto_clinicahospitalar.back_end.Genero;
import com.projeto_clinicahospitalar.back_end.ListasDeControle;
import com.projeto_clinicahospitalar.back_end.Paciente;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CrudPaciente extends javax.swing.JFrame {

    public CrudPaciente() {
        initComponents();
        this.setVisible(true);
        //dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPaciente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        MenuAnterior = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        editarPaciente = new javax.swing.JButton();
        apagarPaciente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tabelaPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome Completo", "Idade", "Nascimento", "Genero", "Cadastro", "Endereço", "Contato", "Obs Geral", "Nome Respo", "Contato Resp"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaPaciente);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText("Pacientes");

        MenuAnterior.setText("Menu Anterior");
        MenuAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAnteriorActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Selecione uma linha da tabela caso queira editar ou remover um paciente:");

        editarPaciente.setText("Editar");
        editarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarPacienteActionPerformed(evt);
            }
        });

        apagarPaciente.setText("Remover");
        apagarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1078, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(editarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(apagarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(MenuAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(441, 441, 441)
                        .addComponent(jLabel1)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MenuAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(apagarPaciente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tabelaPaciente.getModel();
        modelo.setRowCount(0); // limpa a tabela
        for (Paciente p : ListasDeControle.ListaPaciente) {
            modelo.addRow(new Object[]{
                p.getIdPaciente(),
                p.getNomeCompleto(),
                p.getIdade(),
                p.getDataNascimento(), // rever - imprimindo sem ser texto formatado
                p.getGenero(),
                p.getDataCadastro(), /// igual nasc
                p.getEndereco().toString(),
                p.getContato().toString(),
                p.getObsGeral(),
                p.getResponsavel().getNomeResponsavel(),
                p.getResponsavel().getCelular()
            });
    }//GEN-LAST:event_formWindowOpened
    }
    private void MenuAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAnteriorActionPerformed
        // TODO add your handling code here:
        MenuPaciente pacMENU = new MenuPaciente();
        this.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuAnteriorActionPerformed

    private void apagarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarPacienteActionPerformed
        // TODO add your handling code here:
        int row = tabelaPaciente.getSelectedRow(); //garante que uma linha seja selecionada
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um paciente para remover.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tabelaPaciente.getModel();
        Long id = (Long) model.getValueAt(row, 0); //pega o id 

        Paciente p = buscarPacientePorId(id); //procura o id na lista especifica
        if (p == null) {
            JOptionPane.showMessageDialog(this, "Paciente não encontrado.");
            return;
        }

        //pedindo confirmação antes de remover
        int confirm = JOptionPane.showConfirmDialog(this,
                "Deseja realmente remover o paciente: " + p.getNomeCompleto() + "?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            ListasDeControle.ListaPaciente.remove(p);
            /*remove do arrayList*/
            model.removeRow(row);
            /* remove a linha da tabela*/
            JOptionPane.showMessageDialog(this, "Paciente removido com sucesso.");
        }
    }//GEN-LAST:event_apagarPacienteActionPerformed

    private void editarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarPacienteActionPerformed
        // TODO add your handling code here:
        int row = tabelaPaciente.getSelectedRow(); //numero da linha selecionada
        if (row == -1) { //caso nada seja selcionado, ele para
            JOptionPane.showMessageDialog(this, "Selecione uma célula para editar diretamente na tabela.");
            return;
        }
        //obtem o modelo e recupera o id do paciente
        DefaultTableModel model = (DefaultTableModel) tabelaPaciente.getModel();
        Long id = (Long) model.getValueAt(row, 0);
        Paciente p = buscarPacientePorId(id); //busca o pacinte
        if (p == null) {
            return;
        }

        // Formulário inline com todos os campos editáveis
        JTextField nomeField = new JTextField(p.getNomeCompleto());
        JTextField idadeField = new JTextField(String.valueOf(p.getIdade()));
        JTextField dataNascField = new JTextField(String.valueOf(p.getDataNascimento()));;
        JTextField obsField = new JTextField(p.getObsGeral());
        
        //editar genero
        String[] generos = {"MASCULINO", "FEMININO"};
        JComboBox<String> generoComboBox = new JComboBox<>(generos);
        generoComboBox.setSelectedItem(p.getGenero());

        JTextField ruaField = new JTextField(p.getEndereco().getRua());
        JTextField numeroField = new JTextField(p.getEndereco().getNumero());
        JTextField bairroField = new JTextField(p.getEndereco().getBairro());
        JTextField cidadeField = new JTextField(p.getEndereco().getCidade());
        JTextField estadoField = new JTextField(p.getEndereco().getEstado());
        JTextField cepField = new JTextField(p.getEndereco().getCep());
        
        JTextField celularField = new JTextField(p.getContato().getCelular());
        JTextField emailField = new JTextField(p.getContato().getEmail());

        JTextField nomeRespField = new JTextField(p.getResponsavel().getNomeResponsavel());
        JTextField celularRespField = new JTextField(p.getResponsavel().getCelular());

        JPanel panel = new JPanel(new GridLayout(0, 2, 5, 5));
        panel.setPreferredSize(new Dimension(500, 600));
        panel.add(new JLabel("Nome Completo:"));
        panel.add(nomeField);
        panel.add(new JLabel("Idade:"));
        panel.add(idadeField);
        panel.add(new JLabel("Data Nascimento:"));
        panel.add(dataNascField);
        panel.add(new JLabel("Observações:"));
        panel.add(obsField);
        panel.add(new JLabel("Gênero:"));
        panel.add(generoComboBox);
        panel.add(new JLabel("Rua:"));
        panel.add(ruaField);
        panel.add(new JLabel("Número:"));
        panel.add(numeroField);
        panel.add(new JLabel("Bairro:"));
        panel.add(bairroField);
        panel.add(new JLabel("Cidade:"));
        panel.add(cidadeField);
        panel.add(new JLabel("Estado:"));
        panel.add(estadoField);
        panel.add(new JLabel("Cep:"));
        panel.add(cepField);
        panel.add(new JLabel("Celular:"));
        panel.add(celularField);
        panel.add(new JLabel("Email:"));
        panel.add(emailField);
        panel.add(new JLabel("Nome do Responsável:"));
        panel.add(nomeRespField);
        panel.add(new JLabel("Celular do Responsável:"));
        panel.add(celularRespField);

        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setPreferredSize(new Dimension(250, 620));
        int result = JOptionPane.showConfirmDialog(this, panel, "Editar Paciente",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            try {
                // sincroniza/atualiza os dados da tabela com o objeto Paciente
                p.setNomeCompleto(nomeField.getText());
                //p.setIdade(Integer.parseInt(idadeField.getText()));
                Integer idade = validarInteiro(numeroField, "Número", 1, 999);
                if (idade == null) {
                    return;
                } 
                p.setIdade(idade);
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                p.setDataNascimento(sdf.parse(dataNascField.getText()));
                p.setGenero(Genero.valueOf((String) generoComboBox.getSelectedItem()));
                
                p.setObsGeral(obsField.getText());
                
                //editar endereco
                p.getEndereco().setRua(ruaField.getText());
                //p.getEndereco().setNumero(Integer.parseInt(numeroField.getText()));
                Integer numero = validarInteiro(numeroField, "Número", 1, 99999);
                if (numero == null) {
                    return;
                }
                p.getEndereco().setNumero(numero);
                p.getEndereco().setBairro(bairroField.getText());
                p.getEndereco().setCidade(cidadeField.getText());
                p.getEndereco().setEstado(estadoField.getText());
                //p.getEndereco().setCep(Integer.parseInt(cepField.getText()));
                Integer cep = validarInteiro(cepField, "CEP", 1, 99999999);
                if (cep == null) {
                    return;
                }
                p.getEndereco().setCep(cep);
                
                //editar contato
                p.getContato().setCelular(celularField.getText());
                p.getContato().setEmail(emailField.getText());
                
                // editar responsavel 
                p.getResponsavel().setNomeResponsavel(nomeRespField.getText());
                p.getResponsavel().setCelular(celularRespField.getText());

                // Atualiza os valores na JTable - célula
                model.setValueAt(p.getNomeCompleto(), row, 1);
                model.setValueAt(p.getIdade(), row, 2);
                model.setValueAt(p.getEndereco().toString(), row, 6);
                model.setValueAt(p.getContato().toString(), row, 7);
                model.setValueAt(p.getObsGeral(), row, 8);
                model.setValueAt(p.getResponsavel().getNomeResponsavel(), row, 9);
                model.setValueAt(p.getResponsavel().getCelular(), row, 10);
                model.setValueAt(p.getDataNascimento(), row, 3);
                model.setValueAt(p.getGenero(), row, 4);


                JOptionPane.showMessageDialog(this, "Paciente atualizado com sucesso.");
            } catch (ParseException pe) {
                JOptionPane.showMessageDialog(this, "Data inválida. Use o formato dd/MM/yyyy.");
                return;
            } catch (NumberFormatException e) {
                e.printStackTrace(); // aparecer o erro no prompt
                JOptionPane.showMessageDialog(this, "Idade inválida.");
            }
        }
    }//GEN-LAST:event_editarPacienteActionPerformed

    private Paciente buscarPacientePorId(Long id) {
        for (Paciente p : ListasDeControle.ListaPaciente) {
            if (p.getIdPaciente() == id) {
                return p;
            }
        }
        return null;
    }
    
    private Integer validarInteiro(JTextField campo, String nomeCampo, int min, int max) { //resolver problemas com numericos
        String texto = campo.getText().trim();
        if (texto.isEmpty()) {
            JOptionPane.showMessageDialog(this, nomeCampo + " não pode estar vazio.");
            return null;
        }
        try {
            int valor = Integer.parseInt(texto);
            if (valor < min || valor > max) {
                JOptionPane.showMessageDialog(this, nomeCampo + " deve estar entre " + min + " e " + max + ".");
                return null;
            }
            return valor;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, nomeCampo + " inválido. Digite apenas números.");
            return null;
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrudPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MenuAnterior;
    private javax.swing.JButton apagarPaciente;
    private javax.swing.JButton editarPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaPaciente;
    // End of variables declaration//GEN-END:variables
}
