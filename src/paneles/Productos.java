package paneles;

import Conexion.conexion;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
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
        mostrarDatosCarnes();
        mostrarDatosEmbutidos();
        mostrarDatosFrutasVerduras();
        mostrarDatosLacteos();
        mostrarDatosMinsa();

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
        Buscar = new javax.swing.JButton();
        PANADERIA = new javax.swing.JTabbedPane();
        ContenedorTablaEmpleados = new javax.swing.JPanel();
        ScrollTablaEmpleado = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCarnes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaEmbutidos = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaFrutasVerduras = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaLacteos = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablaMinsa = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
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

        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        Buscar.setText("Buscar");
        Buscar.setFocusPainted(false);
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
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

        PANADERIA.addTab("ABARROTE", ContenedorTablaEmpleados);

        TablaCarnes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaCarnes);

        PANADERIA.addTab("CARNE", jScrollPane1);

        TablaEmbutidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TablaEmbutidos);

        PANADERIA.addTab("EMBUTIDOS", jScrollPane2);

        TablaFrutasVerduras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(TablaFrutasVerduras);

        PANADERIA.addTab("FRUTAS Y VERDURAS", jScrollPane3);

        TablaLacteos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(TablaLacteos);

        PANADERIA.addTab("LACTEOS", jScrollPane4);

        TablaMinsa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(TablaMinsa);

        PANADERIA.addTab("MINSA", jScrollPane5);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(jTable6);

        PANADERIA.addTab("PAN", jScrollPane6);

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(jTable7);

        PANADERIA.addTab("PANADERIA", jScrollPane7);

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(jTable8);

        PANADERIA.addTab("PESCADO", jScrollPane8);

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane9.setViewportView(jTable9);

        PANADERIA.addTab("POLLO", jScrollPane9);

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane10.setViewportView(jTable10);

        PANADERIA.addTab("SECOS", jScrollPane10);

        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane11.setViewportView(jTable11);

        PANADERIA.addTab("TORTILLA", jScrollPane11);

        NombreEmpleado.setFont(new java.awt.Font("NSimSun", 1, 14)); // NOI18N
        NombreEmpleado.setText("  Nombre Del Producto: ");

        nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreMouseClicked(evt);
            }
        });
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombreKeyPressed(evt);
            }
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
                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Titulo23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ProductoIva, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PANADERIA))
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
                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(PANADERIA)
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

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:
        String texto = nombre.getText().trim(); // Captura el texto del JTextField

        if (texto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un texto para buscar.");
            return;
        }

        // Conexión a la base de datos
        conexion conn = new conexion();
        Connection con = conn.Conectar();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // Consulta SQL: busca en todas las columnas
            String sql = "SELECT partida, rubro, unidad_medida, descripcion, marca, cantidad, precio, observacion "
                    + "FROM catalogo "
                    + "WHERE partida LIKE ? OR rubro LIKE ? OR unidad_medida LIKE ? OR descripcion LIKE ? "
                    + "OR marca LIKE ? OR cantidad LIKE ? OR precio LIKE ? OR observacion LIKE ?";

            ps = con.prepareStatement(sql);
            for (int i = 1; i <= 8; i++) {
                ps.setString(i, "%" + texto + "%");
            }

            rs = ps.executeQuery();

            // Modelo para la tabla
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Partida");
            modelo.addColumn("Rubro");
            modelo.addColumn("Unidad Medida");
            modelo.addColumn("Descripción");
            modelo.addColumn("Marca");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Precio");
            modelo.addColumn("Observación");

            // Llenar la tabla con los resultados
            while (rs.next()) {
                Object[] fila = new Object[8];
                fila[0] = rs.getString("partida");
                fila[1] = rs.getString("rubro");
                fila[2] = rs.getString("unidad_medida");
                fila[3] = rs.getString("descripcion");
                fila[4] = rs.getString("marca");
                fila[5] = rs.getString("cantidad");
                fila[6] = rs.getString("precio");
                fila[7] = rs.getString("observacion");
                modelo.addRow(fila);
            }

            // Asignar el modelo a la JTable
            TablaProductos.setModel(modelo);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error al cerrar conexión: " + ex);
            }
        }
    }//GEN-LAST:event_BuscarActionPerformed
    //filtra las teclas que puede utilizar el usuario
    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped


    }//GEN-LAST:event_nombreKeyTyped

    private void nombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMouseClicked
        if (evt.getClickCount() == 2) {
            nombre.setText("");
        }
    }//GEN-LAST:event_nombreMouseClicked

    private void ProductoIvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductoIvaActionPerformed
        String tipoIVA = ProductoIva.getSelectedItem().toString();

        conexion conn = new conexion();
        Connection con = conn.Conectar();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String sql = "select *from catalogo";

            // Validar selección del combo
            if (tipoIVA.equalsIgnoreCase("Con IVA")) {
                sql = "SELECT u.id_producto, u.descripcion, f.rubro, f.id_productoiva "
                        + "FROM PRODUCTOS u "
                        + "INNER JOIN IVA f ON u.descripcion = f.descripcion_articulo";
            } else if (tipoIVA.equalsIgnoreCase("Sin IVA")) {
                sql = "SELECT u.id_producto, u.descripcion, 'Sin rubro' AS rubro, NULL AS id_productoiva "
                        + "FROM PRODUCTOS u "
                        + "WHERE u.descripcion NOT IN (SELECT descripcion_articulo FROM IVA)";
            } else if (tipoIVA.equalsIgnoreCase("Todos")) {
                sql = "SELECT u.id_producto, u.descripcion, IFNULL(f.rubro, 'Sin rubro') AS rubro, f.id_productoiva "
                        + "FROM PRODUCTOS u "
                        + "LEFT JOIN IVA f ON u.descripcion = f.descripcion_articulo";
            } else {
                JOptionPane.showMessageDialog(null, "Por favor selecciona una opción válida del filtro.");
                return; // evita ejecutar si no hay opción válida
            }

            // Ejecutar consulta
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            // Modelo para la JTable
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID Producto");
            modelo.addColumn("Descripción");
            modelo.addColumn("Rubro");
            modelo.addColumn("ID Producto IVA");

            while (rs.next()) {
                Object[] fila = new Object[4];
                fila[0] = rs.getString("id_producto");
                fila[1] = rs.getString("descripcion");
                fila[2] = rs.getString("rubro");
                fila[3] = rs.getString("id_productoiva");
                modelo.addRow(fila);
            }

            TablaProductos.setModel(modelo);

            if (modelo.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "No se encontraron productos para el filtro seleccionado.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error al cerrar conexión: " + ex);
            }
        }


    }//GEN-LAST:event_ProductoIvaActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_nombreActionPerformed

    private void nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyPressed

        conexion conn = new conexion();
        Connection con = conn.Conectar();

        String texto = Buscar.getText();

        String sql = "SELECT partida, rubro, unidad_medida, descripcion, marca, cantidad, precio, observacion "
                + "FROM catalogo "
                + "WHERE partida LIKE ? OR rubro LIKE ? OR unidad_medida LIKE ? OR descripcion LIKE ? "
                + "OR marca LIKE ? OR cantidad LIKE ? OR precio LIKE ? OR observacion LIKE ?";

        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 1; i <= 8; i++) {
            try {
                ps.setString(i, "%" + texto + "%");
            } catch (SQLException ex) {
                Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        try {
            ResultSet rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_nombreKeyPressed

    private void TablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProductosMouseClicked

    }//GEN-LAST:event_TablaProductosMouseClicked

    public void mostrarDatos() {
        PreparedStatement ps = null;
        ResultSet rs = null;

        conexion conn = new conexion();
        Connection con = conn.Conectar();
        try {

            DefaultTableModel modelo = new DefaultTableModel();
            TablaProductos.setModel(modelo);
            TablaProductos.setAutoCreateRowSorter(true);

            sorter = new TableRowSorter<>(modelo);
            TablaProductos.setRowSorter(sorter);

            String sql = ("SELECT * FROM CATALOGO \n"
                    + "WHERE RUBRO LIKE '%ABARROTE%';");

            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("Partida");
            modelo.addColumn("Rubro");
            modelo.addColumn("Unidad medida");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Marca");
            modelo.addColumn("Cantidad ");
            modelo.addColumn("Precio");
            modelo.addColumn("Observacion");

            /* centrar datos */
            DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) TablaProductos.getTableHeader().getDefaultRenderer();
            headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
            headerRenderer.setFont(headerRenderer.getFont().deriveFont(Font.BOLD)); // Establecer la fuente en negritas

            TablaProductos.getColumnModel().getColumn(0).setHeaderRenderer(headerRenderer);
            TablaProductos.getColumnModel().getColumn(1).setHeaderRenderer(headerRenderer);
            TablaProductos.getColumnModel().getColumn(2).setHeaderRenderer(headerRenderer);
            TablaProductos.getColumnModel().getColumn(3).setHeaderRenderer(headerRenderer);
            TablaProductos.getColumnModel().getColumn(4).setHeaderRenderer(headerRenderer);
            TablaProductos.getColumnModel().getColumn(5).setHeaderRenderer(headerRenderer);
            TablaProductos.getColumnModel().getColumn(6).setHeaderRenderer(headerRenderer);
            TablaProductos.getColumnModel().getColumn(7).setHeaderRenderer(headerRenderer);

            DefaultTableCellRenderer ColumCenter = new DefaultTableCellRenderer();
            ColumCenter.setHorizontalAlignment(SwingConstants.CENTER);
            TablaProductos.getColumnModel().getColumn(0).setCellRenderer(ColumCenter);
            TablaProductos.getColumnModel().getColumn(1).setCellRenderer(ColumCenter);
            TablaProductos.getColumnModel().getColumn(2).setCellRenderer(ColumCenter);
            TablaProductos.getColumnModel().getColumn(3).setCellRenderer(ColumCenter);
            TablaProductos.getColumnModel().getColumn(4).setCellRenderer(ColumCenter);
            TablaProductos.getColumnModel().getColumn(5).setCellRenderer(ColumCenter);
            TablaProductos.getColumnModel().getColumn(6).setCellRenderer(ColumCenter);
            TablaProductos.getColumnModel().getColumn(7).setCellRenderer(ColumCenter);

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                // Cerrar ResultSet, PreparedStatement y Connection en el orden adecuado
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    
    public void mostrarDatosCarnes() {
        PreparedStatement ps = null;
        ResultSet rs = null;

        conexion conn = new conexion();
        Connection con = conn.Conectar();
        try {

            DefaultTableModel modelo = new DefaultTableModel();
            TablaCarnes.setModel(modelo);
            TablaCarnes.setAutoCreateRowSorter(true);

            sorter = new TableRowSorter<>(modelo);
            TablaCarnes.setRowSorter(sorter);

            String sql = ("SELECT * FROM CATALOGO \n"
                    + "WHERE RUBRO LIKE '%CARNE%';");

            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("Partida");
            modelo.addColumn("Rubro");
            modelo.addColumn("Unidad medida");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Marca");
            modelo.addColumn("Cantidad ");
            modelo.addColumn("Precio");
            modelo.addColumn("Observacion");

            /* centrar datos */
            DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) TablaCarnes.getTableHeader().getDefaultRenderer();
            headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
            headerRenderer.setFont(headerRenderer.getFont().deriveFont(Font.BOLD)); // Establecer la fuente en negritas

            TablaCarnes.getColumnModel().getColumn(0).setHeaderRenderer(headerRenderer);
            TablaCarnes.getColumnModel().getColumn(1).setHeaderRenderer(headerRenderer);
            TablaCarnes.getColumnModel().getColumn(2).setHeaderRenderer(headerRenderer);
            TablaCarnes.getColumnModel().getColumn(3).setHeaderRenderer(headerRenderer);
            TablaCarnes.getColumnModel().getColumn(4).setHeaderRenderer(headerRenderer);
            TablaCarnes.getColumnModel().getColumn(5).setHeaderRenderer(headerRenderer);
            TablaCarnes.getColumnModel().getColumn(6).setHeaderRenderer(headerRenderer);
            TablaCarnes.getColumnModel().getColumn(7).setHeaderRenderer(headerRenderer);

            DefaultTableCellRenderer ColumCenter = new DefaultTableCellRenderer();
            ColumCenter.setHorizontalAlignment(SwingConstants.CENTER);
            TablaCarnes.getColumnModel().getColumn(0).setCellRenderer(ColumCenter);
            TablaCarnes.getColumnModel().getColumn(1).setCellRenderer(ColumCenter);
            TablaCarnes.getColumnModel().getColumn(2).setCellRenderer(ColumCenter);
            TablaCarnes.getColumnModel().getColumn(3).setCellRenderer(ColumCenter);
            TablaCarnes.getColumnModel().getColumn(4).setCellRenderer(ColumCenter);
            TablaCarnes.getColumnModel().getColumn(5).setCellRenderer(ColumCenter);
            TablaCarnes.getColumnModel().getColumn(6).setCellRenderer(ColumCenter);
            TablaCarnes.getColumnModel().getColumn(7).setCellRenderer(ColumCenter);

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                // Cerrar ResultSet, PreparedStatement y Connection en el orden adecuado
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    //filtra la tabla del incidencias_semestre
    public void DiseñoTabla() {

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
    
    public void DiseñoTablaCarne() {

        DefaultTableModel modelo = new DefaultTableModel();
        TablaCarnes.setModel(modelo);
        TablaCarnes.setAutoCreateRowSorter(true);

        sorter = new TableRowSorter<>(modelo);
        TablaCarnes.setRowSorter(sorter);

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
        TableColumn id = TablaCarnes.getColumnModel().getColumn(0);
        TableColumn partida = TablaCarnes.getColumnModel().getColumn(1);
        TableColumn rubro = TablaCarnes.getColumnModel().getColumn(2);
        TableColumn UnidadMedida = TablaCarnes.getColumnModel().getColumn(3);
        TableColumn Descripcion = TablaCarnes.getColumnModel().getColumn(4);
        TableColumn Marca = TablaCarnes.getColumnModel().getColumn(5);
        TableColumn Cantidad = TablaCarnes.getColumnModel().getColumn(6);
        TableColumn Precio = TablaCarnes.getColumnModel().getColumn(7);

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
        TablaCarnes.getColumnModel().getColumn(3).setCellRenderer(ColumCenter);
    }
    
    
    
    public void mostrarDatosEmbutidos() {
        PreparedStatement ps = null;
        ResultSet rs = null;

        conexion conn = new conexion();
        Connection con = conn.Conectar();
        try {

            DefaultTableModel modelo = new DefaultTableModel();
            TablaEmbutidos.setModel(modelo);
            TablaEmbutidos.setAutoCreateRowSorter(true);

            sorter = new TableRowSorter<>(modelo);
            TablaEmbutidos.setRowSorter(sorter);

            String sql = ("SELECT * FROM CATALOGO \n"
                    + "WHERE RUBRO LIKE '%EMBUTIDOS%';");

            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("Partida");
            modelo.addColumn("Rubro");
            modelo.addColumn("Unidad medida");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Marca");
            modelo.addColumn("Cantidad ");
            modelo.addColumn("Precio");
            modelo.addColumn("Observacion");

            /* centrar datos */
            DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) TablaCarnes.getTableHeader().getDefaultRenderer();
            headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
            headerRenderer.setFont(headerRenderer.getFont().deriveFont(Font.BOLD)); // Establecer la fuente en negritas

            TablaEmbutidos.getColumnModel().getColumn(0).setHeaderRenderer(headerRenderer);
            TablaEmbutidos.getColumnModel().getColumn(1).setHeaderRenderer(headerRenderer);
            TablaEmbutidos.getColumnModel().getColumn(2).setHeaderRenderer(headerRenderer);
            TablaEmbutidos.getColumnModel().getColumn(3).setHeaderRenderer(headerRenderer);
            TablaEmbutidos.getColumnModel().getColumn(4).setHeaderRenderer(headerRenderer);
            TablaEmbutidos.getColumnModel().getColumn(5).setHeaderRenderer(headerRenderer);
            TablaEmbutidos.getColumnModel().getColumn(6).setHeaderRenderer(headerRenderer);
            TablaEmbutidos.getColumnModel().getColumn(7).setHeaderRenderer(headerRenderer);

            DefaultTableCellRenderer ColumCenter = new DefaultTableCellRenderer();
            ColumCenter.setHorizontalAlignment(SwingConstants.CENTER);
            TablaEmbutidos.getColumnModel().getColumn(0).setCellRenderer(ColumCenter);
            TablaEmbutidos.getColumnModel().getColumn(1).setCellRenderer(ColumCenter);
            TablaEmbutidos.getColumnModel().getColumn(2).setCellRenderer(ColumCenter);
            TablaEmbutidos.getColumnModel().getColumn(3).setCellRenderer(ColumCenter);
            TablaEmbutidos.getColumnModel().getColumn(4).setCellRenderer(ColumCenter);
            TablaEmbutidos.getColumnModel().getColumn(5).setCellRenderer(ColumCenter);
            TablaEmbutidos.getColumnModel().getColumn(6).setCellRenderer(ColumCenter);
            TablaEmbutidos.getColumnModel().getColumn(7).setCellRenderer(ColumCenter);

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                // Cerrar ResultSet, PreparedStatement y Connection en el orden adecuado
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    
    public void DiseñoTablaEmbutidos() {

        DefaultTableModel modelo = new DefaultTableModel();
        TablaEmbutidos.setModel(modelo);
        TablaEmbutidos.setAutoCreateRowSorter(true);

        sorter = new TableRowSorter<>(modelo);
        TablaEmbutidos.setRowSorter(sorter);

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
        TableColumn id = TablaEmbutidos.getColumnModel().getColumn(0);
        TableColumn partida = TablaEmbutidos.getColumnModel().getColumn(1);
        TableColumn rubro = TablaEmbutidos.getColumnModel().getColumn(2);
        TableColumn UnidadMedida = TablaEmbutidos.getColumnModel().getColumn(3);
        TableColumn Descripcion = TablaEmbutidos.getColumnModel().getColumn(4);
        TableColumn Marca = TablaEmbutidos.getColumnModel().getColumn(5);
        TableColumn Cantidad = TablaEmbutidos.getColumnModel().getColumn(6);
        TableColumn Precio = TablaEmbutidos.getColumnModel().getColumn(7);

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
        TablaEmbutidos.getColumnModel().getColumn(3).setCellRenderer(ColumCenter);
    }
    
    
    public void mostrarDatosFrutasVerduras() {
        PreparedStatement ps = null;
        ResultSet rs = null;

        conexion conn = new conexion();
        Connection con = conn.Conectar();
        try {

            DefaultTableModel modelo = new DefaultTableModel();
            TablaFrutasVerduras.setModel(modelo);
            TablaFrutasVerduras.setAutoCreateRowSorter(true);

            sorter = new TableRowSorter<>(modelo);
            TablaFrutasVerduras.setRowSorter(sorter);

            String sql = ("SELECT * FROM CATALOGO \n"
                    + "WHERE RUBRO LIKE '%FRUTAS Y VERDURAS%';");

            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("Partida");
            modelo.addColumn("Rubro");
            modelo.addColumn("Unidad medida");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Marca");
            modelo.addColumn("Cantidad ");
            modelo.addColumn("Precio");
            modelo.addColumn("Observacion");

            /* centrar datos */
            DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) TablaCarnes.getTableHeader().getDefaultRenderer();
            headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
            headerRenderer.setFont(headerRenderer.getFont().deriveFont(Font.BOLD)); // Establecer la fuente en negritas

            TablaFrutasVerduras.getColumnModel().getColumn(0).setHeaderRenderer(headerRenderer);
            TablaFrutasVerduras.getColumnModel().getColumn(1).setHeaderRenderer(headerRenderer);
            TablaFrutasVerduras.getColumnModel().getColumn(2).setHeaderRenderer(headerRenderer);
            TablaFrutasVerduras.getColumnModel().getColumn(3).setHeaderRenderer(headerRenderer);
            TablaFrutasVerduras.getColumnModel().getColumn(4).setHeaderRenderer(headerRenderer);
            TablaFrutasVerduras.getColumnModel().getColumn(5).setHeaderRenderer(headerRenderer);
            TablaFrutasVerduras.getColumnModel().getColumn(6).setHeaderRenderer(headerRenderer);
            TablaFrutasVerduras.getColumnModel().getColumn(7).setHeaderRenderer(headerRenderer);

            DefaultTableCellRenderer ColumCenter = new DefaultTableCellRenderer();
            ColumCenter.setHorizontalAlignment(SwingConstants.CENTER);
            TablaFrutasVerduras.getColumnModel().getColumn(0).setCellRenderer(ColumCenter);
            TablaFrutasVerduras.getColumnModel().getColumn(1).setCellRenderer(ColumCenter);
            TablaFrutasVerduras.getColumnModel().getColumn(2).setCellRenderer(ColumCenter);
            TablaFrutasVerduras.getColumnModel().getColumn(3).setCellRenderer(ColumCenter);
            TablaFrutasVerduras.getColumnModel().getColumn(4).setCellRenderer(ColumCenter);
            TablaFrutasVerduras.getColumnModel().getColumn(5).setCellRenderer(ColumCenter);
            TablaFrutasVerduras.getColumnModel().getColumn(6).setCellRenderer(ColumCenter);
            TablaFrutasVerduras.getColumnModel().getColumn(7).setCellRenderer(ColumCenter);

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                // Cerrar ResultSet, PreparedStatement y Connection en el orden adecuado
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    
    public void DiseñoTablaFrutasVerduras() {

        DefaultTableModel modelo = new DefaultTableModel();
        TablaFrutasVerduras.setModel(modelo);
        TablaFrutasVerduras.setAutoCreateRowSorter(true);

        sorter = new TableRowSorter<>(modelo);
        TablaFrutasVerduras.setRowSorter(sorter);

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
        TableColumn id = TablaFrutasVerduras.getColumnModel().getColumn(0);
        TableColumn partida = TablaFrutasVerduras.getColumnModel().getColumn(1);
        TableColumn rubro = TablaFrutasVerduras.getColumnModel().getColumn(2);
        TableColumn UnidadMedida = TablaFrutasVerduras.getColumnModel().getColumn(3);
        TableColumn Descripcion = TablaFrutasVerduras.getColumnModel().getColumn(4);
        TableColumn Marca = TablaFrutasVerduras.getColumnModel().getColumn(5);
        TableColumn Cantidad = TablaFrutasVerduras.getColumnModel().getColumn(6);
        TableColumn Precio = TablaFrutasVerduras.getColumnModel().getColumn(7);

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
        TablaFrutasVerduras.getColumnModel().getColumn(3).setCellRenderer(ColumCenter);
    }
    
    
    
    public void mostrarDatosLacteos() {
        PreparedStatement ps = null;
        ResultSet rs = null;

        conexion conn = new conexion();
        Connection con = conn.Conectar();
        try {

            DefaultTableModel modelo = new DefaultTableModel();
            TablaLacteos.setModel(modelo);
            TablaLacteos.setAutoCreateRowSorter(true);

            sorter = new TableRowSorter<>(modelo);
            TablaLacteos.setRowSorter(sorter);

            String sql = ("SELECT * FROM CATALOGO \n"
                    + "WHERE RUBRO LIKE '%LACTEOS%';");

            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("Partida");
            modelo.addColumn("Rubro");
            modelo.addColumn("Unidad medida");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Marca");
            modelo.addColumn("Cantidad ");
            modelo.addColumn("Precio");
            modelo.addColumn("Observacion");

            /* centrar datos */
            DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) TablaLacteos.getTableHeader().getDefaultRenderer();
            headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
            headerRenderer.setFont(headerRenderer.getFont().deriveFont(Font.BOLD)); // Establecer la fuente en negritas

            TablaLacteos.getColumnModel().getColumn(0).setHeaderRenderer(headerRenderer);
            TablaLacteos.getColumnModel().getColumn(1).setHeaderRenderer(headerRenderer);
            TablaLacteos.getColumnModel().getColumn(2).setHeaderRenderer(headerRenderer);
            TablaLacteos.getColumnModel().getColumn(3).setHeaderRenderer(headerRenderer);
            TablaLacteos.getColumnModel().getColumn(4).setHeaderRenderer(headerRenderer);
            TablaLacteos.getColumnModel().getColumn(5).setHeaderRenderer(headerRenderer);
            TablaLacteos.getColumnModel().getColumn(6).setHeaderRenderer(headerRenderer);
            TablaLacteos.getColumnModel().getColumn(7).setHeaderRenderer(headerRenderer);

            DefaultTableCellRenderer ColumCenter = new DefaultTableCellRenderer();
            ColumCenter.setHorizontalAlignment(SwingConstants.CENTER);
            TablaLacteos.getColumnModel().getColumn(0).setCellRenderer(ColumCenter);
            TablaLacteos.getColumnModel().getColumn(1).setCellRenderer(ColumCenter);
            TablaLacteos.getColumnModel().getColumn(2).setCellRenderer(ColumCenter);
            TablaLacteos.getColumnModel().getColumn(3).setCellRenderer(ColumCenter);
            TablaLacteos.getColumnModel().getColumn(4).setCellRenderer(ColumCenter);
            TablaLacteos.getColumnModel().getColumn(5).setCellRenderer(ColumCenter);
            TablaLacteos.getColumnModel().getColumn(6).setCellRenderer(ColumCenter);
            TablaLacteos.getColumnModel().getColumn(7).setCellRenderer(ColumCenter);

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                // Cerrar ResultSet, PreparedStatement y Connection en el orden adecuado
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    
    public void DiseñoTablaLacteos() {

        DefaultTableModel modelo = new DefaultTableModel();
        TablaLacteos.setModel(modelo);
        TablaLacteos.setAutoCreateRowSorter(true);

        sorter = new TableRowSorter<>(modelo);
        TablaLacteos.setRowSorter(sorter);

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
        TableColumn id = TablaLacteos.getColumnModel().getColumn(0);
        TableColumn partida = TablaLacteos.getColumnModel().getColumn(1);
        TableColumn rubro = TablaLacteos.getColumnModel().getColumn(2);
        TableColumn UnidadMedida = TablaLacteos.getColumnModel().getColumn(3);
        TableColumn Descripcion = TablaLacteos.getColumnModel().getColumn(4);
        TableColumn Marca = TablaLacteos.getColumnModel().getColumn(5);
        TableColumn Cantidad = TablaLacteos.getColumnModel().getColumn(6);
        TableColumn Precio = TablaLacteos.getColumnModel().getColumn(7);

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
        TablaFrutasVerduras.getColumnModel().getColumn(3).setCellRenderer(ColumCenter);
    }
    
    
    public void mostrarDatosMinsa() {
        PreparedStatement ps = null;
        ResultSet rs = null;

        conexion conn = new conexion();
        Connection con = conn.Conectar();
        try {

            DefaultTableModel modelo = new DefaultTableModel();
            TablaMinsa.setModel(modelo);
            TablaMinsa.setAutoCreateRowSorter(true);

            sorter = new TableRowSorter<>(modelo);
            TablaMinsa.setRowSorter(sorter);

            String sql = ("SELECT * FROM CATALOGO \n"
                    + "WHERE RUBRO LIKE '%MINSA%';");

            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("Partida");
            modelo.addColumn("Rubro");
            modelo.addColumn("Unidad medida");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Marca");
            modelo.addColumn("Cantidad ");
            modelo.addColumn("Precio");
            modelo.addColumn("Observacion");

            /* centrar datos */
            DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) TablaMinsa.getTableHeader().getDefaultRenderer();
            headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
            headerRenderer.setFont(headerRenderer.getFont().deriveFont(Font.BOLD)); // Establecer la fuente en negritas

            TablaMinsa.getColumnModel().getColumn(0).setHeaderRenderer(headerRenderer);
            TablaMinsa.getColumnModel().getColumn(1).setHeaderRenderer(headerRenderer);
            TablaMinsa.getColumnModel().getColumn(2).setHeaderRenderer(headerRenderer);
            TablaMinsa.getColumnModel().getColumn(3).setHeaderRenderer(headerRenderer);
            TablaMinsa.getColumnModel().getColumn(4).setHeaderRenderer(headerRenderer);
            TablaMinsa.getColumnModel().getColumn(5).setHeaderRenderer(headerRenderer);
            TablaMinsa.getColumnModel().getColumn(6).setHeaderRenderer(headerRenderer);
            TablaMinsa.getColumnModel().getColumn(7).setHeaderRenderer(headerRenderer);

            DefaultTableCellRenderer ColumCenter = new DefaultTableCellRenderer();
            ColumCenter.setHorizontalAlignment(SwingConstants.CENTER);
            TablaMinsa.getColumnModel().getColumn(0).setCellRenderer(ColumCenter);
            TablaMinsa.getColumnModel().getColumn(1).setCellRenderer(ColumCenter);
            TablaMinsa.getColumnModel().getColumn(2).setCellRenderer(ColumCenter);
            TablaMinsa.getColumnModel().getColumn(3).setCellRenderer(ColumCenter);
            TablaMinsa.getColumnModel().getColumn(4).setCellRenderer(ColumCenter);
            TablaMinsa.getColumnModel().getColumn(5).setCellRenderer(ColumCenter);
            TablaMinsa.getColumnModel().getColumn(6).setCellRenderer(ColumCenter);
            TablaMinsa.getColumnModel().getColumn(7).setCellRenderer(ColumCenter);

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                // Cerrar ResultSet, PreparedStatement y Connection en el orden adecuado
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    
    public void DiseñoTablaMinsa() {

        DefaultTableModel modelo = new DefaultTableModel();
        TablaMinsa.setModel(modelo);
        TablaMinsa.setAutoCreateRowSorter(true);

        sorter = new TableRowSorter<>(modelo);
        TablaMinsa.setRowSorter(sorter);

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
        TableColumn id = TablaMinsa.getColumnModel().getColumn(0);
        TableColumn partida = TablaMinsa.getColumnModel().getColumn(1);
        TableColumn rubro = TablaMinsa.getColumnModel().getColumn(2);
        TableColumn UnidadMedida = TablaMinsa.getColumnModel().getColumn(3);
        TableColumn Descripcion = TablaMinsa.getColumnModel().getColumn(4);
        TableColumn Marca = TablaMinsa.getColumnModel().getColumn(5);
        TableColumn Cantidad = TablaMinsa.getColumnModel().getColumn(6);
        TableColumn Precio = TablaMinsa.getColumnModel().getColumn(7);

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
        TablaMinsa.getColumnModel().getColumn(3).setCellRenderer(ColumCenter);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JPanel ContenedorTablaEmpleados;
    private javax.swing.JPanel ContenedorTitulo;
    private javax.swing.JLabel FechaFinal;
    private javax.swing.JLabel FechaInicio;
    private javax.swing.JLabel NombreEmpleado;
    private javax.swing.JTabbedPane PANADERIA;
    private javax.swing.JComboBox<String> ProductoIva;
    private javax.swing.JScrollPane ScrollTablaEmpleado;
    private javax.swing.JTable TablaCarnes;
    private javax.swing.JTable TablaEmbutidos;
    private javax.swing.JTable TablaFrutasVerduras;
    private javax.swing.JTable TablaLacteos;
    private javax.swing.JTable TablaMinsa;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo23;
    private com.toedter.calendar.JDateChooser fechafinal;
    private com.toedter.calendar.JDateChooser fechainicio;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextField nombre;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
