package com.projeto_clinicahospitalar.back_end;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ImportarExcel {

    public static void importar(String caminho) throws IOException {
        try (FileInputStream fis = new FileInputStream(caminho); Workbook workbook = new XSSFWorkbook(fis)) {
            System.out.println("Abas encontradas:");
            for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
                System.out.println("- " + workbook.getSheetName(i));
            }

            Sheet s1 = workbook.getSheet("Paciente");
            if (s1 != null) {
                importarPacientes(s1);
            } else {
                System.out.println("Aba 'Paciente' não encontrada.");
            }

            Sheet s2 = workbook.getSheet("Medico");
            if (s2 != null) {
                importarMedicos(s2);
            } else {
                System.out.println("Aba 'Medico' não encontrada.");
            }

            Sheet s3 = workbook.getSheet("Enfermeiro");
            if (s3 != null) {
                importarEnfermeiros(s3);
            } else {
                System.out.println("Aba 'Enfermeiro' não encontrada.");
            }

            Sheet s4 = workbook.getSheet("ConsultaMedica");
            if (s4 != null) {
                importarConsultas(s4);
            } else {
                System.out.println("Aba 'ConsultaMedica' não encontrada.");
            }
        }
    }

    private static void importarPacientes(Sheet sheet) {
        ListasDeControle.ListaPaciente.clear();
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            try {
                long idPaciente = getCellLongValue(row.getCell(0)); // <-- paciente
                String nome = getCellStringValue(row.getCell(1));
                Date nascimento = row.getCell(2).getDateCellValue();
                String rua = getCellStringValue(row.getCell(3));
                int numero = parseIntSafe(getCellStringValue(row.getCell(4)));
                String bairro = getCellStringValue(row.getCell(5));
                String cidade = getCellStringValue(row.getCell(6));
                String estado = getCellStringValue(row.getCell(7));
                int cep = parseIntSafe(getCellStringValue(row.getCell(8)));
                String celular = getCellStringValue(row.getCell(9));
                String telefone = getCellStringValue(row.getCell(10));
                String email = getCellStringValue(row.getCell(11));
                String genero = getCellStringValue(row.getCell(12));
                int idade = parseIntSafe(getCellStringValue(row.getCell(13)));
                Date dataCadastro = row.getCell(14).getDateCellValue();
                String obs = getCellStringValue(row.getCell(15));
                long idResp = parseLongSafe(getCellStringValue(row.getCell(17)));
                String nomeResp = getCellStringValue(row.getCell(18));
                String celResp = getCellStringValue(row.getCell(19));
                String telResp = getCellStringValue(row.getCell(20));
                String emailResp = getCellStringValue(row.getCell(21));

                Endereco endereco = new Endereco(rua, numero, bairro, cidade, estado, cep);
                ContatoTelEmail contato = new ContatoTelEmail(celular, telefone, email);
                ContatoTelEmail contatoResp = new ContatoTelEmail(celResp, telResp, emailResp);
                Responsavel responsavel = new Responsavel(idResp, nomeResp, celResp, telResp, emailResp);

                Paciente paciente = new Paciente(idPaciente, idade, dataCadastro, obs, nome, nascimento, endereco,
                        Genero.valueOf(genero.toUpperCase()), contato, responsavel, contatoResp);

                ListasDeControle.ListaPaciente.add(paciente);

            } catch (Exception e) {
                System.out.println("Erro linha " + i + ": " + e.getMessage());
                for (int c = 0; c < row.getLastCellNum(); c++) {
                    Cell cell = row.getCell(c);
                    String val = (cell == null) ? "<null>" : cell.toString();
                    System.out.println("Coluna " + c + ": " + val);
                }
            }
        }
        System.out.println("Pacientes importados: " + ListasDeControle.ListaPaciente.size());
    }

   private static void importarMedicos(Sheet sheet) {
        ListasDeControle.ListaMedico.clear();
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            try {
                long idMedico = getCellLongValue(row.getCell(0));
                String nomeCompleto = getCellStringValue(row.getCell(1));
                Date dataNasc = row.getCell(2).getDateCellValue();

                // Endereço (colunas 3 a 8)
                Endereco endereco = new Endereco(
                        getCellStringValue(row.getCell(3)), // Rua
                        parseIntSafe(getCellStringValue(row.getCell(4))), // Número
                        getCellStringValue(row.getCell(5)), // Bairro
                        getCellStringValue(row.getCell(6)), // Cidade
                        getCellStringValue(row.getCell(7)), // Estado
                        parseIntSafe(getCellStringValue(row.getCell(8))) // CEP
                );

                // Contato (colunas 9 a 11)
                ContatoTelEmail contato = new ContatoTelEmail(
                        getCellStringValue(row.getCell(9)), // Celular
                        getCellStringValue(row.getCell(10)), // Telefone
                        getCellStringValue(row.getCell(11)) // Email
                );

                // Demais campos
                String genero = getCellStringValue(row.getCell(12));
                String setor = getCellStringValue(row.getCell(13));
                int cargaHorariaSemanal = parseIntSafe(getCellStringValue(row.getCell(14)));
                int crm = Integer.parseInt(getCellStringValue(row.getCell(15)).replaceAll("[^0-9]", ""));
                String cirurgiaoStr = getCellStringValue(row.getCell(16)).trim().toLowerCase(); // ✅ coluna correta
                boolean cirurgiao = cirurgiaoStr.startsWith("s");
                //int cargaHorariaSemanal = parseIntSafe(getCellStringValue(row.getCell(14)));  

                ArrayList<String> areasEspecialidades = new ArrayList<>();
                Cell cellEspecialidades = row.getCell(17);
                if (cellEspecialidades != null) {
                    String especialidadesStr = getCellStringValue(cellEspecialidades).trim();
                    if (!especialidadesStr.isEmpty()) {
                        areasEspecialidades = new ArrayList<>(Arrays.asList(especialidadesStr.split(",\\s*")));
                    }
                }

                // Cria o médico
                Medico medico = new Medico(
                        idMedico, crm, areasEspecialidades, cirurgiao, setor,
                        cargaHorariaSemanal, nomeCompleto, dataNasc, endereco,
                        Genero.valueOf(genero.toUpperCase()), contato
                );

                ListasDeControle.ListaMedico.add(medico);

            } catch (Exception x) {
                System.err.println("Erro na linha " + i + ": " + x.getMessage());
            }
        }
        System.out.println("Médicos importados: " + ListasDeControle.ListaMedico.size());
    }  

    private static void importarEnfermeiros(Sheet sheet) {
        ListasDeControle.ListaEnfermeiro.clear();
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            try {
                long idEnfermeiro = getCellLongValue(row.getCell(0)); // <-- paciente
                String nomeCompleto = getCellStringValue(row.getCell(1));
                Date dataNasc = row.getCell(2).getDateCellValue();
                String rua = getCellStringValue(row.getCell(3));
                int numero = parseIntSafe(getCellStringValue(row.getCell(4)));
                String bairro = getCellStringValue(row.getCell(5));
                String cidade = getCellStringValue(row.getCell(6));
                String estado = getCellStringValue(row.getCell(7));
                int cep = parseIntSafe(getCellStringValue(row.getCell(8)));
                String celular = getCellStringValue(row.getCell(9));
                String telefone = getCellStringValue(row.getCell(10));
                String email = getCellStringValue(row.getCell(11));
                String genero = getCellStringValue(row.getCell(12));
                String setor = getCellStringValue(row.getCell(13));
                int cargaHorariaSemanal = parseIntSafe(getCellStringValue(row.getCell(14)));

                String treinadoRaioXStr = getCellStringValue(row.getCell(15)).trim().toLowerCase(Locale.ROOT);
                boolean treinadoRaioX = treinadoRaioXStr.equals("sim") || treinadoRaioXStr.equals("s");

                Endereco endereco = new Endereco(rua, numero, bairro, cidade, estado, cep);
                ContatoTelEmail contato = new ContatoTelEmail(celular, telefone, email);

                Enfermeiro enfermeiro = new Enfermeiro(idEnfermeiro, treinadoRaioX, setor, cargaHorariaSemanal,
                        nomeCompleto, dataNasc, endereco, Genero.valueOf(genero.toUpperCase()), contato);

                ListasDeControle.ListaEnfermeiro.add(enfermeiro);

            } catch (Exception x) {
                System.out.println("Erro linha:" + i + ": " + x.getMessage());
                for (int c = 0; c < row.getLastCellNum(); c++) {
                    Cell cell = row.getCell(c);
                    String val = (cell == null) ? "<null>" : cell.toString();
                    System.out.println("Coluna " + c + ": " + val);
                }
            }
        }
        System.out.println("Enfermeiros importados: " + ListasDeControle.ListaEnfermeiro.size());
    }

    private static void importarConsultas(Sheet sheet) {
        ListasDeControle.ListaConsultaMedica.clear();

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            try {
                long idConsultaMedica = getCellLongValue(row.getCell(0));
                long idPaciente = getCellLongValue(row.getCell(1));
                long idMedico = getCellLongValue(row.getCell(3));

                String nomePaciente = getCellStringValue(row.getCell(2));
                String nomeMedico = getCellStringValue(row.getCell(4));

                Paciente paciente = buscarPacientePorId(idPaciente);
                Medico medico = buscarMedicoPorId(idMedico);

                if (paciente == null) {
                    System.out.println("Aviso: Paciente ID " + idPaciente + " não encontrado - usando nome da planilha: " + nomePaciente);
                }
                if (medico == null) {
                    System.out.println("Aviso: Médico ID " + idMedico + " não encontrado - usando nome da planilha: " + nomeMedico);
                }

                String exame = getCellStringValue(row.getCell(5));
                String diagnostico = getCellStringValue(row.getCell(6));
                String prescricao = getCellStringValue(row.getCell(7));
                String indicacaoStr = getCellStringValue(row.getCell(8)).trim().toLowerCase(Locale.ROOT);
                boolean indicacaoCirurgica = indicacaoStr.equals("sim") || indicacaoStr.equals("s");

                ConsultaMedica consulta = new ConsultaMedica(idConsultaMedica, idPaciente, nomePaciente, idMedico, nomeMedico,
                        exame, diagnostico, prescricao, indicacaoCirurgica);

                ListasDeControle.ListaConsultaMedica.add(consulta);
            } catch (Exception e) {
                System.out.println("Erro ao importar consulta linha " + i + ": " + e.getMessage());
                for (int c = 0; c < row.getLastCellNum(); c++) {
                    Cell cell = row.getCell(c);
                    String val = (cell == null) ? "<null>" : cell.toString();
                    System.out.println("Coluna " + c + ": " + val);
                }
            }
        }
        System.out.println("Consultas importadas: " + ListasDeControle.ListaConsultaMedica.size());
    }

    private static long getCellLongValue(Cell cell) {
        if (cell == null) {
            throw new IllegalArgumentException("Célula nula");
        }
        if (cell.getCellType() == CellType.NUMERIC) {
            return (long) cell.getNumericCellValue();
        } else if (cell.getCellType() == CellType.STRING) {
            return Long.parseLong(cell.getStringCellValue().split("\\.")[0]);
        }
        throw new IllegalArgumentException("Célula inválida ou não numérica");
    }

    private static long parseLongSafe(String val) {
        // Trunca qualquer parte decimal convertida do Excel
        val = val.split("\\.")[0]; // pega só a parte inteira
        return Long.parseLong(val);
    }

    private static String getCellStringValue(Cell cell) {
        if (cell == null) {
            return "";
        }
        return switch (cell.getCellType()) {
            case STRING ->
                cell.getStringCellValue();
            case NUMERIC ->
                String.valueOf(cell.getNumericCellValue());
            case BOOLEAN ->
                String.valueOf(cell.getBooleanCellValue());
            case BLANK ->
                "";
            default ->
                throw new IllegalArgumentException("Tipo de célula inválido: " + cell.getCellType());
        };
    }

    private static int parseIntSafe(String val) {
        return (int) Double.parseDouble(val);
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
