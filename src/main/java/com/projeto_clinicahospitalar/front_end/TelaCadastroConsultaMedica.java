
package com.projeto_clinicahospitalar.front_end;

import com.projeto_clinicahospitalar.back_end.ConsultaMedica;
import com.projeto_clinicahospitalar.back_end.Medico;
import com.projeto_clinicahospitalar.back_end.Paciente;
import com.projeto_clinicahospitalar.back_end.ListasDeControle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.table.DefaultTableModel;


public class TelaCadastroConsultaMedica extends javax.swing.JFrame {

    public TelaCadastroConsultaMedica() {
        initComponents();
        this.setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowOpened(WindowEvent e) {
                carregarPacientesNaTabela();
                carregarMedicosNaTabela();
            }
        });
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_ExameQueixa_CC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Diagnosticos_CC = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_PrescricaoCC = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_IC_SIM_CC = new javax.swing.JCheckBox();
        LimparDados = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_Paciente = new javax.swing.JTable();
        RegistrarDados = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabela_Medico = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txt_IC_NAO_CC1 = new javax.swing.JCheckBox();
        retornarMenuConsMed = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_ExameQueixa_CC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ExameQueixa_CCActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Diagnóstico:");

        txt_Diagnosticos_CC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Diagnosticos_CCActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Prescrição:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Indicação Cirurgica?");

        txt_IC_SIM_CC.setText("Sim");
        txt_IC_SIM_CC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IC_SIM_CCActionPerformed(evt);
            }
        });

        LimparDados.setText("Limpar Dados");
        LimparDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparDadosActionPerformed(evt);
            }
        });

        Tabela_Paciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id ", "Nome", "Nascimento", "Genero", "Obs Geral"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabela_Paciente);

        RegistrarDados.setText("Registrar Dados");
        RegistrarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarDadosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText("Cadastro de Consultas");

        Tabela_Medico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "CRM", "Especialidade", "Cirurgião"
            }
        ));
        jScrollPane2.setViewportView(Tabela_Medico);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Exame Queixa:");

        txt_IC_NAO_CC1.setText("Não");
        txt_IC_NAO_CC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IC_NAO_CC1ActionPerformed(evt);
            }
        });

        retornarMenuConsMed.setText("Voltar ao Menu de Consultas Médicas");
        retornarMenuConsMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retornarMenuConsMedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_IC_SIM_CC)
                                .addGap(4, 4, 4)
                                .addComponent(txt_IC_NAO_CC1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_ExameQueixa_CC, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Diagnosticos_CC, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_PrescricaoCC, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LimparDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RegistrarDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(retornarMenuConsMed)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_ExameQueixa_CC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Diagnosticos_CC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txt_PrescricaoCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LimparDados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_IC_SIM_CC)
                    .addComponent(RegistrarDados)
                    .addComponent(txt_IC_NAO_CC1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(retornarMenuConsMed, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_ExameQueixa_CCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ExameQueixa_CCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ExameQueixa_CCActionPerformed

    private void txt_Diagnosticos_CCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Diagnosticos_CCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Diagnosticos_CCActionPerformed

    private void txt_IC_SIM_CCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IC_SIM_CCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IC_SIM_CCActionPerformed

    private void RegistrarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarDadosActionPerformed
        // TODO add your handling code here:
        try {
            String queixa = txt_ExameQueixa_CC.getText().trim();
            String diagnostico = txt_Diagnosticos_CC.getText().trim();
            String prescricao = txt_PrescricaoCC.getText().trim();
            boolean indicacaoCirurgica; // verificação da opção marcada
            if (txt_IC_SIM_CC.isSelected()) {
                indicacaoCirurgica = true;
            } else if (txt_IC_NAO_CC1.isSelected()) {
                indicacaoCirurgica = false;
            } else {
                throw new IllegalArgumentException("Selecione se é indicado para cirurgia ou não.");
            }

            if (queixa.isEmpty() || diagnostico.isEmpty() || prescricao.isEmpty()) {
                throw new IllegalArgumentException("Todos os campos devem ser preenchidos.");
            }
            //conversões
            long idConsultaMedica = System.currentTimeMillis();

            ConsultaMedica consultaMedica = new ConsultaMedica(
                    idConsultaMedica,
                    getPaciente().getIdPaciente(),
                    getPaciente().getNomeCompleto(),
                    getMedico().getIdMedico(),
                    getMedico().getNomeCompleto(),
                    queixa,
                    diagnostico,
                    prescricao,
                    indicacaoCirurgica
            );

            Paciente paciente = getPaciente();
            paciente.adicionarConsulta(consultaMedica);
            carregarPacientesNaTabela(); // <- Atualiza a tabela com histórico
            
            Medico medico = getMedico();
            //medico.adicionarConsulta(consultaMedica); //rever - acho que não precisa pq medico nao tem historico de consulta
            carregarMedicosNaTabela();
            
            //adicionando no array
            ListasDeControle.ListaConsultaMedica.add(consultaMedica);

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Idade e/ou datas e/ou números devem ser valores numéricos.", "Erro de Entrada", javax.swing.JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage(), "Erro de Validação", javax.swing.JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace(); // aparecer o erro no prompt
            javax.swing.JOptionPane.showMessageDialog(this, "Ocorreu um erro inesperado.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_RegistrarDadosActionPerformed

    private void txt_IC_NAO_CC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IC_NAO_CC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IC_NAO_CC1ActionPerformed

    private void LimparDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparDadosActionPerformed
        // TODO add your handling code here:
        LimparDados();
    }//GEN-LAST:event_LimparDadosActionPerformed

    private void retornarMenuConsMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retornarMenuConsMedActionPerformed
        // TODO add your handling code here:
        //limpar todos os campos
        LimparDados();
        
        //chamar o menu medico
        MenuConsultaMedica menuConsMed = new MenuConsultaMedica();
        menuConsMed.setVisible(true);
        dispose();;
    }//GEN-LAST:event_retornarMenuConsMedActionPerformed

    
    private void LimparDados(){
        txt_ExameQueixa_CC.setText(" ");
        txt_Diagnosticos_CC.setText( " ");
        txt_PrescricaoCC.setText(" ");
    }
    
    private Paciente getPaciente() {
        int index = Tabela_Paciente.getSelectedRow();
        if (index >= 0 && index < ListasDeControle.ListaPaciente.size()) {
            return ListasDeControle.ListaPaciente.get(index);
        }
        throw new IllegalArgumentException("Nenhum paciente selecionado.");
    }

    private Medico getMedico() {
        int index = Tabela_Medico.getSelectedRow();
        if (index >= 0 && index < ListasDeControle.ListaMedico.size()) {
            return ListasDeControle.ListaMedico.get(index);
        }
        throw new IllegalArgumentException("Nenhum médico selecionado.");
    }

    public void carregarPacientesNaTabela() {
        DefaultTableModel model = (DefaultTableModel) Tabela_Paciente.getModel();
        model.setRowCount(0);

        for (Paciente p : ListasDeControle.ListaPaciente) {
            model.addRow(new Object[]{
                p.getIdPaciente(),
                p.getNomeCompleto(),
                p.getDataNascimento(),
                p.getGenero(),
                p.getObsGeral()
            });
        }
    }
    
    public void carregarMedicosNaTabela(){
        DefaultTableModel model = (DefaultTableModel) Tabela_Medico.getModel();
        model.setRowCount(0);
        
        for(Medico m : ListasDeControle.ListaMedico){
            model.addRow(new Object[]{
                m.getIdMedico(),
                m.getNomeCompleto(),
                m.getNumeroCRM(),
                m.getAreasEspecialidade(),
                m.isCirurgiao()
            });
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
        java.util.logging.Logger.getLogger(TelaCadastroConsultaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(TelaCadastroConsultaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(TelaCadastroConsultaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(TelaCadastroConsultaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new TelaCadastroConsultaMedica().setVisible(true);
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LimparDados;
    private javax.swing.JButton RegistrarDados;
    private javax.swing.JTable Tabela_Medico;
    private javax.swing.JTable Tabela_Paciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton retornarMenuConsMed;
    private javax.swing.JTextField txt_Diagnosticos_CC;
    private javax.swing.JTextField txt_ExameQueixa_CC;
    private javax.swing.JCheckBox txt_IC_NAO_CC1;
    private javax.swing.JCheckBox txt_IC_SIM_CC;
    private javax.swing.JTextField txt_PrescricaoCC;
    // End of variables declaration//GEN-END:variables
}
