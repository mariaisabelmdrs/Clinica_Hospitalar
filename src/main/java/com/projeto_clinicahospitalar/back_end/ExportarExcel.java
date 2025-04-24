package com.projeto_clinicahospitalar.back_end;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ExportarExcel {

    public static void exportar(String caminho) throws IOException {
        Workbook workbook = new XSSFWorkbook();
        CreationHelper createHelper = workbook.getCreationHelper();
        CellStyle dateStyle = workbook.createCellStyle();
        dateStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd/MM/yyyy"));

        exportarPacientes(workbook, dateStyle);
        exportarMedicos(workbook, dateStyle);
        exportarEnfermeiros(workbook, dateStyle);
        exportarConsultas(workbook, dateStyle);

        try (FileOutputStream fileOut = new FileOutputStream(caminho)) {
            workbook.write(fileOut);
        }
        workbook.close();
    }

    private static void exportarPacientes(Workbook workbook, CellStyle dateStyle) {
        Sheet sheet = workbook.createSheet("Paciente");
        Row header = sheet.createRow(0);
        String[] cols = {"ID", "Nome", "Nascimento", "Rua", "Número", "Bairro", "Cidade", "Estado", "CEP", "Celular", "Telefone", "Email", "Genero", "Idade", "Cadastro", "Obs Geral", "Historico", "ID Responsável", "Nome Resp", "Celular Resp", "Telefone Resp", "Email Resp"};
        for (int i = 0; i < cols.length; i++) {
            header.createCell(i).setCellValue(cols[i]);
        }

        List<Paciente> pacientes = ListasDeControle.ListaPaciente;
        int rowNum = 1;
        for (Paciente p : pacientes) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(p.getIdPaciente()); // grava como número
            row.createCell(1).setCellValue(p.getNomeCompleto());

            Cell nascimento = row.createCell(2);
            nascimento.setCellValue(p.getDataNascimento());
            nascimento.setCellStyle(dateStyle);

            row.createCell(3).setCellValue(p.getEndereco().getRua());
            row.createCell(4).setCellValue(p.getEndereco().getNumero());
            row.createCell(5).setCellValue(p.getEndereco().getBairro());
            row.createCell(6).setCellValue(p.getEndereco().getCidade());
            row.createCell(7).setCellValue(p.getEndereco().getEstado());
            row.createCell(8).setCellValue(p.getEndereco().getCep());

            row.createCell(9).setCellValue(p.getContatoTelEmail().getCelular());
            row.createCell(10).setCellValue(p.getContatoTelEmail().getTelefone());
            row.createCell(11).setCellValue(p.getContatoTelEmail().getEmail());

            row.createCell(12).setCellValue(p.getGenero().toString());

            row.createCell(13).setCellValue(p.getIdade());

            Cell cadastro = row.createCell(14);
            cadastro.setCellValue(p.getDataCadastro());
            cadastro.setCellStyle(dateStyle);

            row.createCell(15).setCellValue(p.getObsGeral());
            row.createCell(16).setCellValue(p.getHistoricoConsultasMedicas().toString()); // ver se vai

            row.createCell(17).setCellValue(String.valueOf(p.getResponsavel().getIdResponsavel()));
            row.createCell(18).setCellValue(p.getResponsavel().getNomeResponsavel());
            row.createCell(19).setCellValue(p.getResponsavel().getCelular());
            row.createCell(20).setCellValue(p.getResponsavel().getTelefone());
            row.createCell(21).setCellValue(p.getResponsavel().getEmail());
        }
    }

    private static void exportarMedicos(Workbook workbook, CellStyle dateStyle) {
        Sheet sheet = workbook.createSheet("Medico");
        Row header = sheet.createRow(0);
        String[] cols = {"ID", "Nome", "Nascimento", "Rua", "Número", "Bairro", "Cidade", "Estado", "CEP", "Celular", "Telefone", "Email", "Genero", "Setor", "Carga Horária", "CRM", "Cirurgião", "Especialidades"};
        for (int i = 0; i < cols.length; i++) {
            header.createCell(i).setCellValue(cols[i]);
        }

        List<Medico> medicos = ListasDeControle.ListaMedico;
        int rowNum = 1;
        for (Medico m : medicos) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(m.getIdMedico());
            row.createCell(1).setCellValue(m.getNomeCompleto());
            Cell nascimento = row.createCell(2);
            nascimento.setCellValue(m.getDataNascimento());
            nascimento.setCellStyle(dateStyle);

            row.createCell(3).setCellValue(m.getEndereco().getRua());
            row.createCell(4).setCellValue(m.getEndereco().getNumero());
            row.createCell(5).setCellValue(m.getEndereco().getBairro());
            row.createCell(6).setCellValue(m.getEndereco().getCidade());
            row.createCell(7).setCellValue(m.getEndereco().getEstado());
            row.createCell(8).setCellValue(m.getEndereco().getCep());

            row.createCell(9).setCellValue(m.getContato().getCelular());
            row.createCell(10).setCellValue(m.getContato().getTelefone());
            row.createCell(11).setCellValue(m.getContato().getEmail());

            row.createCell(12).setCellValue(m.getGenero().toString());

            row.createCell(13).setCellValue(m.getSetor());
            
            row.createCell(14).setCellValue(m.getCargaHorariaSemanal());  // Carga Horária
            row.createCell(15).setCellValue(m.getNumeroCRM());           // CRM
            row.createCell(16).setCellValue(m.isCirurgiao() ? "Sim" : "Não");  // Cirurgião
            row.createCell(17).setCellValue(String.join(", ", m.getAreasEspecialidade()));  // Especialidades

        }
    }

    private static void exportarEnfermeiros(Workbook workbook, CellStyle dateStyle) {
        Sheet sheet = workbook.createSheet("Enfermeiro");
        Row header = sheet.createRow(0);
        String[] cols = {"ID", "Nome", "Nascimento", "Rua", "Número", "Bairro", "Cidade", "Estado", "CEP", "Celular", "Telefone", "Email", "Genero", "Setor", "Carga Horária", "Treinado Raio-X"};
        for (int i = 0; i < cols.length; i++) {
            header.createCell(i).setCellValue(cols[i]);
        }

        List<Enfermeiro> enfermeiros = ListasDeControle.ListaEnfermeiro;
        int rowNum = 1;
        for (Enfermeiro e : enfermeiros) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(e.getIdEnfermeiro());
            row.createCell(1).setCellValue(e.getNomeCompleto());
            Cell nascimento = row.createCell(2);
            nascimento.setCellValue(e.getDataNascimento());
            nascimento.setCellStyle(dateStyle);

            row.createCell(3).setCellValue(e.getEndereco().getRua());
            row.createCell(4).setCellValue(e.getEndereco().getNumero());
            row.createCell(5).setCellValue(e.getEndereco().getBairro());
            row.createCell(6).setCellValue(e.getEndereco().getCidade());
            row.createCell(7).setCellValue(e.getEndereco().getEstado());
            row.createCell(8).setCellValue(e.getEndereco().getCep());

            row.createCell(9).setCellValue(e.getContato().getCelular());
            row.createCell(10).setCellValue(e.getContato().getTelefone());
            row.createCell(11).setCellValue(e.getContato().getEmail());

            row.createCell(12).setCellValue(e.getGenero().toString());

            row.createCell(13).setCellValue(e.getSetor());
            row.createCell(14).setCellValue(e.getCargaHorariaSemanal());

            row.createCell(15).setCellValue(e.isTreinadoOpRaioX() ? "Sim" : "Não");
        }
    }

    private static void exportarConsultas(Workbook workbook, CellStyle dateStyle) {
        Sheet sheet = workbook.createSheet("ConsultaMedica");
        Row header = sheet.createRow(0);
        String[] cols = {"ID Consulta", "ID Paciente", "Nome Paciente", "ID Medico", "Nome Medico", "Exame", "Diagnóstico", "Prescrição", "Indicação Cirúrgica"};
        for (int i = 0; i < cols.length; i++) {
            header.createCell(i).setCellValue(cols[i]);
        }

        List<ConsultaMedica> consultas = ListasDeControle.ListaConsultaMedica;
        int rowNum = 1;
        for (ConsultaMedica c : consultas) {
            Paciente paciente = buscarPacientePorId(c.getIdPaciente());
            Medico medico = buscarMedicoPorId(c.getIdMedico());
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(c.getIdConsultaMedica());
            row.createCell(1).setCellValue(c.getIdPaciente());
            row.createCell(2).setCellValue(paciente.getNomeCompleto());
            row.createCell(3).setCellValue(c.getIdMedico());
            row.createCell(4).setCellValue(medico.getNomeCompleto());
            row.createCell(5).setCellValue(c.getExameQueixa());
            row.createCell(6).setCellValue(c.getDiagnostico());
            row.createCell(7).setCellValue(c.getPrescricao());
            row.createCell(8).setCellValue(c.isIndicacaoCirurgica() ? "Sim" : "Não");
        }
    }

    private static Paciente buscarPacientePorId(long id) {
        for (Paciente p : ListasDeControle.ListaPaciente) {
            if (p.getIdPaciente() == id) {
                return p;
            }
        }
        return null;
    }

    private static Medico buscarMedicoPorId(long id) {
        for (Medico m : ListasDeControle.ListaMedico) {
            if (m.getIdMedico() == id) {
                return m;
            }
        }
        return null;
    }

}
