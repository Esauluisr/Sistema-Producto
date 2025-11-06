package paneles;

import Conexion.conexion;
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import static paneles.inicio.ProgressBar;
import static paneles.inicio.pb;

public class reporte extends javax.swing.JPanel {
    //private static final Logger log=Logger.getLogger(CambiaPanel.class);

    private DefaultTableModel dtm;
    private Object[] o = new Object[6];

    private TableRowSorter<DefaultTableModel> sorter;

    Calendar fechaactual = new GregorianCalendar();
    Calendar fechaactuall = new GregorianCalendar();

    public reporte() {
        initComponents();

        setBackground(new Color(0, 0, 0, 0));
        TablaEmpleados.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        TablaEmpleados.getTableHeader().setOpaque(false);
        //TablaReloj.getTableHeader().setBackground(new Color(32, 136, 203));
        //TablaReloj.getTableHeader().setForeground(new Color(255,255,255));
        TablaEmpleados.setRowHeight(25);

        fechafinal.setCalendar(fechaactual);
        fechainicio.setCalendar(fechaactual);
        dtm = (DefaultTableModel) TablaEmpleados.getModel();

        mostrarReporte();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        ContenedorTitulo = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        FechaInicio = new javax.swing.JLabel();
        FechaFinal = new javax.swing.JLabel();
        fechainicio = new com.toedter.calendar.JDateChooser();
        BuscarHistorial = new javax.swing.JButton();
        TituloDeLaTabla = new javax.swing.JTabbedPane();
        ContenedorTablaEmpleados = new javax.swing.JPanel();
        ScrollTablaEmpleados = new javax.swing.JScrollPane();
        TablaEmpleados = new javax.swing.JTable();
        NombreEmpleado = new javax.swing.JLabel();
        ContenedorNombre = new javax.swing.JTextField();
        GenerarReporteIndividual = new javax.swing.JButton();
        GenerarReportes = new javax.swing.JButton();
        ProgressBar = new javax.swing.JProgressBar();
        fechafinal = new com.toedter.calendar.JDateChooser();
        GenerarReportesDetalle = new javax.swing.JButton();
        GenerarReportesPorEmpleado = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        ContenedorTitulo.setBackground(new java.awt.Color(255, 255, 255));
        ContenedorTitulo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Titulo.setFont(new java.awt.Font("NSimSun", 1, 24)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Reporte");

        javax.swing.GroupLayout ContenedorTituloLayout = new javax.swing.GroupLayout(ContenedorTitulo);
        ContenedorTitulo.setLayout(ContenedorTituloLayout);
        ContenedorTituloLayout.setHorizontalGroup(
            ContenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorTituloLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ContenedorTituloLayout.setVerticalGroup(
            ContenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        FechaInicio.setFont(new java.awt.Font("NSimSun", 1, 14)); // NOI18N
        FechaInicio.setText("Fecha Inicial");

        FechaFinal.setFont(new java.awt.Font("NSimSun", 1, 14)); // NOI18N
        FechaFinal.setText("Fecha Final");

        BuscarHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        BuscarHistorial.setText("Buscar");
        BuscarHistorial.setFocusPainted(false);
        BuscarHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarHistorialActionPerformed(evt);
            }
        });

        ContenedorTablaEmpleados.setBackground(new java.awt.Color(255, 255, 255));

        TablaEmpleados = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };
        TablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre  Del Empleado", "Fecha", "Puesto", "Estado", "1°Incidencia", "2°Incidencia", "Reporte"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaEmpleadosMouseClicked(evt);
            }
        });
        ScrollTablaEmpleados.setViewportView(TablaEmpleados);
        if (TablaEmpleados.getColumnModel().getColumnCount() > 0) {
            TablaEmpleados.getColumnModel().getColumn(0).setResizable(false);
            TablaEmpleados.getColumnModel().getColumn(1).setResizable(false);
            TablaEmpleados.getColumnModel().getColumn(2).setResizable(false);
            TablaEmpleados.getColumnModel().getColumn(3).setResizable(false);
            TablaEmpleados.getColumnModel().getColumn(4).setResizable(false);
            TablaEmpleados.getColumnModel().getColumn(5).setResizable(false);
            TablaEmpleados.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout ContenedorTablaEmpleadosLayout = new javax.swing.GroupLayout(ContenedorTablaEmpleados);
        ContenedorTablaEmpleados.setLayout(ContenedorTablaEmpleadosLayout);
        ContenedorTablaEmpleadosLayout.setHorizontalGroup(
            ContenedorTablaEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollTablaEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 1112, Short.MAX_VALUE)
        );
        ContenedorTablaEmpleadosLayout.setVerticalGroup(
            ContenedorTablaEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollTablaEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
        );

        TituloDeLaTabla.addTab("Reporte", ContenedorTablaEmpleados);

        NombreEmpleado.setFont(new java.awt.Font("NSimSun", 1, 14)); // NOI18N
        NombreEmpleado.setText("Nombre del Empleado ");

        ContenedorNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ContenedorNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContenedorNombreMouseClicked(evt);
            }
        });
        ContenedorNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ContenedorNombreKeyTyped(evt);
            }
        });

        GenerarReporteIndividual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/report-empleado.png"))); // NOI18N
        GenerarReporteIndividual.setText("R.Individual");
        GenerarReporteIndividual.setFocusPainted(false);
        GenerarReporteIndividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarReporteIndividualActionPerformed(evt);
            }
        });

        GenerarReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/portapapeles.png"))); // NOI18N
        GenerarReportes.setText("R.General");
        GenerarReportes.setFocusPainted(false);
        GenerarReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarReportesActionPerformed(evt);
            }
        });

        ProgressBar.setBackground(new java.awt.Color(204, 204, 204));
        ProgressBar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        ProgressBar.setForeground(new java.awt.Color(102, 153, 255));
        ProgressBar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ProgressBar.setRequestFocusEnabled(false);
        ProgressBar.setStringPainted(true);

        GenerarReportesDetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/grafico.png"))); // NOI18N
        GenerarReportesDetalle.setText("D.General");
        GenerarReportesDetalle.setFocusPainted(false);
        GenerarReportesDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarReportesDetalleActionPerformed(evt);
            }
        });

        GenerarReportesPorEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte.png"))); // NOI18N
        GenerarReportesPorEmpleado.setText("D.Individual");
        GenerarReportesPorEmpleado.setFocusPainted(false);
        GenerarReportesPorEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarReportesPorEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TituloDeLaTabla, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ProgressBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(NombreEmpleado)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(ContenedorNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(GenerarReporteIndividual)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GenerarReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GenerarReportesPorEmpleado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GenerarReportesDetalle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fechainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(fechafinal, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BuscarHistorial))
                            .addComponent(FechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FechaInicio)
                        .addComponent(FechaFinal))
                    .addComponent(NombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ContenedorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(GenerarReporteIndividual)
                        .addComponent(GenerarReportes)
                        .addComponent(GenerarReportesPorEmpleado)
                        .addComponent(GenerarReportesDetalle))
                    .addComponent(BuscarHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechainicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechafinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(TituloDeLaTabla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ContenedorTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(ContenedorTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public static void pb() {

        Thread hilos;

        hilos = new Thread() {
            public void run() {

                for (int b = 0; b <= 100; b++) {
                    try {
                        ProgressBar.setValue(b);
                        Thread.sleep(15);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(reporte.class.getName()).log(Level.SEVERE, null, ex);

                    }

                }
            }

        };

        hilos.start();

    }

    private void GenerarReporte(String nombre) {
        conexion conn = new conexion();
        Connection con = conn.Conectar();

        SimpleDateFormat df = new SimpleDateFormat("d/MM/yyyy");
        String Date1 = df.format(fechainicio.getDate());
        String Date2 = df.format(fechafinal.getDate());
        PreparedStatement sr = null, ps = null;
        int valor = 0;

        Map<String, Object> parametros = new HashMap<>();
        parametros.put("Nombre", nombre);
        parametros.put("Fecha1", String.valueOf(Date1));
        parametros.put("Fecha2", String.valueOf(Date2));

        String path = "src\\reportes\\Reporte.jasper";
        JasperReport jr = null;
        try {
            sr = con.prepareStatement("update incidencias_semestre set Justificación='Reporte' where Nombre COLLATE utf8_general_ci LIKE concat(?,'%') \n"
                    + "and (Justificación is null or Justificación = 'Reporte')\n"
                    + "and ((P_Incidencia != 'Normal'and P_Incidencia !='NT' and S_Incidencia != 'Normal' ) or ((S_Incidencia = 'Normal' or S_Incidencia is null) \n"
                    + "and P_Incidencia != 'Normal'and P_Incidencia !='NT') or ((P_Incidencia = 'Normal' or P_Incidencia ='NT') and S_Incidencia != 'Normal' )) \n"
                    + "and Fecha between str_to_date(?,'%d/%m/%Y') and str_to_date(?,'%d/%m/%Y');");
            sr.setString(2, Date1);
            sr.setString(3, Date2);
            sr.setString(1, nombre);
            sr.execute();

        } catch (SQLException ex) {
            //System.err.println(ex.toString());
        }
        try {
            ps = con.prepareStatement("SELECT \n"
                    + "count(nombre) as contador\n"
                    + "FROM incidencias_semestre\n"
                    + "LEFT JOIN horario_semestre e ON idEmpleado = id_Empleado\n"
                    + "where Nombre COLLATE utf8_general_ci LIKE concat(?,'%') and (Justificación is null or Justificación = 'Reporte')and ((P_Incidencia != 'Normal'and P_Incidencia !='NT' and S_Incidencia != 'Normal' ) or ((S_Incidencia = 'Normal' or S_Incidencia is null) and P_Incidencia != 'Normal'and P_Incidencia !='NT') or ((P_Incidencia = 'Normal' or P_Incidencia ='NT') and S_Incidencia != 'Normal' )) and Fecha between str_to_date(?,'%d/%m/%Y') and str_to_date(?,'%d/%m/%Y');");
            ps.setString(1, nombre);
            ps.setString(2, Date1);
            ps.setString(3, Date2);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                valor = rs.getInt("contador");
            }
        } catch (SQLException ex) {
            //System.err.println(ex.toString());
        }
        try {

            //SubirReporte();
            jr = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, conn.Conectar());
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setTitle(path);
            jv.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

            // Crea un temporizador con un retraso de 2 segundos (2000 milisegundos)
            if (valor != 0) {

                pb();
                Timer timer = new Timer(2000, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Esta parte del código se ejecutará después de 2 segundos

                        jv.setVisible(true);
                    }
                });

                // Inicia el temporizador
                timer.setRepeats(false); // Esto evita que el temporizador se repita
                timer.start();
            }

        } catch (JRException ex) {

            java.util.logging.Logger.getLogger(reporte.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    private void BuscarHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarHistorialActionPerformed
        // TODO add your handling code here:
        try {

            TablaEmpleados.setModel(new DefaultTableModel(null, new Object[]{"Nombre Del Empleado", "Fecha", "Puesto", "Estado", "1°Incidencia", "2°Incidencia", "Reporte"}));
            SimpleDateFormat df = new SimpleDateFormat("d/M/Y");
            String date1 = df.format(fechainicio.getDate());
            String date2 = df.format(fechafinal.getDate());

            showData(date1, date2);

            // 
            TableColumn columnaNombre = TablaEmpleados.getColumnModel().getColumn(0);
            TableColumn columnaFecha = TablaEmpleados.getColumnModel().getColumn(1);
            TableColumn columnaPuesto = TablaEmpleados.getColumnModel().getColumn(2);

            columnaNombre.setPreferredWidth(150);
            columnaFecha.setPreferredWidth(50);
            columnaPuesto.setPreferredWidth(250);

        } catch (Exception e) {

        }
    }//GEN-LAST:event_BuscarHistorialActionPerformed

    private void ContenedorNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ContenedorNombreKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isLetter(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_ENTER && c != KeyEvent.VK_SPACE) {
            evt.consume(); // Esto evita que el carácter ingresado se muestre en el campo de texto

            // Muestra el mensaje de alerta
            JOptionPane.showMessageDialog(null, "Ingrese solo texto", "Error de caractér", JOptionPane.ERROR_MESSAGE);
        }

        String palabra = ContenedorNombre.getText();
        if (palabra.length() > 0) {
            char primeraletra = palabra.charAt(0);
            palabra = Character.toUpperCase(primeraletra) + palabra.substring(1, palabra.length());
            ContenedorNombre.setText(palabra);
        }
    }//GEN-LAST:event_ContenedorNombreKeyTyped

    private void GenerarReporteIndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarReporteIndividualActionPerformed
        String nombre = ContenedorNombre.getText();
        if (nombre.equals("")) {
            JOptionPane.showMessageDialog(null, "No se encuentra ningun nombre de empleado", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            GenerarReporte(nombre);

        }

        mostrarReporte();

    }//GEN-LAST:event_GenerarReporteIndividualActionPerformed

    private void GenerarReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarReportesActionPerformed

        GenerarReporte("");
        mostrarReporte();
    }//GEN-LAST:event_GenerarReportesActionPerformed
    private void GenerarReporteDeDetalles(String parametro) {

        conexion conn = new conexion();
        Connection con = conn.Conectar();

        SimpleDateFormat df = new SimpleDateFormat("d/MM/yyyy");
        String Date1 = df.format(fechainicio.getDate());
        String Date2 = df.format(fechafinal.getDate());
        String nombre = ContenedorNombre.getText();
        String path = "";
        PreparedStatement sr = null, ps = null;
        int valor = 0;

        Map<String, Object> parametros = new HashMap<>();

        parametros.put("Nombres", nombre);
        parametros.put("Fecha1", String.valueOf(Date1));
        parametros.put("Fecha2", String.valueOf(Date2));
        path = "src\\reportes\\" + parametro + ".jasper";
        JasperReport jr = null;
        if (parametro == "ReporteDetallesPorFecha") {
            parametros.put("Nombres", "");
        }
        if (parametro == "ReporteDetallesPorFechaYNombre") {
            JFrame frame = new JFrame("Cuadro de Diálogo de Elección");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            int respuesta = JOptionPane.showConfirmDialog(frame, "¿Desea imprimir una hoja por empleado?", "", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                path = "src\\reportes\\ReporteEmpleadoPorHoja.jasper";
            } else if (respuesta == JOptionPane.NO_OPTION) {
                path = "src\\reportes\\" + parametro + ".jasper";
            }
        }

        try {
            ps = con.prepareStatement("SELECT \n"
                    + "    count(nombre) as contador\n"
                    + "FROM (\n"
                    + "    SELECT \n"
                    + "        CASE \n"
                    + "            WHEN  ?= '' THEN nombre\n"
                    + "            WHEN ? != '' AND nombre COLLATE utf8_general_ci LIKE concat(?, '%') THEN nombre\n"
                    + "        END AS nombre, Fecha, Puesto, p_incidencia, S_incidencia, Justificación\n"
                    + "    FROM incidencias_semestre\n"
                    + "    LEFT JOIN horario_semestre e ON idEmpleado = id_Empleado\n"
                    + "    WHERE (justificación IS NULL OR justificación = 'Reporte') \n"
                    + "        AND ((P_Incidencia != 'Normal'and P_Incidencia !='NT' and S_Incidencia != 'Normal' ) or ((S_Incidencia = 'Normal' or S_Incidencia is null) and P_Incidencia != 'Normal'and P_Incidencia !='NT') or ((P_Incidencia = 'Normal' or P_Incidencia ='NT') and S_Incidencia != 'Normal' ))\n"
                    + "        AND (Fecha BETWEEN str_to_date(?, '%d/%m/%Y') AND str_to_date(?, '%d/%m/%Y'))\n"
                    + ") AS Subconsulta\n"
                    + "WHERE nombre IS NOT NULL;");
            ps.setString(1, nombre);
            ps.setString(2, nombre);
            ps.setString(3, nombre);
            ps.setString(4, Date1);
            ps.setString(5, Date2);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                valor = rs.getInt("contador");
            }
        } catch (SQLException ex) {
            //System.err.println(ex.toString());
        }
        try {

            //SubirReporte();
            jr = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, conn.Conectar());
            JasperViewer jv = new JasperViewer(jp, false);

            jv.setTitle(path);
            //JasperViewer view= new JasperViewer(jp,false);
            jv.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            if (valor != 0) {
                pb();
                // Crea un temporizador con un retraso de 2 segundos (2000 milisegundos)
                Timer timer = new Timer(3000, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Esta parte del código se ejecutará después de 2 segundos
                        jv.setVisible(true);
                    }
                });

                // Inicia el temporizador
                timer.setRepeats(false); // Esto evita que el temporizador se repita
                timer.start();
            }
        } catch (JRException ex) {

            java.util.logging.Logger.getLogger(reporte.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void GenerarReportesDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarReportesDetalleActionPerformed

        GenerarReporteDeDetalles("ReporteDetallesPorFecha");

    }//GEN-LAST:event_GenerarReportesDetalleActionPerformed

    private void TablaEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaEmpleadosMouseClicked
        if (evt.getClickCount() == 2) {

            if (TablaEmpleados.getSelectedRow() != -1) { // Verifica si se seleccionó alguna fila setSelectedItem(
                int fila = TablaEmpleados.getSelectedRow();
                String n = (TablaEmpleados.getValueAt(fila, 0).toString());
                ContenedorNombre.setText(n);

            } else {
                JOptionPane.showMessageDialog(null, "No ha seleccionado ningun usuario ", "Error ", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_TablaEmpleadosMouseClicked

    private void GenerarReportesPorEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarReportesPorEmpleadoActionPerformed
        GenerarReporteDeDetalles("ReporteDetallesPorFechaYNombre");

    }//GEN-LAST:event_GenerarReportesPorEmpleadoActionPerformed

    private void ContenedorNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContenedorNombreMouseClicked
        if (evt.getClickCount() == 2) {
            ContenedorNombre.setText("");

        }
    }//GEN-LAST:event_ContenedorNombreMouseClicked

    public void mostrarReporte() {
        showData("", "");
    }

    public void showData(String d1, String d2) {
        conexion conn = new conexion();
        Connection con = conn.Conectar();
        PreparedStatement st = null;
        ResultSet rs = null;
        String nombre = ContenedorNombre.getText();

        try {

            if (d1.equals("") || d2.equals("")) {
                st = con.prepareStatement(" SELECT nombre,DATE_FORMAT(Fecha, '%d/%m/%Y'),puesto,estado,p_incidencia,S_incidencia,CASE WHEN Justificación = 'Reporte' THEN '✔' ELSE null END AS Reporte from incidencias_semestre \n"
                        + "                    left join horario_semestre e on nombre_empleado = Nombre\n"
                        + "                    where (Justificación is null or Justificación='Reporte') and ((P_Incidencia != 'Normal'and P_Incidencia !='NT' and S_Incidencia != 'Normal' ) or ((S_Incidencia = 'Normal' or S_Incidencia is null) and P_Incidencia != 'Normal'and P_Incidencia !='NT') or ((P_Incidencia = 'Normal' or P_Incidencia ='NT') and S_Incidencia != 'Normal' ));");

                TablaEmpleados.setModel(new DefaultTableModel(null, new Object[]{"Nombre Empleado", "Fecha", "Puesto", "Estado", "1°Incidencia", "2°Incidencia", "Reporte"}));
                SimpleDateFormat df = new SimpleDateFormat("d/MM/yyyy");
                String date1 = df.format(fechainicio.getDate());
                String date2 = df.format(fechafinal.getDate());

                showData(date1, date2);

            } else {
                //st = con.prepareStatement("select distinct * from incidencias_semestre WHERE fecha between ? AND ?");

                st = con.prepareStatement("SELECT nombre, DATE_FORMAT(Fecha, '%d/%m/%Y'), puesto, estado, p_incidencia, S_incidencia, CASE WHEN Justificación = 'Reporte' THEN '✔' ELSE NULL END AS reporte \n"
                        + "FROM incidencias_semestre \n"
                        + "LEFT JOIN horario_semestre e ON nombre_empleado = Nombre\n"
                        + "WHERE (Justificación IS NULL OR Justificación = 'Reporte') \n"
                        + "AND (\n"
                        + "  (P_Incidencia != 'Normal' AND P_Incidencia != 'NT' AND S_Incidencia != 'Normal') \n"
                        + "  OR \n"
                        + "  ((S_Incidencia = 'Normal' OR S_Incidencia IS NULL) AND P_Incidencia != 'Normal' AND P_Incidencia != 'NT') \n"
                        + "  OR \n"
                        + "  ((P_Incidencia = 'Normal' OR P_Incidencia = 'NT') AND S_Incidencia != 'Normal')\n"
                        + ") \n"
                        + "AND Fecha BETWEEN STR_TO_DATE(?, '%d/%m/%Y') AND STR_TO_DATE(?, '%d/%m/%Y') \n"
                        + "AND Nombre COLLATE utf8_general_ci LIKE CONCAT(?, '%');");

                st.setString(1, d1);
                st.setString(2, d2);
                st.setString(3, nombre);
                //System.out.print(d1);
                //System.out.print(d2);
                //System.out.print(nombre);

            }

            rs = st.executeQuery();
            DefaultTableModel model = (DefaultTableModel) TablaEmpleados.getModel();

            Object[] row;

            while (rs.next()) {
                row = new Object[7];
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);

                model.addRow(row);
            }
            
            /* Se da tamaño al a las columas del Jtable*/
            TableColumn columnaNombre = TablaEmpleados.getColumnModel().getColumn(0);
            TableColumn columnaFecha = TablaEmpleados.getColumnModel().getColumn(1);
            TableColumn columnaPuesto = TablaEmpleados.getColumnModel().getColumn(2);

            columnaNombre.setPreferredWidth(200);
            columnaFecha.setPreferredWidth(50);
            columnaPuesto.setPreferredWidth(250);
            

        } catch (Exception e) {
            //System.out.println(e.getMessage());
        } finally {
            try {
                // Cerrar ResultSet, PreparedStatement y Connection en el orden adecuado
                if (st != null) {
                    st.close();
                }
                if (rs != null) {
                    rs.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void MostrarReporte() {

        conexion conn = new conexion();
        Connection con = conn.Conectar();
        PreparedStatement st = null;
        ResultSet rs = null;

        try {

            st = con.prepareStatement("SELECT nombre,fecha,puesto,estado,p_incidencia,S_incidencia,CASE WHEN Justificación = 'Reporte' THEN '✔' ELSE null END AS reporte from incidencias_semestre \n"
                    + "                    left join horario_semestre e on nombre_empleado = Nombre\n"
                    + "                    where (Justificación is null or Justificación='Reporte') and ((P_Incidencia != 'Normal'and P_Incidencia !='NT' and S_Incidencia != 'Normal' ) or ((S_Incidencia = 'Normal' or S_Incidencia is null) and P_Incidencia != 'Normal'and P_Incidencia !='NT') or ((P_Incidencia = 'Normal' or P_Incidencia ='NT') and S_Incidencia != 'Normal' ));");

            rs = st.executeQuery();
            DefaultTableModel model = (DefaultTableModel) TablaEmpleados.getModel();
            TablaEmpleados.setModel(model);
            TablaEmpleados.setAutoCreateRowSorter(true);
            sorter = new TableRowSorter<>(model);
            TablaEmpleados.setRowSorter(sorter);

            Object[] row;

            while (rs.next()) {
                row = new Object[7];
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);

                model.addRow(row);
            } 
        } catch (Exception e) {
            //System.out.println(e.getMessage());
        } finally {
            try {
                // Cerrar ResultSet, PreparedStatement y Connection en el orden adecuado
                if (st != null) {
                    st.close();
                }
                if (rs != null) {
                    rs.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarHistorial;
    private javax.swing.JTextField ContenedorNombre;
    private javax.swing.JPanel ContenedorTablaEmpleados;
    private javax.swing.JPanel ContenedorTitulo;
    private javax.swing.JLabel FechaFinal;
    private javax.swing.JLabel FechaInicio;
    private javax.swing.JButton GenerarReporteIndividual;
    private javax.swing.JButton GenerarReportes;
    private javax.swing.JButton GenerarReportesDetalle;
    private javax.swing.JButton GenerarReportesPorEmpleado;
    private javax.swing.JLabel NombreEmpleado;
    public static javax.swing.JProgressBar ProgressBar;
    private javax.swing.JScrollPane ScrollTablaEmpleados;
    private javax.swing.JTable TablaEmpleados;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTabbedPane TituloDeLaTabla;
    private com.toedter.calendar.JDateChooser fechafinal;
    private com.toedter.calendar.JDateChooser fechainicio;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
