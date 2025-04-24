package com.projeto_clinicahospitalar.front_end;

import com.projeto_clinicahospitalar.back_end.Enfermeiro;
import com.projeto_clinicahospitalar.back_end.Genero;
import com.projeto_clinicahospitalar.back_end.ListasDeControle;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CrudEnfermeiro extends javax.swing.JFrame {

    public CrudEnfermeiro() {
        initComponents();
        this.setVisible(true);
        //dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        MenuAnterior = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEnfermeiro = new javax.swing.JTable();
        editarEnfermeiro = new javax.swing.JButton();
        apagarEnfermeiro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText("Enfermeiros");

        MenuAnterior.setText("Menu Anterior");
        MenuAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAnteriorActionPerformed(evt);
            }
        });

        tabelaEnfermeiro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome Completo", "Nascimento", "Genero", "Endereço", "Contato", "Operador RX", "Setor", "Carga H Semanal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaEnfermeiro);

        editarEnfermeiro.setText("Editar");
        editarEnfermeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarEnfermeiroActionPerformed(evt);
            }
        });

        apagarEnfermeiro.setText("Remover");
        apagarEnfermeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarEnfermeiroActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Selecione uma linha da tabela caso queira editar ou remover um enfermeiro:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(editarEnfermeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(apagarEnfermeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(MenuAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(455, 455, 455)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editarEnfermeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apagarEnfermeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MenuAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAnteriorActionPerformed
        // TODO add your handling code here:
        MenuEnfermeiro enfMENU = new MenuEnfermeiro();
        this.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuAnteriorActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tabelaEnfermeiro.getModel();
        modelo.setRowCount(0); // limpa a tabela
        for (Enfermeiro e : ListasDeControle.ListaEnfermeiro) {
            modelo.addRow(new Object[]{
                e.getIdEnfermeiro(),
                e.getNomeCompleto(),
                e.getDataNascimento(),
                e.getGenero(),
                e.getEndereco(),
                e.getContato(),
                e.isTreinadoOpRaioX(),
                e.getSetor(),
                e.getCargaHorariaSemanal()
            });
        }

    }//GEN-LAST:event_formWindowOpened

    private void editarEnfermeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarEnfermeiroActionPerformed
        // TODO add your handling code here:
        int row = tabelaEnfermeiro.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma célula para editar diretamente na tabela.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tabelaEnfermeiro.getModel();
        Long id = (Long) model.getValueAt(row, 0);
        Enfermeiro e = buscarEnfermeiroPorId(id);
        if (e == null) {
            return;
        }

        JTextField nomeField = new JTextField(e.getNomeCompleto());
        JTextField dataNascField = new JTextField(String.valueOf(e.getDataNascimento()));
        String[] generos = {"MASCULINO", "FEMININO"};
        JComboBox<String> generoComboBox = new JComboBox<>(generos);
        generoComboBox.setSelectedItem(e.getGenero());

        // Radio Buttons: Operador de Raio-X
        JRadioButton radioSim = new JRadioButton("Sim");
        JRadioButton radioNao = new JRadioButton("Não");
        ButtonGroup raioXGroup = new ButtonGroup();
        raioXGroup.add(radioSim);
        raioXGroup.add(radioNao);
        if (e.isTreinadoOpRaioX()) {
            radioSim.setSelected(true);
        } else {
            radioNao.setSelected(true);
        }

        JTextField ruaField = new JTextField(e.getEndereco().getRua());
        JTextField numeroField = new JTextField(String.valueOf(e.getEndereco().getNumero()));
        JTextField bairroField = new JTextField(e.getEndereco().getBairro());
        JTextField cidadeField = new JTextField(e.getEndereco().getCidade());
        JTextField estadoField = new JTextField(e.getEndereco().getEstado());
        JTextField cepField = new JTextField(String.valueOf(e.getEndereco().getCep()));
        JTextField celularField = new JTextField(e.getContato().getCelular());
        JTextField emailField = new JTextField(e.getContato().getEmail());
        
        JTextField setorField = new JTextField(e.getSetor());
        JTextField cargaHorariaSemanalField = new JTextField(e.getCargaHorariaSemanal());
        
        
        JPanel panel = new JPanel(new GridLayout(0, 2, 2, 5));
        panel.setPreferredSize(new Dimension(500, 600));
        panel.add(new JLabel("Nome Completo:"));
        panel.add(nomeField);
        panel.add(new JLabel("Data Nascimento:"));
        panel.add(dataNascField);
        panel.add(new JLabel("Gênero:"));
        panel.add(generoComboBox);
        panel.add(new JLabel("É operador de Raio-X?"));
        panel.add(radioSim);
        panel.add(radioNao);
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
        panel.add(new JLabel("Setor:"));
        panel.add(setorField);
        panel.add(new JLabel("Carga Horária Semanal:"));
        panel.add(cargaHorariaSemanalField);

        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setPreferredSize(new Dimension(250, 620));
        int result = JOptionPane.showConfirmDialog(this, panel, "Editar Enfermeiro",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            try {
                e.setNomeCompleto(nomeField.getText());
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                e.setDataNascimento(sdf.parse(dataNascField.getText()));
                e.setGenero(Genero.valueOf((String) generoComboBox.getSelectedItem()));
                e.setTreinadoOpRaioX(radioSim.isSelected());

                e.getEndereco().setRua(ruaField.getText());
                e.getEndereco().setNumero(Integer.parseInt(numeroField.getText()));
                Integer numero = validarInteiro(numeroField, "Número", 1, 99999);
                if (numero == null) {
                    return;
                }
                e.getEndereco().setNumero(numero);
                e.getEndereco().setBairro(bairroField.getText());
                e.getEndereco().setCidade(cidadeField.getText());
                e.getEndereco().setEstado(estadoField.getText());
                //e.getEndereco().setCep(Integer.parseInt(cepField.getText()));
                Integer cep = validarInteiro(cepField, "CEP", 1, 99999999);
                if (cep == null) {
                    return;
                }
                e.getEndereco().setCep(cep);

                e.getContato().setCelular(celularField.getText());
                e.getContato().setEmail(emailField.getText());
                
                e.setSetor(setorField.getText()); // ✅ correto
                //e.setCargaHorariaSemanal(Integer.parseInt(cargaHorariaSemanalField.getText()));
                Integer carga = validarInteiro(cargaHorariaSemanalField, "Carga Horária", 0, 80);
                if (carga == null) {
                    return;
                }
                e.setCargaHorariaSemanal(carga);

                model.setValueAt(e.getNomeCompleto(), row, 1);
                model.setValueAt(e.getEndereco().toString(), row, 4);
                model.setValueAt(e.getGenero(), row, 3);
                model.setValueAt(e.isTreinadoOpRaioX(), row, 6);
                model.setValueAt(e.getContato().toString(), row, 5);
                model.setValueAt(e.getSetor(), row, 7);
                model.setValueAt(e.getCargaHorariaSemanal(), row, 8);
                model.setValueAt(e.getDataNascimento(), row, 2);

                JOptionPane.showMessageDialog(this, "Paciente atualizado com sucesso.");
            } catch (ParseException pe) {
                JOptionPane.showMessageDialog(this, "Data inválida. Use o formato dd/MM/yyyy.");
                return;
            } catch (NumberFormatException x) {
                x.printStackTrace();
                JOptionPane.showMessageDialog(this, "Número ou CEP inválido.");
            }
        }
    }//GEN-LAST:event_editarEnfermeiroActionPerformed

    private void apagarEnfermeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarEnfermeiroActionPerformed
        // TODO add your handling code here:
        int row = tabelaEnfermeiro.getSelectedRow(); //garante que uma linha seja selecionada
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um paciente para remover.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tabelaEnfermeiro.getModel();
        Long id = (Long) model.getValueAt(row, 0); //pega o id

        Enfermeiro e = buscarEnfermeiroPorId(id); //procura o id na lista especifica
        if (e == null) {
            JOptionPane.showMessageDialog(this, "Paciente não encontrado.");
            return;
        }

        //pedindo confirmação antes de remover
        int confirm = JOptionPane.showConfirmDialog(this,
                "Deseja realmente remover o paciente: " + e.getNomeCompleto() + "?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            ListasDeControle.ListaPaciente.remove(e);
            /*remove do arrayList*/
            model.removeRow(row);
            /* remove a linha da tabela*/
            JOptionPane.showMessageDialog(this, "Paciente removido com sucesso.");
        }
    }//GEN-LAST:event_apagarEnfermeiroActionPerformed

    private Enfermeiro buscarEnfermeiroPorId(Long id) {
        for (Enfermeiro e : ListasDeControle.ListaEnfermeiro) {
            if (e.getIdEnfermeiro() == id) {
                return e;
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
            java.util.logging.Logger.getLogger(CrudEnfermeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudEnfermeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudEnfermeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudEnfermeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudEnfermeiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MenuAnterior;
    private javax.swing.JButton apagarEnfermeiro;
    private javax.swing.JButton editarEnfermeiro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaEnfermeiro;
    // End of variables declaration//GEN-END:variables
}
