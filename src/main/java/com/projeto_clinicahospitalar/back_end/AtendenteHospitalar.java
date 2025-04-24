package com.projeto_clinicahospitalar.back_end;

import com.projeto_clinicahospitalar.back_end.ContatoTelEmail;
import com.projeto_clinicahospitalar.back_end.DadoPessoal;
import com.projeto_clinicahospitalar.back_end.Endereco;
import com.projeto_clinicahospitalar.back_end.Genero;
import java.util.Date;

public class AtendenteHospitalar extends DadoPessoal{
    private String setor;
    private int cargaHorariaSemanal;

    public AtendenteHospitalar(String setor, int cargaHorariaSemanal, String nomeCompleto, Date dataNascimento, Endereco endereco, Genero genero, ContatoTelEmail contato) {
        super(nomeCompleto, dataNascimento, endereco, genero, contato);
        this.setor = setor;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    

    public int getCargaHorariaSemanal() {
        return cargaHorariaSemanal;
    }

    public void setCargaHorariaSemanal(int cargaHorariaSemanal) {
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
