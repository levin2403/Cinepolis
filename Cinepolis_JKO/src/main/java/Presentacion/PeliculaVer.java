/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import Presentacion.Admin.Funciones;
import Presentacion.Admin.Pais;
import Presentacion.Admin.Peliculas;
import Presentacion.Admin.Reportes;
import Presentacion.Admin.Sala;
import Presentacion.Admin.Sucursales;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author jesus
 */
public class PeliculaVer extends javax.swing.JFrame {

    /**
     * Creates new form Pelicula
     */
    public PeliculaVer() {
        initComponents();
        personalizador();
        agregarOpcionesMenu();
        
    }
    
      public void personalizador() {
        panelMenu.setBackground(Color.decode("#07285B"));
        
        lblimagen.setOpaque(true);
        lblimagen.setBackground(new java.awt.Color(0x07, 0x28, 0x5B));
        
        btnComprar.setBackground(Color.decode("#07285B"));
        btnVolver.setBackground(Color.decode("#07285B"));
        
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
        btnVolver = new javax.swing.JButton();
        etiquetaDescripcion = new javax.swing.JLabel();
        btnComprar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblimagen = new javax.swing.JLabel();
        MenuBarAdmin = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Agrupador.setBackground(new java.awt.Color(255, 255, 255));
        Agrupador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolver.setText("Volver");
        btnVolver.setBackground(new java.awt.Color(0, 102, 153));
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        Agrupador.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 240, 30));

        etiquetaDescripcion.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaDescripcion.setText("Sinopsis");
        Agrupador.add(etiquetaDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 290, 140));

        btnComprar.setText("Comprar boletos");
        btnComprar.setBackground(new java.awt.Color(0, 102, 153));
        btnComprar.setForeground(new java.awt.Color(255, 255, 255));
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        Agrupador.add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 240, 30));

        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("Titulo");
        Agrupador.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 270, 40));

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
        Agrupador.add(lblimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 220, 310));

        setJMenuBar(MenuBarAdmin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Agrupador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Agrupador, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
      Inicio inicio = new Inicio();
      
      inicio.setVisible(true);
      
      dispose();
      
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        // TODO add your handling code here:
        Compra comprar = new Compra();
        
        comprar.setVisible(true);
        
        dispose();
       
    }//GEN-LAST:event_btnComprarActionPerformed

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
            java.util.logging.Logger.getLogger(PeliculaVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeliculaVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeliculaVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeliculaVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeliculaVer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Agrupador;
    private javax.swing.JMenuBar MenuBarAdmin;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel etiquetaDescripcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}
