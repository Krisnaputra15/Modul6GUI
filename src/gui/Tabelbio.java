/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class Tabelbio extends javax.swing.JFrame {

    /**
     * Creates new form Tabelbio
     */
    public Tabelbio() {
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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        Kelas = new javax.swing.JComboBox<>();
        Alamat = new javax.swing.JTextField();
        Sekolah = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tabel Biodata");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 20, 240, 50);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 80, 40, 20);

        jLabel3.setText("Kelas");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 140, 40, 20);

        jLabel4.setText("Alamt");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 210, 40, 20);

        jLabel5.setText("Sekolah");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 300, 50, 20);
        getContentPane().add(Nama);
        Nama.setBounds(90, 80, 340, 30);

        Kelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "X RPL 1", "X RPL 2", "X RPL 3", "X RPL 4", "X RPL 5", "X RPL 6", "X RPL 7", "X TKJ 1", "X TKJ 2", "X TKJ 3", "X TKJ 4", "X TKJ 5", "X TKJ 6", "X TKJ 7" }));
        getContentPane().add(Kelas);
        Kelas.setBounds(90, 140, 100, 30);
        getContentPane().add(Alamat);
        Alamat.setBounds(90, 200, 340, 60);

        Sekolah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SekolahActionPerformed(evt);
            }
        });
        getContentPane().add(Sekolah);
        Sekolah.setBounds(90, 300, 340, 30);

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(90, 370, 73, 23);

        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(360, 370, 70, 23);

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Kelas", "Alamat", "Sekolah"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabel);
        if (tabel.getColumnModel().getColumnCount() > 0) {
            tabel.getColumnModel().getColumn(0).setResizable(false);
            tabel.getColumnModel().getColumn(1).setResizable(false);
            tabel.getColumnModel().getColumn(2).setResizable(false);
            tabel.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(70, 410, 510, 180);

        jLabel6.setIcon(new javax.swing.ImageIcon("E:\\Tugas Sekolah\\Produktif RPL\\buat icon.png")); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(380, 90, 220, 230);

        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(223, 370, 80, 23);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 610, 610);

        setBounds(0, 0, 621, 651);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String namaa = Nama.getText();
        String kelaas = Kelas.getSelectedItem().toString();
        String alamaat = Alamat.getText();
        String sekolaah = Sekolah.getText();
        
       if(Kelas.getSelectedItem()== "X RPL 1"){}
       if(Kelas.getSelectedItem()== "X RPL 2"){}
       if(Kelas.getSelectedItem()== "X RPL 3"){}
       if(Kelas.getSelectedItem()== "X RPL 4"){}
       if(Kelas.getSelectedItem()== "X RPL 5"){}
       if(Kelas.getSelectedItem()== "X RPL 6"){}
       if(Kelas.getSelectedItem()== "X EPL 7"){}
       if(Kelas.getSelectedItem()== "X TKJ 1"){}
       if(Kelas.getSelectedItem()== "X TKJ 2"){}
       if(Kelas.getSelectedItem()== "X TKJ 3"){}
       if(Kelas.getSelectedItem()== "X TKJ 4"){}
       if(Kelas.getSelectedItem()== "X TKJ 5"){}
       if(Kelas.getSelectedItem()== "X TKJ 6"){}
       
           DefaultTableModel model = (DefaultTableModel) tabel.getModel();
                   model.addRow(new Object[]{namaa,kelaas, alamaat, sekolaah});
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SekolahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SekolahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SekolahActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Alamat.setText("");
       Sekolah.setText("");
       Kelas.getSelectedItem();
       Nama.setText("");
       tabel.getModel();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Tabelbio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabelbio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabelbio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabelbio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabelbio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alamat;
    private javax.swing.JComboBox<String> Kelas;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField Sekolah;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
