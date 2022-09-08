package com.ivogeraldo.contribuintes.views;

import com.ivogeraldo.contribuintes.domains.Pessoa;
import com.ivogeraldo.contribuintes.reports.FichaCadastralReport;
import com.ivogeraldo.contribuintes.repositories.PessoaRepository;
import com.ivogeraldo.contribuintes.services.PessoaService;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaConsulta extends javax.swing.JInternalFrame {

    private Pessoa pessoa = new Pessoa();
    boolean telaCadastro = false;

    public TelaConsulta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        filtroComboBox = new javax.swing.JComboBox<>();
        filtroField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grid = new javax.swing.JTable();
        exitButton = new javax.swing.JButton();
        openButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        filterButton = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Consulta Contribuintes");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setText("Filtra por:");

        filtroComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CNPJ/CPF", "NOME", "EMAIL" }));

        filtroField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filtroFieldKeyReleased(evt);
            }
        });

        jLabel2.setText("Digite aqui:");

        grid.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "CNPJ/CPF", "Nome", "Natureja Juridica", "Rg/Inscrição Estadual", "Data Cadastro", "Email"
            }
        ));
        jScrollPane1.setViewportView(grid);

        exitButton.setText("Sair");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        openButton.setText("Abrir");
        openButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButtonActionPerformed(evt);
            }
        });

        printButton.setText("Imprimir Registro");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        filterButton.setText("Pesquisar");
        filterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(filtroComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(filtroField, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(filterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(openButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(printButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filtroComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filtroField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filterButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(openButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        setBounds(30, 10, 942, 459);
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void openButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButtonActionPerformed
        int row = grid.getSelectedRow();

        if (telaCadastro == false) {
            TelaCadastro telaCadastro = new TelaCadastro();
            TelaPrincipal.painel.add(telaCadastro);
            telaCadastro.setVisible(true);
            pessoa.setId(Integer.parseInt(grid.getValueAt(row, 0).toString().trim()));
            TelaCadastro.setIdField(pessoa.getId());
            dispose();
        } else {
            pessoa.setId(Integer.parseInt(grid.getValueAt(row, 0).toString().trim()));
            TelaCadastro.setIdField(pessoa.getId());
            dispose();
        }


    }//GEN-LAST:event_openButtonActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed

        int row = grid.getSelectedRow();
        String arg = grid.getValueAt(row, 0).toString().trim();

        FichaCadastralReport fichaReport = new FichaCadastralReport();

        try {
            fichaReport.report(arg);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "falhou");
        }


    }//GEN-LAST:event_printButtonActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        DefaultTableModel defaultTableModel = (DefaultTableModel) grid.getModel();
        int i = defaultTableModel.getRowCount();

        if (i > 0) {
            while (i > 0) {
                ((DefaultTableModel) grid.getModel()).removeRow(i - 1);
                i--;
            }
        }

        try {
            PessoaRepository pessoaRepository = new PessoaService();
            List<Pessoa> pessoaList = pessoaRepository.getAllPessoa();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            DefaultTableModel df = (DefaultTableModel) grid.getModel();

            for (Pessoa pessoa : pessoaList) {
                String column0 = String.valueOf(pessoa.getId());
                String column1 = pessoa.getCnpjCpf().trim();
                String column2 = pessoa.getNome().trim();
                String column3 = pessoa.getNaturezaJuridica().getNome().trim();
                String column4 = pessoa.getRg().trim();
                String column5 = sdf.format(pessoa.getDataCadastro());
                String column6 = pessoa.getEmail().trim();
                df.addRow(new String[]{column0, column1, column2, column3, column4, column5, column6});
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao buscar dados!");
        }
        columnsSize();
        grid.setAutoCreateRowSorter(true);

    }//GEN-LAST:event_formInternalFrameOpened

    private void filtroFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroFieldKeyReleased
    }//GEN-LAST:event_filtroFieldKeyReleased

    private void filterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterButtonActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) grid.getModel();
        int i = dtm.getRowCount();

        if (i > 0) {
            while (i > 0) {
                ((DefaultTableModel) grid.getModel()).removeRow(i - 1);
                i--;
            }
        }
        String type = "";
        String selection = filtroComboBox.getSelectedItem().toString().trim();

        if (selection.equals("CNPJ/CPF")) {
            type = "cnpjCpf";
        } else if (selection.equals("NOME")) {
            type = "nome";
        } else if (selection.equals("EMAIL")) {
            type = "email";
        }
        String arg = filtroField.getText().trim();

        try {
            PessoaRepository pessoaRepository = new PessoaService();
            List<Pessoa> pessoaList = pessoaRepository.getFilterAllPessoa(type, arg);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            DefaultTableModel df = (DefaultTableModel) grid.getModel();

            for (Pessoa pessoa : pessoaList) {
                String column0 = String.valueOf(pessoa.getId());
                String column1 = pessoa.getCnpjCpf().trim();
                String column2 = pessoa.getNome().trim();
                String column3 = pessoa.getNaturezaJuridica().getNome().trim();
                String column4 = pessoa.getRg().trim();
                String column5 = sdf.format(pessoa.getDataCadastro());
                String column6 = pessoa.getEmail().trim();
                df.addRow(new String[]{column0, column1, column2, column3, column4, column5, column6});
            }

        } catch (Exception e) {
            e.printStackTrace();
//            JOptionPane.showMessageDialog(this, "Erro ao buscar dados!");
        }
        columnsSize();
        grid.setAutoCreateRowSorter(true);
    }//GEN-LAST:event_filterButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JButton filterButton;
    private javax.swing.JComboBox<String> filtroComboBox;
    private javax.swing.JTextField filtroField;
    private javax.swing.JTable grid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton openButton;
    private javax.swing.JButton printButton;
    // End of variables declaration//GEN-END:variables

    private void columnsSize() {
        grid.getColumnModel().getColumn(0).setMinWidth(80);
        grid.getColumnModel().getColumn(1).setMinWidth(80);
        grid.getColumnModel().getColumn(2).setMinWidth(200);
        grid.getColumnModel().getColumn(3).setMinWidth(200);
        grid.getColumnModel().getColumn(4).setMinWidth(60);

    }

    public void telaCadastro(boolean arg) {
        telaCadastro = true;
    }

}
