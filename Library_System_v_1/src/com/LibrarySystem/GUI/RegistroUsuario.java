/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LibrarySystem.GUI;

import com.LibrarySystem.Database.UsuarioDB;
import com.LibrarySystem.Entities.Usuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author brayan
 */
public class RegistroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public RegistroUsuario() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBody = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblGestionarUsuarios = new javax.swing.JLabel();
        lblGestionarBibliotecas = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        lblPassword2 = new javax.swing.JLabel();
        lblComunidad = new javax.swing.JLabel();
        txtComunidad = new javax.swing.JTextField();
        lblComunidad1 = new javax.swing.JLabel();
        cbRol = new javax.swing.JComboBox<>();
        txtPassword = new javax.swing.JPasswordField();
        txtPassword2 = new javax.swing.JPasswordField();
        lblGestionarUsuarios1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlBody.setBackground(new java.awt.Color(44, 62, 80));

        pnlHeader.setBackground(new java.awt.Color(23, 165, 137));

        lblTitulo.setBackground(java.awt.Color.white);
        lblTitulo.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblTitulo.setForeground(java.awt.Color.white);
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/LibrarySystem/Icons/add-user-white.png"))); // NOI18N
        lblTitulo.setText("Registro Usuarios");

        lblCerrar.setBackground(java.awt.Color.white);
        lblCerrar.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblCerrar.setForeground(java.awt.Color.white);
        lblCerrar.setText("X");
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });

        lblMinimizar.setBackground(java.awt.Color.white);
        lblMinimizar.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblMinimizar.setForeground(java.awt.Color.white);
        lblMinimizar.setText("-");
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
        });

        lblGestionarUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        lblGestionarUsuarios.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblGestionarUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        lblGestionarUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGestionarUsuarios.setText("Gestionar Usuarios");
        lblGestionarUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGestionarUsuariosMouseClicked(evt);
            }
        });

        lblGestionarBibliotecas.setBackground(new java.awt.Color(255, 255, 255));
        lblGestionarBibliotecas.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblGestionarBibliotecas.setForeground(new java.awt.Color(255, 255, 255));
        lblGestionarBibliotecas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGestionarBibliotecas.setText("Gestionar Bibliotecas");
        lblGestionarBibliotecas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGestionarBibliotecasMouseClicked(evt);
            }
        });

        lblSalir.setBackground(new java.awt.Color(255, 255, 255));
        lblSalir.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblSalir.setForeground(new java.awt.Color(255, 255, 255));
        lblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalir.setText("Salir");
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHeaderLayout.createSequentialGroup()
                        .addComponent(lblGestionarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblGestionarBibliotecas, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSalir)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlHeaderLayout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 531, Short.MAX_VALUE)
                        .addComponent(lblMinimizar)
                        .addGap(18, 18, 18)
                        .addComponent(lblCerrar)
                        .addGap(22, 22, 22))))
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(lblCerrar)
                    .addComponent(lblMinimizar))
                .addGap(18, 18, 18)
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGestionarUsuarios)
                    .addComponent(lblGestionarBibliotecas)
                    .addComponent(lblSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnGuardar.setBackground(new java.awt.Color(34, 167, 240));
        btnGuardar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Ingresar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(236, 240, 241));
        lblNombre.setText("Nombre:");

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));

        lblUser.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblUser.setForeground(new java.awt.Color(236, 240, 241));
        lblUser.setText("Usuario:");

        txtUser.setBackground(new java.awt.Color(255, 255, 255));
        txtUser.setForeground(new java.awt.Color(0, 0, 0));
        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserFocusLost(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(236, 240, 241));
        lblPassword.setText("Contraseña:");

        lblPassword2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblPassword2.setForeground(new java.awt.Color(236, 240, 241));
        lblPassword2.setText("<html>Vuelve a escribir la Contraseña:</html>");

        lblComunidad.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblComunidad.setForeground(new java.awt.Color(236, 240, 241));
        lblComunidad.setText("Comunidad:");

        txtComunidad.setBackground(new java.awt.Color(255, 255, 255));
        txtComunidad.setForeground(new java.awt.Color(0, 0, 0));

        lblComunidad1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblComunidad1.setForeground(new java.awt.Color(236, 240, 241));
        lblComunidad1.setText("Rol:");

        cbRol.setBackground(new java.awt.Color(255, 255, 255));
        cbRol.setForeground(new java.awt.Color(0, 0, 0));
        cbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Administrador" }));

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setForeground(new java.awt.Color(0, 0, 0));

        txtPassword2.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword2.setForeground(new java.awt.Color(0, 0, 0));
        txtPassword2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassword2FocusLost(evt);
            }
        });

        lblGestionarUsuarios1.setBackground(new java.awt.Color(255, 255, 255));
        lblGestionarUsuarios1.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        lblGestionarUsuarios1.setForeground(new java.awt.Color(255, 255, 255));
        lblGestionarUsuarios1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGestionarUsuarios1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/LibrarySystem/Icons/back-white.png"))); // NOI18N
        lblGestionarUsuarios1.setText("Atras");
        lblGestionarUsuarios1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGestionarUsuarios1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlBodyLayout = new javax.swing.GroupLayout(pnlBody);
        pnlBody.setLayout(pnlBodyLayout);
        pnlBodyLayout.setHorizontalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlBodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBodyLayout.createSequentialGroup()
                            .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNombre)
                                .addComponent(lblUser)
                                .addComponent(lblPassword))
                            .addGap(44, 44, 44))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBodyLayout.createSequentialGroup()
                            .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblComunidad)
                                .addComponent(lblPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(pnlBodyLayout.createSequentialGroup()
                        .addComponent(lblComunidad1)
                        .addGap(116, 116, 116)))
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbRol, 0, 470, Short.MAX_VALUE)
                    .addComponent(txtNombre)
                    .addComponent(txtUser)
                    .addComponent(txtPassword)
                    .addComponent(txtPassword2)
                    .addComponent(txtComunidad))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGestionarUsuarios1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBodyLayout.setVerticalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBodyLayout.createSequentialGroup()
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblGestionarUsuarios1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPassword2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBodyLayout.createSequentialGroup()
                        .addComponent(txtPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComunidad)
                    .addComponent(txtComunidad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbRol, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblComunidad1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try{
            Usuario usuario = new Usuario
            (
                txtNombre.getText(),
                txtUser.getText(),
                txtPassword.getText(),
                txtComunidad.getText(),
                cbRol.getSelectedItem().toString()
            );
            UsuarioDB usuarioDB=new UsuarioDB();
            usuarioDB.insertarUsuario(usuario);
            
            JOptionPane.showMessageDialog(null, "Usuario registrado correctamente");
            
        }catch (SQLException ex) {
                Logger.getLogger(RegistroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
        if(!txtUser.getText().toString().equals("")){
            try {
                Usuario usuario = new UsuarioDB().obtenerUsuarioByUser(txtUser.getText().toString());
                if(usuario.getUser() != null){
                    JOptionPane.showMessageDialog(null, "Las Contraseñas no Coinciden", "ERROR", JOptionPane.ERROR_MESSAGE);
                    btnGuardar.setEnabled(false);
                }else{
                    btnGuardar.setEnabled(true);
                }
            } catch (SQLException ex) {
                Logger.getLogger(RegistroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txtUserFocusLost

    private void lblGestionarUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGestionarUsuariosMouseClicked

    }//GEN-LAST:event_lblGestionarUsuariosMouseClicked

    private void lblGestionarBibliotecasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGestionarBibliotecasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblGestionarBibliotecasMouseClicked

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if(resp == 0){
            Login login = new Login();
            login.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_lblSalirMouseClicked

    private void lblGestionarUsuarios1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGestionarUsuarios1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblGestionarUsuarios1MouseClicked

    private void txtPassword2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassword2FocusLost
        if(txtPassword.getText().equals(txtPassword2.getText())){
            btnGuardar.setEnabled(true);
        }else{
            JOptionPane.showMessageDialog(null, "Las Contraseñas no Coinciden", "ERROR", JOptionPane.ERROR_MESSAGE);
            btnGuardar.setEnabled(false);
        }
    }//GEN-LAST:event_txtPassword2FocusLost

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
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbRol;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblComunidad;
    private javax.swing.JLabel lblComunidad1;
    private javax.swing.JLabel lblGestionarBibliotecas;
    private javax.swing.JLabel lblGestionarUsuarios;
    private javax.swing.JLabel lblGestionarUsuarios1;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPassword2;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel pnlBody;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JTextField txtComunidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPassword2;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
