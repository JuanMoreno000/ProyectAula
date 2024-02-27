/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoaula.gui;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class Bebidas extends javax.swing.JPanel {

    /**
     * Creates new form Bebidas
     */
    public Bebidas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBebidas = new javax.swing.JTable();
        respuesta = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt_articulo = new javax.swing.JTextField();
        txt_cantidad = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        txt_ID = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SECCION DE BEBIDAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        tablaBebidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PRODUCTO", "CANTIDAD", "PRECIO", "PRECIO TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaBebidas);
        if (tablaBebidas.getColumnModel().getColumnCount() > 0) {
            tablaBebidas.getColumnModel().getColumn(0).setResizable(false);
            tablaBebidas.getColumnModel().getColumn(1).setResizable(false);
            tablaBebidas.getColumnModel().getColumn(2).setResizable(false);
            tablaBebidas.getColumnModel().getColumn(3).setResizable(false);
            tablaBebidas.getColumnModel().getColumn(4).setResizable(false);
        }

        respuesta.setBackground(new java.awt.Color(51, 255, 51));
        respuesta.setForeground(new java.awt.Color(0, 255, 0));

        jButton1.setFont(new java.awt.Font("Monotype Corsiva", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/informacion (1).png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txt_articulo.setBorder(javax.swing.BorderFactory.createTitledBorder("ARTICULO:"));
        txt_articulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_articuloActionPerformed(evt);
            }
        });

        txt_cantidad.setBorder(javax.swing.BorderFactory.createTitledBorder("CANTIDAD:"));
        txt_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cantidadActionPerformed(evt);
            }
        });

        txt_precio.setBorder(javax.swing.BorderFactory.createTitledBorder("PRECIO:"));

        jButton2.setText("GUARDAR");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txt_ID.setBorder(javax.swing.BorderFactory.createTitledBorder("ID:"));

        jButton5.setText("BUSCAR");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("MODIFICAR");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton4.setText("ELIMINAR");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setText("ACTUALIZAR");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton7.setText("IMPRIMIR");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setText("QUITAR");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton8.setText("AÑADIR");
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_articulo, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(txt_cantidad)
                            .addComponent(txt_precio)
                            .addComponent(jButton2)
                            .addComponent(txt_ID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(195, 195, 195)
                                .addComponent(jButton7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton8)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null, "En esta seccion podra ingresar, o eliminar los"
            + "productos de la seccion de bebidas.", "INFORMACION", JOptionPane.INFORMATION_MESSAGE, null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cantidadActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (txt_articulo.getText().trim().isEmpty() || 
                txt_cantidad.getText().trim().isEmpty() || txt_precio.getText().trim().isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "POR FAVOR LLENE TODOS LOS CAMPOS", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        
        }
        
        try {
            String cantidadTexto = txt_cantidad.getText();
            String precioTexto = txt_precio.getText();

            int cantidad = Integer.parseInt(cantidadTexto);
            double precio = Double.parseDouble(precioTexto);

            double precioTotal = cantidad * precio;
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/inventario", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into bebidas values(?,?,?,?,?)");

            pst.setString(1, "0000");
            pst.setString(2, txt_articulo.getText().trim());
            pst.setString(3, txt_cantidad.getText().trim());
            pst.setString(4, txt_precio.getText().trim());
            pst.setString(5, precioTotal + "");
            pst.executeUpdate();

            txt_articulo.setText("");
            txt_cantidad.setText("");
            txt_precio.setText("");

            respuesta.setText("REGISTRO EXITOSO");

            Timer timer = new Timer(2000, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    respuesta.setText("");
                }
            });
            timer.setRepeats(false);
            timer.start();

            DefaultTableModel model = (DefaultTableModel) tablaBebidas.getModel();
            model.setRowCount(0);


                try {
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/inventario", "root", "");
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery("select * from bebidas");

                    while (rs.next()) {

                        String id = rs.getString("ID");
                        String articulo = rs.getString("PRODUCTO");
                        String cantidadBd = rs.getString("CANTIDAD");
                        String precioBd = rs.getString("PRECIOxUNIDAD");
                        String precioTotalBd = rs.getString("PRECIOTOTAL");

                        model.addRow(new Object[]{id, articulo, cantidadBd, precioBd, precioTotalBd});
                    }

                    rs.close();
                    stmt.close();
                conn.close();

            } catch (Exception e) {

            }
            
        } catch (Exception e) {

        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_articuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_articuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_articuloActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (txt_ID.getText().trim().isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "   NO HA INTRODUCIDO EL ID\n"
                    + "POR FAVOR INTRODUZCA UN ID", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        
        }

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/inventario", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from bebidas where ID = ?");

            pst.setString(1, txt_ID.getText().trim());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txt_articulo.setText(rs.getString("PRODUCTO"));
                txt_cantidad.setText(rs.getString("CANTIDAD"));
                txt_precio.setText(rs.getString("PRECIOxUNIDAD"));

            } else {

                JOptionPane.showConfirmDialog(null, "Producto no registrado", "ERROR", JOptionPane.WARNING_MESSAGE);

            }

        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (txt_articulo.getText().trim().isEmpty() || 
                txt_cantidad.getText().trim().isEmpty() || txt_precio.getText().trim().isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "NO HA SELECCIONADO NINGUN ITEM PARA MODIFICAR\n"
                    + "      POR FAVOR SELECCIONE EL ITEM A MODIFICAR", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        
        }

        int resp = JOptionPane.showConfirmDialog(null, "¿Desea modificar el contenido?", "Confirmar modificacion", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                   
            try {
                String cantidadTexto = txt_cantidad.getText();
                String precioTexto = txt_precio.getText();

                int cantidad = Integer.parseInt(cantidadTexto);
                double precio = Double.parseDouble(precioTexto);
                double precioTotal = cantidad * precio;

                String id = txt_ID.getText().trim();

                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/inventario", "root", "");
                PreparedStatement pst = cn.prepareStatement("update bebidas set PRODUCTO = ?, CANTIDAD = ?, PRECIOxUNIDAD = ?, PRECIOTOTAL = ? where ID = " + id);

                pst.setString(1, txt_articulo.getText().trim());
                pst.setString(2, txt_cantidad.getText().trim());
                pst.setString(3, txt_precio.getText().trim());
                pst.setString(4, precioTotal + "");
                pst.executeUpdate();

                respuesta.setText("MODIFICACION EXITOSA");

                Timer timer = new Timer(2000, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        respuesta.setText("");
                    }
                });
                timer.setRepeats(false);
                timer.start();
                
                DefaultTableModel model = (DefaultTableModel) tablaBebidas.getModel();
                model.setRowCount(0);


                try {
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/inventario", "root", "");
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery("select * from bebidas");

                    while (rs.next()) {

                        String idBd = rs.getString("ID");
                        String articulo = rs.getString("PRODUCTO");
                        String cantidadBd = rs.getString("CANTIDAD");
                        String precioBd = rs.getString("PRECIOxUNIDAD");
                        String precioTotalBd = rs.getString("PRECIOTOTAL");

                        model.addRow(new Object[]{idBd, articulo, cantidadBd, precioBd, precioTotalBd});
                    }

                    rs.close();
                    stmt.close();
                    conn.close();

                } catch (Exception e) {

                }

            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (txt_articulo.getText().trim().isEmpty() ||
                txt_cantidad.getText().trim().isEmpty() || txt_precio.getText().trim().isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "POR SELECCIONE ALGUN ITEM", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        
        }
        
        int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el contenido?", "Confirmar eliminacion", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                   
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/inventario", "root", "");
                PreparedStatement pst = cn.prepareStatement("delete from bebidas where ID = ?");

                pst.setString(1, txt_ID.getText().trim());
                pst.executeUpdate();

                txt_articulo.setText("");
                txt_cantidad.setText("");
                txt_precio.setText("");
                txt_ID.setText("");

                respuesta.setText("ELIMINACION CONFIRMADA");

                Timer timer = new Timer(2000, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        respuesta.setText("");
                    }
                });
                timer.setRepeats(false);
                timer.start();
                
                DefaultTableModel model = (DefaultTableModel) tablaBebidas.getModel();
                model.setRowCount(0);


                try {
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/inventario", "root", "");
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery("select * from bebidas");

                    while (rs.next()) {

                        String id = rs.getString("ID");
                        String articulo = rs.getString("PRODUCTO");
                        String cantidadBd = rs.getString("CANTIDAD");
                        String precioBd = rs.getString("PRECIOxUNIDAD");
                        String precioTotalBd = rs.getString("PRECIOTOTAL");

                        model.addRow(new Object[]{id, articulo, cantidadBd, precioBd, precioTotalBd});
                    }

                    rs.close();
                    stmt.close();
                    conn.close();

                } catch (Exception e) {

                }

            } catch (Exception e) {

            }
        }
                
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Document documento = new Document();
        
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/OneDrive/Escritorio/Reporte Inventario De Alimentos.pdf"));
            documento.open();
            
            PdfPTable tabla = new PdfPTable(5);
            tabla.addCell("ID");
            tabla.addCell("PRODUCTO");
            tabla.addCell("CANTIDAD");
            tabla.addCell("PRECIO POR UNIDAD");
            tabla.addCell("PRECIO TOTAL");
            
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/inventario", "root", "");
                PreparedStatement pst = cn.prepareStatement("select * from bebidas");
                
                ResultSet rs = pst.executeQuery();
                
                if (rs.next()) {
                    
                    do {                        
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                    
                    } while (rs.next());
                        documento.add(tabla);
                                
                }
                
            } catch (DocumentException | SQLException e) {
                
            }
            documento.close();
            
            respuesta.setText("REPORTE GENERADO");

                Timer timer = new Timer(2000, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        respuesta.setText("");
                    }
                });
                timer.setRepeats(false);
                timer.start();
            
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
        
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel model = (DefaultTableModel) tablaBebidas.getModel();
        model.setRowCount(0);

        
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/inventario", "root", "");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from bebidas");

            while (rs.next()) {

                String ID = rs.getString("ID");
                String articulo = rs.getString("PRODUCTO");
                String cantidad = rs.getString("CANTIDAD");
                String precio = rs.getString("PRECIOxUNIDAD");
                String precioTotal = rs.getString("PRECIOTOTAL");

                model.addRow(new Object[]{ID, articulo, cantidad, precio, precioTotal});
            }

            rs.close();
            stmt.close();
            conn.close();
            
            respuesta.setText("TABLA ACTUALIZADA");

                Timer timer = new Timer(2000, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        respuesta.setText("");
                    }
                });
                timer.setRepeats(false);
                timer.start();
            
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try {
            int cantidadAQuitar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad a quitar:"));

            if (cantidadAQuitar > 0) {
                String idProducto = txt_ID.getText().trim();
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/inventario", "root", "");

                PreparedStatement pstCantidadActual = cn.prepareStatement("select CANTIDAD, PRECIOxUNIDAD from bebidas where ID = ?");
                pstCantidadActual.setString(1, idProducto);
                ResultSet rsCantidadActual = pstCantidadActual.executeQuery();

                if (rsCantidadActual.next()) {
                    int cantidadActual = rsCantidadActual.getInt("CANTIDAD");
                    double precioPorUnidad = rsCantidadActual.getDouble("PRECIOxUNIDAD");

                    if (cantidadAQuitar <= cantidadActual) {
                        int nuevaCantidad = cantidadActual - cantidadAQuitar;
                        double nuevoPrecioTotal = nuevaCantidad * precioPorUnidad;

                        PreparedStatement pstActualizarCantidad = cn.prepareStatement("update bebidas set CANTIDAD = ?, PRECIOTOTAL = ? where ID = ?");
                        pstActualizarCantidad.setInt(1, nuevaCantidad);
                        pstActualizarCantidad.setDouble(2, nuevoPrecioTotal);
                        pstActualizarCantidad.setString(3, idProducto);
                        pstActualizarCantidad.executeUpdate();

                        respuesta.setText("CANTIDAD EXTRAIDA EXITOSAMENTE");

                    } else {
                        JOptionPane.showMessageDialog(null, "La cantidad a quitar no puede exceder la cantidad actual", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Producto no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
                }

                rsCantidadActual.close();
                pstCantidadActual.close();
                cn.close();
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese una cantidad válida", "Error", JOptionPane.ERROR_MESSAGE);
            }

            DefaultTableModel model = (DefaultTableModel) tablaBebidas.getModel();
            model.setRowCount(0);

            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/inventario", "root", "");
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select * from bebidas");

                while (rs.next()) {
                    String ID = rs.getString("ID");
                    String articulo = rs.getString("PRODUCTO");
                    String cantidad = rs.getString("CANTIDAD");
                    String precio = rs.getString("PRECIOxUNIDAD");
                    String precioTotal = rs.getString("PRECIOTOTAL");

                    model.addRow(new Object[]{ID, articulo, cantidad, precio, precioTotal});
                }

                rs.close();
                stmt.close();
                conn.close();

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Error al actualizar la tabla", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException | SQLException e) {

        }

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            int cantidadAAgregar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad a añadir:"));

            if (cantidadAAgregar > 0) {
                String idProducto = txt_ID.getText().trim();
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/inventario", "root", "");

                PreparedStatement pstCantidadActual = cn.prepareStatement("select CANTIDAD, PRECIOxUNIDAD from bebidas where ID = ?");
                pstCantidadActual.setString(1, idProducto);
                ResultSet rsCantidadActual = pstCantidadActual.executeQuery();

                if (rsCantidadActual.next()) {
                    int cantidadActual = rsCantidadActual.getInt("CANTIDAD");
                    double precioPorUnidad = rsCantidadActual.getDouble("PRECIOxUNIDAD");

                    int nuevaCantidad = cantidadActual + cantidadAAgregar;
                    double nuevoPrecioTotal = nuevaCantidad * precioPorUnidad;

                    PreparedStatement pstActualizarCantidad = cn.prepareStatement("update bebidas set CANTIDAD = ?, PRECIOTOTAL = ? where ID = ?");
                    pstActualizarCantidad.setInt(1, nuevaCantidad);
                    pstActualizarCantidad.setDouble(2, nuevoPrecioTotal);
                    pstActualizarCantidad.setString(3, idProducto);
                    pstActualizarCantidad.executeUpdate();

                    respuesta.setText("CANTIDAD AÑADIDA EXITOSAMENTE");

                } else {
                    JOptionPane.showMessageDialog(null, "Producto no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
                }

                rsCantidadActual.close();
                pstCantidadActual.close();
                cn.close();

            } else {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese una cantidad válida", "Error", JOptionPane.ERROR_MESSAGE);
            }

            DefaultTableModel model = (DefaultTableModel) tablaBebidas.getModel();
            model.setRowCount(0);

            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/inventario", "root", "");
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select * from bebidas");

                while (rs.next()) {
                    String ID = rs.getString("ID");
                    String articulo = rs.getString("PRODUCTO");
                    String cantidad = rs.getString("CANTIDAD");
                    String precio = rs.getString("PRECIOxUNIDAD");
                    String precioTotal = rs.getString("PRECIOTOTAL");

                    model.addRow(new Object[]{ID, articulo, cantidad, precio, precioTotal});
                }

                rs.close();
                stmt.close();
                conn.close();

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Error al actualizar la tabla", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException | SQLException e) {

        }

    }//GEN-LAST:event_jButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel respuesta;
    private javax.swing.JTable tablaBebidas;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_articulo;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_precio;
    // End of variables declaration//GEN-END:variables
}
