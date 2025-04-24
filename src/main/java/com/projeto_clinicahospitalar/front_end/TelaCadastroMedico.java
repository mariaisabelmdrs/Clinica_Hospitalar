package com.projeto_clinicahospitalar.front_end;

import com.projeto_clinicahospitalar.back_end.DadoPessoal;
import com.projeto_clinicahospitalar.back_end.ContatoTelEmail;
import com.projeto_clinicahospitalar.back_end.Endereco;
import com.projeto_clinicahospitalar.back_end.Genero;
import com.projeto_clinicahospitalar.back_end.ListasDeControle;
import com.projeto_clinicahospitalar.back_end.Medico;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class TelaCadastroMedico extends javax.swing.JFrame {
    public TelaCadastroMedico() {
        initComponents();
        this.setVisible(true);
        this.telaConsultaMedica = telaConsultaMedica; //tela de cadastro de consulta
        dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_DataNascimento = new javax.swing.JTextField();
        txt_Email_CTE = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_NomeCompleto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_Numero_Endereco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_Bairro_Endereco = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_Cidade_Endereco = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_Estado_Endereco = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCep_Endereco = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        opcao_Genero = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_Rua = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Celular_CTE = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_Telefone_CTE = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txt_NumeroCRM = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txt_Especialidade = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txt_Setor = new javax.swing.JTextField();
        txt_CargaHoraria = new javax.swing.JTextField();
        botao_LimparDados = new javax.swing.JButton();
        Limpar_AtendenteHosp = new javax.swing.JButton();
        LimparTodos_Dados = new javax.swing.JButton();
        Registrar_Dados = new javax.swing.JButton();
        botao_Limpar_Endereco = new javax.swing.JButton();
        botao_Limpar_Contatos = new javax.swing.JButton();
        cirurgiaoSIM = new javax.swing.JRadioButton();
        cirurgiaoNAO = new javax.swing.JRadioButton();
        jLabel28 = new javax.swing.JLabel();
        retornarMenuMedico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_DataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DataNascimentoActionPerformed(evt);
            }
        });

        txt_Email_CTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Email_CTEActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Endereço");

        txt_NomeCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NomeCompletoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Rua");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Número:");

        txt_Numero_Endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Numero_EnderecoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Bairro: ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Cidade:");

        txt_Cidade_Endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Cidade_EnderecoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Estado");

        txt_Estado_Endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Estado_EnderecoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Cep:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Genero:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText("Cadastro de Médico");

        opcao_Genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FEMININO", "MASCULINO" }));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Contatos");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Celular:");

        txt_Rua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RuaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Data de Nascimento:");

        txt_Celular_CTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Celular_CTEActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Telefone:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Nome Completo:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Email:");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setText("Número CRM:");

        txt_NumeroCRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NumeroCRMActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setText("Especialidade:");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setText("Cirurgião:");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setText("Atendente Hospitalar");

        jLabel26.setText("Setor:");

        jLabel27.setText("Carga Horária Semanal:");

        txt_Setor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SetorActionPerformed(evt);
            }
        });

        botao_LimparDados.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botao_LimparDados.setText("Limpar Dados");
        botao_LimparDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_LimparDadosActionPerformed(evt);
            }
        });

        Limpar_AtendenteHosp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Limpar_AtendenteHosp.setText("Limpar Antendente Hospitalar");
        Limpar_AtendenteHosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Limpar_AtendenteHospActionPerformed(evt);
            }
        });

        LimparTodos_Dados.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LimparTodos_Dados.setText("Limpar Tudo");
        LimparTodos_Dados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparTodos_DadosActionPerformed(evt);
            }
        });

        Registrar_Dados.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Registrar_Dados.setText("Registrar Dados");
        Registrar_Dados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Registrar_DadosActionPerformed(evt);
            }
        });

        botao_Limpar_Endereco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botao_Limpar_Endereco.setText("Limpar Endereço");
        botao_Limpar_Endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Limpar_EnderecoActionPerformed(evt);
            }
        });

        botao_Limpar_Contatos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botao_Limpar_Contatos.setText("Limpar Contatos");
        botao_Limpar_Contatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Limpar_ContatosActionPerformed(evt);
            }
        });

        cirurgiaoSIM.setText("Sim");
        cirurgiaoSIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cirurgiaoSIMActionPerformed(evt);
            }
        });

        cirurgiaoNAO.setText("Não");
        cirurgiaoNAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cirurgiaoNAOActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setText("Dados");

        retornarMenuMedico.setText("Voltar ao Menu Médico");
        retornarMenuMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retornarMenuMedicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel22)
                                            .addComponent(jLabel23)
                                            .addComponent(jLabel24)
                                            .addComponent(jLabel11))
                                        .addGap(13, 13, 13)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txt_Especialidade, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txt_NumeroCRM, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(opcao_Genero, javax.swing.GroupLayout.Alignment.LEADING, 0, 170, Short.MAX_VALUE)
                                                .addComponent(txt_DataNascimento, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txt_NomeCompleto, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cirurgiaoSIM)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(botao_LimparDados)
                                                    .addComponent(cirurgiaoNAO)))
                                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Limpar_AtendenteHosp)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_Setor, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                        .addComponent(txt_CargaHoraria))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(botao_Limpar_Endereco)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtCep_Endereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                        .addComponent(txt_Estado_Endereco, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_Cidade_Endereco, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_Bairro_Endereco, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_Numero_Endereco, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_Rua, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt_Telefone_CTE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                            .addComponent(txt_Email_CTE, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_Celular_CTE)))
                                    .addComponent(botao_Limpar_Contatos, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LimparTodos_Dados)
                        .addGap(18, 18, 18)
                        .addComponent(Registrar_Dados)
                        .addGap(18, 18, 18)
                        .addComponent(retornarMenuMedico)
                        .addGap(0, 21, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(266, 266, 266))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12)
                    .addComponent(jLabel28))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_NomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_DataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txt_Estado_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Especialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cirurgiaoSIM)
                                            .addComponent(cirurgiaoNAO))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botao_LimparDados))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel10)
                                            .addComponent(txtCep_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botao_Limpar_Endereco))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel24)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(txt_Setor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(txt_CargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Limpar_AtendenteHosp)
                            .addComponent(LimparTodos_Dados)
                            .addComponent(Registrar_Dados)
                            .addComponent(retornarMenuMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(opcao_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_Rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel13)
                                    .addComponent(txt_Celular_CTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(txt_Numero_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel14)
                                            .addComponent(txt_Telefone_CTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel15)
                                            .addComponent(txt_Email_CTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(1, 1, 1))
                            .addComponent(txt_Bairro_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_NumeroCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(txt_Cidade_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(botao_Limpar_Contatos))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_DataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DataNascimentoActionPerformed

    private void txt_Email_CTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Email_CTEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Email_CTEActionPerformed

    private void txt_NomeCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NomeCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NomeCompletoActionPerformed

    private void txt_Numero_EnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Numero_EnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Numero_EnderecoActionPerformed

    private void txt_Cidade_EnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Cidade_EnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Cidade_EnderecoActionPerformed

    private void txt_Estado_EnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Estado_EnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Estado_EnderecoActionPerformed

    private void txt_RuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RuaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_RuaActionPerformed

    private void txt_Celular_CTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Celular_CTEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Celular_CTEActionPerformed

    private void txt_SetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SetorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SetorActionPerformed

    private void txt_NumeroCRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NumeroCRMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NumeroCRMActionPerformed

    private void botao_LimparDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_LimparDadosActionPerformed
        // TODO add your handling code here:
        LimparDados();
    }//GEN-LAST:event_botao_LimparDadosActionPerformed

    private void Limpar_AtendenteHospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Limpar_AtendenteHospActionPerformed
        // TODO add your handling code here:
        LimparAtendHosp();
    }//GEN-LAST:event_Limpar_AtendenteHospActionPerformed

    private void LimparTodos_DadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparTodos_DadosActionPerformed
        //limpar todos os campos
        LimparDados();
        LimparEndereco();
        LimparContatos();
        LimparAtendHosp();
    }//GEN-LAST:event_LimparTodos_DadosActionPerformed


    private void Registrar_DadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Registrar_DadosActionPerformed
        // TODO add your handling code here:
        try {
            String nome = txt_NomeCompleto.getText().trim();
            String dataNascimento = txt_DataNascimento.getText().trim();
            String genero = (String) opcao_Genero.getSelectedItem();
            String crm = txt_NumeroCRM.getText().trim();
            String especialidade = txt_Especialidade.getText().trim();
            boolean cirurgiao; // verificação da opção marcada para cirutgião
            if (cirurgiaoSIM.isSelected()) {
                cirurgiao = true;
            } else if (cirurgiaoNAO.isSelected()) {
                cirurgiao = false;
            } else {
                throw new IllegalArgumentException("Selecione se é cirurgião ou não.");
            }

            String rua = txt_Rua.getText().trim();
            String numero = txt_Numero_Endereco.getText().trim();
            String bairro = txt_Bairro_Endereco.getText().trim();
            String cidade = txt_Cidade_Endereco.getText().trim();
            String estado = txt_Estado_Endereco.getText().trim();
            String cep = txtCep_Endereco.getText().trim();

            String celular = txt_Celular_CTE.getText().trim();
            String telefone = txt_Telefone_CTE.getText().trim();
            String email = txt_Email_CTE.getText().trim();

            String setor = txt_Setor.getText().trim();
            String cargaHora = txt_CargaHoraria.getText().trim();

            // Verifica se algum campo está vazio
            if (nome.isEmpty() || dataNascimento.isEmpty()) {
                throw new IllegalArgumentException("Todos os campos dos dados do paciente devem ser preenchidos.");
            }
            if (rua.isEmpty() || numero.isEmpty() || bairro.isEmpty() || cidade.isEmpty() || estado.isEmpty() || cep.isEmpty()) {
                throw new IllegalArgumentException("Todos os campos dos dados do endereço do paciente devem ser preenchidos.");
            }
            if (celular.isEmpty() || telefone.isEmpty() || email.isEmpty()) {
                throw new IllegalArgumentException("Todos os campos dos dados de contato do paciente devem ser preenchidos.");
            }
            if (!numero.matches("\\d+") || !celular.matches("\\d+") || !telefone.matches("\\d+") || !cargaHora.matches("\\d+")) {
                throw new IllegalArgumentException("Os campos de idade, número, carga horaria, celular e telefone devem conter apenas números.");
            }
            if (!dataNascimento.matches("\\d{2}/\\d{2}/\\d{4}")) {
                throw new IllegalArgumentException("Formato de data inválido. Use dd/MM/yyyy");
            }
            if (!nome.matches("[a-zA-ZÀ-ÿ ]+")) { // Verifica se o nome contém apenas letras (regex: [a-zA-ZÀ-ÿ ]+)
                throw new IllegalArgumentException("O nome deve conter apenas letras e espaços.");
            }

            // Conversões
            int numeroEndereco = Integer.parseInt(numero);
            int cepInt = Integer.parseInt(cep);
            long idMedico = System.currentTimeMillis();
            int cargaHoraria = Integer.parseInt(cargaHora);
            int numeroCRM = Integer.parseInt(crm);
            ArrayList<String> areasEspecialidade = new ArrayList<>();
            areasEspecialidade.add(especialidade);

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date dataNasc = sdf.parse(dataNascimento);
            Date dataCadastro = new Date();

            Endereco endereco = new Endereco(rua, numeroEndereco, bairro, cidade, estado, cepInt);
            Genero generoEnum = Genero.valueOf(genero.toUpperCase());
            ContatoTelEmail contato = new ContatoTelEmail(celular, telefone, email);

            // Criação do objeto Médico
            Medico medico = new Medico(
                    idMedico,
                    numeroCRM,
                    areasEspecialidade,
                    cirurgiao,
                    setor,
                    cargaHoraria,
                    nome,
                    dataNasc,
                    endereco,
                    generoEnum,
                    contato
            );
            
            //adicionando medico no array
            ListasDeControle.ListaMedico.add(medico);
            
            // Corrigido: telaConsultaMedica atualiza a tabela, se for passada no construtor
            if (telaConsultaMedica != null) {
                telaConsultaMedica.carregarMedicosNaTabela();
            }

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Idade e/ou datas e/ou números devem ser valores numéricos.", "Erro de Entrada", javax.swing.JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage(), "Erro de Validação", javax.swing.JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace(); // mostrar o erro no prompt
            javax.swing.JOptionPane.showMessageDialog(this, "Ocorreu um erro inesperado.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Registrar_DadosActionPerformed

    private void botao_Limpar_EnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Limpar_EnderecoActionPerformed
        // Limpar dados do endereco
        LimparEndereco();
    }//GEN-LAST:event_botao_Limpar_EnderecoActionPerformed

    private void botao_Limpar_ContatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Limpar_ContatosActionPerformed
        // limpar contatos
        LimparContatos();
    }//GEN-LAST:event_botao_Limpar_ContatosActionPerformed

    private void cirurgiaoSIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cirurgiaoSIMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cirurgiaoSIMActionPerformed

    private void cirurgiaoNAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cirurgiaoNAOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cirurgiaoNAOActionPerformed

    private void retornarMenuMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retornarMenuMedicoActionPerformed
        // TODO add your handling code here:
        //limpar todos os campos
        LimparDados();
        LimparEndereco();
        LimparContatos();
        LimparAtendHosp();
        
        //chamar o menu medico
        MenuMedico menuMed = new MenuMedico();
        menuMed.setVisible(true);
        dispose();;
    }//GEN-LAST:event_retornarMenuMedicoActionPerformed

    private void LimparContatos() {
        // limpar contatos
        txt_Celular_CTE.setText(" ");
        txt_Telefone_CTE.setText(" ");
        txt_Email_CTE.setText(" ");
    }

    private void LimparDados() {
        // Limpar dados: Nome, data nascimento, idade, Genero
        txt_NomeCompleto.setText(" ");
        txt_DataNascimento.setText(" ");
        txt_NumeroCRM.setText(" ");
        txt_Especialidade.setText(" ");
    }

    private void LimparEndereco() {
        txt_Rua.setText(" ");
        txt_Numero_Endereco.setText(" ");
        txt_Bairro_Endereco.setText(" ");
        txt_Cidade_Endereco.setText(" ");
        txt_Estado_Endereco.setText(" ");
        txtCep_Endereco.setText(" ");
    }

    private void LimparAtendHosp() {
        txt_Setor.setText(" ");
        txt_CargaHoraria.setText(" ");
    }

    private TelaCadastroConsultaMedica telaConsultaMedica; //guardar a tela de consulta
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaCadastroMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LimparTodos_Dados;
    private javax.swing.JButton Limpar_AtendenteHosp;
    private javax.swing.JButton Registrar_Dados;
    private javax.swing.JButton botao_LimparDados;
    private javax.swing.JButton botao_Limpar_Contatos;
    private javax.swing.JButton botao_Limpar_Endereco;
    private javax.swing.JRadioButton cirurgiaoNAO;
    private javax.swing.JRadioButton cirurgiaoSIM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> opcao_Genero;
    private javax.swing.JButton retornarMenuMedico;
    private javax.swing.JTextField txtCep_Endereco;
    private javax.swing.JTextField txt_Bairro_Endereco;
    private javax.swing.JTextField txt_CargaHoraria;
    private javax.swing.JTextField txt_Celular_CTE;
    private javax.swing.JTextField txt_Cidade_Endereco;
    private javax.swing.JTextField txt_DataNascimento;
    private javax.swing.JTextField txt_Email_CTE;
    private javax.swing.JTextField txt_Especialidade;
    private javax.swing.JTextField txt_Estado_Endereco;
    private javax.swing.JTextField txt_NomeCompleto;
    private javax.swing.JTextField txt_NumeroCRM;
    private javax.swing.JTextField txt_Numero_Endereco;
    private javax.swing.JTextField txt_Rua;
    private javax.swing.JTextField txt_Setor;
    private javax.swing.JTextField txt_Telefone_CTE;
    // End of variables declaration//GEN-END:variables

}
