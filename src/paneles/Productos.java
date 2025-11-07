package paneles;

import Conexion.conexion;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;

public final class Productos extends javax.swing.JPanel {

    /**
     * Creates new form historial
     */
    private TableRowSorter<DefaultTableModel> sorter;

    private String archivo;

    Calendar fechaactual = new GregorianCalendar();

    public Productos() {
        initComponents();

        setBackground(new Color(0, 0, 0, 0));
        TablaProductos.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        TablaProductos.getTableHeader().setOpaque(false);
        TablaProductos.setRowHeight(25);

        //setVisible(true);
        fechainicio.setCalendar(fechaactual);
        fechafinal.setCalendar(fechaactual);
        mostrarDatos();
        //MostarDaReportetos();
        //Data("", "");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        ContenedorTitulo = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        FechaInicio = new javax.swing.JLabel();
        fechainicio = new com.toedter.calendar.JDateChooser();
        FechaFinal = new javax.swing.JLabel();
        fechafinal = new com.toedter.calendar.JDateChooser();
        BuscarHistorial = new javax.swing.JButton();
        TituloDeLaTabla = new javax.swing.JTabbedPane();
        ContenedorTablaEmpleados = new javax.swing.JPanel();
        ScrollTablaEmpleado = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        NombreEmpleado = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        Titulo23 = new javax.swing.JLabel();
        ProductoIva = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        ContenedorTitulo.setBackground(new java.awt.Color(255, 255, 255));
        ContenedorTitulo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Titulo.setFont(new java.awt.Font("NSimSun", 1, 24)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Productos");

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
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        FechaInicio.setFont(new java.awt.Font("NSimSun", 1, 14)); // NOI18N
        FechaInicio.setText("Fecha de Inicio");

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

        TablaProductos = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };
        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaProductosMouseClicked(evt);
            }
        });
        ScrollTablaEmpleado.setViewportView(TablaProductos);

        javax.swing.GroupLayout ContenedorTablaEmpleadosLayout = new javax.swing.GroupLayout(ContenedorTablaEmpleados);
        ContenedorTablaEmpleados.setLayout(ContenedorTablaEmpleadosLayout);
        ContenedorTablaEmpleadosLayout.setHorizontalGroup(
            ContenedorTablaEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollTablaEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 1113, Short.MAX_VALUE)
        );
        ContenedorTablaEmpleadosLayout.setVerticalGroup(
            ContenedorTablaEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollTablaEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );

        TituloDeLaTabla.addTab("Productos Del catalogo", ContenedorTablaEmpleados);

        NombreEmpleado.setFont(new java.awt.Font("NSimSun", 1, 14)); // NOI18N
        NombreEmpleado.setText("  Nombre Del Producto: ");

        nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreMouseClicked(evt);
            }
        });
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });

        Titulo23.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        Titulo23.setText("Producto Iva:");

        ProductoIva.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ProductoIva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Producto Sin Iva", "Producto Con Iva" }));
        ProductoIva.setToolTipText("");
        ProductoIva.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ProductoIva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductoIvaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(NombreEmpleado)
                        .addGap(12, 12, 12)
                        .addComponent(nombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(fechainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fechafinal, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(FechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BuscarHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Titulo23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ProductoIva, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TituloDeLaTabla))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FechaInicio)
                    .addComponent(FechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BuscarHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Titulo23)
                        .addComponent(ProductoIva))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fechainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(fechafinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(TituloDeLaTabla)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ContenedorTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(ContenedorTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarHistorialActionPerformed
        // TODO add your handling code here:
        try {
            DiseñoTabla();
            SimpleDateFormat df = new SimpleDateFormat("d/MM/yyyy");
            String date1 = df.format(fechainicio.getDate());
            String date2 = df.format(fechafinal.getDate());

            Data(date1, date2);

        } catch (Exception e) {

        }
    }//GEN-LAST:event_BuscarHistorialActionPerformed
    //filtra las teclas que puede utilizar el usuario
    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isLetter(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_ENTER && c != KeyEvent.VK_SPACE) {
            evt.consume(); // Esto evita que el carácter ingresado se muestre en el campo de texto

            // Muestra el mensaje de alerta
            JOptionPane.showMessageDialog(null, "Ingrese solo texto", "Error de caractér", JOptionPane.ERROR_MESSAGE);
        }

        String palabra = nombre.getText();
        if (palabra.length() > 0) {
            char primeraletra = palabra.charAt(0);
            palabra = Character.toUpperCase(primeraletra) + palabra.substring(1, palabra.length());
            nombre.setText(palabra);
        }

    }//GEN-LAST:event_nombreKeyTyped

    private void TablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProductosMouseClicked
        if (evt.getClickCount() == 2) {

            if (TablaProductos.getSelectedRow() != -1) { // Verifica si se seleccionó alguna fila setSelectedItem(
                int fila = TablaProductos.getSelectedRow();
                String n = (TablaProductos.getValueAt(fila, 2).toString());
                nombre.setText(n);

            } else {
                JOptionPane.showMessageDialog(null, "No ha seleccionado ningun usuario ", "Error ", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_TablaProductosMouseClicked

    private void nombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMouseClicked
        if (evt.getClickCount() == 2) {
            nombre.setText("");
        }
    }//GEN-LAST:event_nombreMouseClicked

    private void ProductoIvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductoIvaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductoIvaActionPerformed
    

    public void mostrarDatos() {
        Data("", "");
    }
    
    //filtra la tabla del incidencias_semestre
    public void Data(String d1, String d2) {
        conexion conn = new conexion();
        Connection con = conn.Conectar();
        PreparedStatement st = null;
        ResultSet rs = null;
        String Nombre = nombre.getText();
        

        try {

            if (d1.equals("") || d2.equals("")) {
                st = con.prepareStatement("SELECT id_producto,partida,rubro,unidad_medida,descripcion,marca,cantidad,precio,observacion FROM PRODUCTOS");
                DiseñoTabla();
                SimpleDateFormat df = new SimpleDateFormat("d/MM/yyy");
                String date1 = df.format(fechainicio.getDate());
                String date2 = df.format(fechafinal.getDate());
                //filtrar();
                Data(date1, date2);

            }

            rs = st.executeQuery();
            DefaultTableModel model = (DefaultTableModel) TablaProductos.getModel();

            //filtrar();
            Object[] row;

            while (rs.next()) {
                row = new Object[8];
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);

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
    
    
    public void DiseñoTabla(){
       
        DefaultTableModel modelo = new DefaultTableModel();
        TablaProductos.setModel(modelo);
        TablaProductos.setAutoCreateRowSorter(true);

        sorter = new TableRowSorter<>(modelo);
        TablaProductos.setRowSorter(sorter);

        modelo.addColumn("ID");
        modelo.addColumn("Partida");
        modelo.addColumn("Rubro");
        modelo.addColumn("Unida Medida");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Marca");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        modelo.addColumn("Descripcion");

        /* Se da tamaño al a las columas del Jtable*/
        TableColumn id = TablaProductos.getColumnModel().getColumn(0);
        TableColumn partida = TablaProductos.getColumnModel().getColumn(1);
        TableColumn rubro = TablaProductos.getColumnModel().getColumn(2);
        TableColumn UnidadMedida = TablaProductos.getColumnModel().getColumn(3);
        TableColumn Descripcion = TablaProductos.getColumnModel().getColumn(4);
        TableColumn Marca = TablaProductos.getColumnModel().getColumn(5);
        TableColumn Cantidad = TablaProductos.getColumnModel().getColumn(6);
        TableColumn Precio = TablaProductos.getColumnModel().getColumn(7);

        id.setPreferredWidth(5);
        partida.setPreferredWidth(5);
        rubro.setPreferredWidth(5);
        UnidadMedida.setPreferredWidth(15);
        Descripcion.setPreferredWidth(200);
        Marca.setPreferredWidth(20);
        Cantidad.setPreferredWidth(20);
        Precio.setPreferredWidth(20);

        /* centrar datos */
        DefaultTableCellRenderer ColumCenter = new DefaultTableCellRenderer();
        ColumCenter.setHorizontalAlignment(SwingConstants.CENTER);
        TablaProductos.getColumnModel().getColumn(3).setCellRenderer(ColumCenter);
    }

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarHistorial;
    private javax.swing.JPanel ContenedorTablaEmpleados;
    private javax.swing.JPanel ContenedorTitulo;
    private javax.swing.JLabel FechaFinal;
    private javax.swing.JLabel FechaInicio;
    private javax.swing.JLabel NombreEmpleado;
    private javax.swing.JComboBox<String> ProductoIva;
    private javax.swing.JScrollPane ScrollTablaEmpleado;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo23;
    private javax.swing.JTabbedPane TituloDeLaTabla;
    private com.toedter.calendar.JDateChooser fechafinal;
    private com.toedter.calendar.JDateChooser fechainicio;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField nombre;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
