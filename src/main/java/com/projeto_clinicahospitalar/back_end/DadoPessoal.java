package com.projeto_clinicahospitalar.back_end;
import com.projeto_clinicahospitalar.back_end.Endereco;
import com.projeto_clinicahospitalar.back_end.Genero;
import java.util.Date;
import java.util.UUID;

public class DadoPessoal {
    private String nomeCompleto;
    private Date dataNascimento;
    private Endereco endereco; //contruir classse
    private Genero genero;//construir enum
    private ContatoTelEmail contato;

    public DadoPessoal(String nomeCompleto, Date dataNascimento, Endereco endereco, Genero genero, ContatoTelEmail contato) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.genero = genero;
        this.contato = contato;
    }

    public ContatoTelEmail getContato() {
        return contato;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Genero getGenero() {
        return genero;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setContato(ContatoTelEmail contato) {
        this.contato = contato;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    
    
}

