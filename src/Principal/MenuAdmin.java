
package Principal;

//import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Image;
import java.awt.Point;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import paneles.CambiaPanel;


public class MenuAdmin extends javax.swing.JFrame {

    
    
    public MenuAdmin() {
        initComponents();
        setLocationRelativeTo(null); //Centra la vantana en la pantalla
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(this);
        this.inicio.setSelected(true);
        
        
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/reloj.png"));
        setIconImage(icon);

        new CambiaPanel(pnlPrincipal,new paneles.inicio());
       
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        ContenedorTitulo = new javax.swing.JPanel();
        TituloPrincipal = new javax.swing.JLabel();
        ContenedorMenu = new javax.swing.JPanel();
        CerrarSecion = new javax.swing.JButton();
        inicio = new rsbuttom.RSButtonMetro();
        historial = new rsbuttom.RSButtonMetro();
        reporte = new rsbuttom.RSButtonMetro();
        recordatorio = new rsbuttom.RSButtonMetro();
        Justificacion = new rsbuttom.RSButtonMetro();
        configuracion = new rsbuttom.RSButtonMetro();
        Escudo = new javax.swing.JLabel();
        pnlPrincipal = new javax.swing.JPanel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
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

        ContenedorTitulo.setBackground(new java.awt.Color(0, 153, 153));
        ContenedorTitulo.setForeground(new java.awt.Color(153, 0, 0));
        ContenedorTitulo.setToolTipText("");

        TituloPrincipal.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        TituloPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        TituloPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloPrincipal.setText("SISTEMA DE INVENTARIO DE PRODUCTOS ( CENDI )");
        TituloPrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout ContenedorTituloLayout = new javax.swing.GroupLayout(ContenedorTitulo);
        ContenedorTitulo.setLayout(ContenedorTituloLayout);
        ContenedorTituloLayout.setHorizontalGroup(
            ContenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1657, Short.MAX_VALUE)
                .addGap(52, 52, 52))
        );
        ContenedorTituloLayout.setVerticalGroup(
            ContenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloPrincipal)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        CerrarSecion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CerrarSecion.setForeground(new java.awt.Color(25, 118, 211));
        CerrarSecion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        CerrarSecion.setText("Cerrar Sesion");
        CerrarSecion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSecionActionPerformed(evt);
            }
        });

        inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        inicio.setText(" Inicio");
        inicio.setColorHover(new java.awt.Color(204, 204, 204));
        inicio.setColorNormal(new java.awt.Color(204, 204, 204));
        inicio.setColorPressed(new java.awt.Color(204, 204, 204));
        inicio.setColorTextHover(new java.awt.Color(0, 0, 0));
        inicio.setColorTextNormal(new java.awt.Color(0, 0, 0));
        inicio.setColorTextPressed(new java.awt.Color(128, 128, 131));
        inicio.setFocusPainted(false);
        inicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        inicio.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        inicio.setIconTextGap(25);
        inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inicioMousePressed(evt);
            }
        });
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });

        historial.setBackground(new java.awt.Color(239, 238, 244));
        historial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/collection.png"))); // NOI18N
        historial.setText(" Historial");
        historial.setColorHover(new java.awt.Color(204, 204, 204));
        historial.setColorNormal(new java.awt.Color(239, 238, 244));
        historial.setColorPressed(new java.awt.Color(204, 204, 204));
        historial.setColorTextHover(new java.awt.Color(0, 0, 0));
        historial.setColorTextNormal(new java.awt.Color(0, 0, 0));
        historial.setColorTextPressed(new java.awt.Color(128, 128, 131));
        historial.setFocusPainted(false);
        historial.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        historial.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        historial.setIconTextGap(25);
        historial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                historialMousePressed(evt);
            }
        });
        historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialActionPerformed(evt);
            }
        });

        reporte.setBackground(new java.awt.Color(239, 238, 244));
        reporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/chat.png"))); // NOI18N
        reporte.setText("Reporte");
        reporte.setColorHover(new java.awt.Color(204, 204, 204));
        reporte.setColorNormal(new java.awt.Color(239, 238, 244));
        reporte.setColorPressed(new java.awt.Color(204, 204, 204));
        reporte.setColorTextHover(new java.awt.Color(0, 0, 0));
        reporte.setColorTextNormal(new java.awt.Color(0, 0, 0));
        reporte.setColorTextPressed(new java.awt.Color(128, 128, 131));
        reporte.setFocusPainted(false);
        reporte.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        reporte.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        reporte.setIconTextGap(19);
        reporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                reporteMousePressed(evt);
            }
        });
        reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteActionPerformed(evt);
            }
        });

        recordatorio.setBackground(new java.awt.Color(239, 238, 244));
        recordatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/web.png"))); // NOI18N
        recordatorio.setText("  Recordatorio");
        recordatorio.setColorHover(new java.awt.Color(204, 204, 204));
        recordatorio.setColorNormal(new java.awt.Color(239, 238, 244));
        recordatorio.setColorPressed(new java.awt.Color(204, 204, 204));
        recordatorio.setColorTextHover(new java.awt.Color(0, 0, 0));
        recordatorio.setColorTextNormal(new java.awt.Color(0, 0, 0));
        recordatorio.setColorTextPressed(new java.awt.Color(128, 128, 131));
        recordatorio.setFocusPainted(false);
        recordatorio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        recordatorio.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        recordatorio.setIconTextGap(19);
        recordatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                recordatorioMousePressed(evt);
            }
        });
        recordatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordatorioActionPerformed(evt);
            }
        });

        Justificacion.setBackground(new java.awt.Color(239, 238, 244));
        Justificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/feeedback.png"))); // NOI18N
        Justificacion.setText("  Justificación");
        Justificacion.setColorHover(new java.awt.Color(204, 204, 204));
        Justificacion.setColorNormal(new java.awt.Color(239, 238, 244));
        Justificacion.setColorPressed(new java.awt.Color(204, 204, 204));
        Justificacion.setColorTextHover(new java.awt.Color(0, 0, 0));
        Justificacion.setColorTextNormal(new java.awt.Color(0, 0, 0));
        Justificacion.setColorTextPressed(new java.awt.Color(128, 128, 131));
        Justificacion.setFocusPainted(false);
        Justificacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Justificacion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Justificacion.setIconTextGap(19);
        Justificacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JustificacionMousePressed(evt);
            }
        });
        Justificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JustificacionActionPerformed(evt);
            }
        });

        configuracion.setBackground(new java.awt.Color(239, 238, 244));
        configuracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/engranaje.png"))); // NOI18N
        configuracion.setText("  Configuracion ");
        configuracion.setColorHover(new java.awt.Color(204, 204, 204));
        configuracion.setColorNormal(new java.awt.Color(239, 238, 244));
        configuracion.setColorPressed(new java.awt.Color(204, 204, 204));
        configuracion.setColorTextHover(new java.awt.Color(0, 0, 0));
        configuracion.setColorTextNormal(new java.awt.Color(0, 0, 0));
        configuracion.setColorTextPressed(new java.awt.Color(128, 128, 131));
        configuracion.setFocusPainted(false);
        configuracion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        configuracion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        configuracion.setIconTextGap(19);
        configuracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                configuracionMousePressed(evt);
            }
        });
        configuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configuracionActionPerformed(evt);
            }
        });

        Escudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tarjeta-electronica.png"))); // NOI18N

        javax.swing.GroupLayout ContenedorMenuLayout = new javax.swing.GroupLayout(ContenedorMenu);
        ContenedorMenu.setLayout(ContenedorMenuLayout);
        ContenedorMenuLayout.setHorizontalGroup(
            ContenedorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContenedorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CerrarSecion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorMenuLayout.createSequentialGroup()
                        .addGroup(ContenedorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(historial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(recordatorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Justificacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(configuracion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(ContenedorMenuLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(Escudo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ContenedorMenuLayout.setVerticalGroup(
            ContenedorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorMenuLayout.createSequentialGroup()
                .addComponent(Escudo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(historial, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(recordatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Justificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(configuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(CerrarSecion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setEnabled(false);
        pnlPrincipal.setLayout(new javax.swing.BoxLayout(pnlPrincipal, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ContenedorMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ContenedorTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ContenedorTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContenedorMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(333, 333, 333))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        new CambiaPanel(pnlPrincipal,new paneles.inicio());
        if(this.inicio.isSelected()){
            this.inicio.setColorNormal(new Color(204,204,204));
            this.inicio.setColorHover(new Color(204,204,204));
            this.inicio.setColorPressed(new Color(204,204,204));

            this.historial.setColorNormal(new Color(239,238,244));
            this.historial.setColorHover(new Color(204,204,204));
            this.historial.setColorPressed(new Color(204,204,204));

            this.reporte.setColorNormal(new Color(239,238,244));
            this.reporte.setColorHover(new Color(204,204,204));
            this.reporte.setColorPressed(new Color(204,204,204));

            this.recordatorio.setColorNormal(new Color(239,238,244));
            this.recordatorio.setColorHover(new Color(204,204,204));
            this.recordatorio.setColorPressed(new Color(204,204,204));

            this.Justificacion.setColorNormal(new Color(239,238,244));
            this.Justificacion.setColorHover(new Color(204,204,204));
            this.Justificacion.setColorPressed(new Color(204,204,204));

            this.configuracion.setColorNormal(new Color(239,238,244));
            this.configuracion.setColorHover(new Color(204,204,204));
            this.configuracion.setColorPressed(new Color(204,204,204));

        }else{
            this.inicio.setColorNormal(new Color(239,238,244));
            this.inicio.setColorHover(new Color(204,204,204));
            this.inicio.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_inicioActionPerformed

    private void inicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioMousePressed
        this.inicio.setSelected(true);
        this.historial.setSelected(false);
        this.reporte.setSelected(false);
        this.recordatorio.setSelected(false);
        this.reporte.setSelected(false);
        this.configuracion.setSelected(false);

    }//GEN-LAST:event_inicioMousePressed

    private void recordatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordatorioActionPerformed
        new CambiaPanel(pnlPrincipal,new paneles.MenuSemanal());
        if(this.recordatorio.isSelected()){
            this.inicio.setColorNormal(new Color(239,238,244));
            this.inicio.setColorHover(new Color(204,204,204));
            this.inicio.setColorPressed(new Color(204,204,204));

            this.historial.setColorNormal(new Color(239,238,244));
            this.historial.setColorHover(new Color(204,204,204));
            this.historial.setColorPressed(new Color(204,204,204));

            this.reporte.setColorNormal(new Color(239,238,244));
            this.reporte.setColorHover(new Color(204,204,204));
            this.reporte.setColorPressed(new Color(204,204,204));

            this.recordatorio.setColorNormal(new Color(204,204,204));
            this.recordatorio.setColorHover(new Color(204,204,204));
            this.recordatorio.setColorPressed(new Color(204,204,204));

            this.Justificacion.setColorNormal(new Color(239,238,244));
            this.Justificacion.setColorHover(new Color(204,204,204));
            this.Justificacion.setColorPressed(new Color(204,204,204));

            this.configuracion.setColorNormal(new Color(239,238,244));
            this.configuracion.setColorHover(new Color(204,204,204));
            this.configuracion.setColorPressed(new Color(204,204,204));

        }else{
            this.recordatorio.setColorNormal(new Color(239,238,244));
            this.recordatorio.setColorHover(new Color(204,204,204));
            this.recordatorio.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_recordatorioActionPerformed

    private void recordatorioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recordatorioMousePressed
        this.inicio.setSelected(false);
        this.historial.setSelected(false);
        this.reporte.setSelected(false);
        this.recordatorio.setSelected(true);
        this.Justificacion.setSelected(true);
        this.configuracion.setSelected(false);

    }//GEN-LAST:event_recordatorioMousePressed

    private void reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteActionPerformed
        new CambiaPanel(pnlPrincipal, new paneles.reporte());
        if(this.reporte.isSelected()){
            this.reporte.setColorNormal(new Color(204,204,204));
            this.reporte.setColorHover(new Color(204,204,204));
            this.reporte.setColorPressed(new Color(204,204,204));

            this.inicio.setColorNormal(new Color(239,238,244));
            this.inicio.setColorHover(new Color(204,204,204));
            this.inicio.setColorPressed(new Color(204,204,204));

            this.historial.setColorNormal(new Color(239,238,244));
            this.historial.setColorHover(new Color(204,204,204));
            this.historial.setColorPressed(new Color(204,204,204));

            this.recordatorio.setColorNormal(new Color(239,238,244));
            this.recordatorio.setColorHover(new Color(204,204,204));
            this.recordatorio.setColorPressed(new Color(204,204,204));

            this.Justificacion.setColorNormal(new Color(239,238,244));
            this.Justificacion.setColorHover(new Color(204,204,204));
            this.Justificacion.setColorPressed(new Color(204,204,204));

            this.configuracion.setColorNormal(new Color(239,238,244));
            this.configuracion.setColorHover(new Color(204,204,204));
            this.configuracion.setColorPressed(new Color(204,204,204));

        }else{
            this.reporte.setColorNormal(new Color(239,238,244));
            this.reporte.setColorHover(new Color(204,204,204));
            this.reporte.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_reporteActionPerformed

    private void reporteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteMousePressed
        this.inicio.setSelected(false);
        this.historial.setSelected(false);
        this.reporte.setSelected(true);
        this.recordatorio.setSelected(false);
        this.Justificacion.setSelected(false);
        this.configuracion.setSelected(false);

    }//GEN-LAST:event_reporteMousePressed

    private void historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialActionPerformed
        new CambiaPanel(pnlPrincipal, new paneles.Productos());
        if(this.historial.isSelected()){
            this.historial.setColorNormal(new Color(204,204,204));
            this.historial.setColorHover(new Color(204,204,204));
            this.historial.setColorPressed(new Color(204,204,204));

            this.inicio.setColorNormal(new Color(239,238,244));
            this.inicio.setColorHover(new Color(204,204,204));
            this.inicio.setColorPressed(new Color(204,204,204));

            this.reporte.setColorNormal(new Color(239,238,244));
            this.reporte.setColorHover(new Color(204,204,204));
            this.reporte.setColorPressed(new Color(204,204,204));

            this.recordatorio.setColorNormal(new Color(239,238,244));
            this.recordatorio.setColorHover(new Color(204,204,204));
            this.recordatorio.setColorPressed(new Color(204,204,204));

            this.Justificacion.setColorNormal(new Color(239,238,244));
            this.Justificacion.setColorHover(new Color(204,204,204));
            this.Justificacion.setColorPressed(new Color(204,204,204));

            this.configuracion.setColorNormal(new Color(239,238,244));
            this.configuracion.setColorHover(new Color(204,204,204));
            this.configuracion.setColorPressed(new Color(204,204,204));

        }else{
            this.historial.setColorNormal(new Color(239,238,244));
            this.historial.setColorHover(new Color(204,204,204));
            this.historial.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_historialActionPerformed

    private void historialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historialMousePressed
        this.inicio.setSelected(false);
        this.historial.setSelected(true);
        this.reporte.setSelected(false);
        this.recordatorio.setSelected(false);
        this.Justificacion.setSelected(false);
        this.configuracion.setSelected(false);
    }//GEN-LAST:event_historialMousePressed

    private void JustificacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JustificacionMousePressed
        // TODO add your handling code here:
        this.inicio.setSelected(false);
        this.historial.setSelected(false);
        this.reporte.setSelected(false);
        this.recordatorio.setSelected(false);
        this.Justificacion.setSelected(true);
        this.configuracion.setSelected(false);

    }//GEN-LAST:event_JustificacionMousePressed

    private void JustificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JustificacionActionPerformed
        // TODO add your handling code here:
        
        if(this.Justificacion.isSelected()){

            this.Justificacion.setColorNormal(new Color(204,204,204));
            this.Justificacion.setColorHover(new Color(204,204,204));
            this.Justificacion.setColorPressed(new Color(204,204,204));

            this.historial.setColorNormal(new Color(239,238,244));
            this.historial.setColorHover(new Color(204,204,204));
            this.historial.setColorPressed(new Color(204,204,204));

            this.inicio.setColorNormal(new Color(239,238,244));
            this.inicio.setColorHover(new Color(204,204,204));
            this.inicio.setColorPressed(new Color(204,204,204));

            this.reporte.setColorNormal(new Color(239,238,244));
            this.reporte.setColorHover(new Color(204,204,204));
            this.reporte.setColorPressed(new Color(204,204,204));

            this.recordatorio.setColorNormal(new Color(239,238,244));
            this.recordatorio.setColorHover(new Color(204,204,204));
            this.recordatorio.setColorPressed(new Color(204,204,204));

            this.configuracion.setColorNormal(new Color(239,238,244));
            this.configuracion.setColorHover(new Color(204,204,204));
            this.configuracion.setColorPressed(new Color(204,204,204));

        }else{
            this.Justificacion.setColorNormal(new Color(239,238,244));
            this.Justificacion.setColorHover(new Color(204,204,204));
            this.Justificacion.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_JustificacionActionPerformed

    private void configuracionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_configuracionMousePressed
        // TODO add your handling code here:
        this.inicio.setSelected(false);
        this.historial.setSelected(false);
        this.reporte.setSelected(false);
        this.recordatorio.setSelected(false);
        this.Justificacion.setSelected(false);
        this.configuracion.setSelected(true);
    }//GEN-LAST:event_configuracionMousePressed

    private void configuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configuracionActionPerformed
        // TODO add your handling code here:
        new CambiaPanel(pnlPrincipal, new paneles.ConfiguracionAdmin());
        if(this.configuracion.isSelected()){

            this.configuracion.setColorNormal(new Color(204,204,204));
            this.configuracion.setColorHover(new Color(204,204,204));
            this.configuracion.setColorPressed(new Color(204,204,204));

            this.reporte.setColorNormal(new Color(239,238,244));
            this.reporte.setColorHover(new Color(204,204,204));
            this.reporte.setColorPressed(new Color(204,204,204));

            this.historial.setColorNormal(new Color(239,238,244));
            this.historial.setColorHover(new Color(204,204,204));
            this.historial.setColorPressed(new Color(204,204,204));

            this.inicio.setColorNormal(new Color(239,238,244));
            this.inicio.setColorHover(new Color(204,204,204));
            this.inicio.setColorPressed(new Color(204,204,204));

            this.recordatorio.setColorNormal(new Color(239,238,244));
            this.recordatorio.setColorHover(new Color(204,204,204));
            this.recordatorio.setColorPressed(new Color(204,204,204));

            this.Justificacion.setColorNormal(new Color(239,238,244));
            this.Justificacion.setColorHover(new Color(204,204,204));
            this.Justificacion.setColorPressed(new Color(204,204,204));

        }else{
            this.configuracion.setColorNormal(new Color(239,238,244));
            this.configuracion.setColorHover(new Color(204,204,204));
            this.configuracion.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_configuracionActionPerformed

    private void CerrarSecionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSecionActionPerformed
        // TODO add your handling code here:
        loginn newFrame = new loginn();
        newFrame.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_CerrarSecionActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        /*
        point = evt.getPoint();
        getComponentAt(point);
        */
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
         /*
        int CurrentX = this.getLocation().x;
        int Currenty = this.getLocation().y;
        
        int MoveX = ( CurrentX + evt.getX() - (CurrentX + point.x));
        int MoveY = ( Currenty + evt.getY() - (Currenty + point.y));
        
        int x = CurrentX + MoveX;
        int y = Currenty + MoveY;  
        
        this.setLocation(x,y);
        */
    }//GEN-LAST:event_formMousePressed

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
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarSecion;
    private javax.swing.JPanel ContenedorMenu;
    private javax.swing.JPanel ContenedorTitulo;
    private javax.swing.JLabel Escudo;
    private rsbuttom.RSButtonMetro Justificacion;
    private javax.swing.JLabel TituloPrincipal;
    private rsbuttom.RSButtonMetro configuracion;
    private rsbuttom.RSButtonMetro historial;
    private rsbuttom.RSButtonMetro inicio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel pnlPrincipal;
    private rsbuttom.RSButtonMetro recordatorio;
    private rsbuttom.RSButtonMetro reporte;
    // End of variables declaration//GEN-END:variables

    
}
