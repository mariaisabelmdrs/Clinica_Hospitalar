package com.projeto_clinicahospitalar.back_end;

import java.util.ArrayList;
import java.util.Date;//usar para datas
import java.util.List;
import java.util.UUID; //usar para id's

public class Paciente extends DadoPessoal {

    private long idPaciente;
    private int idade;
    private Date dataCadastro;
    private String obsGeral;
    private ArrayList<ConsultaMedica> historicoConsultasMedicas;
    private ContatoTelEmail ContatoTelEmail;
    private Responsavel responsavel;
    private ContatoTelEmail contatoResponsavel;

    public Paciente(int idade, Date dataCadastro, String obsGeral,
            String nomeCompleto, Date dataNascimento, Endereco endereco,
            Genero genero, ContatoTelEmail contatoPaciente,
            Responsavel responsavel, ContatoTelEmail contatoResponsavel) {
        super(nomeCompleto, dataNascimento, endereco, genero, contatoPaciente);
        this.idPaciente = gerarIdUnico();
        this.idade = idade;
        this.dataCadastro = dataCadastro;
        this.obsGeral = obsGeral;
        this.historicoConsultasMedicas = new ArrayList<>();
        this.responsavel = responsavel;
        this.contatoResponsavel = contatoResponsavel;
        this.ContatoTelEmail = contatoPaciente; 
    }
    public Paciente(long idPaciente, int idade, Date dataCadastro, String obsGeral,
            String nomeCompleto, Date dataNascimento, Endereco endereco,
            Genero genero, ContatoTelEmail contatoPaciente,
            Responsavel responsavel, ContatoTelEmail contatoResponsavel) {
        super(nomeCompleto, dataNascimento, endereco, genero, contatoPaciente);
        this.idPaciente = idPaciente;
        this.idade = idade;
        this.dataCadastro = dataCadastro;
        this.obsGeral = obsGeral;
        this.historicoConsultasMedicas = new ArrayList<>();
        this.responsavel = responsavel;
        this.contatoResponsavel = contatoResponsavel;
        this.ContatoTelEmail = contatoPaciente; 
    }

    private long gerarIdUnico() { //converte uuid para um numero positivo
        return Math.abs(UUID.randomUUID().getMostSignificantBits());
    }

    public void listarConsultas() {
        if (historicoConsultasMedicas.isEmpty()) {
            System.out.println("Nenhuma consulta registrada");
        } else {
            System.out.println(); //rever
        }
    }

    public ArrayList<ConsultaMedica> getHistoricoConsultasMedicas() {
        return historicoConsultasMedicas;
    }

    public ContatoTelEmail getContatoResponsavel() {
        return contatoResponsavel;
    }

    public void setContatoResponsavel(ContatoTelEmail contatoResponsavel) {
        this.contatoResponsavel = contatoResponsavel;
    }

    public void adicionarConsulta(ConsultaMedica consulta) {
        historicoConsultasMedicas.add(consulta);
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    public ContatoTelEmail getContatoTelEmail() {
        return ContatoTelEmail;
    }

    public void setHistoricoConsultasMedicas(ArrayList<ConsultaMedica> historicoConsultasMedicas) {
        this.historicoConsultasMedicas = historicoConsultasMedicas;
    }

    public void setContatoTelEmail(ContatoTelEmail ContatoTelEmail) {
        this.ContatoTelEmail = ContatoTelEmail;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public long getIdPaciente() {
        return idPaciente;
    }

    public int getIdade() {
        return idade;
    }

    public String getObsGeral() {
        return obsGeral;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setIdPaciente(long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public void setObsGeral(String obsGeral) {
        this.obsGeral = obsGeral;
    }

    @Override
    public String toString() {
        return "Paciente {"
                + "\n  ID: " + idPaciente
                + "\n  Nome: " + getNomeCompleto()
                + "\n  Idade: " + idade
                + "\n  Data de Cadastro: " + dataCadastro
                + "\n  Gênero: " + getGenero()
                + "\n  Data de Nascimento: " + getDataNascimento()
                + "\n  Endereço: " + getEndereco()
                + "\n  Contato: " + getContato()
                + "\n  Observações Gerais: " + obsGeral
                + "\n  Total de Consultas: " + historicoConsultasMedicas.size()
                + "\n  Responsavel: " + responsavel.toString()
                + "\n  Contato: " + ContatoTelEmail.toString()
                + "\n  Contato Responsável: " + contatoResponsavel.toString()
                + "\n}";
    }

}
