package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PlanoDeSaudeDialog extends javax.swing.JDialog {

    private PlanoDeSaude planoDeSaude;
    private OperacaoEnum operacao;

    public PlanoDeSaudeDialog(
            java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {

        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
    }

    public PlanoDeSaudeDialog(
            java.awt.Frame parent,
            boolean modal,
            PlanoDeSaude p,
            OperacaoEnum operacao) {

        super(parent, modal);
        initComponents();

        planoDeSaude = p;
        this.operacao = operacao;

        preencherFormulario();
        preencherTitulo();
    }

    private void preencherFormulario() {

        textFieldCodigoPlano.setText(planoDeSaude.getCodigo().toString());
        textFieldOperadoraPlano.setText(planoDeSaude.getOperadora());
        textFieldCategoriaPlano.setText(planoDeSaude.getCategoria());
        textFieldNumeroPlano.setText(planoDeSaude.getNumero());
        textFieldValidadePlano.setText(planoDeSaude.getValidade().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    private void preencherTitulo() {
        labelPlanoDeSaudeAdicionar.setText("Planos de Saúde - " + operacao);

        if (operacao == OperacaoEnum.EDITAR) {
            labelPlanoDeSaudeAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/editar.png")));
        } else {
            labelPlanoDeSaudeAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/adicionar.png")));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelPlanoDeSaudeAdicionar = new javax.swing.JLabel();
        panelDetalhesPlanoDeSaude = new javax.swing.JPanel();
        labelCodigoPlano = new javax.swing.JLabel();
        textFieldCodigoPlano = new javax.swing.JTextField();
        labelNumeroPlano = new javax.swing.JLabel();
        textFieldNumeroPlano = new javax.swing.JTextField();
        labelOperadoraPlano = new javax.swing.JLabel();
        textFieldOperadoraPlano = new javax.swing.JTextField();
        textFieldCategoriaPlano = new javax.swing.JTextField();
        labelCategoriaPlano = new javax.swing.JLabel();
        labelValidadePlano = new javax.swing.JLabel();
        buttonCancelarPlanoDeSaude = new javax.swing.JButton();
        buttonSalvarPlanoDeSaude = new javax.swing.JButton();
        textFieldValidadePlano = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(null);

        labelPlanoDeSaudeAdicionar.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        labelPlanoDeSaudeAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/adicionar.png"))); // NOI18N
        labelPlanoDeSaudeAdicionar.setText("Plano de Saúde - ADICIONAR");
        jPanel1.add(labelPlanoDeSaudeAdicionar);
        labelPlanoDeSaudeAdicionar.setBounds(40, 10, 330, 32);

        panelDetalhesPlanoDeSaude.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do Plano de Saúde", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N
        panelDetalhesPlanoDeSaude.setLayout(null);

        labelCodigoPlano.setText("Código:");
        panelDetalhesPlanoDeSaude.add(labelCodigoPlano);
        labelCodigoPlano.setBounds(30, 40, 50, 16);

        textFieldCodigoPlano.setEditable(false);
        textFieldCodigoPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoPlanoActionPerformed(evt);
            }
        });
        panelDetalhesPlanoDeSaude.add(textFieldCodigoPlano);
        textFieldCodigoPlano.setBounds(30, 60, 110, 22);

        labelNumeroPlano.setText("Número do Plano:");
        panelDetalhesPlanoDeSaude.add(labelNumeroPlano);
        labelNumeroPlano.setBounds(30, 90, 110, 16);

        textFieldNumeroPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNumeroPlanoActionPerformed(evt);
            }
        });
        panelDetalhesPlanoDeSaude.add(textFieldNumeroPlano);
        textFieldNumeroPlano.setBounds(30, 110, 140, 22);

        labelOperadoraPlano.setText("Operadora do Plano:");
        panelDetalhesPlanoDeSaude.add(labelOperadoraPlano);
        labelOperadoraPlano.setBounds(30, 140, 140, 16);
        panelDetalhesPlanoDeSaude.add(textFieldOperadoraPlano);
        textFieldOperadoraPlano.setBounds(30, 160, 180, 22);
        panelDetalhesPlanoDeSaude.add(textFieldCategoriaPlano);
        textFieldCategoriaPlano.setBounds(30, 210, 130, 22);

        labelCategoriaPlano.setText("Categoria do Plano:");
        panelDetalhesPlanoDeSaude.add(labelCategoriaPlano);
        labelCategoriaPlano.setBounds(30, 190, 130, 16);

        labelValidadePlano.setText("Validade do Plano:");
        panelDetalhesPlanoDeSaude.add(labelValidadePlano);
        labelValidadePlano.setBounds(30, 240, 130, 16);

        buttonCancelarPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/cancelar.png"))); // NOI18N
        buttonCancelarPlanoDeSaude.setToolTipText("Cancelar");
        buttonCancelarPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarPlanoDeSaudeActionPerformed(evt);
            }
        });
        panelDetalhesPlanoDeSaude.add(buttonCancelarPlanoDeSaude);
        buttonCancelarPlanoDeSaude.setBounds(320, 280, 80, 50);

        buttonSalvarPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/salve-.png"))); // NOI18N
        buttonSalvarPlanoDeSaude.setToolTipText("Salvar");
        buttonSalvarPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarPlanoDeSaudeActionPerformed(evt);
            }
        });
        panelDetalhesPlanoDeSaude.add(buttonSalvarPlanoDeSaude);
        buttonSalvarPlanoDeSaude.setBounds(420, 280, 80, 50);

        textFieldValidadePlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldValidadePlanoActionPerformed(evt);
            }
        });
        panelDetalhesPlanoDeSaude.add(textFieldValidadePlano);
        textFieldValidadePlano.setBounds(30, 260, 150, 22);
        try{
            textFieldValidadePlano.setFormatterFactory(new javax.swing.text.
                DefaultFormatterFactory(new javax.swing.text.MaskFormatter
                    ("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(panelDetalhesPlanoDeSaude, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(panelDetalhesPlanoDeSaude, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 63, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(596, 497));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarPlanoDeSaudeActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarPlanoDeSaudeActionPerformed

    private void buttonSalvarPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarPlanoDeSaudeActionPerformed

        if (operacao == OperacaoEnum.ADICIONAR) {
            adicionar();
        } else {
            editar();
        }
        
    }//GEN-LAST:event_buttonSalvarPlanoDeSaudeActionPerformed

    private void textFieldNumeroPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNumeroPlanoActionPerformed

    }//GEN-LAST:event_textFieldNumeroPlanoActionPerformed

    private void textFieldCodigoPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoPlanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoPlanoActionPerformed

    private void textFieldValidadePlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldValidadePlanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldValidadePlanoActionPerformed
    private void editar() {
        planoDeSaude.setOperadora(textFieldOperadoraPlano.getText());
        planoDeSaude.setCategoria(textFieldCategoriaPlano.getText());
        planoDeSaude.setNumero(textFieldNumeroPlano.getText());
        planoDeSaude.setValidade(LocalDate.parse(textFieldValidadePlano.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        PlanoDeSaudeDAO.atualizar(planoDeSaude);

        JOptionPane.showMessageDialog(
                null,
                "Plano de Saúde atualizado com sucesso!",
                "Planos de Saúde",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }

    private void adicionar() {
        
        
        if (textFieldOperadoraPlano.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "A operadora do plano é obrigatória!", "Erro", JOptionPane.WARNING_MESSAGE);
            textFieldOperadoraPlano.requestFocus();
        } else if (textFieldCategoriaPlano.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "A categoria do plano é obrigatória!", "Erro", JOptionPane.WARNING_MESSAGE);
            textFieldCategoriaPlano.requestFocus();
        } else if (textFieldNumeroPlano.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O número do plano é obrigatório!", "Erro", JOptionPane.WARNING_MESSAGE);
            textFieldNumeroPlano.requestFocus();
        } else if (textFieldValidadePlano.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "A validade do plano é obrigatória!", "Erro", JOptionPane.WARNING_MESSAGE);
            textFieldValidadePlano.requestFocus();
        } else {
        
            // Criar um objeto Plano de Saude
            PlanoDeSaude novoPlanoDeSaude = new PlanoDeSaude();
            novoPlanoDeSaude.setOperadora(textFieldOperadoraPlano.getText());
            novoPlanoDeSaude.setCategoria(textFieldCategoriaPlano.getText());
            novoPlanoDeSaude.setNumero(textFieldNumeroPlano.getText());
            novoPlanoDeSaude.setValidade(LocalDate.parse(textFieldValidadePlano.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));

            // Gravar o objeto, através do Dao.
            PlanoDeSaudeDAO.gravar(novoPlanoDeSaude);

            JOptionPane.showMessageDialog(
                    this,
                    "Plano de Saúde gravado com sucesso!",
                    "Planos de Saúde",
                    JOptionPane.INFORMATION_MESSAGE);

            dispose();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelarPlanoDeSaude;
    private javax.swing.JButton buttonSalvarPlanoDeSaude;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCategoriaPlano;
    private javax.swing.JLabel labelCodigoPlano;
    private javax.swing.JLabel labelNumeroPlano;
    private javax.swing.JLabel labelOperadoraPlano;
    private javax.swing.JLabel labelPlanoDeSaudeAdicionar;
    private javax.swing.JLabel labelValidadePlano;
    private javax.swing.JPanel panelDetalhesPlanoDeSaude;
    private javax.swing.JTextField textFieldCategoriaPlano;
    private javax.swing.JTextField textFieldCodigoPlano;
    private javax.swing.JTextField textFieldNumeroPlano;
    private javax.swing.JTextField textFieldOperadoraPlano;
    private javax.swing.JFormattedTextField textFieldValidadePlano;
    // End of variables declaration//GEN-END:variables

    private boolean matchesOnlyText(JTextField textFieldOperadoraPlano) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
