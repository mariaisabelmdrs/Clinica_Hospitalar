package com.projeto_clinicahospitalar.front_end;

import com.projeto_clinicahospitalar.back_end.ExportarExcel;
import com.projeto_clinicahospitalar.back_end.ImportarExcel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
        this.setVisible(true);
        dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Menu_Paciente = new javax.swing.JButton();
        Menu_Medico = new javax.swing.JButton();
        Menu_Enfermeiro = new javax.swing.JButton();
        Menu_ConsultaMedica = new javax.swing.JButton();
        exportarExcel = new javax.swing.JButton();
        importarEcel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setFont(new java.awt.Font("Angellica- PERSONAL USE", 0, 36)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("UBS-SUS");

        Menu_Paciente.setText("Menu Paciente");
        Menu_Paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_PacienteActionPerformed(evt);
            }
        });

        Menu_Medico.setText("Menu Médico");
        Menu_Medico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_MedicoActionPerformed(evt);
            }
        });

        Menu_Enfermeiro.setText("Menu Enfermeiro");
        Menu_Enfermeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_EnfermeiroActionPerformed(evt);
            }
        });

        Menu_ConsultaMedica.setText("Menu Consulta Médica");
        Menu_ConsultaMedica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_ConsultaMedicaActionPerformed(evt);
            }
        });

        exportarExcel.setText("Exportar para Excel");
        exportarExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarExcelActionPerformed(evt);
            }
        });

        importarEcel.setText("Importar para Excel");
        importarEcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importarEcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Menu_ConsultaMedica, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(Menu_Medico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Menu_Enfermeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(exportarExcel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Menu_Paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(importarEcel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel1)))
                .addGap(0, 24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Menu_Medico, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Menu_Paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(importarEcel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Menu_ConsultaMedica, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Menu_Enfermeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exportarExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Menu_PacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_PacienteActionPerformed
        // TODO add your handling code here:
        MenuPaciente pacMENU = new MenuPaciente();
        this.setVisible(true);
        dispose();
    }//GEN-LAST:event_Menu_PacienteActionPerformed

    private void Menu_MedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_MedicoActionPerformed
        // TODO add your handling code here:
        MenuMedico medMENU = new MenuMedico();
        this.setVisible(true);
        dispose();
    }//GEN-LAST:event_Menu_MedicoActionPerformed

    private void Menu_EnfermeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_EnfermeiroActionPerformed
        // TODO add your handling code here:
        MenuEnfermeiro enfMENU = new MenuEnfermeiro();
        this.setVisible(true);
        dispose();
    }//GEN-LAST:event_Menu_EnfermeiroActionPerformed

    private void Menu_ConsultaMedicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_ConsultaMedicaActionPerformed
        // TODO add your handling code here:
        MenuConsultaMedica conmedMENU = new MenuConsultaMedica();
        this.setVisible(true);
        dispose();
    }//GEN-LAST:event_Menu_ConsultaMedicaActionPerformed

    private void exportarExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarExcelActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Salvar como Excel");

        if (chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                String caminho = chooser.getSelectedFile().getAbsolutePath();
                if (!caminho.toLowerCase().endsWith(".xlsx")) {
                    caminho += ".xlsx";
                }
                ExportarExcel.exportar(caminho); // ✅ Centraliza a exportação de todas as abas
                JOptionPane.showMessageDialog(this, "Exportado com sucesso para: " + caminho);
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Erro ao exportar: " + e.getMessage());
            }
        }

    }//GEN-LAST:event_exportarExcelActionPerformed

    private void importarEcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importarEcelActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Selecione o arquivo Excel para importar");

        try {
            JFileChooser fc = new JFileChooser();
            int escolha = fc.showOpenDialog(this);
            if (escolha == JFileChooser.APPROVE_OPTION) {
                String caminho = fc.getSelectedFile().getAbsolutePath();
                ImportarExcel.importar(caminho);
                JOptionPane.showMessageDialog(this, "Dados importados com sucesso!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro na importação: " + e.getMessage());
        }
    }//GEN-LAST:event_importarEcelActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Menu_ConsultaMedica;
    private javax.swing.JButton Menu_Enfermeiro;
    private javax.swing.JButton Menu_Medico;
    private javax.swing.JButton Menu_Paciente;
    private javax.swing.JButton exportarExcel;
    private javax.swing.JButton importarEcel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
