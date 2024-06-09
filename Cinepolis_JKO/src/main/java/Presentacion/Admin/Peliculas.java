/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion.Admin;

import Presentacion.Compra;
import Presentacion.Inicio;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author jesus
 */
public class Peliculas extends javax.swing.JFrame {
    
     //Para imagen
    File archivo;
    
    /**
     * Creates new form Peliculas
     */
    public Peliculas() {
        initComponents();
        
        agregarOpcionesMenu();
    }
    
    
    public void agregarOpcionesMenu() {

        JMenu menuPeliculas = new JMenu("Películas");
        JMenuItem verPeliculas = new JMenuItem("Ver Películas");
        verPeliculas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open your frame here
                Inicio Inicio = new Inicio();
                Inicio.setVisible(true);
                
                dispose();
            }
        });
        
        JMenuItem agregarPeliculas = new JMenuItem("Agregar Películas");
        verPeliculas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open your frame here
                Peliculas Peliculas = new Peliculas();
                Peliculas.setVisible(true);
                
                dispose();
            }
        });
        menuPeliculas.add(verPeliculas);
        menuPeliculas.add(agregarPeliculas);

        JMenu menuFunciones = new JMenu("Funciones");
        JMenuItem verFunciones = new JMenuItem("Ver Funciones");
        verFunciones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open your frame here
                Funciones Funciones = new Funciones();
                Funciones.setVisible(true);
                
                dispose();
            }
        });

        JMenuItem agregarFunciones = new JMenuItem("Agregar Funciones");
        agregarFunciones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open your frame here
                 Funciones Funciones = new Funciones();
                Funciones.setVisible(true);
                
                dispose();
            }
        });
        menuFunciones.add(verFunciones);
        menuFunciones.add(agregarFunciones);

        JMenu menuSalas = new JMenu("Salas");
        JMenuItem agregarSalas = new JMenuItem("Agregar Salas");
        agregarSalas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open your frame here
                Sala Sala = new Sala();
                Sala.setVisible(true);
            
                dispose();
            }
        });
        menuSalas.add(agregarSalas);

        JMenu menuPais = new JMenu("Pais");
        JMenuItem agregarPais = new JMenuItem("Agregar Pais");
        agregarPais.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open your frame here
                 Pais Pais = new Pais();
                Pais.setVisible(true);
            
                dispose();
            }
        });
        JMenuItem verPais = new JMenuItem("Ver Pais");
        verPais.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open your frame here
                Pais Pais = new Pais();
                Pais.setVisible(true);
            
                dispose();
            }
        });
        menuPais.add(agregarPais);
        menuPais.add(verPais);

        JMenu menuReportes = new JMenu("Reportes");
        JMenuItem GenerarReporte = new JMenuItem("Generar Reportes");
        GenerarReporte.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open your frame here
                Reportes Reportes = new Reportes();
                Reportes.setVisible(true);
            
                dispose();
            }
        });
        menuReportes.add(GenerarReporte);

        JMenu menuBoletos = new JMenu("Boletos");
        JMenuItem ComprarBoleto = new JMenuItem("Comprar Boleto");
        ComprarBoleto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open your frame here
                Compra comprar = new Compra();
                comprar.setVisible(true);
            
                dispose();
            }
        });
        menuBoletos.add(ComprarBoleto);
        
         JMenu menuSucursales = new JMenu("Sucursales");
        JMenuItem verSucursales = new JMenuItem("Ver Sucursales");
        verSucursales.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open your frame here
                Sucursales Sucursales = new Sucursales();
                Sucursales.setVisible(true);
            
                dispose();
            }
        });
        menuSucursales.add(verSucursales);
        
        
        

        MenuBarAdmin.add(menuPeliculas);
        MenuBarAdmin.add(menuFunciones);
        MenuBarAdmin.add(menuSalas);
        MenuBarAdmin.add(menuPais);
        MenuBarAdmin.add(menuReportes);
        MenuBarAdmin.add(menuBoletos);
         MenuBarAdmin.add(menuSucursales);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Agrupador = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        etiquetaDescripcion = new javax.swing.JLabel();
        btnSubir = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblimagen = new javax.swing.JLabel();
        lblDireccionIMG = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        etiquetaDescripcion1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        etiquetaDescripcion2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        etiquetaDescripcion3 = new javax.swing.JLabel();
        etiquetaDescripcion4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        etiquetaDescripcion5 = new javax.swing.JLabel();
        btnVolver1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        MenuBarAdmin = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Agrupador.setBackground(new java.awt.Color(255, 255, 255));
        Agrupador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancelar.setBackground(new java.awt.Color(0, 102, 153));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        Agrupador.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 150, 30));

        etiquetaDescripcion.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaDescripcion.setText("Trailer");
        Agrupador.add(etiquetaDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 60, 20));

        btnSubir.setBackground(new java.awt.Color(0, 102, 153));
        btnSubir.setForeground(new java.awt.Color(255, 255, 255));
        btnSubir.setText("SubirI Imagen");
        btnSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirActionPerformed(evt);
            }
        });
        Agrupador.add(btnSubir, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 130, 30));

        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("Titulo");
        Agrupador.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 80, 20));

        panelMenu.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cinepolis logo barra.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("inepolis");

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 490, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Agrupador.add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 60));

        lblimagen.setText("IMAGEN");
        Agrupador.add(lblimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 180, 260));

        lblDireccionIMG.setText("jLabel2");
        Agrupador.add(lblDireccionIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 190, -1));

        jTextField1.setText("jTextField1");
        Agrupador.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 210, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        Agrupador.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        etiquetaDescripcion1.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaDescripcion1.setText("Sinopsis");
        Agrupador.add(etiquetaDescripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 120, 20));

        jTextField2.setText("jTextField2");
        Agrupador.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 220, -1));

        etiquetaDescripcion2.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaDescripcion2.setText("Genero");
        Agrupador.add(etiquetaDescripcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 60, 20));

        jTextField3.setText("jTextField2");
        Agrupador.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Agrupador.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 130, -1));

        etiquetaDescripcion3.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaDescripcion3.setText("Duracion:");
        Agrupador.add(etiquetaDescripcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 60, 20));

        etiquetaDescripcion4.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaDescripcion4.setText("Pais");
        Agrupador.add(etiquetaDescripcion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 60, 20));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Agrupador.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 130, -1));

        etiquetaDescripcion5.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaDescripcion5.setText("Clasificacion");
        Agrupador.add(etiquetaDescripcion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 80, 20));

        btnVolver1.setBackground(new java.awt.Color(0, 102, 153));
        btnVolver1.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver1.setText("Guardar");
        btnVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver1ActionPerformed(evt);
            }
        });
        Agrupador.add(btnVolver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 150, 30));

        jCheckBox1.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setText("Musical");
        Agrupador.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 500, -1, -1));

        jCheckBox2.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox2.setText("Terror");
        Agrupador.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, -1, -1));

        jCheckBox3.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox3.setText("Drama");
        Agrupador.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, -1, -1));

        jCheckBox4.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox4.setText("Ciencia Ficcion");
        Agrupador.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, -1, -1));

        jCheckBox5.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox5.setText("Comedia");
        Agrupador.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, -1, -1));

        setJMenuBar(MenuBarAdmin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Agrupador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Agrupador, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Inicio inicio = new Inicio();

        inicio.setVisible(true);

        dispose();

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirActionPerformed
        // TODO add your handling code here:
       int resultado;

        FrmBuscarImg buscar = new FrmBuscarImg();

        FileNameExtensionFilter formato = new FileNameExtensionFilter("JPG,PNG Y GIF", "jpg", "png", "gif");

        buscar.JFCImg.setFileFilter(formato);

        resultado = buscar.JFCImg.showOpenDialog(null);

        if (JFileChooser.APPROVE_OPTION == resultado) {
            archivo = buscar.JFCImg.getSelectedFile();

            lblDireccionIMG.setText(archivo.getAbsolutePath());

        }
        try {
            ImageIcon ImgIcon = new ImageIcon(archivo.toString());

            Icon icono = new ImageIcon(ImgIcon.getImage().getScaledInstance(lblimagen.getWidth(), lblimagen.getHeight(), Image.SCALE_DEFAULT));

            lblimagen.setIcon(icono);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al abrir" + e);
        }


    }//GEN-LAST:event_btnSubirActionPerformed

    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolver1ActionPerformed

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
            java.util.logging.Logger.getLogger(Peliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Peliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Peliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Peliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Peliculas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Agrupador;
    private javax.swing.JMenuBar MenuBarAdmin;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSubir;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JLabel etiquetaDescripcion;
    private javax.swing.JLabel etiquetaDescripcion1;
    private javax.swing.JLabel etiquetaDescripcion2;
    private javax.swing.JLabel etiquetaDescripcion3;
    private javax.swing.JLabel etiquetaDescripcion4;
    private javax.swing.JLabel etiquetaDescripcion5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblDireccionIMG;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}
