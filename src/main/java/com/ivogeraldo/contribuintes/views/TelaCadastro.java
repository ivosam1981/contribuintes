package com.ivogeraldo.contribuintes.views;

import com.ivogeraldo.contribuintes.domains.NaturezaJuridica;
import com.ivogeraldo.contribuintes.domains.Pessoa;
import com.ivogeraldo.contribuintes.repositories.NaturezaJuridicaRepository;
import com.ivogeraldo.contribuintes.repositories.PessoaRepository;
import com.ivogeraldo.contribuintes.services.NaturezaJuridicaService;
import com.ivogeraldo.contribuintes.services.PessoaService;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TelaCadastro extends javax.swing.JInternalFrame {

    private PessoaRepository pessoaRepository = new PessoaService();
    private NaturezaJuridicaRepository naturezaJuridicaRepository = new NaturezaJuridicaService();
    private Pessoa pessoa = new Pessoa();

    Date dataSugerida = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private int action;
    private int pessoaId;
    boolean telaCadastroOpen = false;

    public TelaCadastro() {
        initComponents();
        habilitaCampo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cnpjCpfField = new javax.swing.JTextField();
        nomeField = new javax.swing.JTextField();
        dataCadastroField = new javax.swing.JFormattedTextField();
        emailField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        naturezaJuridicaComboBox = new javax.swing.JComboBox<>();
        newButton = new javax.swing.JToggleButton();
        editButton = new javax.swing.JToggleButton();
        cancelButton = new javax.swing.JButton();
        consultButton = new javax.swing.JButton();
        rgField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Contribuintes");

        jLabel2.setText("Natureza Juridica");

        jLabel3.setText("CNPJ/CPF");

        jLabel4.setText("Nome");

        jLabel5.setText("Data de Cadastro");

        jLabel6.setText("Email");

        cnpjCpfField.setEnabled(false);
        cnpjCpfField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnpjCpfFieldActionPerformed(evt);
            }
        });

        nomeField.setEnabled(false);
        nomeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeFieldActionPerformed(evt);
            }
        });

        try {
            dataCadastroField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataCadastroField.setEnabled(false);
        emailField.setEnabled(false);
        saveButton.setText("Salvar");
        saveButton.setEnabled(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Sair");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        naturezaJuridicaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(getNaturezaComboBox().split(",")));
        naturezaJuridicaComboBox.setEnabled(false);

        newButton.setText("Novo");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        editButton.setText("Editar");
        editButton.setEnabled(false);
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        consultButton.setText("...");
        consultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultButtonActionPerformed(evt);
            }
        });

        rgField.setEnabled(false);

        jLabel7.setText("RG / INSCRIÇÃO ESTADUAL");

        jLabel8.setText("Código");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(naturezaJuridicaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(cnpjCpfField, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rgField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(dataCadastroField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(364, 364, 364))
                            .addComponent(nomeField, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE))
                        .addGap(3, 3, 3)))
                .addComponent(consultButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(newButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton)))
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(naturezaJuridicaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cnpjCpfField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rgField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultButton)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataCadastroField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newButton)
                    .addComponent(editButton)
                    .addComponent(saveButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton)
                    .addComponent(cancelButton))
                .addGap(71, 71, 71))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cnpjCpfFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnpjCpfFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnpjCpfFieldActionPerformed

    private void nomeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFieldActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        saveEditAction();

    }//GEN-LAST:event_saveButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        cancelAction();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        action = 1;
        newAction();
        dataCadastroField.setText(sdf.format(dataSugerida));

    }//GEN-LAST:event_newButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        action = 2;
        editAction();
        pessoa = pessoaRepository.getPessoaById(Integer.parseInt(idField.getText()));

    }//GEN-LAST:event_editButtonActionPerformed

    private void consultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultButtonActionPerformed
        pessoa = new Pessoa();

        if (idField.getText().trim().equals("")) {
            telaCadastroOpen = true;
            TelaConsulta consultaContribuintes = new TelaConsulta();
            TelaPrincipal.painel.add(consultaContribuintes);
            consultaContribuintes.setVisible(true);
            consultaContribuintes.telaCadastro(telaCadastroOpen);
            TelaPrincipal.painel.setComponentZOrder(consultaContribuintes, 0);

        } else {
            pessoa.setId(Integer.parseInt(idField.getText().trim()));
            try {
                pessoa = pessoaRepository.getPessoaById(pessoa.getId());
                if (pessoa != null) {
                    cnpjCpfField.setText(pessoa.getCnpjCpf());
                    rgField.setText(pessoa.getRg());
                    idField.setText(String.valueOf(pessoa.getId()));
                    nomeField.setText(pessoa.getNome());
                    emailField.setText(pessoa.getEmail());
                    pessoaId = pessoa.getId();
                    dataCadastroField.setText(sdf.format(pessoa.getDataCadastro()));
                    naturezaJuridicaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{pessoa.getNaturezaJuridica().getNome()}));
                    editButton.setEnabled(true);
                    newButton.setEnabled(false);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro ao Buscar Dados");
            }
        }
    }//GEN-LAST:event_consultButtonActionPerformed

    private String getNaturezaComboBox() {
        List<NaturezaJuridica> naturezaList = naturezaJuridicaRepository.getAllNaturezaJuridica();
        List<String> nomes = new ArrayList<>();
        for (NaturezaJuridica nat : naturezaList) {
            nomes.add(nat.getNome());
        }
        return nomes.toString().replace("[", "").replace("]", "");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField cnpjCpfField;
    private javax.swing.JButton consultButton;
    private javax.swing.JFormattedTextField dataCadastroField;
    private javax.swing.JToggleButton editButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JButton exitButton;
    private static javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> naturezaJuridicaComboBox;
    private javax.swing.JToggleButton newButton;
    private javax.swing.JTextField nomeField;
    private javax.swing.JTextField rgField;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables

    private void newAction() {
        cnpjCpfField.setEnabled(true);
        rgField.setEnabled(true);
        idField.setEnabled(false);
        dataCadastroField.setEnabled(true);
        emailField.setEnabled(true);
        naturezaJuridicaComboBox.setEnabled(true);
        nomeField.setEnabled(true);
        saveButton.setEnabled(true);
        editButton.setEnabled(false);
        consultButton.setEnabled(false);
        cancelButton.setEnabled(true);
        cnpjCpfField.setText("");
        rgField.setText("");
        emailField.setText("");
        nomeField.setText("");
        idField.setText("");

    }

    private void cancelAction() {
        cnpjCpfField.setEnabled(false);
        rgField.setEnabled(false);
        idField.setEnabled(true);
        idField.setFocusable(true);
        dataCadastroField.setEnabled(false);
        editButton.setEnabled(false);
        emailField.setEnabled(false);
        naturezaJuridicaComboBox.setEnabled(false);
        nomeField.setEnabled(false);
        cancelButton.setEnabled(false);
        saveButton.setEnabled(false);
        consultButton.setEnabled(true);
        cnpjCpfField.setText("");
        rgField.setText("");
        emailField.setText("");
        nomeField.setText("");
        idField.setText("");
        dataCadastroField.setText("");
    }

    private void editAction() {
        cnpjCpfField.setEnabled(true);
        rgField.setEnabled(true);
        idField.setEnabled(false);
        dataCadastroField.setEnabled(true);
        emailField.setEnabled(true);
        naturezaJuridicaComboBox.setEnabled(true);
        nomeField.setEnabled(true);
        saveButton.setEnabled(true);
        cancelButton.setEnabled(true);
        consultButton.setEnabled(false);
        exitButton.setEnabled(true);

    }

    private String saveEditAction() {

        String cnpjCpf = cnpjCpfField.getText().trim();
        String rg = rgField.getText().trim();
        String nome = nomeField.getText().trim();
        String dataCadastro = dataCadastroField.getText();
        String email = emailField.getText().trim();

        if (cnpjCpf.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo CNPJ/CPF deve ser preenchido");
            return null;
        } else if (nome.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo NOME deve ser preenchido");
            return null;
        } 

        List<NaturezaJuridica> naturezaList = naturezaJuridicaRepository.getAllNaturezaJuridica();
        NaturezaJuridica naturezaJuridica = new NaturezaJuridica();
        for (NaturezaJuridica natureza : naturezaList) {
            if (natureza.getNome().equals(naturezaJuridicaComboBox.getSelectedItem().toString().trim())) {
                naturezaJuridica = natureza;
                break;
            }
        }

        try {
            Date dtCadastro = null;
            try {
                dtCadastro = sdf.parse(dataCadastro);
            } catch (ParseException ex) {
                String msg = "Data de Cadastro invalida";
                JOptionPane.showMessageDialog(this, "Operação não Concluída" + msg);
                ex.printStackTrace();
            }

            if (action == 1) {
                if(pessoaRepository.getPessoaByCnpjCpf(cnpjCpf) != null){
                   JOptionPane.showMessageDialog(null, "Já existe um cadastro com este CNPJ/CPF");
                   return null;
                }
                pessoa = new Pessoa(null, cnpjCpf, rg, nome, dtCadastro, email, naturezaJuridica);
                pessoaRepository.savePessoa(pessoa);
                pessoa = pessoaRepository.getPessoaByCnpjCpf(cnpjCpf);
                idField.setText(String.valueOf(pessoa.getId()));
                JOptionPane.showMessageDialog(null, "Cadastro Efetuado com Sucesso");

            } else if (action == 2) {
                Integer id = Integer.parseInt(idField.getText().trim());
                pessoa = new Pessoa(id, cnpjCpf, rg, nome, dtCadastro, email, naturezaJuridica);
                pessoaRepository.updatePessoa(pessoa);
                JOptionPane.showMessageDialog(null, "Cadastro Alterado com Sucesso");
            }

            cnpjCpfField.setEnabled(false);
            rgField.setEnabled(false);
            dataCadastroField.setEnabled(false);
            emailField.setEnabled(false);
            naturezaJuridicaComboBox.setEnabled(false);
            nomeField.setEnabled(false);
            saveButton.setEnabled(false);
            cancelButton.setEnabled(false);
            exitButton.setEnabled(true);
            editButton.setEnabled(true);
            newButton.setEnabled(true);
            cancelButton.setEnabled(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Operação não Concluída! Verifique se todos os campos estão preenchidos corretamente.");
            e.printStackTrace();
        }
        
        return "Success!";
    }

    public static void setIdField(Integer id) {
        idField.setText(String.valueOf(id));
        idField.requestFocus();
    }

    private void habilitaCampo() {
        idField.setEnabled(true);
        idField.setFocusable(true);
        consultButton.setEnabled(true);
    }

}
