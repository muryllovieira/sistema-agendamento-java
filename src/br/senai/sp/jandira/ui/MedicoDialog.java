package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

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
        adicionandoNaList();

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
        adicionandoNaList();
    }
    
   
  
    
    private void preencherFormulario() {

        textFieldCodigoMedico.setText(medico.getCodigo().toString());
        textFieldCrmMedico.setText(medico.getCrm());
        textFieldNomeMedico.setText(medico.getNome());
        textFieldTelefoneMedico.setText(medico.getTelefone());
        textFieldEmailMedico.setText(medico.getEmail());
        textFieldDataNascimentoMedico.setText(medico.getDataDeNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    private void preencherTitulo() {
        labelMedicoAdicionar.setText("Médico - " + operacao);

        if (operacao == OperacaoEnum.EDITAR) {
            labelMedicoAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/editar.png")));
        } else {
            labelMedicoAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/adicionar.png")));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelMedicoAdicionar = new javax.swing.JLabel();
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
        listListaEspecialidades = new javax.swing.JList<>();
        labelEspecialidadesMedico = new javax.swing.JLabel();
        scrollEspecialidadeMedico = new javax.swing.JScrollPane();
        listListaEspecialidadeMedico = new javax.swing.JList<>();
        buttonEsquerdoMedico = new javax.swing.JButton();
        buttonDireitoMedico = new javax.swing.JButton();
        buttonCancelarMedico = new javax.swing.JButton();
        buttonSalvarMedico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        labelMedicoAdicionar.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        labelMedicoAdicionar.setText("Médico - ADICIONAR");
        jPanel1.add(labelMedicoAdicionar);
        labelMedicoAdicionar.setBounds(60, 12, 270, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 650, 60);

        panelDetalhesMedico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do(a) médico(a):", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(204, 153, 255))); // NOI18N

        labelCodigoMedico.setText("Código:");

        textFieldCodigoMedico.setEditable(false);
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

        listListaEspecialidades.setBackground(new java.awt.Color(255, 255, 204));
        scrollListaEspecialidadeMedico.setViewportView(listListaEspecialidades);

        labelEspecialidadesMedico.setText("Especialidades do médico:");

        listListaEspecialidadeMedico.setBackground(new java.awt.Color(255, 255, 204));
        scrollEspecialidadeMedico.setViewportView(listListaEspecialidadeMedico);

        buttonEsquerdoMedico.setBackground(new java.awt.Color(255, 0, 51));
        buttonEsquerdoMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/seta-esquerda.png"))); // NOI18N
        buttonEsquerdoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEsquerdoMedicoActionPerformed(evt);
            }
        });

        buttonDireitoMedico.setBackground(new java.awt.Color(102, 255, 102));
        buttonDireitoMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/seta-direita.png"))); // NOI18N
        buttonDireitoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDireitoMedicoActionPerformed(evt);
            }
        });

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
                                    .addComponent(buttonDireitoMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                                .addComponent(buttonDireitoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonEsquerdoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(panelDetalhesMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonCancelarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSalvarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        try{
            textFieldDataNascimentoMedico.setFormatterFactory(new javax.swing.text.
                DefaultFormatterFactory(new javax.swing.text.MaskFormatter
                    ("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

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

    private void buttonEsquerdoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEsquerdoMedicoActionPerformed
       
    }//GEN-LAST:event_buttonEsquerdoMedicoActionPerformed

    private void buttonDireitoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDireitoMedicoActionPerformed
        
    }//GEN-LAST:event_buttonDireitoMedicoActionPerformed

    private void editar() {
        medico.setCrm(textFieldCrmMedico.getText());
        medico.setNome(textFieldNomeMedico.getText());
        medico.setTelefone(textFieldTelefoneMedico.getText());
        medico.setEmail(textFieldEmailMedico.getText());
        medico.setDataDeNascimento(LocalDate.parse(textFieldDataNascimentoMedico.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        MedicoDAO.atualizar(medico);

        JOptionPane.showMessageDialog(
                null,
                "Médico atualizado com sucesso!",
                "Médico",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }

    private void adicionar() {
        
        
        if (textFieldCrmMedico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O CRM do médico é obrigatório!", "Erro", JOptionPane.WARNING_MESSAGE);
            textFieldCrmMedico.requestFocus();
        } else if (textFieldEmailMedico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O email do médico é obrigatório!", "Erro", JOptionPane.WARNING_MESSAGE);
            textFieldEmailMedico.requestFocus();
        } else if (textFieldNomeMedico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O nome do médico é obrigatório!", "Erro", JOptionPane.WARNING_MESSAGE);
            textFieldNomeMedico.requestFocus();
        } else if (textFieldDataNascimentoMedico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "A data de nascimento do médico é obrigatório!", "Erro", JOptionPane.WARNING_MESSAGE);
            textFieldDataNascimentoMedico.requestFocus();
        } else if (textFieldTelefoneMedico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O telefone do médico é obrigatório!", "Erro", JOptionPane.WARNING_MESSAGE);
            textFieldTelefoneMedico.requestFocus();
        } else {
        
            // Criar um objeto Medico
            Medico novoMedico = new Medico();
            novoMedico.setCrm(textFieldCrmMedico.getText());
            novoMedico.setNome(textFieldNomeMedico.getText());
            novoMedico.setTelefone(textFieldTelefoneMedico.getText());
            novoMedico.setEmail(textFieldEmailMedico.getText());
            novoMedico.setDataDeNascimento(LocalDate.parse(textFieldDataNascimentoMedico.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));

            // Gravar o objeto, através do Dao.
            MedicoDAO.gravar(novoMedico);

            JOptionPane.showMessageDialog(
                    this,
                    "Médico gravado com sucesso!",
                    "Médicos",
                    JOptionPane.INFORMATION_MESSAGE);

            dispose();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelarMedico;
    private javax.swing.JButton buttonDireitoMedico;
    private javax.swing.JButton buttonEsquerdoMedico;
    private javax.swing.JButton buttonSalvarMedico;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCodigoMedico;
    private javax.swing.JLabel labelCrmMedico;
    private javax.swing.JLabel labelDataNascimentoMedico;
    private javax.swing.JLabel labelEmailMedico;
    private javax.swing.JLabel labelEspecialidadesMedico;
    private javax.swing.JLabel labelListaEspecialidadeMedico;
    private javax.swing.JLabel labelMedicoAdicionar;
    private javax.swing.JLabel labelNomeMedico;
    private javax.swing.JLabel labelTelefoneMedico;
    private javax.swing.JList<String> listListaEspecialidadeMedico;
    private javax.swing.JList<String> listListaEspecialidades;
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

    private void adicionandoNaList(){
        listListaEspecialidades.setModel(EspecialidadeDAO.getListaEspecialidade());
    }
}
