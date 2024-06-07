/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion.Admin;

import Presentacion.Compra;
import Presentacion.Inicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author jesus
 */
public class Peliculas extends javax.swing.JFrame {

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

        MenuBarAdmin = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setJMenuBar(MenuBarAdmin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 299, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JMenuBar MenuBarAdmin;
    // End of variables declaration//GEN-END:variables
}
