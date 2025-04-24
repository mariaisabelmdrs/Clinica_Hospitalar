package com.projeto_clinicahospitalar.front_end;

import com.projeto_clinicahospitalar.back_end.Paciente;
import com.projeto_clinicahospitalar.back_end.DadoPessoal;
import com.projeto_clinicahospitalar.back_end.Responsavel;
import com.projeto_clinicahospitalar.back_end.Genero;
import com.projeto_clinicahospitalar.back_end.Endereco;
import com.projeto_clinicahospitalar.back_end.ContatoTelEmail;
import com.projeto_clinicahospitalar.back_end.ListasDeControle;
import com.projeto_clinicahospitalar.back_end.Responsavel;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane; // Para exibir mensagens

public class TelaCadastroPaciente extends javax.swing.JFrame {

    public TelaCadastroPaciente() {
        initComponents();
        this.setVisible(true);
        this.telaConsultaMedica = telaConsultaMedica; //tela de cadastro de consulta
        dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_Rua = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_DataNascimento = new javax.swing.JTextField();
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
        opcao_Genero = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_Celular_CTE = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_Telefone_CTE = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_Email_CTE = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_Idade = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_Nome_Responsavel = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txt_Celular_RESP_CTE = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txt_Telefone_RESP_CTE = new javax.swing.JTextField();
        txt_Email_RESP_CTE = new javax.swing.JTextField();
        botao_LimparDados_NDtIG = new javax.swing.JButton();
        botao_Limpar_Endereco = new javax.swing.JButton();
        botao_Limpar_Contatos = new javax.swing.JButton();
        botao_Limpar_Responsavel = new javax.swing.JButton();
        Registrar_Dados = new javax.swing.JButton();
        LimparTodos_Dados = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txt_Obs_Gerais = new javax.swing.JTextField();
        botao_Limpar_Obse = new javax.swing.JButton();
        txt_Data_Cadastro = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        retornarMENUprinc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText("Cadastro de Paciente");

        txt_Rua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RuaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Data de Nascimento:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Nome Completo:");

        txt_DataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DataNascimentoActionPerformed(evt);
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

        opcao_Genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FEMININO", "MASCULINO" }));
        opcao_Genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcao_GeneroActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Genero:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Contatos");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Celular:");

        txt_Celular_CTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Celular_CTEActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Telefone:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Email:");

        txt_Email_CTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Email_CTEActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Idade:");

        txt_Idade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IdadeActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("Responsável");

