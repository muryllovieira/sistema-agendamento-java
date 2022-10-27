package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PanelPlanoDeSaude extends javax.swing.JPanel {

    private int linha;
    
    public PanelPlanoDeSaude() {
        initComponents();
        PlanoDeSaudeDAO.criarListaDePlanoDeSaude();
        preencherTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPlanoDeSaude = new javax.swing.JScrollPane();
        tablePlanoDeSaude = new javax.swing.JTable();
        buttonExcluirPlanoDeSaude = new javax.swing.JButton();
        buttonEditarPlanoDeSaude = new javax.swing.JButton();
        buttonNovoPlanoDeSaude = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Planos de Saúde", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(204, 153, 255))); // NOI18N
        setLayout(null);

        tablePlanoDeSaude.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollPlanoDeSaude.setViewportView(tablePlanoDeSaude);

        add(scrollPlanoDeSaude);
        scrollPlanoDeSaude.setBounds(20, 30, 750, 210);

        buttonExcluirPlanoDeSaude.setBackground(new java.awt.Color(204, 204, 204));
        buttonExcluirPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/excluir.png"))); // NOI18N
        buttonExcluirPlanoDeSaude.setToolTipText("Excluir a especialidade selecionada");
        buttonExcluirPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirPlanoDeSaudeActionPerformed(evt);
            }
        });
        add(buttonExcluirPlanoDeSaude);
        buttonExcluirPlanoDeSaude.setBounds(520, 260, 80, 50);

        buttonEditarPlanoDeSaude.setBackground(new java.awt.Color(204, 204, 204));
        buttonEditarPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/editar.png"))); // NOI18N
        buttonEditarPlanoDeSaude.setToolTipText("Editar especialidade selecionada");
        buttonEditarPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarPlanoDeSaudeActionPerformed(evt);
            }
        });
        add(buttonEditarPlanoDeSaude);
        buttonEditarPlanoDeSaude.setBounds(610, 260, 80, 50);

        buttonNovoPlanoDeSaude.setBackground(new java.awt.Color(204, 204, 204));
        buttonNovoPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plus.png"))); // NOI18N
        buttonNovoPlanoDeSaude.setToolTipText("Criar nova especialidade");
        buttonNovoPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovoPlanoDeSaudeActionPerformed(evt);
            }
        });
        add(buttonNovoPlanoDeSaude);
        buttonNovoPlanoDeSaude.setBounds(700, 260, 80, 50);
    }// </editor-fold>//GEN-END:initComponents
        private int getLinha() {
        linha = tablePlanoDeSaude.getSelectedRow();
        return linha;
    }
        private Integer getCodigo() {
        String codigoStr = tablePlanoDeSaude.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }
    private void buttonExcluirPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirPlanoDeSaudeActionPerformed
        
       if (getLinha() != -1) {
            excluirPlanoDeSaude();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por Favor, selecione o plano de saúde que você deseja excluir",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonExcluirPlanoDeSaudeActionPerformed

    private void buttonEditarPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarPlanoDeSaudeActionPerformed

        if (getLinha() != -1) {
            editarPlanoDeSaude();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione o plano de saúde que você deseja editar.",
                    "Plano de Saúde",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonEditarPlanoDeSaudeActionPerformed
    private void editarPlanoDeSaude() {

        PlanoDeSaude planoDeSaude = PlanoDeSaudeDAO.getPlanoDeSaude(getCodigo());

        PlanoDeSaudeDialog planoDeSaudeDialog = new PlanoDeSaudeDialog(null, true, planoDeSaude, OperacaoEnum.EDITAR);

        planoDeSaudeDialog.setVisible(true);
        preencherTabela();
    }

    private void excluirPlanoDeSaude() {

        int resposta = JOptionPane.showConfirmDialog(this,
                "Você confirma a exclusão?",
                "Atenção!",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
            PlanoDeSaudeDAO.excluir(getCodigo());
            preencherTabela();
        }
    }

        
    private void buttonNovoPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoPlanoDeSaudeActionPerformed
        PlanoDeSaudeDialog planoDeSaudeDialog = new PlanoDeSaudeDialog(null, true, OperacaoEnum.ADICIONAR);
        planoDeSaudeDialog.setVisible(true);
        preencherTabela();
    }//GEN-LAST:event_buttonNovoPlanoDeSaudeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditarPlanoDeSaude;
    private javax.swing.JButton buttonExcluirPlanoDeSaude;
    private javax.swing.JButton buttonNovoPlanoDeSaude;
    private javax.swing.JScrollPane scrollPlanoDeSaude;
    private javax.swing.JTable tablePlanoDeSaude;
    // End of variables declaration//GEN-END:variables
    private void preencherTabela() {

        tablePlanoDeSaude.setModel(PlanoDeSaudeDAO.getTabelaPlanosDeSaude());
        ajustarTabela();
    }

    private void ajustarTabela() {

        // Impedir que o usuário movimente as colunas
        tablePlanoDeSaude.getTableHeader().setReorderingAllowed(false);

        // Bloquear a edição das células da tabela
        tablePlanoDeSaude
                .setDefaultEditor(Object.class,
                        null);

        // Definir a largura das colunas
        tablePlanoDeSaude.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tablePlanoDeSaude.getColumnModel().getColumn(0).setPreferredWidth(100);
        tablePlanoDeSaude.getColumnModel().getColumn(1).setPreferredWidth(100);
        tablePlanoDeSaude.getColumnModel().getColumn(2).setPreferredWidth(170);
        tablePlanoDeSaude.getColumnModel().getColumn(3).setPreferredWidth(160);
        tablePlanoDeSaude.getColumnModel().getColumn(4).setPreferredWidth(200);

    }

}
