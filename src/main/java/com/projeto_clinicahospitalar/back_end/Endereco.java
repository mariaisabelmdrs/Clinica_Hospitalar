package com.projeto_clinicahospitalar.back_end;

public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private int cep;

    public Endereco(String rua, int numero, String bairro, String cidade, String estado, int cep) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }
    
    public String getBairro() {
        return bairro;
    }

    public int getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public int getNumero() {
        return numero;
    }

    public String getRua() {
        return rua;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    
    @Override
    public String toString() {
        return rua + ", " + numero + " - " + bairro + ", " + cidade + " - " + estado + ", CEP: " + String.format("%05d", cep);
}
    
}
