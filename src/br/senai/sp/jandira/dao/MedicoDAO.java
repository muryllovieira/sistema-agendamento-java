package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO {
    
    /*
    Essa classe será responsável pela persistência de dados
    dos planos de saude, por exemplo, adicionar um novo,
    excluir um plano de saude, etc.
     */
    
    private static ArrayList<Medico> medicos = new ArrayList<>();

    public static ArrayList<Medico> getMedico() { // READ
        return medicos;
    }

    public static Medico getMedico(Integer codigo) { // READ

        for (Medico m : medicos) {
            if (m.getCodigo() == codigo) {
                return m;
            }

        }

        return null;

    }
    
    public static void atualizar(Medico medicosAtualizado) { // UPDATE

        for (Medico m : medicos) {
            if (m.getCodigo() == medicosAtualizado.getCodigo()) {
                medicos.set(medicos.indexOf(m), medicosAtualizado);
                break;
            }

        }
        
        //atualizarArquivo();
        
    }

    public static void excluir(Integer codigo) { // DELETE

        for (Medico m : medicos) {
            if (m.getCodigo().equals(codigo)) {
                medicos.remove(m);
                break;
            }
        }

        //atualizarArquivo();
        
    }
    
    // Criar uma lista inicial de medicos
    public static void criarListaDeMedicos() {
        Medico m1 = new Medico("Maria", "1111-111", "(11)94444-4444");
        Medico m2 = new Medico("José", "2222-222", "(11)95555-5555");
        Medico m3 = new Medico("Pedro", "3333-333", "(11)97777-7777");
        Medico m4 = new Medico("Lucas", "4444-444", "(11)99999-9999");
        
        medicos.add(m1);
        medicos.add(m2);
        medicos.add(m3);
        medicos.add(m4);
    }
    
    public static DefaultTableModel getTabelaMedicos() {

        System.out.println(medicos.size());

        String[] titulo = {"CÓDIGO", "CRM", "NOME", "TELEFONE"};
        String[][] dados = new String[medicos.size()][4];

        for (Medico m : medicos) {
            int i = medicos.indexOf(m);
            dados[i][0] = m.getCodigo().toString();
            dados[i][1] = m.getCrm();
            dados[i][2] = m.getNome();
            dados[i][3] = m.getTelefone();

        }

        return new DefaultTableModel(dados, titulo);
    }
 }