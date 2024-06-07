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
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author jesus
 */
public class Inicio extends javax.swing.JFrame {

    private JPanel cardPanel;
    private CardLayout cardLayout;

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        personalizador();
        agregarLabelsEnPanel();
        agregarOpcionesMenu();

    }

    public void personalizador() {
        panelMenu.setBackground(Color.decode("#07285B"));
        btnAtras.setBackground(Color.decode("#07285B"));
        btnSiguiente.setBackground(Color.decode("#07285B"));
        btnCercana.setBackground(Color.decode("#07285B"));

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

    public void agregarLabelsEnPanel() {
        panelPeliculas.setLayout(new GridLayout(2, 3, 50, 15)); // Filas, columnas, espaciado horizontal, espaciado vertical

        JLabel[] labels = new JLabel[10];
        for (int i = 0; i < 10; i++) {
            labels[i] = new JLabel("Pelicula", SwingConstants.CENTER);
            labels[i].setOpaque(true);
            labels[i].setBackground(new java.awt.Color(0x07, 0x28, 0x5B)); // #07285B
            labels[i].setForeground(java.awt.Color.WHITE); // Blanco
            labels[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    abrirNuevoFrame();
                }
            });
            panelPeliculas.add(labels[i]);
        }
    }

    public void abrirNuevoFrame() {
        Pelicula pelicula = new Pelicula();
        pelicula.setVisible(true);

        dispose();
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
        panelMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelPeliculas = new javax.swing.JPanel();
        btnSiguiente = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnCercana = new javax.swing.JButton();
        MenuBarAdmin = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Agrupador.setBackground(new java.awt.Color(255, 255, 255));
        Agrupador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        panelPeliculas.setBackground(new java.awt.Color(255, 255, 255));
        panelPeliculas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Agrupador.add(panelPeliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 790, 330));

        btnSiguiente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        Agrupador.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, 100, 40));

        btnAtras.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        Agrupador.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 100, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("1");
        Agrupador.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Agrupador.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 140, -1));

        btnCercana.setForeground(new java.awt.Color(255, 255, 255));
        btnCercana.setText("Sucursal cercana");
        Agrupador.add(btnCercana, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        setJMenuBar(MenuBarAdmin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Agrupador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Agrupador, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Agrupador;
    private javax.swing.JMenuBar MenuBarAdmin;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCercana;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelPeliculas;
    // End of variables declaration//GEN-END:variables
}
