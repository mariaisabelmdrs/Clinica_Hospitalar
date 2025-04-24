package com.projeto_clinicahospitalar.back_end;
import com.projeto_clinicahospitalar.front_end.TelaPrincipal;
import com.projeto_clinicahospitalar.front_end.TelaCadastroPaciente; // Importe a outra classe do front

//import com.projeto_clinicahospitalar.front_end;

import java.util.ArrayList;
import java.util.Date;

public class Projeto_ClinicaHospitalar {

    public static void main(String[] args) {
        
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true); // Supondo que TelaPrincipal seja um JFrame ou similar
    
        
      
        
        //TelaPrincipal TP = new TelaPrincipal();
        
        /*System.out.println("Hello World!");

        Endereco endereco = new Endereco(
            "Rua das Flores", 
            123, 
            "Apt 101", 
            "Centro", 
            "São Paulo",  
            9987
        );

        ContatoTelEmail contato = new ContatoTelEmail(
            "(11) 9999-8888", 
            "(11) 33323-4444", 
            "paciente@email.com"
        );

        ContatoTelEmail contato_p = new ContatoTelEmail(
            "(11) 7777-8888", 
            "(11) 5555-4444", 
            "pacienteRsponsavel@email.com"
        );

        Date dataNascimento = new Date(); 
        Date dataCadastro = new Date(); 

        Paciente paciente = new Paciente(
            0,
            30,
            dataCadastro,
            "Nenhuma observacao",
            contato, //o dele
            "Maria da Silva",
            dataNascimento,
            endereco,
            Genero.F,
            contato_p //o do responsavel
        );

        Endereco enderecoMedico = new Endereco("Av. Paulista", 1000, "Conj. 101", "Bela Vista", "São Paulo", 12345678);
        ContatoTelEmail contatoMedico = new ContatoTelEmail("4002-8922", "99999-0000", "ana.medico@hospital.com");

        ArrayList<String> especialidades = new ArrayList<>();

        Medico medico = new Medico(
            1001L,
            456789,
            especialidades,
            true,
            "Centro Cirúrgico",
            40,
            "Dra. Ana Beatriz",
            new Date(),
            enderecoMedico,
            Genero.F,
            contatoMedico
        );

        medico.adicionarEspecialidade("Cardiologia");

        ConsultaMedica consulta1 = new ConsultaMedica(
            1L, // idConsulta
            paciente.getIdPaciente(), // idPaciente
            medico.getIdMedico(), // idMedico
            "2025-04-07", // data da consulta
            "14:00", // horário da consulta
            "Rotina", // motivo
            false // realizada
        );
                paciente.getHistoricoConsultasMedicas().add(consulta1);

        System.out.println("Histórico de Consultas:");
        for (ConsultaMedica consulta : paciente.getHistoricoConsultasMedicas()) {
            System.out.println(consulta.toString());
        }

        Enfermeiro enfermeiro1 = new Enfermeiro(0, false);

        Responsavel responsavel = new Responsavel(
            0,
            "João da Silva",
            "(11) 91234-5678",
            "(11) 3456-7890",
            "joao.silva@email.com"
        );

        Medico medico2 = new Medico(
            0,
            123456,
            especialidades,
            true,
            "Emergência",
            40,
            "Dra. Ana Beatriz",
            new Date(),
            enderecoMedico,
            Genero.F,
            contatoMedico
        );
        medico2.adicionarEspecialidade("Ortopedia");

        System.out.println("Paciente criado: " + paciente.getNomeCompleto());
        System.out.println("ID do paciente: " + paciente.getIdPaciente());
        System.out.println("paciente to string: " + paciente.toString());
        System.out.println("endereco to string: " + endereco.toString());
        System.out.println("enfermeiro: " + enfermeiro1.toString());
        System.out.println("responsavel: " + responsavel.toString());
        System.out.println("Medico: " + medico);
        System.out.println("Medico2: " + medico2.toString());
            
        */
    }
}
