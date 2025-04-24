package com.projeto_clinicahospitalar.back_end;
import java.util.UUID;

public class ConsultaMedica {
    private long idConsultaMedica;
    private long idPaciente; //ref ?
    private String nomePaciente;
    private long idMedico; //ref ?
    private String nomeMedico;
    private String exameQueixa;
    private String diagnostico;
    private String prescricao;
    
    private boolean indicacaoCirurgica;

    public ConsultaMedica(long idConsultaMedica, long idPaciente, String nomePaciente, 
                         long idMedico, String nomeMedico, String exameQueixa, 
                         String diagnostico, String prescricao, boolean indicacaoCirurgica) {
        this.idConsultaMedica = idConsultaMedica;
        this.idPaciente = idPaciente;
        this.nomePaciente = nomePaciente;
        this.idMedico = idMedico;
        this.nomeMedico = nomeMedico;
        this.exameQueixa = exameQueixa;
        this.diagnostico = diagnostico;
        this.prescricao = prescricao;
        this.indicacaoCirurgica = indicacaoCirurgica;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }
    
    

    public void setIdConsultaMedica(long idConsultaMedica) {
        this.idConsultaMedica = idConsultaMedica;
    }

    public long getIdConsultaMedica() {
        return idConsultaMedica;
    }

    public long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public long getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(long idMedico) {
        this.idMedico = idMedico;
    }
    
    private long gerarIdUnico(){ //converte uuid para um numero positivo
        return Math.abs(UUID.randomUUID().getMostSignificantBits());
    }
    
    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getExameQueixa() {
        return exameQueixa;
    }

    public void setExameQueixa(String exameQueixa) {
        this.exameQueixa = exameQueixa;
    }

    public String getPrescricao() {
        return prescricao;
    }

    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
    }

    public void setIndicacaoCirurgica(boolean indicacaoCirurgica) {
        this.indicacaoCirurgica = indicacaoCirurgica;
    }

    public boolean isIndicacaoCirurgica() {
        return indicacaoCirurgica;
    }

    @Override
    public String toString() {
        return ", idMedico=" + 
                "Consulta{ " + "idconsulta=" + idConsultaMedica +
                ", idpaciente=" + idPaciente +
                ", nomePaciente=" + nomePaciente +
                ", idpaciente=" + idMedico + 
                ", nomeMedico=" + nomeMedico +
                ", exameQueixa=" + exameQueixa +
                ", diagnostico=" + diagnostico +
                ", prescricao=" + prescricao + 
                ", indicacaoCirurgica=" +indicacaoCirurgica + "////}" ; 
    } 
}
