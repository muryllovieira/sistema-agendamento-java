package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import java.time.format.DateTimeFormatter;

public class MedicoDialog extends javax.swing.JDialog {

    private Medico medico;
    private OperacaoEnum operacao;

    public MedicoDialog(
            java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {

        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
    }

    public MedicoDialog(
            java.awt.Frame parent,
            boolean modal,
            Medico m,
            OperacaoEnum operacao) {

        super(parent, modal);
        initComponents();

        medico = m;
        this.operacao = operacao;

        preencherFormulario();
        preencherTitulo();
    }
    
    private void preencherFormulario() {

        textFieldCodigoMedico.setText(medico.getCodigo().toString());
        textFieldCrmMedico.setText(medico.getCrm());
        textFieldNomeMedico.setText(medico.getNome());
        textFieldEmailMedico.setText(medico.getEmail());
        textFieldTelefoneMedico.setText(medico.getTelefone());
        textFieldDataNascimentoMedico.setText(medico.get().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
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
        jLabel1 = new javax.swing.JLabel();
        panelDetalhesMedico = new javax.swing.JPanel();
        labelCodigoMedico = new javax.swing.JLabel();
        textFieldCodigoMedico = new javax.swing.JTextField();
        labelCrmMedico = new javax.swing.JLabel();
        textFieldCrmMedico = new javax.swing.JTextField();
        labelNomeMedico = new javax.swing.JLabel();
        textFieldEmailMedico = new javax.swing.JTextField();
        labelTelefoneMedico = new javax.swing.JLabel();
        textFieldTelefoneMedico = new javax.swing.JTextField();
        labelEmailMedico = new javax.swing.JLabel();
        textFieldNomeMedico = new javax.swing.JTextField();
        labelDataNascimentoMedico = new javax.swing.JLabel();
        textFieldDataNascimentoMedico = new javax.swing.JFormattedTextField();
        labelListaEspecialidadeMedico = new javax.swing.JLabel();
        scrollListaEspecialidadeMedico = new javax.swing.JScrollPane();
        listListaEspecialidadeMedico = new javax.swing.JList<>();
        labelEspecialidadesMedico = new javax.swing.JLabel();
        scrollEspecialidadeMedico = new javax.swing.JScrollPane();
        listEspecialidadeMedico = new javax.swing.JList<>();
        buttonEsquerdoMedico = new javax.swing.JButton();
        buttonDIreitoMedico = new javax.swing.JButton();
        buttonCancelarMedico = new javax.swing.JButton();
        buttonSalvarMedico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel1.setText("Médico - ADICIONAR");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 20, 190, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 650, 60);

        panelDetalhesMedico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do(a) médico(a):", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(204, 153, 255))); // NOI18N

        labelCodigoMedico.setText("Código:");

        textFieldCodigoMedico.setBackground(new java.awt.Color(255, 255, 204));

        labelCrmMedico.setText("CRM:");

        textFieldCrmMedico.setBackground(new java.awt.Color(255, 255, 204));

        labelNomeMedico.setText("Nome do(a) médico(a):");

        textFieldEmailMedico.setBackground(new java.awt.Color(255, 255, 204));

        labelTelefoneMedico.setText("Telefone:");

        textFieldTelefoneMedico.setBackground(new java.awt.Color(255, 255, 204));

        labelEmailMedico.setText("E-mail:");

        textFieldNomeMedico.setBackground(new java.awt.Color(255, 255, 204));

        labelDataNascimentoMedico.setText("Data Nascimento:");

        textFieldDataNascimentoMedico.setBackground(new java.awt.Color(255, 255, 204));

        labelListaEspecialidadeMedico.setText("Lista de Especialidades:");

        listListaEspecialidadeMedico.setBackground(new java.awt.Color(255, 255, 204));
        scrollListaEspecialidadeMedico.setViewportView(listListaEspecialidadeMedico);

        labelEspecialidadesMedico.setText("Especialidades do médico:");

        listEspecialidadeMedico.setBackground(new java.awt.Color(255, 255, 204));
        scrollEspecialidadeMedico.setViewportView(listEspecialidadeMedico);

        buttonEsquerdoMedico.setBackground(new java.awt.Color(255, 0, 51));
        buttonEsquerdoMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/seta-esquerda.png"))); // NOI18N

        buttonDIreitoMedico.setBackground(new java.awt.Color(102, 255, 102));
        buttonDIreitoMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/seta-direita.png"))); // NOI18N

        buttonCancelarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/cancelar.png"))); // NOI18N
        buttonCancelarMedico.setToolTipText("Cancelar");
        buttonCancelarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarMedicoActionPerformed(evt);
            }
        });

        buttonSalvarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/salve-.png"))); // NOI18N
        buttonSalvarMedico.setToolTipText("Salvar");
        buttonSalvarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarMedicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDetalhesMedicoLayout = new javax.swing.GroupLayout(panelDetalhesMedico);
        panelDetalhesMedico.setLayout(panelDetalhesMedicoLayout);
        panelDetalhesMedicoLayout.setHorizontalGroup(
            panelDetalhesMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetalhesMedicoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelDetalhesMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDetalhesMedicoLayout.createSequentialGroup()
                        .addGroup(panelDetalhesMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelTelefoneMedico)
                            .addComponent(scrollListaEspecialidadeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(labelListaEspecialidadeMedico)
                            .addComponent(textFieldTelefoneMedico, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                        .addGap(21, 21, 21)
                        .addGroup(panelDetalhesMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDetalhesMedicoLayout.createSequentialGroup()
                                .addGroup(panelDetalhesMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldEmailMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelEmailMedico))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelDetalhesMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDataNascimentoMedico)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetalhesMedicoLayout.createSequentialGroup()
                                        .addComponent(textFieldDataNascimentoMedico)
                                        .addGap(19, 19, 19))))
                            .addGroup(panelDetalhesMedicoLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(panelDetalhesMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(buttonEsquerdoMedico, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                                    .addComponent(buttonDIreitoMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(33, 33, 33)
                                .addGroup(panelDetalhesMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelEspecialidadesMedico)
                                    .addComponent(scrollEspecialidadeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(130, 130, 130))))
                    .addGroup(panelDetalhesMedicoLayout.createSequentialGroup()
                        .addGroup(panelDetalhesMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCodigoMedico)
                            .addComponent(textFieldCodigoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelDetalhesMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldCrmMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCrmMedico))
                        .addGap(18, 18, 18)
                        .addGroup(panelDetalhesMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNomeMedico)
                            .addComponent(textFieldNomeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetalhesMedicoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonCancelarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonSalvarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelDetalhesMedicoLayout.setVerticalGroup(
            panelDetalhesMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetalhesMedicoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelDetalhesMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigoMedico)
                    .addComponent(labelCrmMedico)
                    .addComponent(labelNomeMedico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDetalhesMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldCodigoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldCrmMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldNomeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDetalhesMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefoneMedico)
                    .addComponent(labelEmailMedico)
                    .addComponent(labelDataNascimentoMedico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDetalhesMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldTelefoneMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldEmailMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldDataNascimentoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDetalhesMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDetalhesMedicoLayout.createSequentialGroup()
                        .addGroup(panelDetalhesMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelListaEspecialidadeMedico)
                            .addComponent(labelEspecialidadesMedico))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollListaEspecialidadeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDetalhesMedicoLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(panelDetalhesMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scrollEspecialidadeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelDetalhesMedicoLayout.createSequentialGroup()
                                .addComponent(buttonDIreitoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonEsquerdoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(panelDetalhesMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonCancelarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSalvarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(panelDetalhesMedico);
        panelDetalhesMedico.setBounds(20, 80, 610, 420);

        setSize(new java.awt.Dimension(665, 533));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarMedicoActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarMedicoActionPerformed

    private void buttonSalvarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarMedicoActionPerformed

        if (operacao == OperacaoEnum.ADICIONAR) {
            adicionar();
        } else {
            editar();
        }

    }//GEN-LAST:event_buttonSalvarMedicoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelarMedico;
    private javax.swing.JButton buttonDIreitoMedico;
    private javax.swing.JButton buttonEsquerdoMedico;
    private javax.swing.JButton buttonSalvarMedico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCodigoMedico;
    private javax.swing.JLabel labelCrmMedico;
    private javax.swing.JLabel labelDataNascimentoMedico;
    private javax.swing.JLabel labelEmailMedico;
    private javax.swing.JLabel labelEspecialidadesMedico;
    private javax.swing.JLabel labelListaEspecialidadeMedico;
    private javax.swing.JLabel labelNomeMedico;
    private javax.swing.JLabel labelTelefoneMedico;
    private javax.swing.JList<String> listEspecialidadeMedico;
    private javax.swing.JList<String> listListaEspecialidadeMedico;
    private javax.swing.JPanel panelDetalhesMedico;
    private javax.swing.JScrollPane scrollEspecialidadeMedico;
    private javax.swing.JScrollPane scrollListaEspecialidadeMedico;
    private javax.swing.JTextField textFieldCodigoMedico;
    private javax.swing.JTextField textFieldCrmMedico;
    private javax.swing.JFormattedTextField textFieldDataNascimentoMedico;
    private javax.swing.JTextField textFieldEmailMedico;
    private javax.swing.JTextField textFieldNomeMedico;
    private javax.swing.JTextField textFieldTelefoneMedico;
    // End of variables declaration//GEN-END:variables
}
