package com.projeto_clinicahospitalar.front_end;

import com.projeto_clinicahospitalar.back_end.ConsultaMedica;
import com.projeto_clinicahospitalar.back_end.ListasDeControle;
import static com.projeto_clinicahospitalar.back_end.ListasDeControle.ListaMedico;
import static com.projeto_clinicahospitalar.back_end.ListasDeControle.ListaPaciente;
import com.projeto_clinicahospitalar.back_end.Medico;
import com.projeto_clinicahospitalar.back_end.Paciente;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CrudConsultaMedica extends javax.swing.JFrame {

    public CrudConsultaMedica() {
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
        tabelaConsultaMedica = new javax.swing.JTable();
        editarMedico = new javax.swing.JButton();
        apagarMedico = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText(" Consultas Médicas");

        MenuAnterior.setText("Menu Anterior");
        MenuAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAnteriorActionPerformed(evt);
            }
        });

        tabelaConsultaMedica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Consulta", "Id Paciente", "Nome Paciente", "Id Médico", "Nome Médico", "Exame Queixa", "Diagnostico", "Prescrição", "Indicação Cirurgica"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.Long.class, java.lang.String.class, java.lang.Long.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaConsultaMedica);

        editarMedico.setText("Editar");
        editarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarMedicoActionPerformed(evt);
            }
        });

        apagarMedico.setText("Remover");
        apagarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarMedicoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Selecione uma linha da tabela caso queira editar ou remover uma consulta médica:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(editarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(apagarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(MenuAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1033, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(357, 357, 357))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editarMedico, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(apagarMedico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MenuAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAnteriorActionPerformed
        // TODO add your handling code here:
        MenuConsultaMedica cmMENU = new MenuConsultaMedica();
        this.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuAnteriorActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tabelaConsultaMedica.getModel();
        modelo.setRowCount(0); // limpa a tabela

        for (ConsultaMedica cm : ListasDeControle.ListaConsultaMedica) {
            Medico medico = buscarMedicoPorId(cm.getIdMedico());
            Paciente paciente = buscarPacientePorId(cm.getIdPaciente());
            modelo.addRow(new Object[]{
                cm.getIdConsultaMedica(),
    cm.getIdPaciente(),
    cm.getNomePaciente(), // <- usa direto o valor do objeto
    cm.getIdMedico(),
    cm.getNomeMedico(),   // <- idem
    cm.getExameQueixa(),
    cm.getDiagnostico(),
    cm.getPrescricao(),
    cm.isIndicacaoCirurgica()
            });
        }
    }//GEN-LAST:event_formWindowOpened

    private void editarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarMedicoActionPerformed
        // TODO add your handling code here:
        int row = tabelaConsultaMedica.getSelectedRow(); //numero da linha selecionada
        if (row == -1) { //caso nada seja selcionado, ele para
            JOptionPane.showMessageDialog(this, "Selecione uma célula para editar diretamente na tabela.");
            return;
        }
        //obtem o modelo e recupera o id do paciente
        DefaultTableModel model = (DefaultTableModel) tabelaConsultaMedica.getModel();
        Long id = (Long) model.getValueAt(row, 0);
        ConsultaMedica cm = buscarConsultaMedicaPorId(id); //busca a consulta
        if (cm == null) {
            return;
        }
        Medico medico = buscarMedicoPorId(cm.getIdMedico());
        Paciente paciente = buscarPacientePorId(cm.getIdPaciente());

        // Formulário inline com todos os campos editáveis
        JLabel medicoLabel = new JLabel("Médico: " + (medico != null ? medico.getNomeCompleto() : "Desconhecido"));
        JLabel pacienteLabel = new JLabel("Paciente: " + (paciente != null ? paciente.getNomeCompleto() : "Desconhecido"));

        JTextField exameQueixaField = new JTextField(cm.getExameQueixa());
        JTextField diagnosticoField = new JTextField(String.valueOf(cm.getDiagnostico()));
        JTextField prescricaoField = new JTextField(String.valueOf(cm.getPrescricao()));

        // Radio Buttons: Cirurgiao
        JRadioButton indCirurgiaoSim = new JRadioButton("Sim");
        JRadioButton indCirurgiaoNao = new JRadioButton("Não");
        ButtonGroup indCirurgiaoGroup = new ButtonGroup();
        indCirurgiaoGroup.add(indCirurgiaoSim);
        indCirurgiaoGroup.add(indCirurgiaoNao);
        if (cm.isIndicacaoCirurgica()) {
            indCirurgiaoSim.setSelected(true);
        } else {
            indCirurgiaoNao.setSelected(true);
        }

        JPanel panel = new JPanel(new GridLayout(0, 1));
        //panel.add(new JLabel("Médico Responsável:"));
        panel.add(medicoLabel);
        //panel.add(new JLabel("Paciente:"));
        panel.add(pacienteLabel);
        panel.add(new JLabel("Exame Queixa:"));
        panel.add(exameQueixaField);
        panel.add(new JLabel("Diagnóstico:"));
        panel.add(diagnosticoField);
        panel.add(new JLabel("Prescrição:"));
        panel.add(prescricaoField);
        panel.add(new JLabel("É indicação cirurgica?"));
        panel.add(indCirurgiaoSim);
        panel.add(indCirurgiaoNao);

        int result = JOptionPane.showConfirmDialog(this, panel, "Editar Paciente",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            try {
                // sincroniza/atualiza os dados da tabela com o objeto Paciente
                cm.setExameQueixa(exameQueixaField.getText());
                cm.setDiagnostico(diagnosticoField.getText());
                cm.setPrescricao(prescricaoField.getText());
                cm.setIndicacaoCirurgica(indCirurgiaoSim.isSelected());

                // Atualiza os valores na JTable - célula
                model.setValueAt(cm.getExameQueixa(), row, 5);
                model.setValueAt(cm.getDiagnostico(), row, 6);
                model.setValueAt(cm.getPrescricao(), row, 7);
                model.setValueAt(cm.isIndicacaoCirurgica(), row, 8);

                JOptionPane.showMessageDialog(this, "Paciente atualizado com sucesso.");

            } catch (NumberFormatException x) {
                x.printStackTrace(); // aparecer o erro no prompt
                JOptionPane.showMessageDialog(this, "Idade inválida.");
            }

        }
    }//GEN-LAST:event_editarMedicoActionPerformed

    private void apagarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarMedicoActionPerformed
        // TODO add your handling code here:
        int row = tabelaConsultaMedica.getSelectedRow(); //garante que uma linha seja selecionada
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um paciente para remover.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tabelaConsultaMedica.getModel();
        Long id = (Long) model.getValueAt(row, 0); //pega o id

        ConsultaMedica cm = buscarConsultaMedicaPorId(id); //procura o id na lista especifica
        if (cm == null) {
            JOptionPane.showMessageDialog(this, "Paciente não encontrado.");
            return;
        }
        Medico medico = buscarMedicoPorId(cm.getIdMedico());
        Paciente paciente = buscarPacientePorId(cm.getIdPaciente());

        //pedindo confirmação antes de remover
        int confirm = JOptionPane.showConfirmDialog(this,
                "Deseja remover a consulta do paciente " + (paciente != null ? paciente.getNomeCompleto() : "Desconhecido")
                + " com o médico " + (medico != null ? medico.getNomeCompleto() : "Desconhecido") + "?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            ListasDeControle.ListaConsultaMedica.remove(cm);
            /*remove do arrayList*/
            model.removeRow(row);
            /* remove a linha da tabela*/
            JOptionPane.showMessageDialog(this, "Paciente removido com sucesso.");
        }
    }//GEN-LAST:event_apagarMedicoActionPerformed

    public Medico buscarMedicoPorId(long id) {
        for (Medico m : ListaMedico) {
            if (m.getIdMedico() == id) {
                return m;
            }
        }
        return null;
    }

    public Paciente buscarPacientePorId(long id) {
        for (Paciente p : ListaPaciente) {
            if (p.getIdPaciente() == id) {
                return p;
            }
        }
        return null;
    }

    private ConsultaMedica buscarConsultaMedicaPorId(Long id) {
        for (ConsultaMedica cm : ListasDeControle.ListaConsultaMedica) {
            if (cm.getIdConsultaMedica() == id) {
                return cm;
            }
        }
        return null;
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
            java.util.logging.Logger.getLogger(CrudConsultaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudConsultaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudConsultaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudConsultaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudConsultaMedica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MenuAnterior;
    private javax.swing.JButton apagarMedico;
    private javax.swing.JButton editarMedico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaConsultaMedica;
    // End of variables declaration//GEN-END:variables
}
