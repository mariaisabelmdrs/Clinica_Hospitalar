package com.projeto_clinicahospitalar.back_end;

public class ContatoTelEmail {
    private String celular;
    private String telefone;
    private String email;

    public ContatoTelEmail(String celular, String telefone, String email) {
        this.celular = celular;
        this.telefone = telefone;
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "cel:" + celular + ", tel:" + telefone + ", email:" + email + '}';
    }
    
    
}
