/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LibrarySystem.GUI;

import com.LibrarySystem.Entities.Biblioteca;
import com.LibrarySystem.Entities.Categoria;
import com.LibrarySystem.Entities.Libro;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Acer
 */
public class RegistroLibro extends javax.swing.JFrame {

    /**
     * Creates new form RegistroLibro
     */
    private String nombreArchivo;
    private String ruta;
    private String nuevaRuta = null;
    private File archivo;
    String usuario;

    public RegistroLibro() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        ArrayList<Biblioteca> listBibliotecas = new ArrayList<>();
        Biblioteca biblioteca = new Biblioteca();
        listBibliotecas = biblioteca.listarBibliotecas();
        combo_box_biblioteca.removeAllItems();
        for (int i = 0; i < listBibliotecas.size(); i++) {
            combo_box_biblioteca.addItem(listBibliotecas.get(i).getId_biblioteca() + "-" + listBibliotecas.get(i).getNombre());
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

        jPanel1 = new javax.swing.JPanel();
        btn_atras1 = new javax.swing.JButton();
        pnlHeader1 = new javax.swing.JPanel();
        lblTitulo1 = new javax.swing.JLabel();
        lblCerrar1 = new javax.swing.JLabel();
        lblMinimizar1 = new javax.swing.JLabel();
        lblGestionarUsuarios1 = new javax.swing.JLabel();
        lblGestionarBibliotecas1 = new javax.swing.JLabel();
        lblSalir1 = new javax.swing.JLabel();
        btn_registrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        input_titulo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        input_autor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        combo_box_biblioteca = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        combo_box_categoria = new javax.swing.JComboBox<>();
        input_ubicacion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblFoto = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        input_descripcion = new javax.swing.JTextArea();
        label_url_imagen = new javax.swing.JLabel();
        label_imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(239, 248, 248));
        jPanel1.setForeground(new java.awt.Color(23, 135, 137));

