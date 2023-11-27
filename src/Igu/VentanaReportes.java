/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Igu;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author hp
 */
public class VentanaReportes extends javax.swing.JFrame {

    public VentanaReportes() {
        initComponents();
    
        DefaultTableModel model = (DefaultTableModel) tablaUsuario.getModel();
        model.setRowCount(0);

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/bd_usuarios", "root", "");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from usuarios");

            while (rs.next()) {

                String id = rs.getString("id");
                String cedula = rs.getString("cedula");
                String nombre = rs.getString("nombre");
                String email = rs.getString("email");
                String tel = rs.getString("telefono");
                String fechaE = rs.getString("fechae");
                String fechaS = rs.getString("fechas");
                String pagoR = rs.getString("pagorecibido");
                String habitacion = rs.getString("habitacion");

                model.addRow(new Object[]{id, cedula, nombre, email, tel, fechaE, fechaS, pagoR, habitacion});
            }

            rs.close();
            stmt.close();
            conn.close();
         

        } catch (SQLException e) {

        }
        
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuario = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REPORTES");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, -1, 30));

        jButton3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, -1, 30));

        jButton4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Igu/Iconos/buscar24px.png"))); // NOI18N
        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, -1, -1));

        tablaUsuario.setBackground(new java.awt.Color(0, 0, 0));
        tablaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        tablaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CEDULA", "NOMBRE", "EMAIL", "TELEFONO", "FECHAE", "FECHAS", "PAGORECIBIDO", "HABITACION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaUsuario);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 794, 387));

        jButton2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, -1, 30));

        jButton5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton5.setText("VOLVER");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 420, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Igu/Iconos/Fondo-Reportes.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VentanaUsuariosVerModificar modificar = new VentanaUsuariosVerModificar();
        modificar.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     
     try {
            String cedulaAEliminar = JOptionPane.showInputDialog(null, "Ingrese la cédula del cliente a eliminar:");

            if (cedulaAEliminar != null && !cedulaAEliminar.isEmpty()) {
                int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea eliminar el cliente con cédula " + cedulaAEliminar + "?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

                if (confirmacion == JOptionPane.YES_OPTION) {
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_usuarios", "root", "");
                    cn.setAutoCommit(false); // Desactivar la autoconfirmación para transacciones

                    // Obtener el número de habitación antes de eliminar al cliente
                    PreparedStatement obtenerHabitacion = cn.prepareStatement("SELECT habitacion FROM usuarios WHERE cedula = ?");
                    obtenerHabitacion.setString(1, cedulaAEliminar);
                    ResultSet rsHabitacion = obtenerHabitacion.executeQuery();

                    String habitacionAntesEliminar = null;
                    if (rsHabitacion.next()) {
                        habitacionAntesEliminar = rsHabitacion.getString("habitacion");
                    }

                    // Eliminar al cliente
                    PreparedStatement pstEliminar = cn.prepareStatement("DELETE FROM usuarios WHERE cedula = ?");
                    pstEliminar.setString(1, cedulaAEliminar);
                    int filasAfectadas = pstEliminar.executeUpdate();

                    PreparedStatement pstActualizarHabitacion = cn.prepareStatement("UPDATE habitaciones SET estado = 'disponible' WHERE numero = ?");
                    
                    if (filasAfectadas > 0) {
                        // Actualizar el estado de la habitación a "disponible"
                        
                        pstActualizarHabitacion.setString(1, habitacionAntesEliminar);
                        pstActualizarHabitacion.executeUpdate();

                        JOptionPane.showMessageDialog(null, "Cliente con cédula " + cedulaAEliminar + " eliminado correctamente.", "Eliminación Exitosa", JOptionPane.INFORMATION_MESSAGE);
                        cn.commit(); // Confirmar la transacción
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró ningún cliente con la cédula proporcionada.", "Cliente no Encontrado", JOptionPane.WARNING_MESSAGE);
                    }

                    pstEliminar.close();
                    pstActualizarHabitacion.close();
                    rsHabitacion.close();
                    obtenerHabitacion.close();
                    cn.close();
                } else {
                    JOptionPane.showMessageDialog(null, "Eliminación cancelada.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {            
            }

            DefaultTableModel model = (DefaultTableModel) tablaUsuario.getModel();
            model.setRowCount(0);

            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/bd_usuarios", "root", "");
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select * from usuarios");

                while (rs.next()) {

                    String id = rs.getString("id");
                    String cedula = rs.getString("cedula");
                    String nombre = rs.getString("nombre");
                    String email = rs.getString("email");
                    String tel = rs.getString("telefono");
                    String fechaE = rs.getString("fechaE");
                    String fechaS = rs.getString("fechaS");
                    String pagoR = rs.getString("pagorecibido");
                    String habitacion = rs.getString("habitacion");

                    model.addRow(new Object[]{id, cedula, nombre, email, tel, fechaE, fechaS, pagoR, habitacion});
                }

                rs.close();
                stmt.close();
                conn.close();


            } catch (SQLException e) {

            }

            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el cliente: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    try {
        
        String cedulaStr = JOptionPane.showInputDialog(null, "Ingrese la cedula a buscar:");


        if (cedulaStr != null && !cedulaStr.isEmpty()) {
            int cedula = Integer.parseInt(cedulaStr);


            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_usuarios", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from usuarios where CEDULA = ?");
            pst.setInt(1, cedula);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                String mensaje = ""
                        + "Cedula: " + rs.getInt("CEDULA") + "\n"
                        + "Nombre: " + rs.getString("NOMBRE") + "\n"
                        + "Email: " + rs.getString("EMAIL") + "\n"
                        + "Teléfono: " + rs.getString("TELEFONO") + "\n"
                        + "Fecha de entrada: " + rs.getString("FECHAE") + "\n"
                        + "Fecha de salida: " + rs.getString("FECHAS") + "\n"
                        + "Pago: " + rs.getString("PAGORECIBIDO") + "\n"
                        + "Habitación: " + rs.getString("HABITACION");

                JOptionPane.showMessageDialog(null, mensaje, "Cliente Encontrado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                
                JOptionPane.showMessageDialog(null, "No se encontró ningún cliente con la cedula proporcionado.", "Cliente no Encontrado", JOptionPane.WARNING_MESSAGE);
            }

            // Cerrar recursos
            rs.close();
            pst.close();
            cn.close();
        } else {
            // Mostrar un mensaje si no se ingresó un ID válido
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID válido.", "ID Inválido", JOptionPane.ERROR_MESSAGE);
        }

    } catch (NumberFormatException e) {
        // Capturar excepción si el ID no es numérico
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID numérico válido.", "ID Inválido", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        // Capturar otras excepciones
        JOptionPane.showMessageDialog(null, "Error al buscar el cliente: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        DefaultTableModel model = (DefaultTableModel) tablaUsuario.getModel();
        model.setRowCount(0);

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/bd_usuarios", "root", "");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from usuarios");

            while (rs.next()) {

                String id = rs.getString("id");
                String cedula = rs.getString("cedula");
                String nombre = rs.getString("nombre");
                String email = rs.getString("email");
                String tel = rs.getString("telefono");
                String fechaE = rs.getString("fechae");
                String fechaS = rs.getString("fechas");
                String pagoR = rs.getString("pagorecibido");
                String habitacion = rs.getString("habitacion");

                model.addRow(new Object[]{id, cedula, nombre, email, tel, fechaE, fechaS, pagoR, habitacion});
            }

            rs.close();
            stmt.close();
            conn.close();
         

        } catch (SQLException e) {

        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaReportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaUsuario;
    // End of variables declaration//GEN-END:variables
}
