/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package siPenjualan;

/**
 *
 * @author SMKN4 BANDUNG
 */

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import penjualan.view.barangView;
import penjualan.view.transaksiView;
import penjualan.view.pelangganView;
public class penjualan extends javax.swing.JFrame {

    /**
     * Creates new form penjualan
     */
    public penjualan() {
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

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuHome = new javax.swing.JMenu();
        menuMaster = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        masterPelanggan = new javax.swing.JMenuItem();
        menuTransaksi = new javax.swing.JMenu();
        transaksiPembelian = new javax.swing.JMenuItem();
        transaksiPenjualan = new javax.swing.JMenuItem();
        menuLaporan = new javax.swing.JMenu();
        menuHelp = new javax.swing.JMenu();
        menuLogout = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar3.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar3.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuHome.setText("HOME");
        jMenuBar1.add(menuHome);

        menuMaster.setText("MASTER");

        jMenuItem1.setText("BARANG");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuMaster.add(jMenuItem1);

        masterPelanggan.setText("PELANGGAN");
        masterPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masterPelangganActionPerformed(evt);
            }
        });
        menuMaster.add(masterPelanggan);

        jMenuBar1.add(menuMaster);

        menuTransaksi.setText("TRANSAKSI");

        transaksiPembelian.setText("PEMBELIAN");
        menuTransaksi.add(transaksiPembelian);

        transaksiPenjualan.setText("PENJUALAN");
        transaksiPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transaksiPenjualanActionPerformed(evt);
            }
        });
        menuTransaksi.add(transaksiPenjualan);

        jMenuBar1.add(menuTransaksi);

        menuLaporan.setText("LAPORAN");
        jMenuBar1.add(menuLaporan);

        menuHelp.setText("HELP");
        jMenuBar1.add(menuHelp);

        menuLogout.setText("LOGOUT");
        jMenuBar1.add(menuLogout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void masterPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masterPelangganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_masterPelangganActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        barangView bv = new barangView();
        bv.setLocationRelativTo(null);
        bv.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void transaksiPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaksiPenjualanActionPerformed
        // TODO add your handling code here:
        transaksiView trans = null;
        try {
            trans = new transaksiView();
        }catch (SQLException ex) {
            Logger.getLogger(penjualan.class.getName()).log(Level.SEVERE, null, ex);
        }
        trans.setLocationRelativeTo(null);
        trans.setVisible(true);
    }//GEN-LAST:event_transaksiPenjualanActionPerformed

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
            java.util.logging.Logger.getLogger(penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new penjualan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem masterPelanggan;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenu menuHome;
    private javax.swing.JMenu menuLaporan;
    private javax.swing.JMenu menuLogout;
    private javax.swing.JMenu menuMaster;
    private javax.swing.JMenu menuTransaksi;
    private javax.swing.JMenuItem transaksiPembelian;
    private javax.swing.JMenuItem transaksiPenjualan;
    // End of variables declaration//GEN-END:variables
}