        btn_atras1.setText("Atras");
        btn_atras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atras1ActionPerformed(evt);
            }
        });

        pnlHeader1.setBackground(new java.awt.Color(23, 135, 137));
        pnlHeader1.setForeground(new java.awt.Color(239, 248, 248));

        lblTitulo1.setBackground(java.awt.Color.white);
        lblTitulo1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblTitulo1.setForeground(java.awt.Color.white);
        lblTitulo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/LibrarySystem/Icons/users-white.png"))); // NOI18N
        lblTitulo1.setText("Registrar Libro");

        lblCerrar1.setBackground(java.awt.Color.white);
        lblCerrar1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblCerrar1.setForeground(java.awt.Color.white);
        lblCerrar1.setText("X");
        lblCerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrar1MouseClicked(evt);
            }
        });

        lblMinimizar1.setBackground(java.awt.Color.white);
        lblMinimizar1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblMinimizar1.setForeground(java.awt.Color.white);
        lblMinimizar1.setText("-");
        lblMinimizar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizar1MouseClicked(evt);
            }
        });

        lblGestionarUsuarios1.setBackground(new java.awt.Color(255, 255, 255));
        lblGestionarUsuarios1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblGestionarUsuarios1.setForeground(new java.awt.Color(255, 255, 255));
        lblGestionarUsuarios1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGestionarUsuarios1.setText("Gestionar Usuarios");
        lblGestionarUsuarios1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGestionarUsuarios1MouseClicked(evt);
            }
        });

        lblGestionarBibliotecas1.setBackground(new java.awt.Color(255, 255, 255));
        lblGestionarBibliotecas1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblGestionarBibliotecas1.setForeground(new java.awt.Color(255, 255, 255));
        lblGestionarBibliotecas1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGestionarBibliotecas1.setText("Gestionar Bibliotecas");
        lblGestionarBibliotecas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGestionarBibliotecas1MouseClicked(evt);
            }
        });

        lblSalir1.setBackground(new java.awt.Color(255, 255, 255));
        lblSalir1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblSalir1.setForeground(new java.awt.Color(255, 255, 255));
        lblSalir1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalir1.setText("Salir");
        lblSalir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalir1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlHeader1Layout = new javax.swing.GroupLayout(pnlHeader1);
        pnlHeader1.setLayout(pnlHeader1Layout);
        pnlHeader1Layout.setHorizontalGroup(
            pnlHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeader1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHeader1Layout.createSequentialGroup()
                        .addComponent(lblGestionarUsuarios1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblGestionarBibliotecas1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSalir1)
                        .addGap(0, 753, Short.MAX_VALUE))
                    .addGroup(pnlHeader1Layout.createSequentialGroup()
                        .addComponent(lblTitulo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMinimizar1)
                        .addGap(18, 18, 18)
                        .addComponent(lblCerrar1)
                        .addGap(22, 22, 22))))
        );
        pnlHeader1Layout.setVerticalGroup(
            pnlHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeader1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo1)
                    .addComponent(lblCerrar1)
                    .addComponent(lblMinimizar1))
                .addGap(18, 18, 18)
                .addGroup(pnlHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGestionarUsuarios1)
                    .addComponent(lblGestionarBibliotecas1)
                    .addComponent(lblSalir1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_registrar.setBackground(new java.awt.Color(23, 135, 137));
        btn_registrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(239, 248, 248));
        btn_registrar.setText("Registrar");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(23, 135, 137));
        jLabel4.setText("Titulo:");

        input_titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_tituloActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(23, 135, 137));
        jLabel5.setText("Autor:");

        input_autor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_autorActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(23, 135, 137));
        jLabel9.setText("Biblioteca");

        combo_box_biblioteca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_box_biblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_box_bibliotecaActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(23, 135, 137));
        jLabel8.setText("Categoria: ");

        combo_box_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(23, 135, 137));
        jLabel6.setText("Ubicacion:");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(23, 135, 137));
        jLabel1.setText("Imagen:");

        lblFoto.setText("Cargar Imagen");
        lblFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblFotoActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(23, 135, 137));
        jLabel10.setText("Descripción:");

        input_descripcion.setColumns(20);
        input_descripcion.setRows(5);
        jScrollPane1.setViewportView(input_descripcion);

        label_url_imagen.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label_url_imagen.setForeground(new java.awt.Color(23, 135, 137));
        label_url_imagen.setText("Portada:");

        label_imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_imagen.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlHeader1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel6))
                            .addComponent(jLabel10))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                            .addComponent(input_ubicacion)
                            .addComponent(combo_box_biblioteca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(input_titulo))
                        .addGap(201, 201, 201)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1)
                                    .addComponent(label_url_imagen))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(input_autor)
                            .addComponent(combo_box_categoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                            .addComponent(label_imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btn_atras1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_atras1)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(input_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(input_autor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combo_box_biblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combo_box_categoria, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(label_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(label_url_imagen)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(259, 259, 259))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        // TODO add your handling code here:
        boolean validador = false;

        String text_combobox_biblioteca = (String) combo_box_biblioteca.getSelectedItem();
        String text_combobox_categoria = (String) combo_box_categoria.getSelectedItem();
        String var_split_biblioteca[] = text_combobox_biblioteca.split("-");
        int id_biblioteca = Integer.parseInt(var_split_biblioteca[0]);
        String var_split_categoria[] = text_combobox_categoria.split("-");
        int id_categoria = Integer.parseInt(var_split_categoria[0]);

        Libro new_libro = new Libro(input_titulo.getText(), input_descripcion.getText(),
                input_ubicacion.getText(), input_autor.getText(), nuevaRuta,
                id_biblioteca, id_categoria);
        validador = new_libro.registrarLibro(new_libro);

        if (validador == true) {
            copiarArchivo(ruta, nuevaRuta);
            input_titulo.setText("");
            input_descripcion.setText("");
            input_autor.setText("");
            input_ubicacion.setText("");
            combo_box_biblioteca.setSelectedItem("Seleccione");
            combo_box_categoria.setSelectedItem("Seleccione");
            JOptionPane.showMessageDialog(null, "Transaccion exitosa!");

        } else {
            JOptionPane.showMessageDialog(null, "Error en transaccion!");
        }

    }//GEN-LAST:event_btn_registrarActionPerformed
     private void input_autorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_autorActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_input_autorActionPerformed

    private void input_tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_tituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_tituloActionPerformed

    public static void copiarArchivo(String origen, String destino) {
        try {
            Path rutaOrigen = Paths.get(origen);
            Path rutaDestino = Paths.get(destino);
            CopyOption[] opciones = new CopyOption[]{
                StandardCopyOption.REPLACE_EXISTING,
                StandardCopyOption.COPY_ATTRIBUTES
            };
            Files.copy(rutaOrigen, rutaDestino, opciones);
        } catch (IOException err) {
            JOptionPane.showMessageDialog(null, "Error 9:" + err.getMessage());
        }
    }

    File fichero;
    private void lblFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblFotoActionPerformed
        // TODO add your handling code here:
        JFileChooser jfcAbrirArchivo = new JFileChooser();
        //fc.setDialogTitle("Buscar Foto o Imagen");

        //if(fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
        //  File archivo = new File(fc.getSelectedFile().toString());
        //}
        try {
            ImageIcon imagen; //permite almacenar la imagen que se abre con el JFileChooser
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("PNG,JPG", "png", "jpg");
            jfcAbrirArchivo.setFileFilter(filtro);

            int abrir = jfcAbrirArchivo.showOpenDialog(this);

            if (abrir == JFileChooser.APPROVE_OPTION) {
                archivo = jfcAbrirArchivo.getSelectedFile();
                ruta = archivo.getAbsolutePath();
                nombreArchivo = archivo.getName();
                nuevaRuta = System.getProperty("user.dir") + "\\src\\com\\LIbrarySystem\\" + nombreArchivo;
                System.out.println("ruta:" + nuevaRuta);
                imagen = new ImageIcon(ruta);

                this.label_url_imagen.setText(nombreArchivo);
                Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(label_imagen.getWidth(), label_imagen.getHeight(), Image.SCALE_DEFAULT));

                label_imagen.setText(null);

                label_imagen.setIcon(icono);
                //this.label_imagen.setIcon(imagen);

                copiarArchivo(ruta, nuevaRuta);
            }
        } catch (NullPointerException err) {
            JOptionPane.showMessageDialog(null, "Error 8:" + err.getMessage());
        }


    }//GEN-LAST:event_lblFotoActionPerformed

    private void lblSalir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalir1MouseClicked
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if (resp == 0) {
            Login login = new Login();
            login.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_lblSalir1MouseClicked

    private void lblGestionarBibliotecas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGestionarBibliotecas1MouseClicked
        // TODO add your handling code here:
        GestionarBiblioteca gestionar = new GestionarBiblioteca();
        gestionar.usuario = usuario;
        gestionar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblGestionarBibliotecas1MouseClicked

    private void lblGestionarUsuarios1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGestionarUsuarios1MouseClicked
        GestionarUsuarios gestionarUsuario = new GestionarUsuarios();
        gestionarUsuario.usuario = usuario;
        gestionarUsuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblGestionarUsuarios1MouseClicked

    private void lblMinimizar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizar1MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizar1MouseClicked

    private void lblCerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrar1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCerrar1MouseClicked

    private void btn_atras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atras1ActionPerformed
        // TODO add your handling code here:
        GestionarBiblioteca gestionar = new GestionarBiblioteca();
        gestionar.usuario = usuario;
        gestionar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_atras1ActionPerformed

    private void combo_box_bibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_box_bibliotecaActionPerformed
        // TODO add your handling code here:
        ArrayList<Categoria> listCategorias = new ArrayList<>();
        Categoria categoria = new Categoria();
        String array[];

        if ((String) combo_box_biblioteca.getSelectedItem() != null) {
            String seleccion = (String) combo_box_biblioteca.getSelectedItem();
            array = seleccion.split("-");
            listCategorias = categoria.listarCategoriasBiblioteca(Integer.parseInt(array[0]));
            combo_box_categoria.removeAllItems();
            for (int i = 0; i < listCategorias.size(); i++) {
                combo_box_categoria.addItem(listCategorias.get(i).getId_categoria() + "-" + listCategorias.get(i).getNombre());
            }
        }
    }//GEN-LAST:event_combo_box_bibliotecaActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atras1;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JComboBox<String> combo_box_biblioteca;
    private javax.swing.JComboBox<String> combo_box_categoria;
    private javax.swing.JTextField input_autor;
    private javax.swing.JTextArea input_descripcion;
    private javax.swing.JTextField input_titulo;
    private javax.swing.JTextField input_ubicacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_imagen;
    private javax.swing.JLabel label_url_imagen;
    private javax.swing.JLabel lblCerrar1;
    private javax.swing.JButton lblFoto;
    private javax.swing.JLabel lblGestionarBibliotecas1;
    private javax.swing.JLabel lblGestionarUsuarios1;
    private javax.swing.JLabel lblMinimizar1;
    private javax.swing.JLabel lblSalir1;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JPanel pnlHeader1;
    // End of variables declaration//GEN-END:variables
}
