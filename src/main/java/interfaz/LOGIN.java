package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Clase que gestiona la interfaz gráfica del login de la aplicación.
 */ 
public class LOGIN extends javax.swing.JFrame {
  /**
     * Constructor de la clase LOGIN. Configura la interfaz gráfica y
     * asigna los eventos a los botones.
     */
   public LOGIN() {
    initComponents();
    setSize(516, 449);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    Salir.addActionListener(new ButtonClickListener());
}
   
  @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ingresarusuario = new javax.swing.JTextField();
        Salir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Iniciar = new javax.swing.JButton();
        Registrar = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        ingresarcontraseña = new javax.swing.JPasswordField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INTERES SIMPLE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 320, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CONTRASEÑA :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 150, 70));

        ingresarusuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ingresarusuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingresarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(ingresarusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 270, 30));

        Salir.setBackground(new java.awt.Color(255, 255, 0));
        Salir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Salir.setText("SALIR");
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 130, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("USUARIO :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 150, 50));

        Iniciar.setBackground(new java.awt.Color(255, 255, 0));
        Iniciar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Iniciar.setText("INICIAR");
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });
        getContentPane().add(Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 130, 30));

        Registrar.setBackground(new java.awt.Color(255, 255, 0));
        Registrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Registrar.setText("REGISTRARSE");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 140, 30));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simbolo.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, 130));

        ingresarcontraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ingresarcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 270, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondoturquesa.jpg"))); // NOI18N
        fondo.setText("jLabel5");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    /**
     * Método llamado cuando se presiona el botón "Iniciar". Verifica si las credenciales ingresadas son válidas.
     * 
     * @param evt El evento del botón.
     */
    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
    //leer los valores de Usuario y Contraseña
        String usuario = ingresarusuario.getText().toUpperCase().trim();
        String contraseña = new String(ingresarcontraseña.getPassword());
 
    //verficar si Usuario o Contraseña son incorrectos
        if (usuario.isEmpty()|| contraseña.isEmpty()){
            JOptionPane.showMessageDialog(this,"rellene todos los campos");
        }else{
            if (verificarCredenciales(usuario,contraseña)){
                //JOptionPane.showMessageDialog(this,"BIENVENIDO");
                MENU menu = new MENU();
                menu.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
            }
        } 
            
    }//GEN-LAST:event_IniciarActionPerformed

   /**
     * Verifica las credenciales del usuario con los datos almacenados en un archivo.
     * 
     * @param usuario El nombre de usuario.
     * @param contraseña La contraseña del usuario.
     * @return True si las credenciales son válidas, False en caso contrario.
     * 
     * @throws IOException si ocurre un error al leer el archivo de usuarios.
     */
private boolean verificarCredenciales(String usuario, String contraseña) {
    try {
        FileReader leer = new FileReader("usuarios.txt");
        BufferedReader bufferleer = new BufferedReader(leer);
        String linea;
        while ((linea = bufferleer.readLine()) != null) {
            String[] partes = linea.split(":"); //  formato "usuario : contraseña"
            if (partes.length == 2) {
                String usuariotxt = partes[0].trim();
                String contraseñatxt = partes[1].trim();

                // Verificar si coinciden el usuario y la contraseña
                if (usuario.equals(usuariotxt) && contraseña.equals(contraseñatxt)) {
                    bufferleer.close();
                    return true; // Credenciales válidas
                }
            }
          }
        bufferleer.close();
        }catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al leer el archivo de usuarios.");
      
        }
       return false;  // Credenciales inválidas
    }    
    
    private void ingresarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresarusuarioActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
     REGISTRAR registrar = new REGISTRAR();
     this.dispose();
        
    }//GEN-LAST:event_RegistrarActionPerformed

private  class ButtonClickListener implements ActionListener {
      
        @Override
        public void actionPerformed(ActionEvent e) {
            // Obtener el texto del campo de texto
           
           
              dispose();
        }
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Iniciar;
    private javax.swing.JButton Registrar;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel fondo;
    private javax.swing.JPasswordField ingresarcontraseña;
    private javax.swing.JTextField ingresarusuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
