/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import Negocio.ClienteNegocio;
import Persistencia.PersistenciaException;
import entidad.Cliente;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jesus
 */
public class LogIn extends javax.swing.JFrame {

    ClienteNegocio clienteNegocio = new ClienteNegocio();

    /**
     * Creates new form LogIn
     */
    public LogIn() {
        initComponents();

        // creamos lo de el label registro clickeable
        lblRegistrarse.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //abrimos los eventos de click en los label
                Registro registro = new Registro();
                registro.setVisible(true);
                dispose();
            }
        });
        personalizador();
    }

    public void personalizador() {
        Agrupador.setBackground(Color.decode("#07285B"));
    }

    public void validarUsuario() throws PersistenciaException {
        // Verificar si el campo de correo está vacío
        if (txtCorreo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese su correo");
            System.out.println("El campo de correo está vacío.");
            return;
        }

        // Verificar si el campo de contraseña está vacío
        if (txtContrasena.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese su contraseña");
            System.out.println("El campo de contraseña está vacío.");
            return;
        }

        // Obtener la lista de clientes
        List<Cliente> clientes = clienteNegocio.obtenerClientes();
        System.out.println("Clientes obtenidos: " + clientes.size());
        Cliente usuarioEncontrado = null;

        // Obtener el correo y la contraseña encriptada del formulario
        String correoIngresado = txtCorreo.getText();
        String contrasenaIngresada = encriptar(txtContrasena.getText());
        System.out.println("Correo ingresado: " + correoIngresado);
        System.out.println("Contraseña ingresada (encriptada): " + contrasenaIngresada);

        // Recorrer la lista de clientes para encontrar coincidencias
        for (Cliente user : clientes) {
            System.out.println("Verificando usuario: " + user.getCorreo());
            // Verificar si el correo coincide
            if (user.getCorreo().equals(correoIngresado)) {
                System.out.println("Correo coincide: " + user.getCorreo());
                // Verificar si la contraseña coincide
                if (user.getContrasena() != null && user.getContrasena().equals(contrasenaIngresada)) {
                    System.out.println("Contraseña coincide para el usuario: " + user.getCorreo());
                    usuarioEncontrado = user;
                    break;
                } else {
                    System.out.println("Contraseña no coincide para el usuario: " + user.getCorreo());
                }
            } else {
                System.out.println("Correo no coincide: " + user.getCorreo());
            }
        }

        // Si se encontró un usuario válido, abrir la ventana de inicio
        if (usuarioEncontrado != null) {
            System.out.println("Usuario encontrado: " + usuarioEncontrado.getCorreo());
            Inicio inicio = new Inicio();
            inicio.setVisible(true);
            this.dispose();
        } else {
            System.out.println("Usuario no encontrado.");
            JOptionPane.showMessageDialog(null, "Usuario no encontrado");
        }
    }

    private String encriptar(String contrasenia) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedPassword = md.digest(contrasenia.getBytes(StandardCharsets.UTF_8)); // Usar UTF-8 para codificar

            // Convierte el hash a una representación hexadecimal
            StringBuilder hexString = new StringBuilder();
            for (byte hashByte : hashedPassword) {
                String hex = Integer.toHexString(0xff & hashByte);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            System.out.println("Contraseña encriptada: " + hexString.toString());
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
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

        Agrupador = new javax.swing.JPanel();
        etiquetaUsuario = new javax.swing.JLabel();
        etiquetaContrasena = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        btnIniciarSesion = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblRegistrarse = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Agrupador.setBackground(new java.awt.Color(0, 51, 102));
        Agrupador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaUsuario.setText("Correo:");
        Agrupador.add(etiquetaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        etiquetaContrasena.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaContrasena.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaContrasena.setText("Contraseña:");
        Agrupador.add(etiquetaContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        txtCorreo.setBackground(new java.awt.Color(234, 234, 234));
        txtCorreo.setForeground(new java.awt.Color(51, 51, 51));
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        Agrupador.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 190, -1));

        btnIniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setForeground(new java.awt.Color(0, 0, 0));
        btnIniciarSesion.setText("Iniciar sesion");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        Agrupador.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 120, 40));

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        Agrupador.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 120, 40));

        lblRegistrarse.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lblRegistrarse.setForeground(new java.awt.Color(153, 153, 255));
        lblRegistrarse.setText("Registrarse");
        Agrupador.add(lblRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("¿No tienes una cuenta?");
        Agrupador.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cinepolis logo.png"))); // NOI18N
        Agrupador.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 160, 160));
        Agrupador.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 190, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Agrupador, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Agrupador, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed

        try {
            validarUsuario();
        } catch (PersistenciaException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Agrupador;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel etiquetaContrasena;
    private javax.swing.JLabel etiquetaUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblRegistrarse;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
