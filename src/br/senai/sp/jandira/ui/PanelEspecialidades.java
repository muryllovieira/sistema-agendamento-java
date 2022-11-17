package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PanelEspecialidades extends javax.swing.JPanel {

    private int linha;

    public PanelEspecialidades() {
        initComponents();
        EspecialidadeDAO.criarListaDeEspecialidades();
        preencherTabela();
    }

    private int getLinha() {
        linha = tabelEspecialidades.getSelectedRow();
        return linha;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollEspecialidades = new javax.swing.JScrollPane();
        tabelEspecialidades = new javax.swing.JTable();
        buttonExcluirEspecialidades = new javax.swing.JButton();
        buttonEditarEspecialidades = new javax.swing.JButton();
        buttonNovaEspecialidades = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, null, null, null, null, null));
        setPreferredSize(new java.awt.Dimension(0, 0));
        setLayout(null);

        tabelEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelEspecialidades.setToolTipText("");
        scrollEspecialidades.setViewportView(tabelEspecialidades);

        add(scrollEspecialidades);
        scrollEspecialidades.setBounds(10, 20, 780, 250);

        buttonExcluirEspecialidades.setBackground(new java.awt.Color(204, 204, 204));
        buttonExcluirEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/excluir.png"))); // NOI18N
        buttonExcluirEspecialidades.setToolTipText("Excluir a especialidade selecionada");
        buttonExcluirEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirEspecialidadesActionPerformed(evt);
            }
        });
        add(buttonExcluirEspecialidades);
        buttonExcluirEspecialidades.setBounds(520, 280, 80, 50);

        buttonEditarEspecialidades.setBackground(new java.awt.Color(204, 204, 204));
        buttonEditarEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/editar.png"))); // NOI18N
        buttonEditarEspecialidades.setToolTipText("Editar especialidade selecionada");
        buttonEditarEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarEspecialidadesActionPerformed(evt);
            }
        });
        add(buttonEditarEspecialidades);
        buttonEditarEspecialidades.setBounds(610, 280, 80, 50);

        buttonNovaEspecialidades.setBackground(new java.awt.Color(204, 204, 204));
        buttonNovaEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plus.png"))); // NOI18N
        buttonNovaEspecialidades.setToolTipText("Criar nova especialidade");
        buttonNovaEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovaEspecialidadesActionPerformed(evt);
            }
        });
        add(buttonNovaEspecialidades);
        buttonNovaEspecialidades.setBounds(700, 280, 80, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonNovaEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovaEspecialidadesActionPerformed
        EspecialidadesDialog d = new EspecialidadesDialog(null, true, OperacaoEnum.ADICIONAR);
        d.setVisible(true);
        preencherTabela();
    }//GEN-LAST:event_buttonNovaEspecialidadesActionPerformed

    private void buttonExcluirEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirEspecialidadesActionPerformed

        if (getLinha() != -1) {
            excluirEspecialidade();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por Favor, selecione a especialidade que você deseja excluir",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonExcluirEspecialidadesActionPerformed

    private void buttonEditarEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarEspecialidadesActionPerformed

        if (getLinha() != -1) {
            editarEspecialidade();
        } else {
            JOptionPane.showConfirmDialog(
                    this,
                    "Por favor, selecione a especialidade que você deseja editar.",
                    "Especialidades",
                    JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_buttonEditarEspecialidadesActionPerformed

    private void editarEspecialidade() {

        Especialidade especialidade = EspecialidadeDAO.getEspecialidade(getCodigo());

        EspecialidadesDialog especialidadeDialog = new EspecialidadesDialog(null, true, especialidade, OperacaoEnum.EDITAR);

        especialidadeDialog.setVisible(true);
        preencherTabela();
    }

    private void excluirEspecialidade() {

        int resposta = JOptionPane.showConfirmDialog(this,
                "Você confirma a exclusão?",
                "Atenção!",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
            EspecialidadeDAO.excluir(getCodigo());
            preencherTabela();
        }
    }

    private Integer getCodigo() {
        String codigoStr = tabelEspecialidades.getValueAt(linha, 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditarEspecialidades;
    private javax.swing.JButton buttonExcluirEspecialidades;
    private javax.swing.JButton buttonNovaEspecialidades;
    private javax.swing.JScrollPane scrollEspecialidades;
    private javax.swing.JTable tabelEspecialidades;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {

        tabelEspecialidades.setModel(EspecialidadeDAO.getTabelaEspecialidades());
        ajustarTabela();
    }

    private void ajustarTabela() {

        // Impedir que o usuário movimente as colunas
        tabelEspecialidades.getTableHeader().setReorderingAllowed(false);

        // Bloquear a edição das células da tabela
        tabelEspecialidades
                .setDefaultEditor(Object.class,
                         null);

        // Definir a largura das colunas
        tabelEspecialidades.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabelEspecialidades.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabelEspecialidades.getColumnModel().getColumn(1).setPreferredWidth(300);
        tabelEspecialidades.getColumnModel().getColumn(2).setPreferredWidth(360);
    }
}
