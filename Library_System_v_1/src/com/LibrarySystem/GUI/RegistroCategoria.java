/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LibrarySystem.GUI;

import com.LibrarySystem.Entities.Biblioteca;
import com.LibrarySystem.Entities.Categoria;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class RegistroCategoria extends javax.swing.JFrame {

    /**
     * Creates new form RegistroCategoria
     */
    public RegistroCategoria() {
        initComponents();
        ArrayList<Biblioteca> listBibliotecas = new ArrayList<>();
        Biblioteca biblioteca = new Biblioteca();
        listBibliotecas = biblioteca.listarBibliotecas();
        combo_box_bibliotecas.removeAllItems();
        for (int i = 0; i < listBibliotecas.size(); i++) {
            combo_box_bibliotecas.addItem(listBibliotecas.get(i).getId_biblioteca() + "-" + listBibliotecas.get(i).getNombre());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_title = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        input_nombre = new javax.swing.JTextField();
        input_codigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_atras = new javax.swing.JButton();
        btn_registrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        combo_box_bibliotecas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        input_descripcion = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label_title.setBackground(new java.awt.Color(255, 255, 255));
        label_title.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_title.setText("Registrar Categoria");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        input_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_nombreActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Codigo de Ubicación:");

        btn_atras.setText("Atras");

        btn_registrar.setText("Registrar");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(248, 148, 6));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 718, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Biblioteca:");

        input_descripcion.setColumns(20);
        input_descripcion.setRows(5);
        jScrollPane1.setViewportView(input_descripcion);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Descripcion:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(280, 280, 280)
                            .addComponent(label_title))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(205, 205, 205)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addGap(26, 26, 26)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(input_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                        .addComponent(input_codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                        .addComponent(combo_box_bibliotecas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                                    .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_title)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_box_bibliotecas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registrar)
                    .addComponent(btn_atras))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void input_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_nombreActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_input_nombreActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        // TODO add your handling code here:
        boolean validador = false;
        
        if(input_nombre.getText().isEmpty() || input_codigo.getText().isEmpty()){
        
        JOptionPane.showMessageDialog(null, "Error, por favor complete los campos");
        }else{
            String text_combobox = (String) combo_box_bibliotecas.getSelectedItem();
        String var_split[] = text_combobox.split("-");
        int id_biblioteca = Integer.parseInt(var_split[0]);
            System.out.println("se realiza split -> "+ id_biblioteca);
        String nombre_categoria = input_nombre.getText();
        String codigo_registro = input_codigo.getText();
        String descripcion = input_descripcion.getText();
        System.out.println("fkdjf " + text_combobox);

        Categoria new_categoria = new Categoria(nombre_categoria, descripcion,
                codigo_registro, id_biblioteca);
        validador = new_categoria.registrarCategoria(new_categoria);
        if (validador == true){
            JOptionPane.showMessageDialog(null, "Transaccion exitosa!");
        }
        }
        
    }//GEN-LAST:event_btn_registrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistroCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JComboBox<String> combo_box_bibliotecas;
    private javax.swing.JTextField input_codigo;
    private javax.swing.JTextArea input_descripcion;
    private javax.swing.JTextField input_nombre;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_title;
    // End of variables declaration//GEN-END:variables
}