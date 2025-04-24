package com.projeto_clinicahospitalar.front_end;

import com.projeto_clinicahospitalar.back_end.Genero;
import com.projeto_clinicahospitalar.back_end.Medico;
import com.projeto_clinicahospitalar.back_end.ListasDeControle;
import java.awt.GridLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CrudMedico extends javax.swing.JFrame {

    public CrudMedico() {
        initComponents();
        this.setVisible(true);
        dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        MenuAnterior = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaMedico = new javax.swing.JTable();
        editarMedico = new javax.swing.JButton();
        apagarMedico = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText("Médicos");

        MenuAnterior.setText("Menu Anterior");
        MenuAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAnteriorActionPerformed(evt);
            }
        });

        tabelaMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome Completo", "Data Nasc", "CRM", "Endereço", "Genero", "Contato", "Cirurgião", "Especialidade", "Setor", "Carga H Semanal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaMedico);

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
        jLabel2.setText("Selecione um paciente caso queira editar ou remover:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Selecione uma linha da tabela caso queira editar ou remover um médico:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(458, 458, 458)
                .addComponent(jLabel1)
                .addContainerGap(516, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(editarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(apagarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(MenuAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(369, 369, 369))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1082, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(363, 363, 363)
                    .addComponent(jLabel2)
                    .addContainerGap(385, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editarMedico, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(MenuAnterior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(apagarMedico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(192, 192, 192)
                    .addComponent(jLabel2)
                    .addContainerGap(192, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAnteriorActionPerformed
        // TODO add your handling code here:
        MenuMedico medMENU = new MenuMedico();
        this.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuAnteriorActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tabelaMedico.getModel();
        modelo.setRowCount(0); // limpa a tabela
        for (Medico m : ListasDeControle.ListaMedico) {
            modelo.addRow(new Object[]{
                m.getIdMedico(),
                m.getNomeCompleto(),
                m.getDataNascimento(),
                m.getNumeroCRM(),
                m.getEndereco(),
                m.getGenero(),
                m.getContato(),
                m.isCirurgiao(),
                m.getAreasEspecialidade(),
                m.getSetor(),
                m.getAreasEspecialidade()
            });
        }
    }//GEN-LAST:event_formWindowOpened

    private void editarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarMedicoActionPerformed
        // TODO add your handling code here:
        int row = tabelaMedico.getSelectedRow(); //numero da linha selecionada
        if (row == -1) { //caso nada seja selcionado, ele para
            JOptionPane.showMessageDialog(this, "Selecione uma célula para editar diretamente na tabela.");
            return;
        }
        //obtem o modelo e recupera o id do paciente
        DefaultTableModel model = (DefaultTableModel) tabelaMedico.getModel();
        Long id = (Long) model.getValueAt(row, 0);
        Medico m = buscarMedicoPorId(id); //busca o pacinte
        if (m == null) {
            return;
        }

        // Formulário inline com todos os campos editáveis
        JTextField nomeField = new JTextField(m.getNomeCompleto());
        JTextField crmField = new JTextField(String.valueOf(m.getNumeroCRM()));
        JTextField dataNascField = new JTextField(String.valueOf(m.getDataNascimento()));

        JTextField ruaField = new JTextField(m.getEndereco().getRua());
        JTextField numeroField = new JTextField(m.getEndereco().getNumero());
        JTextField bairroField = new JTextField(m.getEndereco().getBairro());
        JTextField cidadeField = new JTextField(m.getEndereco().getCidade());
        JTextField estadoField = new JTextField(m.getEndereco().getEstado());
        JTextField cepField = new JTextField(m.getEndereco().getCep());

        //editar genero
        String[] generos = {"MASCULINO", "FEMININO"};
        JComboBox<String> generoComboBox = new JComboBox<>(generos);
        generoComboBox.setSelectedItem(m.getGenero());

        JTextField celularField = new JTextField(m.getContato().getCelular());
        JTextField emailField = new JTextField(m.getContato().getEmail());

        // Radio Buttons: Cirurgiao
        JRadioButton cirurgiaoSim = new JRadioButton("Sim");
        JRadioButton cirurgiaoNao = new JRadioButton("Não");
        ButtonGroup cirurgiaoGroup = new ButtonGroup();
        cirurgiaoGroup.add(cirurgiaoSim);
        cirurgiaoGroup.add(cirurgiaoNao);
        if (m.isCirurgiao()) {
            cirurgiaoSim.setSelected(true);
        } else {
            cirurgiaoNao.setSelected(true);
        }

        JTextArea espArea = new JTextArea(String.join("\n", m.getAreasEspecialidade()));
        JTextField setorField = new JTextField(m.getSetor());
        JTextField cargaHorariaSemanalField = new JTextField(m.getCargaHorariaSemanal());

        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(new JLabel("Nome Completo:"));
        panel.add(nomeField);
        panel.add(new JLabel("CRM:"));
        panel.add(crmField);
        panel.add(new JLabel("Data Nascimento:"));
        panel.add(dataNascField);
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
        panel.add(new JLabel("Gênero:"));
        panel.add(generoComboBox);
        panel.add(new JLabel("Celular:"));
        panel.add(celularField);
        panel.add(new JLabel("Email:"));
        panel.add(emailField);
        panel.add(new JLabel("É cirurgião?"));
        panel.add(cirurgiaoSim);
        panel.add(cirurgiaoNao);
        panel.add(new JLabel("Especialidades:"));
        panel.add(new JScrollPane(espArea));

        panel.add(new JLabel("Setor:"));
        panel.add(setorField);
        panel.add(new JLabel("Carga Horária Semanal:"));
        panel.add(cargaHorariaSemanalField);

        int result = JOptionPane.showConfirmDialog(this, panel, "Editar Paciente",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            try {
                // sincroniza/atualiza os dados da tabela com o objeto Paciente
                m.setNomeCompleto(nomeField.getText());
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                m.setDataNascimento(sdf.parse(dataNascField.getText()));
                //m.setNumeroCRM(Integer.parseInt(crmField.getText()));
                Integer crm = validarInteiro(crmField, "CRM", 1, 999999);
                if (crm == null) {
                    return;
                }
                m.setNumeroCRM(crm);

                //editar endereco
                m.getEndereco().setRua(ruaField.getText());
                //m.getEndereco().setNumero(Integer.parseInt(numeroField.getText()));
                Integer numero = validarInteiro(numeroField, "Número", 1, 99999);
                if (numero == null) {
                    return;
                }
                m.getEndereco().setNumero(numero);
                m.getEndereco().setBairro(bairroField.getText());
                m.getEndereco().setCidade(cidadeField.getText());
                m.getEndereco().setEstado(estadoField.getText());
                //m.getEndereco().setCep(Integer.parseInt(cepField.getText()));
                Integer cep = validarInteiro(cepField, "CEP", 1, 99999999);
                if (cep == null) {
                    return;
                }
                m.getEndereco().setCep(cep);
                //Genero
                m.setGenero(Genero.valueOf((String) generoComboBox.getSelectedItem()));
                //editar contato
                m.getContato().setCelular(celularField.getText());
                m.getContato().setEmail(emailField.getText());

                m.setCirurgiao(cirurgiaoSim.isSelected());

                ArrayList<String> lista = new ArrayList<>(Arrays.asList(espArea.getText().split("\\R")));
                m.setAreasEspecializadas(lista);

                m.setSetor(setorField.getText()); // 
                //m.setCargaHorariaSemanal(Integer.parseInt(cargaHorariaSemanalField.getText()));
                Integer carga = validarInteiro(cargaHorariaSemanalField, "Carga Horária", 0, 80);
                if (carga == null) {
                    return;
                }
                m.setCargaHorariaSemanal(carga);

                // Atualiza os valores na JTable - célula
                model.setValueAt(m.getNomeCompleto(), row, 1);
                model.setValueAt(m.getDataNascimento(), row, 2);
                model.setValueAt(m.getGenero(), row, 5);
                model.setValueAt(m.getNumeroCRM(), row, 3);
                model.setValueAt(m.getEndereco().toString(), row, 6);
                model.setValueAt(m.getContato().toString(), row, 7);
                model.setValueAt(m.getSetor(), row, 9);
                model.setValueAt(m.getCargaHorariaSemanal(), row, 10);
                model.setValueAt(m.isCirurgiao(), row, 7);
                model.setValueAt(m.getAreasEspecialidade(), row, 8);

                JOptionPane.showMessageDialog(this, "Paciente atualizado com sucesso.");
            } catch (ParseException pe) {
                JOptionPane.showMessageDialog(this, "Data inválida. Use o formato dd/MM/yyyy.");
                return;
            } catch (NumberFormatException x) {
                x.printStackTrace(); // aparecer o erro no prompt
                JOptionPane.showMessageDialog(this, "Idade inválida.");
            }

        }
    }//GEN-LAST:event_editarMedicoActionPerformed

    private void apagarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarMedicoActionPerformed
        // TODO add your handling code here:
        int row = tabelaMedico.getSelectedRow(); //garante que uma linha seja selecionada
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um paciente para remover.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tabelaMedico.getModel();
        Long id = (Long) model.getValueAt(row, 0); //pega o id

        Medico m = buscarMedicoPorId(id); //procura o id na lista especifica
        if (m == null) {
            JOptionPane.showMessageDialog(this, "Paciente não encontrado.");
            return;
        }

        //pedindo confirmação antes de remover
        int confirm = JOptionPane.showConfirmDialog(this,
                "Deseja realmente remover o paciente: " + m.getNomeCompleto() + "?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            ListasDeControle.ListaPaciente.remove(m);
            /*remove do arrayList*/
            model.removeRow(row);
            /* remove a linha da tabela*/
            JOptionPane.showMessageDialog(this, "Paciente removido com sucesso.");
        }
    }//GEN-LAST:event_apagarMedicoActionPerformed

    private Medico buscarMedicoPorId(Long id) {
        for (Medico m : ListasDeControle.ListaMedico) {
            if (m.getIdMedico() == id) {
                return m;
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
            java.util.logging.Logger.getLogger(CrudMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MenuAnterior;
    private javax.swing.JButton apagarMedico;
    private javax.swing.JButton editarMedico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaMedico;
    // End of variables declaration//GEN-END:variables
}
