/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokobangunan;

import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;


/**
 *
 * @author ammar
 */
public class pengaturan extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public pengaturan() {
       initComponents();
       jam();
       tanggal();
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
        btn_dashboard = new javax.swing.JButton();
        btn_transaksi = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_jam = new javax.swing.JLabel();
        lbl_tanggal = new javax.swing.JLabel();
        btn_profile = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbl_image1 = new javax.swing.JLabel();
        btn_laporan = new javax.swing.JButton();
        btn_pengaturan = new javax.swing.JButton();
        btn_master = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 199, 80, 30));

        btn_dashboard.setBackground(new java.awt.Color(63, 57, 57));
        btn_dashboard.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_dashboard.setForeground(new java.awt.Color(255, 255, 255));
        btn_dashboard.setText("Dashboard");
        btn_dashboard.setPreferredSize(new java.awt.Dimension(223, 43));
        btn_dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dashboardActionPerformed(evt);
            }
        });
        getContentPane().add(btn_dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 239, 200, 40));

        btn_transaksi.setBackground(new java.awt.Color(63, 57, 57));
        btn_transaksi.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_transaksi.setForeground(new java.awt.Color(255, 255, 255));
        btn_transaksi.setText("Transaksi ");
        btn_transaksi.setPreferredSize(new java.awt.Dimension(223, 43));
        btn_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transaksiActionPerformed(evt);
            }
        });
        getContentPane().add(btn_transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 379, 200, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Belinda");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 39, 140, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Kasir");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 79, 70, 30));

        lbl_jam.setBackground(new java.awt.Color(255, 255, 255));
        lbl_jam.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_jam.setForeground(new java.awt.Color(255, 255, 255));
        lbl_jam.setText("19.00 A.M");
        getContentPane().add(lbl_jam, new org.netbeans.lib.awtextra.AbsoluteConstraints(1213, 89, 120, 30));

        lbl_tanggal.setBackground(new java.awt.Color(255, 255, 255));
        lbl_tanggal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_tanggal.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tanggal.setText("26 November 2077");
        getContentPane().add(lbl_tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1103, 49, 230, 40));

        btn_profile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_profile.setText("\nProfile");
        btn_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_profileActionPerformed(evt);
            }
        });
        getContentPane().add(btn_profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/profile.PNG"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 100, -1));

        lbl_image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/profile.PNG"))); // NOI18N
        lbl_image1.setText("jLabel2");
        lbl_image1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lbl_image1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 110));

        btn_laporan.setBackground(new java.awt.Color(63, 57, 57));
        btn_laporan.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_laporan.setForeground(new java.awt.Color(255, 255, 255));
        btn_laporan.setText(" Laporan    ");
        btn_laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_laporanActionPerformed(evt);
            }
        });
        getContentPane().add(btn_laporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 449, 200, 40));

        btn_pengaturan.setBackground(new java.awt.Color(63, 57, 57));
        btn_pengaturan.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_pengaturan.setForeground(new java.awt.Color(255, 255, 255));
        btn_pengaturan.setText("Pengaturan");
        btn_pengaturan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pengaturanActionPerformed(evt);
            }
        });
        getContentPane().add(btn_pengaturan, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 519, 200, 40));

        btn_master.setBackground(new java.awt.Color(63, 57, 57));
        btn_master.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_master.setForeground(new java.awt.Color(255, 255, 255));
        btn_master.setText("Master      ");
        btn_master.setPreferredSize(new java.awt.Dimension(223, 43));
        btn_master.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masterActionPerformed(evt);
            }
        });
        getContentPane().add(btn_master, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 309, 200, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dashboard.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 229, 40, 60));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/master.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 309, 40, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transaksi.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 379, 40, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/laporan.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 439, 40, 60));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pengaturan.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 519, 40, 40));

        btn_logout.setBackground(new java.awt.Color(63, 57, 57));
        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logout.png"))); // NOI18N
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        getContentPane().add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 60, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/template pegawai.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_transaksiActionPerformed

    private void btn_laporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_laporanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_laporanActionPerformed

    private void btn_pengaturanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pengaturanActionPerformed
    this.setVisible(false);
    new pengaturan().setVisible(true);
    }//GEN-LAST:event_btn_pengaturanActionPerformed

    private void btn_masterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_masterActionPerformed

    private void btn_profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_profileActionPerformed
    this.setVisible(false);
    new Profile().setVisible(true);
    }//GEN-LAST:event_btn_profileActionPerformed

    private void btn_dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dashboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_dashboardActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
    this.setVisible(false);
    new LogOut().setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(pengaturan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pengaturan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pengaturan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pengaturan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pengaturan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_dashboard;
    private javax.swing.JButton btn_laporan;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_master;
    private javax.swing.JButton btn_pengaturan;
    private javax.swing.JButton btn_profile;
    private javax.swing.JButton btn_transaksi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JLabel lbl_image1;
    private javax.swing.JLabel lbl_jam;
    private javax.swing.JLabel lbl_tanggal;
    // End of variables declaration//GEN-END:variables

    private void jam() {
        java.util.Date jam = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh.mm a");
        String jamm = dateFormat.format(jam);
        lbl_jam.setText(jamm);
    }

    private void tanggal() {
          java.util.Date tanggal = new java.util.Date();
          SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
          String tanggall = dateFormat.format(tanggal); 
          lbl_tanggal.setText(tanggall);
    }
    }
