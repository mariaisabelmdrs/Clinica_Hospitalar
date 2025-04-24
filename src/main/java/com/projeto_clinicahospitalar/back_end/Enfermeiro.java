package com.projeto_clinicahospitalar.back_end;
import java.util.Date;
import java.util.UUID; //usar para id's

public class Enfermeiro extends AtendenteHospitalar{
    private long idEnfermeiro;
    private boolean treinadoOpRaioX;

    public Enfermeiro(long idEnfermeiro, boolean treinadoOpRaioX, String setor, int cargaHorariaSemanal, String nomeCompleto, Date dataNascimento, Endereco endereco, Genero genero, ContatoTelEmail contato) {
        super(setor, cargaHorariaSemanal, nomeCompleto, dataNascimento, endereco, genero, contato);
        this.idEnfermeiro = gerarIdUnico();
        this.treinadoOpRaioX = treinadoOpRaioX;
    }

    
    
    private long gerarIdUnico(){ //converte uuid para um numero positivo
        return Math.abs(UUID.randomUUID().getMostSignificantBits());
    }
    
    public void setIdEnfermeiro(long idEnfermeiro) {
        this.idEnfermeiro = idEnfermeiro;
    }

    public long getIdEnfermeiro() {
        return idEnfermeiro;
    }
    
    public boolean isTreinadoOpRaioX() {
        return treinadoOpRaioX;
    }

    public void setTreinadoOpRaioX(boolean treinadoOpRaioX) {
        this.treinadoOpRaioX = treinadoOpRaioX;
    }
    
    @Override
    public String toString() {
        return "Enfermeiro {" +
                "\n  ID: " + idEnfermeiro +
               "\n  Treinado para operar Raio-X: " + (treinadoOpRaioX ? "Sim" : "Não") +
              "\n}";
}

    
}
