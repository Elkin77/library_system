/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LibrarySystem.GUI;

import com.LIbrarySystem.Componentes.Render;
import com.LibrarySystem.Database.CategoriaDB;
import com.LibrarySystem.Database.TemaDB;
import com.LibrarySystem.Database.UsuarioDB;
import com.LibrarySystem.Entities.Categoria;
import com.LibrarySystem.Entities.Tema;
import com.LibrarySystem.Entities.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;

/**
 *
 * @author brayan
 */
public class GestionTemas extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public GestionTemas() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        cargarDatos();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTemas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlBody.setBackground(new java.awt.Color(44, 62, 80));

        pnlHeader.setBackground(new java.awt.Color(248, 148, 6));

        lblTitulo.setBackground(java.awt.Color.white);
        lblTitulo.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblTitulo.setForeground(java.awt.Color.white);
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/LibrarySystem/Icons/book-white.png"))); // NOI18N
        lblTitulo.setText("Gestión Temas");

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

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMinimizar)
                .addGap(18, 18, 18)
                .addComponent(lblCerrar)
                .addGap(22, 22, 22))
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(lblCerrar)
                    .addComponent(lblMinimizar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        tblTemas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Descripción", "Código Registro", "Categoria", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTemas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTemasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTemas);

        javax.swing.GroupLayout pnlBodyLayout = new javax.swing.GroupLayout(pnlBody);
        pnlBody.setLayout(pnlBodyLayout);
        pnlBodyLayout.setHorizontalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBodyLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                .addGap(150, 150, 150))
        );
        pnlBodyLayout.setVerticalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBodyLayout.createSequentialGroup()
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addGap(303, 303, 303))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void tblTemasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTemasMouseClicked
        int column = tblTemas.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/tblTemas.getRowHeight();
        
        if(row < tblTemas.getRowCount() && row >= 0 &&
                column < tblTemas.getColumnCount() && column >= 0){
            Object value = tblTemas.getValueAt(row, column);
            if(value instanceof JButton){
                ((JButton)value).doClick();
                JButton boton = (JButton) value;
                
                if(boton.getName().equals("guardar")){
                    try {
                        //Aca va la logica al dar click en guardar
                        ArrayList<Categoria> lstCategorias = new CategoriaDB().obtenerAllCategorias();
                        int id = (int) tblTemas.getValueAt(row, 0);
                        String nombre = (String) tblTemas.getValueAt(row, 1);
                        String descripcion = (String) tblTemas.getValueAt(row, 2);
                        String codigoRegistro = (String) tblTemas.getValueAt(row, 3);
                        
                        Tema tema = new Tema(
                                id,
                                nombre,
                                descripcion,
                                codigoRegistro,
                                lstCategorias.get(row).getId_categoria()
                        );
                        
                        TemaDB temaDB=new TemaDB();
                        
                        temaDB.actualizarTema(tema);
                        
                        JOptionPane.showMessageDialog(null, "Tema actualizado correctamente");
                        
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(GestionTemas.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    
                    
                }else{
                    //Aca va la logica al dar click en eliminar
                    int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if(resp == 0){
                        try {
                            int id = (int) tblTemas.getValueAt(row, 0);
                            
                            TemaDB temaDB=new TemaDB();
                            
                            temaDB.eliminarTema(id);
                            
                            JOptionPane.showMessageDialog(null, "Tema eliminado correctamente");
                            
                            cargarDatos();
                        } catch (SQLException ex) {
                            Logger.getLogger(GestionTemas.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                    }
                }
            }
        }
        
    }//GEN-LAST:event_tblTemasMouseClicked

    private void cargarDatos(){
        try {
            tblTemas.setDefaultRenderer(Object.class, new Render());
            DefaultTableModel modelo = new DefaultTableModel()
            {
                public boolean isCellEditable(int row, int column){
                    return (column == 1 || column >= 5)? false: true;
                }
            };
            ArrayList<Tema> lstTemas = new TemaDB().obtenerAllTemas();
            modelo.setColumnIdentifiers(new Object[]{"Nombre","Descripción","Código Registro","Categoria","",""});
            JComboBox cbCategoria = new JComboBox();
            ArrayList<Categoria> lstCategorias = new CategoriaDB().obtenerAllCategorias();
            if(lstCategorias.size() > 0 ){
                cbCategoria.removeAllItems();
            }    
            
            for (int i = 0; i < lstCategorias.size(); i++) {
                cbCategoria.addItem(lstCategorias.get(i).getId_categoria() + " " + lstCategorias.get(i).getNombre());
            }
            JButton btnEditar = new JButton("Guardar");
            btnEditar.setName("guardar");
            JButton btnEliminar = new JButton("Eliminar");
            btnEliminar.setName("eliminar");
            for (int i = 0; i < lstTemas.size(); i++) {
                //cbRol.setSelectedIndex((lstUsuarios.get(i).getRol().equals("Usuario"))?0:1);
                
                Object[] tema = {
                    lstTemas.get(i).getNombre(),
                    lstTemas.get(i).getDescripcion(),
                    lstTemas.get(i).getCodigoRegistro(),
                    lstTemas.get(i).getCategoria(),
                    btnEditar,
                    btnEliminar
                };
                modelo.addRow(tema);
            }
            tblTemas.setModel(modelo);
            TableColumn tc = tblTemas.getColumnModel().getColumn(3);
            TableCellEditor tce= new DefaultCellEditor(cbCategoria);
            tc.setCellEditor(tce);

            
        } catch (SQLException ex) {
            Logger.getLogger(GestionTemas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
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
            java.util.logging.Logger.getLogger(GestionTemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionTemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionTemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionTemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionTemas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBody;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JTable tblTemas;
    // End of variables declaration//GEN-END:variables
}
