/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokobangunan;

import java.awt.Image;
import java.io.File;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


/**
 *
 * @author ammar
 */
public class Profile extends javax.swing.JFrame {

    /**
     * Creates new form Profile
     */
    public Profile() {
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

        btn_dashboard = new javax.swing.JButton();
        btn_transaksi = new javax.swing.JButton();
        btn_laporan = new javax.swing.JButton();
        btn_pengaturan = new javax.swing.JButton();
        btn_master = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        btn_ubahpass = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl_image = new javax.swing.JLabel();
        btn_pilih = new javax.swing.JButton();
        txt_filename = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btn_logot = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(btn_dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 200, 40));

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
        getContentPane().add(btn_transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 200, 40));

        btn_laporan.setBackground(new java.awt.Color(63, 57, 57));
        btn_laporan.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_laporan.setForeground(new java.awt.Color(255, 255, 255));
        btn_laporan.setText(" Laporan    ");
        btn_laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_laporanActionPerformed(evt);
            }
        });
        getContentPane().add(btn_laporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 200, 40));

        btn_pengaturan.setBackground(new java.awt.Color(63, 57, 57));
        btn_pengaturan.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_pengaturan.setForeground(new java.awt.Color(255, 255, 255));
        btn_pengaturan.setText("Pengaturan");
        btn_pengaturan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pengaturanActionPerformed(evt);
            }
        });
        getContentPane().add(btn_pengaturan, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 200, 40));

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
        getContentPane().add(btn_master, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 200, 40));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Telp");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/telp.PNG"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 40, 30));

        jTextField1.setText("085123456789");
        jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 200, 30));

        jLabel4.setText("Nama");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/username.PNG"))); // NOI18N
        jLabel6.setText("jLabel5");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 40, 30));

        jTextField2.setText("Belinda");
        jPanel4.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 200, 30));

        btn_ubahpass.setBackground(new java.awt.Color(51, 51, 255));
        btn_ubahpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ubah_pass-removebg-preview.png"))); // NOI18N
        btn_ubahpass.setText("Ubah Password");
        btn_ubahpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubahpassActionPerformed(evt);
            }
        });
        jPanel4.add(btn_ubahpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 200, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 70, 330, 340));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/kelola-removebg-preview.png"))); // NOI18N
        jLabel2.setText("Kelola Pengguna");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 40, 330, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dashboard.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 60));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/profile.PNG"))); // NOI18N
        lbl_image.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(lbl_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 100, 110));

        btn_pilih.setText("Pilih");
        btn_pilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pilihActionPerformed(evt);
            }
        });
        jPanel2.add(btn_pilih, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 60, 20));
        jPanel2.add(txt_filename, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 180, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 290, 340));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Foto Profil");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 290, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/master.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 40, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transaksi.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 40, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/laporan.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 40, 60));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pengaturan.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 40, 40));

        btn_logot.setBackground(new java.awt.Color(63, 57, 57));
        btn_logot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logout.png"))); // NOI18N
        btn_logot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logotActionPerformed(evt);
            }
        });
        getContentPane().add(btn_logot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 60, 50));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bg-ubah-pass.png"))); // NOI18N
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 660));

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

    private void btn_pilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pilihActionPerformed
    String filename;
    try{
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        Image getAbsolutePath = null;
        ImageIcon icon = new ImageIcon(f.toString());
        Image image = icon.getImage().getScaledInstance(lbl_image.getWidth(), lbl_image.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ic = new ImageIcon(image);
        lbl_image.setIcon(ic);
        
        filename = f.getAbsolutePath();
        txt_filename.setText(filename);
        
        
        String newpath = "src/pilih/profile";
        File directory = new File(newpath);
        if(!directory.exists()){
            directory.mkdirs();
        }
        File sourceFile = null;
        File destinationFile = null;
        String extension = filename.substring(filename.lastIndexOf('.') + 1);
        sourceFile = new File(filename);
        Date tanggal_pilih = new Date();
        String tampilan ="yyyyMMddhhmmss";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String tanggal = String.valueOf(fm.format(tanggal_pilih));
        destinationFile = new File(newpath+"/newImage" + tanggal.toString()+ "." + extension);
        
        Files.copy(sourceFile.toPath(), destinationFile.toPath());
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Error Pilih" + e);
    }
    }//GEN-LAST:event_btn_pilihActionPerformed

    private void btn_dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dashboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_dashboardActionPerformed

    private void btn_logotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logotActionPerformed
    this.setVisible(false);
    new LogOut().setVisible(true);
    }//GEN-LAST:event_btn_logotActionPerformed

    private void btn_ubahpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubahpassActionPerformed
    this.setVisible(false);
    new UbahPass().setVisible(true);
    }//GEN-LAST:event_btn_ubahpassActionPerformed

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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_dashboard;
    private javax.swing.JButton btn_laporan;
    private javax.swing.JButton btn_logot;
    private javax.swing.JButton btn_master;
    private javax.swing.JButton btn_pengaturan;
    private javax.swing.JButton btn_pilih;
    private javax.swing.JButton btn_transaksi;
    private javax.swing.JButton btn_ubahpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JTextField txt_filename;
    // End of variables declaration//GEN-END:variables
}
