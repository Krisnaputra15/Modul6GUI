/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author ASUS
 */
public class Latihan1 extends javax.swing.JFrame {

    /**
     * Creates new form Latihan1
     */
    public Latihan1() {
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

        jLabel1 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        absen = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        kelas = new javax.swing.JComboBox<>();
        jurRpl = new javax.swing.JRadioButton();
        jurTkj = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 70, 40, 30);

        jLabel3.setText("Kelas");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 120, 40, 30);

        jLabel4.setText("Absen");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 220, 80, 40);
        getContentPane().add(nama);
        nama.setBounds(130, 70, 300, 30);

        absen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                absenActionPerformed(evt);
            }
        });
        getContentPane().add(absen);
        absen.setBounds(130, 230, 300, 30);

        jButton1.setText("submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(180, 300, 120, 40);

        kelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "X RPL 1", "X RPL 2", "X RPL 3", "X RPL 4", "X RPL 5", "X RPL 6", "X RPL 7", "X TKJ 1", "X TKJ 2", "X TKJ 3", "X TKJ 4", "X TKJ 5", "X TKJ 6", "X TKJ 7" }));
        kelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelasActionPerformed(evt);
            }
        });
        getContentPane().add(kelas);
        kelas.setBounds(130, 120, 100, 30);

        buttonGroup1.add(jurRpl);
        jurRpl.setText("RPL");
        getContentPane().add(jurRpl);
        jurRpl.setBounds(130, 180, 80, 30);

        buttonGroup1.add(jurTkj);
        jurTkj.setText("TKJ");
        getContentPane().add(jurTkj);
        jurTkj.setBounds(270, 180, 100, 30);

        jLabel5.setText("Jurusan");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 180, 50, 20);

        setBounds(0, 0, 514, 505);
    }// </editor-fold>//GEN-END:initComponents

    private void absenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_absenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_absenActionPerformed

    private void kelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kelasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String name = nama.getText();
       String absent = absen.getText();
       String juurusan ="";
       String keelas = kelas.getSelectedItem().toString();
       
       if(jurRpl.isSelected()){
           juurusan = "RPL";
       }
       else if(jurTkj.isSelected()){
           juurusan = "TKJ";
       }
       else
           
       if(kelas.getSelectedItem()== "X RPL 1"){
       }
       if(kelas.getSelectedItem()== "X RPL 2"){
           
       }
       if(kelas.getSelectedItem()== "X RPL 3"){}
       if(kelas.getSelectedItem()== "X RPL 4"){}
       if(kelas.getSelectedItem()== "X RPL 5"){}
       if(kelas.getSelectedItem()== "X RPL 6"){}
       if(kelas.getSelectedItem()== "X EPL 7"){}
       if(kelas.getSelectedItem()== "X TKJ 1"){}
       if(kelas.getSelectedItem()== "X TKJ 2"){}
       if(kelas.getSelectedItem()== "X TKJ 3"){}
       if(kelas.getSelectedItem()== "X TKJ 4"){}
       if(kelas.getSelectedItem()== "X TKJ 5"){}
       if(kelas.getSelectedItem()== "X TKJ 6"){}
       
       new Framelat1(name, absent, juurusan, keelas).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField absen;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jurRpl;
    private javax.swing.JRadioButton jurTkj;
    private javax.swing.JComboBox<String> kelas;
    private javax.swing.JTextField nama;
    // End of variables declaration//GEN-END:variables
}