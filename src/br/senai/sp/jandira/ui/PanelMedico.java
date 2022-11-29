package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PanelMedico extends javax.swing.JPanel {
    
    private int linha;
    
    public PanelMedico() {
        initComponents();
        MedicoDAO.criarListaDeMedicos();
        preencherTabela();
    }
    private int getLinha() {
        linha = tabelMedicos.getSelectedRow();
        return linha;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollMedicos = new javax.swing.JScrollPane();
        tabelMedicos = new javax.swing.JTable();
        buttonExcluirMedico = new javax.swing.JButton();
        buttonEditarMedico = new javax.swing.JButton();
        buttonNovoMedico = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Médicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(204, 153, 255))); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 350));
        setLayout(null);

        tabelMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelMedicos.setToolTipText("");
        scrollMedicos.setViewportView(tabelMedicos);

        add(scrollMedicos);
        scrollMedicos.setBounds(10, 20, 780, 250);

        buttonExcluirMedico.setBackground(new java.awt.Color(204, 204, 204));
        buttonExcluirMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/excluir.png"))); // NOI18N
        buttonExcluirMedico.setToolTipText("Excluir a especialidade selecionada");
        buttonExcluirMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirMedicoActionPerformed(evt);
            }
        });
        add(buttonExcluirMedico);
        buttonExcluirMedico.setBounds(520, 280, 80, 50);

        buttonEditarMedico.setBackground(new java.awt.Color(204, 204, 204));
        buttonEditarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/editar.png"))); // NOI18N
        buttonEditarMedico.setToolTipText("Editar especialidade selecionada");
        buttonEditarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarMedicoActionPerformed(evt);
            }
        });
        add(buttonEditarMedico);
        buttonEditarMedico.setBounds(610, 280, 80, 50);

        buttonNovoMedico.setBackground(new java.awt.Color(204, 204, 204));
        buttonNovoMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plus.png"))); // NOI18N
        buttonNovoMedico.setToolTipText("Criar nova especialidade");
        buttonNovoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovoMedicoActionPerformed(evt);
            }
        });
        add(buttonNovoMedico);
        buttonNovoMedico.setBounds(700, 280, 80, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirMedicoActionPerformed

        if (getLinha() != -1) {
            excluirMedico();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por Favor, selecione a especialidade que você deseja excluir",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonExcluirMedicoActionPerformed

    private void buttonEditarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarMedicoActionPerformed
        if (getLinha() != -1) {
            editarMedico();
        } else {
            JOptionPane.showConfirmDialog(
                    this,
                    "Por favor, selecione o médico que você deseja editar.",
                    "Médicos",
                    JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_buttonEditarMedicoActionPerformed

    private void buttonNovoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoMedicoActionPerformed
        MedicoDialog m = new MedicoDialog(null, true, OperacaoEnum.ADICIONAR);
        m.setVisible(true);
        preencherTabela();
    }//GEN-LAST:event_buttonNovoMedicoActionPerformed
    private void editarMedico() {

        Medico medico = MedicoDAO.getMedico(getCodigo());

        MedicoDialog medicoDialog = new MedicoDialog(null, true, medico, OperacaoEnum.EDITAR);

        medicoDialog.setVisible(true);
        preencherTabela();
    }

    private void excluirMedico() {

        int resposta = JOptionPane.showConfirmDialog(this,
                "Você confirma a exclusão?",
                "Atenção!",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
            MedicoDAO.excluir(getCodigo());
            preencherTabela();
        }
    }

    private Integer getCodigo() {
        String codigoStr = tabelMedicos.getValueAt(linha, 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditarMedico;
    private javax.swing.JButton buttonExcluirMedico;
    private javax.swing.JButton buttonNovoMedico;
    private javax.swing.JScrollPane scrollMedicos;
    private javax.swing.JTable tabelMedicos;
    // End of variables declaration//GEN-END:variables
    private void preencherTabela() {

        tabelMedicos.setModel(MedicoDAO.getTabelaMedicos());
        ajustarTabela();
    }

    private void ajustarTabela() {

        // Impedir que o usuário movimente as colunas
        tabelMedicos.getTableHeader().setReorderingAllowed(false);

        // Bloquear a edição das células da tabela
        tabelMedicos
                .setDefaultEditor(Object.class,
                        null);

        // Definir a largura das colunas
        tabelMedicos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabelMedicos.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabelMedicos.getColumnModel().getColumn(1).setPreferredWidth(150);
        tabelMedicos.getColumnModel().getColumn(2).setPreferredWidth(300);
        tabelMedicos.getColumnModel().getColumn(3).setPreferredWidth(210);

    }




}
