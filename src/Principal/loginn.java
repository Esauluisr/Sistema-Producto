package Principal;

import Conexion.conexion;
//import com.sun.awt.AWTUtilities;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.RoundRectangle2D;

public class loginn extends javax.swing.JFrame {

    public Point point;

    public loginn() {
        initComponents();
        gifload.setVisible(false);
        setLocationRelativeTo(null); //Centra la vantana en la pantalla

        txtusername.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtpassword.setBackground(new java.awt.Color(0, 0, 0, 1));

        Shape forma = new RoundRectangle2D.Double(0, 0, getBounds().width, getBounds().height, 20, 20);
        //AWTUtilities.setWindowShape(this, forma);

        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/almacen.png"));
        setIconImage(icon);
        txtpassword.addKeyListener(new KeyListener() {
        public void keyTyped(KeyEvent e) {
            // Aquí no funcionará
        }

        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                loggear();
            }
            if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                // Hacer algo en caso de presionar Escape
            }
        }

        public void keyReleased(KeyEvent e) {
            // Acciones a realizar cuando se libera una tecla
        }
    });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        login = new javax.swing.JPanel();
        cerrar = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        InicioDeSesion = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        disable = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        gifload = new javax.swing.JLabel();
        control = new javax.swing.JLabel();
        asistencia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 255));
        setMinimumSize(new java.awt.Dimension(940, 440));
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(550, 378));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 378));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tarjeta-electronica.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 130, 160));

        login.setBackground(new java.awt.Color(0, 153, 153));
        login.setMinimumSize(new java.awt.Dimension(420, 375));
        login.setPreferredSize(new java.awt.Dimension(420, 375));
        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cerrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cerrar.setForeground(new java.awt.Color(255, 255, 255));
        cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrar.setText("X");
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });
        login.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 40, 29));

        txtusername.setFont(txtusername.getFont().deriveFont(txtusername.getFont().getSize()+2f));
        txtusername.setForeground(new java.awt.Color(255, 255, 255));
        txtusername.setBorder(null);
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        login.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 240, 30));

        txtpassword.setFont(txtpassword.getFont().deriveFont(txtpassword.getFont().getSize()+3f));
        txtpassword.setForeground(new java.awt.Color(255, 255, 255));
        txtpassword.setBorder(null);
        txtpassword.setCaretColor(new java.awt.Color(255, 255, 255));
        login.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 240, 30));

        InicioDeSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        InicioDeSesion.setForeground(new java.awt.Color(25, 118, 211));
        InicioDeSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iniciar-sesion.png"))); // NOI18N
        InicioDeSesion.setText("INICIO DE SESION");
        InicioDeSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        InicioDeSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioDeSesionActionPerformed(evt);
            }
        });
        login.add(InicioDeSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 200, 40));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_user_20px_1.png"))); // NOI18N
        login.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 40, 39));

        disable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        disable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_invisible_20px_1.png"))); // NOI18N
        disable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        disable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disableMouseClicked(evt);
            }
        });
        login.add(disable, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 40, 40));

        show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_eye_20px_1.png"))); // NOI18N
        show.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        login.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 40, 40));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("_________________________________________");
        login.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 290, 39));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("_________________________________________");
        login.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 290, 39));

        jLabel3.setFont(new java.awt.Font("NSimSun", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Login");
        login.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 380, 53));

        jLabel12.setFont(new java.awt.Font("NSimSun", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Contraseña");
        login.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 110, 40));

        jLabel13.setFont(new java.awt.Font("NSimSun", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Hola Yazmin Bienvenida....");
        login.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 380, 53));

        jLabel14.setFont(new java.awt.Font("NSimSun", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Usuario");
        login.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 80, 40));

        gifload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loadingif.gif"))); // NOI18N
        login.add(gifload, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, -1, -1));

        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 410, 450));

        control.setBackground(new java.awt.Color(255, 255, 255));
        control.setFont(new java.awt.Font("NSimSun", 1, 36)); // NOI18N
        control.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        control.setText("Sistema De");
        jPanel1.add(control, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 200, -1));

        asistencia.setBackground(new java.awt.Color(255, 255, 255));
        asistencia.setFont(new java.awt.Font("NSimSun", 1, 36)); // NOI18N
        asistencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asistencia.setText("Productos ");
        jPanel1.add(asistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 450));

        setSize(new java.awt.Dimension(936, 450));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrarMouseClicked

    private void loggear() {
        gifload.setVisible(true);

        // Crea un temporizador con un retraso de 2 segundos (2000 milisegundos)
        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Esta parte del código se ejecutará después de 2 segundos
                Loggin();
            }
        });

        // Inicia el temporizador
        timer.setRepeats(false); // Esto evita que el temporizador se repita
        timer.start();
    }
    private void InicioDeSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioDeSesionActionPerformed

        loggear();

    }//GEN-LAST:event_InicioDeSesionActionPerformed

    public void Loggin() {
        String user = txtusername.getText();
        String pass = txtpassword.getText();

        String sql = "SELECT nombre, clave FROM usuario WHERE nombre = ? AND clave = ?";
       
        try {
            conexion conn = new conexion();
            Connection con = conn.Conectar();
            PreparedStatement ps = con.prepareStatement(sql);
            
            // Asignamos los valores de usuario y contraseña
            ps.setString(1, user);
            ps.setString(2, pass);
            
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String u = rs.getString("nombre");
                String p = rs.getString("clave");
               
                MenuUsuario menu = new MenuUsuario();
                menu.setVisible(true);
                this.setVisible(false);
                gifload.setVisible(false);
                
            } else {
                gifload.setVisible(false);
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos " + ex.getMessage());
        } 
    }
    private void disableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disableMouseClicked
        txtpassword.setEchoChar((char) 0);
        disable.setVisible(false);
        disable.setEnabled(false);
        show.setEnabled(true);
        show.setEnabled(true);
    }//GEN-LAST:event_disableMouseClicked


    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked

        txtpassword.setEchoChar((char) 8226);
        disable.setVisible(true);
        disable.setEnabled(true);
        show.setEnabled(false);
        show.setEnabled(false);
    }//GEN-LAST:event_showMouseClicked

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged

    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed

    }//GEN-LAST:event_formMousePressed

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
        txtusername.transferFocus();
    }//GEN-LAST:event_txtusernameActionPerformed

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed

    }//GEN-LAST:event_jPanel1KeyPressed

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
            java.util.logging.Logger.getLogger(loginn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new loginn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InicioDeSesion;
    private javax.swing.JLabel asistencia;
    private javax.swing.JLabel cerrar;
    private javax.swing.JLabel control;
    private javax.swing.JLabel disable;
    private javax.swing.JLabel gifload;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel login;
    private javax.swing.JLabel show;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
