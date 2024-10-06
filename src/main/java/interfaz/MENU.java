/**
 * Esta clase representa el menú principal de la aplicación.
 * Desde aquí se puede acceder a otras funcionalidades como el cálculo de interés
 * y el historial. También ofrece la opción de salir de la aplicación.
 */
package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
/**
 * Esta clase representa el menú principal de la aplicación.
 * Desde aquí se puede acceder a otras funcionalidades como el cálculo de interés
 * y el historial. También ofrece la opción de salir de la aplicación.
 */
public class MENU extends javax.swing.JFrame {

    /**
     * Crea una nueva ventana de menú.
     * La ventana está configurada para cerrarse al salir y se muestra centrada en pantalla.
     */
    public MENU() {
         initComponents();
         setSize(516, 449);
         setLocationRelativeTo(null);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setVisible(true);
         Salir.addActionListener(new MENU.ButtonClickListener());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Historial = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        Calcular = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        Regresar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Historial.setBackground(new java.awt.Color(255, 255, 51));
        Historial.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Historial.setText("HISTORIAL");
        Historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialActionPerformed(evt);
            }
        });
        getContentPane().add(Historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 220, 50));

        Salir.setBackground(new java.awt.Color(255, 255, 0));
        Salir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Salir.setText("SALIR");
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 120, 30));

        Calcular.setBackground(new java.awt.Color(255, 255, 102));
        Calcular.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Calcular.setText("CALCULAR INTERES ");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });
        getContentPane().add(Calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 210, 50));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simbolo.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 190, 140));

        Regresar.setBackground(new java.awt.Color(255, 255, 0));
        Regresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Regresar.setText("REGRESAR");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 110, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondoturquesa.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    /**
     * Acción ejecutada cuando el botón "HISTORIAL" es presionado.
     * Muestra la ventana de historial y cierra el menú.
     * 
     * @param evt Evento de acción que dispara el método.
     */
    private void HistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialActionPerformed
        HISTORIAL irHistorial = new HISTORIAL();
        this.dispose();        
    }//GEN-LAST:event_HistorialActionPerformed

    /**
     * Acción ejecutada cuando el botón "CALCULAR INTERES" es presionado.
     * Muestra la ventana de cálculo de datos y cierra el menú.
     * 
     * @param evt Evento de acción que dispara el método.
     */
    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        DATOS datos = new DATOS();
         this.dispose();
    }//GEN-LAST:event_CalcularActionPerformed
 
    /**
     * Acción ejecutada cuando el botón "REGRESAR" es presionado.
     * Cierra el menú y muestra la ventana de login.
     * 
     * @param evt Evento de acción que dispara el método.
     */
    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        LOGIN login = new LOGIN();
        this.dispose();
    }//GEN-LAST:event_RegresarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JButton Historial;
    private javax.swing.JButton Regresar;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables

    private  class ButtonClickListener implements ActionListener {
      @Override
        public void actionPerformed(ActionEvent e) {
            // Obtener el texto del campo de texto
              dispose();
        }
    } 
 }
