package com.projeto_clinicahospitalar.back_end;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Medico extends AtendenteHospitalar {
    private long idMedico;
    private int numeroCRM;
    private ArrayList<String> areasEspecialidade;
    private boolean cirurgiao;

    public Medico(long idMedico, int numeroCRM, ArrayList<String> areasEspecialidade, boolean cirurgiao, String setor, int cargaHorariaSemanal, String nomeCompleto, Date dataNascimento, Endereco endereco, Genero genero, ContatoTelEmail contato) {
        super(setor, cargaHorariaSemanal, nomeCompleto, dataNascimento, endereco, genero, contato);
        this.idMedico = idMedico;
        this.numeroCRM = numeroCRM;
        this.areasEspecialidade = new ArrayList<>(areasEspecialidade);
        this.cirurgiao = cirurgiao;
    } 
    public Medico(int numeroCRM, ArrayList<String> areasEspecialidade, boolean cirurgiao, String setor, int cargaHorariaSemanal, String nomeCompleto, Date dataNascimento, Endereco endereco, Genero genero, ContatoTelEmail contato) {
        super(setor, cargaHorariaSemanal, nomeCompleto, dataNascimento, endereco, genero, contato);
        this.idMedico = gerarIdUnico();
        this.numeroCRM = numeroCRM;
        this.areasEspecialidade = new ArrayList<>(areasEspecialidade);
        this.cirurgiao = cirurgiao;
    } 

    private long gerarIdUnico() {
        return Math.abs(UUID.randomUUID().getMostSignificantBits());
    }

  

    public void setAreasEspecializadas(ArrayList<String> especialidades) {
        this.areasEspecialidade = new ArrayList<>(especialidades);
    }

    public ArrayList<String> getAreasEspecialidade() {
        return areasEspecialidade;
    }

    public void adicionarEspecialidade(String especialidade) {
        if (!areasEspecialidade.contains(especialidade)) {
            areasEspecialidade.add(especialidade);
        }
    }

    public boolean removerEspecialidade(String especialidade) {
        return areasEspecialidade.remove(especialidade);
    }

    public int getNumeroCRM() {
        return numeroCRM;
    }

    public void setNumeroCRM(int numeroCRM) {
        this.numeroCRM = numeroCRM;
    }

    public boolean isCirurgiao() {
        return cirurgiao;
    }

    public void setCirurgiao(boolean cirurgiao) {
        this.cirurgiao = cirurgiao;
    }
    public long getIdMedico() {
        return this.idMedico;
    }

    @Override
    public String toString() {
        return "Medico{" +
               "idMedico=" + idMedico +
               ", numeroCRM=" + numeroCRM +
               ", areasEspecialidade=" + areasEspecialidade +
               ", cirurgiao=" + cirurgiao +
               ", setor=" + getSetor() +
               ", cargaHorariaSemanal=" + getCargaHorariaSemanal() +
               ", nome=" + getNomeCompleto() +
               ", dataNascimento=" + getDataNascimento() +
               ", endereco=" + getEndereco().toString() +
               ", genero=" + getGenero() +
               ", contato=" + getContato().toString() +
               '}';
    }
}