        txt_Nome_Responsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Nome_ResponsavelActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Nome Completo:");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Celular:");

        txt_Celular_RESP_CTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Celular_RESP_CTEActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("Telefone:");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("Email:");

        txt_Telefone_RESP_CTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Telefone_RESP_CTEActionPerformed(evt);
            }
        });

        txt_Email_RESP_CTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Email_RESP_CTEActionPerformed(evt);
            }
        });

        botao_LimparDados_NDtIG.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botao_LimparDados_NDtIG.setText("Limpar Dados");
        botao_LimparDados_NDtIG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_LimparDados_NDtIGActionPerformed(evt);
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

        botao_Limpar_Responsavel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botao_Limpar_Responsavel.setText("Limpar Responsável");
        botao_Limpar_Responsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Limpar_ResponsavelActionPerformed(evt);
            }
        });

        Registrar_Dados.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Registrar_Dados.setText("Registrar Dados");
        Registrar_Dados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Registrar_DadosActionPerformed(evt);
            }
        });

        LimparTodos_Dados.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LimparTodos_Dados.setText("Limpar Tudo");
        LimparTodos_Dados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparTodos_DadosActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setText("Observações Gerais:");

        jLabel23.setText("Obs:");

        botao_Limpar_Obse.setText("Limpar Observações");
        botao_Limpar_Obse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Limpar_ObseActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setText("Data Cadastro:");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setText("Dados");

        retornarMENUprinc.setText("Retornar Menu Paciente");
        retornarMENUprinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retornarMENUprincActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel1)
                .addGap(127, 127, 127))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)
                                .addComponent(jLabel16)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel21)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel24))
                            .addGap(13, 13, 13)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(botao_Limpar_Responsavel)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_Telefone_RESP_CTE, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Celular_RESP_CTE, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Nome_Responsavel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(botao_LimparDados_NDtIG)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt_Data_Cadastro, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(opcao_Genero, javax.swing.GroupLayout.Alignment.LEADING, 0, 170, Short.MAX_VALUE)
                                            .addComponent(txt_Idade, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addComponent(txt_Email_RESP_CTE))
                                .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addComponent(txt_DataNascimento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(txt_NomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_Estado_Endereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(txt_Cidade_Endereco, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_Bairro_Endereco, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_Numero_Endereco, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_Rua, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCep_Endereco))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(botao_Limpar_Endereco)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txt_Telefone_CTE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                        .addComponent(txt_Celular_CTE, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_Email_CTE, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(botao_Limpar_Obse)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_Obs_Gerais, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(23, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(botao_Limpar_Contatos)
                                    .addComponent(jLabel22))
                                .addGap(38, 38, 38))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LimparTodos_Dados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Registrar_Dados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(retornarMENUprinc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_NomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_DataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(opcao_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel16)))
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
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(txt_Cidade_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11))
                            .addComponent(botao_Limpar_Contatos))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(txt_Estado_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_Data_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel24)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(txtCep_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botao_LimparDados_NDtIG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botao_Limpar_Endereco)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(3, 3, 3)))
                        .addGap(2, 2, 2))
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(txt_Obs_Gerais, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botao_Limpar_Obse, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(retornarMENUprinc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Nome_Responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Celular_RESP_CTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Telefone_RESP_CTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Email_RESP_CTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao_Limpar_Responsavel)
                            .addComponent(LimparTodos_Dados)
                            .addComponent(Registrar_Dados))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_RuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_RuaActionPerformed

    private void txt_DataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DataNascimentoActionPerformed

    private void txt_NomeCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NomeCompletoActionPerformed
        // TODO add your handling code here:
        //String nome = NameField.getText().trim();

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

    private void txt_Celular_CTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Celular_CTEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Celular_CTEActionPerformed

    private void txt_Email_CTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Email_CTEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Email_CTEActionPerformed

    private void txt_IdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IdadeActionPerformed

    private void txt_Nome_ResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Nome_ResponsavelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Nome_ResponsavelActionPerformed

    private void txt_Telefone_RESP_CTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Telefone_RESP_CTEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Telefone_RESP_CTEActionPerformed

    private void txt_Celular_RESP_CTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Celular_RESP_CTEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Celular_RESP_CTEActionPerformed

    private void botao_LimparDados_NDtIGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_LimparDados_NDtIGActionPerformed
        // Limpar dados: Nome, data nascimento, idade, Genero
        LimparDados();
    }//GEN-LAST:event_botao_LimparDados_NDtIGActionPerformed

    private void botao_Limpar_ResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Limpar_ResponsavelActionPerformed
        //Limpar dados dos Responsaveis
        LimparResponsavel();
    }//GEN-LAST:event_botao_Limpar_ResponsavelActionPerformed

    private void botao_Limpar_EnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Limpar_EnderecoActionPerformed
        // Limpar dados do endereco
        LimparEndereco();
    }//GEN-LAST:event_botao_Limpar_EnderecoActionPerformed

    private void botao_Limpar_ContatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Limpar_ContatosActionPerformed
        // limpar contatos
        LimparContatos();
    }//GEN-LAST:event_botao_Limpar_ContatosActionPerformed

    private void LimparTodos_DadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparTodos_DadosActionPerformed
        //limpar todos os campos
        LimparDados();
        LimparEndereco();
        LimparResponsavel();
        LimparContatos();
        LimparObs();
    }//GEN-LAST:event_LimparTodos_DadosActionPerformed

    private void Registrar_DadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Registrar_DadosActionPerformed
        // TODO add your handling code here:
        try {
            String nome = txt_NomeCompleto.getText().trim();
            String dataNascimento = txt_DataNascimento.getText().trim();
            String idade = txt_Idade.getText().trim();
            String dataTexto = txt_Data_Cadastro.getText();
            String genero = (String) opcao_Genero.getSelectedItem(); //arumar
            String obsGeral = txt_Obs_Gerais.getText().trim();

            String rua = txt_Rua.getText().trim();
            String numero = txt_Numero_Endereco.getText().trim();
            String bairro = txt_Bairro_Endereco.getText().trim();
            String cidade = txt_Cidade_Endereco.getText().trim();
            String estado = txt_Estado_Endereco.getText().trim();
            String cep = txtCep_Endereco.getText().trim();

            String celular = txt_Celular_CTE.getText().trim();
            String telefone = txt_Telefone_CTE.getText().trim();
            String email = txt_Email_CTE.getText().trim();

            String nomeResponsavel = txt_Nome_Responsavel.getText().trim();
            String celularResponsavel = txt_Celular_RESP_CTE.getText().trim();
            String telefoneResponsavel = txt_Telefone_RESP_CTE.getText().trim();
            String emailResponsavel = txt_Email_RESP_CTE.getText().trim();

            // Verifica se algum campo está vazio
            if (nome.isEmpty() || dataNascimento.isEmpty() || idade.isEmpty() || obsGeral.isEmpty() || dataTexto.isEmpty()) {
                throw new IllegalArgumentException("Todos os campos dos dados do paciente devem ser preenchidos.");
            }
            if (rua.isEmpty() || numero.isEmpty() || bairro.isEmpty() || cidade.isEmpty() || estado.isEmpty() || cep.isEmpty() || dataTexto.isEmpty()) {
                throw new IllegalArgumentException("Todos os campos dos dados do endereço do paciente devem ser preenchidos.");
            }
            if (celular.isEmpty() || telefone.isEmpty() || email.isEmpty()) {
                throw new IllegalArgumentException("Todos os campos dos dados de contato do paciente devem ser preenchidos.");
            }
            if (nomeResponsavel.isEmpty() || celularResponsavel.isEmpty() || emailResponsavel.isEmpty() || telefoneResponsavel.isEmpty()) {
                throw new IllegalArgumentException("Todos os campos dos dados do responsável do  paciente devem ser preenchidos.");
            }
            if (!idade.matches("\\d+") || !numero.matches("\\d+") || !celular.matches("\\d+") || !telefone.matches("\\d+") || !telefoneResponsavel.matches("\\d+") || !celularResponsavel.matches("\\d+")) {
                throw new IllegalArgumentException("Os campos de idade, data de cadastro, cep, número, celular e telefone devem conter apenas números.");
            }
            if (!dataNascimento.matches("\\d{2}/\\d{2}/\\d{4}")) {
                throw new IllegalArgumentException("Formato de data inválido. Use dd/MM/yyyy");
            }

            // Verifica se o nome contém apenas letras (regex: [a-zA-ZÀ-ÿ ]+)
            if (!nome.matches("[a-zA-ZÀ-ÿ ]+") || !nomeResponsavel.matches("[a-zA-ZÀ-ÿ ]+")) {
                throw new IllegalArgumentException("O nome deve conter apenas letras e espaços.");
            }

            // Conversões
            int idadeInt = Integer.parseInt(idade);
            int numeroEndereco = Integer.parseInt(numero);
            int cepInt = Integer.parseInt(cep);
            long idPaciente = System.currentTimeMillis();

            // Formatar e converter: string -> date
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            Date dataNasc = sdf.parse(dataNascimento);
            Date dataCadastro = sdf.parse(dataTexto);

            //criando objetos:
            Endereco endereco = new Endereco(rua, numeroEndereco, bairro, cidade, estado, cepInt);
            Genero generoEnum = Genero.valueOf(genero.toUpperCase());
            long idResponsavel = System.currentTimeMillis();
            ContatoTelEmail contatoPaciente = new ContatoTelEmail(celular, telefone, email);
            ContatoTelEmail contatoResponsavel = new ContatoTelEmail(celularResponsavel, telefoneResponsavel, emailResponsavel);
            Responsavel responsavel = new Responsavel(idResponsavel, nomeResponsavel, celularResponsavel, telefoneResponsavel, emailResponsavel);

            // Criação do objeto Paciente
            Paciente paciente = new Paciente(
                    idPaciente, // long
                    idadeInt, // int
                    dataCadastro, // Date
                    obsGeral, // String
                    nome, // String nomeCompleto
                    dataNasc, // Date dataNascimento
                    endereco, // Endereco
                    generoEnum, // Genero
                    contatoPaciente, // ContatoTelEmail do paciente
                    responsavel, // Responsavel
                    contatoResponsavel
            );

            // adiciona paciente A LISTA DE CONTROLE
            ListasDeControle.ListaPaciente.add(paciente);

            // telaConsultaMedica atualiza a tabela
            if (telaConsultaMedica != null) {
                telaConsultaMedica.carregarPacientesNaTabela();
            }

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Idade e/ou datas e/ou números devem ser valores numéricos.", "Erro de Entrada", javax.swing.JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage(), "Erro de Validação", javax.swing.JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace(); // aparecer o erro no prompt
            javax.swing.JOptionPane.showMessageDialog(this, "Ocorreu um erro inesperado.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Registrar_DadosActionPerformed

    private void opcao_GeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcao_GeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcao_GeneroActionPerformed

    private void botao_Limpar_ObseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Limpar_ObseActionPerformed
        // TODO add your handling code here:
        LimparObs();
    }//GEN-LAST:event_botao_Limpar_ObseActionPerformed

    private void txt_Email_RESP_CTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Email_RESP_CTEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Email_RESP_CTEActionPerformed

    private void retornarMENUprincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retornarMENUprincActionPerformed
        //limpar todos os campos
        LimparDados();
        LimparEndereco();
        LimparResponsavel();
        LimparContatos();
        LimparObs();

        // chamar o menu principal
        MenuPaciente menuPac = new MenuPaciente();
        this.setVisible(true);
        dispose();
    }//GEN-LAST:event_retornarMENUprincActionPerformed

    private void LimparObs() {
        txt_Obs_Gerais.setText(" ");

    }

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
        txt_Idade.setText(" ");
        txt_Data_Cadastro.setText(" ");
    }

    private void LimparResponsavel() {
        txt_Nome_Responsavel.setText(" ");
        txt_Celular_RESP_CTE.setText(" ");
        txt_Telefone_RESP_CTE.setText(" ");
        txt_Email_RESP_CTE.setText(" ");
    }

    private void LimparEndereco() {
        // Limpar dados do endereco
        txt_Rua.setText(" ");
        txt_Numero_Endereco.setText(" ");
        txt_Bairro_Endereco.setText(" ");
        txt_Cidade_Endereco.setText(" ");
        txt_Estado_Endereco.setText(" ");
        txtCep_Endereco.setText(" ");
    }

    private TelaCadastroConsultaMedica telaConsultaMedica; //guardar a tela de consulta

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
            java.util.logging.Logger.getLogger(TelaCadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LimparTodos_Dados;
    private javax.swing.JButton Registrar_Dados;
    private javax.swing.JButton botao_LimparDados_NDtIG;
    private javax.swing.JButton botao_Limpar_Contatos;
    private javax.swing.JButton botao_Limpar_Endereco;
    private javax.swing.JButton botao_Limpar_Obse;
    private javax.swing.JButton botao_Limpar_Responsavel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> opcao_Genero;
    private javax.swing.JButton retornarMENUprinc;
    private javax.swing.JTextField txtCep_Endereco;
    private javax.swing.JTextField txt_Bairro_Endereco;
    private javax.swing.JTextField txt_Celular_CTE;
    private javax.swing.JTextField txt_Celular_RESP_CTE;
    private javax.swing.JTextField txt_Cidade_Endereco;
    private javax.swing.JTextField txt_DataNascimento;
    private javax.swing.JTextField txt_Data_Cadastro;
    private javax.swing.JTextField txt_Email_CTE;
    private javax.swing.JTextField txt_Email_RESP_CTE;
    private javax.swing.JTextField txt_Estado_Endereco;
    private javax.swing.JTextField txt_Idade;
    private javax.swing.JTextField txt_NomeCompleto;
    private javax.swing.JTextField txt_Nome_Responsavel;
    private javax.swing.JTextField txt_Numero_Endereco;
    private javax.swing.JTextField txt_Obs_Gerais;
    private javax.swing.JTextField txt_Rua;
    private javax.swing.JTextField txt_Telefone_CTE;
    private javax.swing.JTextField txt_Telefone_RESP_CTE;
    // End of variables declaration//GEN-END:variables
}
