/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Bangunruang extends javax.swing.JFrame {

    /**
     * Creates new form Bangunruang
     */
    public Bangunruang() {
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
        btnbalok = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        sisicm = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        volume = new javax.swing.JButton();
        luasp = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        p = new javax.swing.JTextField();
        l = new javax.swing.JTextField();
        t = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        volume2 = new javax.swing.JButton();
        luasp2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jrjr = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        volume3 = new javax.swing.JButton();
        luasp3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PROGRAM PENCARI VOLUME BANGUN RUANG");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 410, 40);

        jPanel1.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Masukkan Panjang Sisi");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 20, 160, 30);
        jPanel1.add(sisicm);
        sisicm.setBounds(10, 60, 140, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("cm");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(160, 60, 60, 20);

        volume.setText("Volume");
        volume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volumeActionPerformed(evt);
            }
        });
        jPanel1.add(volume);
        volume.setBounds(10, 110, 90, 30);

        luasp.setText("Luas Permukaan");
        luasp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luaspActionPerformed(evt);
            }
        });
        jPanel1.add(luasp);
        luasp.setBounds(150, 110, 140, 30);

        btnbalok.addTab("Kubus", jPanel1);

        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Masukkan Panjang :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 30, 120, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Masukkan Lebar :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 80, 110, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Masukkan Tinggi :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 130, 120, 30);
        jPanel2.add(p);
        p.setBounds(140, 30, 190, 30);
        jPanel2.add(l);
        l.setBounds(140, 80, 190, 30);
        jPanel2.add(t);
        t.setBounds(140, 130, 190, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("cm");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(350, 40, 20, 14);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("cm");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(350, 140, 17, 14);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("cm");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(350, 90, 17, 14);

        volume2.setText("Volume");
        volume2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volume2ActionPerformed(evt);
            }
        });
        jPanel2.add(volume2);
        volume2.setBounds(10, 180, 100, 30);

        luasp2.setText("Luas Permukaan");
        luasp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luasp2ActionPerformed(evt);
            }
        });
        jPanel2.add(luasp2);
        luasp2.setBounds(170, 180, 140, 30);

        btnbalok.addTab("Balok", jPanel2);

        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Masukkan Panjang Jari - Jari");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 10, 180, 40);

        jrjr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrjrActionPerformed(evt);
            }
        });
        jPanel3.add(jrjr);
        jrjr.setBounds(10, 50, 120, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("cm");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(140, 54, 60, 20);

        volume3.setText("Volume");
        volume3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volume3ActionPerformed(evt);
            }
        });
        jPanel3.add(volume3);
        volume3.setBounds(10, 110, 100, 30);

        luasp3.setText("Luas Permukaan");
        luasp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luasp3ActionPerformed(evt);
            }
        });
        jPanel3.add(luasp3);
        luasp3.setBounds(150, 110, 140, 30);

        btnbalok.addTab("Bola", jPanel3);

        getContentPane().add(btnbalok);
        btnbalok.setBounds(0, 70, 460, 260);
        btnbalok.getAccessibleContext().setAccessibleName("tab3");

        setBounds(0, 0, 472, 373);
    }// </editor-fold>//GEN-END:initComponents

    private void jrjrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrjrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrjrActionPerformed

    private void volumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volumeActionPerformed
 try{   
        int sisi = Integer.parseInt(sisicm.getText());
    int hasil = sisi*sisi*sisi;
   
        JOptionPane.showMessageDialog(null,"Volume kubus adalah : " +hasil+" cm3","hasil",JOptionPane.INFORMATION_MESSAGE);
    }
    catch (NumberFormatException e){
        JOptionPane.showMessageDialog(null,"sisi tidak boleh kosong dan harus berupa angka","gagal",JOptionPane.WARNING_MESSAGE);
    }
     
    }//GEN-LAST:event_volumeActionPerformed

    private void volume2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volume2ActionPerformed
   try{
        int panjang = Integer.parseInt(p.getText());
   int lebar = Integer.parseInt(l.getText());
   int tinggi = Integer.parseInt(t.getText());
   int hasil = panjang*lebar*tinggi; 
   
    
        JOptionPane.showMessageDialog(null,"Volume balok adalah : " +hasil+" cm3","hasil",JOptionPane.INFORMATION_MESSAGE);
    }
    catch (Exception e){
        JOptionPane.showMessageDialog(null,"Error : " +e,"gagal",JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_volume2ActionPerformed

    private void volume3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volume3ActionPerformed
   try{
        int jarijari = Integer.parseInt(jrjr.getText());
   double hasil = 22/7*4/3*jarijari*jarijari*jarijari;
   
        JOptionPane.showMessageDialog(null,"Volume bola adalah : " +hasil+" cm3","hasil",JOptionPane.INFORMATION_MESSAGE);
    }
    catch (Exception e){
        JOptionPane.showMessageDialog(null,"Error : " +e,"gagal",JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_volume3ActionPerformed

    private void luaspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luaspActionPerformed
      try{
        int sisi = Integer.parseInt(sisicm.getText());
    int hasil = (sisi*sisi)*6;
   
        JOptionPane.showMessageDialog(null,"Luas permukaan kubus adalah : " +hasil+" cm2","hasil",JOptionPane.INFORMATION_MESSAGE);
    }
    catch (NumberFormatException e){
        JOptionPane.showMessageDialog(null,"" +e,"Gagal",JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_luaspActionPerformed

    private void luasp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luasp2ActionPerformed
    try{
        int panjang = Integer.parseInt(p.getText());
   int lebar = Integer.parseInt(l.getText());
   int tinggi = Integer.parseInt(t.getText());
   int hasil = (2*panjang*lebar)+(2*panjang*tinggi)+(2*lebar*tinggi); 
   
   
        JOptionPane.showMessageDialog(null,"Luas permukaan balok adalah : " +hasil+" cm2","hasil",JOptionPane.INFORMATION_MESSAGE);
    }
    catch (Exception e){
        JOptionPane.showMessageDialog(null,"Error : " +e,"gagal",JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_luasp2ActionPerformed

    private void luasp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luasp3ActionPerformed
   try{
        int jarijari = Integer.parseInt(jrjr.getText());
   double hasil = 22/7*4*jarijari*jarijari;
  
        JOptionPane.showMessageDialog(null,"Luas permukaan bola adalah : " +hasil+" cm2","hasil",JOptionPane.INFORMATION_MESSAGE);
    }
    catch (Exception e){
        JOptionPane.showMessageDialog(null,"Error : " +e,"gagal",JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_luasp3ActionPerformed

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
            java.util.logging.Logger.getLogger(Bangunruang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bangunruang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bangunruang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bangunruang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bangunruang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane btnbalok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jrjr;
    private javax.swing.JTextField l;
    private javax.swing.JButton luasp;
    private javax.swing.JButton luasp2;
    private javax.swing.JButton luasp3;
    private javax.swing.JTextField p;
    private javax.swing.JTextField sisicm;
    private javax.swing.JTextField t;
    private javax.swing.JButton volume;
    private javax.swing.JButton volume2;
    private javax.swing.JButton volume3;
    // End of variables declaration//GEN-END:variables
}
