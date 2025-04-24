package com.projeto_clinicahospitalar.back_end;

import java.util.UUID;

public class Responsavel extends ContatoTelEmail{
    private long idResponsavel;
    private String nomeResponsavel;

    public Responsavel(long idResponsavel, String nomeResponsavel, String celular, String telefone, String email) {
        super(celular, telefone, email);
        this.idResponsavel = gerarIdUnico();
        this.nomeResponsavel = nomeResponsavel;
    }
    
    private long gerarIdUnico(){ //converte uuid para um numero positivo
        return Math.abs(UUID.randomUUID().getMostSignificantBits());
    }
    
    public long getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(long idResponsavel) {
        this.idResponsavel = idResponsavel;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }
    
    @Override
    public String toString() {
        return "Responsável {" +
            "\n  ID: " + idResponsavel +
            "\n  Nome: " + nomeResponsavel +
            "\n  Celular: " + getCelular() +
            "\n  Telefone: " + getTelefone() +
            "\n  Email: " + getEmail() +
            "\n}";
}

    
}
