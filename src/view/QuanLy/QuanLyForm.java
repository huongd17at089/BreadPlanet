
package view.QuanLy;

import run.Login;
import static view.QuanLy.QlHhForm.qlhangform;

/**
 *
 * @author MeoMeo
 * @author DinhGi
 */
public class QuanLyForm extends javax.swing.JFrame {

    /**
     * Creates new form QuanLyForm
     */
    public QuanLyForm() {
        initComponents();
        this.setSize(1350,722);
        this.setLocationRelativeTo(null);
        qlHhButtonShadow.setVisible(false);
        nvButtonShadow.setVisible(false);
        qlBillButtonShadow.setVisible(false);
        qlKhButtonShadow.setVisible(false);
        qlKhoButtonSHadow.setVisible(false);
        xuatBaoCaoButtonShadow.setVisible(false);
        qlHhForm1.setVisible(false);
        qlCustomerForm1.setVisible(false);
        qlKhoForm1.setVisible(false);
        qlNvForm1.setVisible(false);
        qlOrderForm1.setVisible(false);
        reportForm1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exitButton = new javax.swing.JButton();
        xuatBaoCaoButtonShadow = new javax.swing.JButton();
        xuatBaoCaoButton = new javax.swing.JButton();
        qlKhButtonShadow = new javax.swing.JButton();
        qlKhButton = new javax.swing.JButton();
        qlKhoButtonSHadow = new javax.swing.JButton();
        qlKhoButton = new javax.swing.JButton();
        qlBillButtonShadow = new javax.swing.JButton();
        qlBillButton = new javax.swing.JButton();
        qlHhButtonShadow = new javax.swing.JButton();
        qlHhButton = new javax.swing.JButton();
        nvButtonShadow = new javax.swing.JButton();
        nvButton = new javax.swing.JButton();
        reportForm1 = new view.QuanLy.reportForm();
        qlCustomerForm1 = new view.QuanLy.qlCustomerForm();
        qlKhoForm1 = new view.QuanLy.qlKhoForm();
        qlOrderForm1 = new view.QuanLy.qlOrderForm();
        qlHhForm1 = new view.QuanLy.QlHhForm();
        qlNvForm1 = new view.QuanLy.qlNvForm();
        ahihihihihi = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1350, 725));
        setUndecorated(true);
        getContentPane().setLayout(null);

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/closeButton.png"))); // NOI18N
        exitButton.setBorderPainted(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setFocusPainted(false);
        exitButton.setFocusable(false);
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });
        getContentPane().add(exitButton);
        exitButton.setBounds(1270, 20, 67, 60);

        xuatBaoCaoButtonShadow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/qlReportButtonShadow.png"))); // NOI18N
        xuatBaoCaoButtonShadow.setBorderPainted(false);
        xuatBaoCaoButtonShadow.setPreferredSize(new java.awt.Dimension(245, 85));
        xuatBaoCaoButtonShadow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xuatBaoCaoButtonShadowMouseClicked(evt);
            }
        });
        getContentPane().add(xuatBaoCaoButtonShadow);
        xuatBaoCaoButtonShadow.setBounds(20, 590, 245, 85);

        xuatBaoCaoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/qlReportButton.png"))); // NOI18N
        xuatBaoCaoButton.setBorderPainted(false);
        xuatBaoCaoButton.setPreferredSize(new java.awt.Dimension(245, 85));
        xuatBaoCaoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xuatBaoCaoButtonMouseClicked(evt);
            }
        });
        getContentPane().add(xuatBaoCaoButton);
        xuatBaoCaoButton.setBounds(20, 590, 245, 85);

        qlKhButtonShadow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/qlKhButtonShadow.png"))); // NOI18N
        qlKhButtonShadow.setBorderPainted(false);
        qlKhButtonShadow.setPreferredSize(new java.awt.Dimension(245, 85));
        qlKhButtonShadow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qlKhButtonShadowMouseClicked(evt);
            }
        });
        getContentPane().add(qlKhButtonShadow);
        qlKhButtonShadow.setBounds(20, 500, 245, 85);

        qlKhButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/qlKhButton.png"))); // NOI18N
        qlKhButton.setBorderPainted(false);
        qlKhButton.setPreferredSize(new java.awt.Dimension(245, 85));
        qlKhButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qlKhButtonMouseClicked(evt);
            }
        });
        getContentPane().add(qlKhButton);
        qlKhButton.setBounds(20, 500, 245, 85);

        qlKhoButtonSHadow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/qlKhoButtonShadow.png"))); // NOI18N
        qlKhoButtonSHadow.setBorderPainted(false);
        qlKhoButtonSHadow.setPreferredSize(new java.awt.Dimension(245, 85));
        qlKhoButtonSHadow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qlKhoButtonSHadowMouseClicked(evt);
            }
        });
        getContentPane().add(qlKhoButtonSHadow);
        qlKhoButtonSHadow.setBounds(20, 410, 245, 85);

        qlKhoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/qlKhoButton.png"))); // NOI18N
        qlKhoButton.setBorderPainted(false);
        qlKhoButton.setPreferredSize(new java.awt.Dimension(245, 85));
        qlKhoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qlKhoButtonMouseClicked(evt);
            }
        });
        getContentPane().add(qlKhoButton);
        qlKhoButton.setBounds(20, 410, 245, 85);

        qlBillButtonShadow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/qlBillButtonShadow.png"))); // NOI18N
        qlBillButtonShadow.setBorderPainted(false);
        qlBillButtonShadow.setPreferredSize(new java.awt.Dimension(245, 85));
        qlBillButtonShadow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qlBillButtonShadowMouseClicked(evt);
            }
        });
        getContentPane().add(qlBillButtonShadow);
        qlBillButtonShadow.setBounds(20, 320, 245, 85);

        qlBillButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/qlBillButton.png"))); // NOI18N
        qlBillButton.setBorderPainted(false);
        qlBillButton.setPreferredSize(new java.awt.Dimension(245, 85));
        qlBillButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qlBillButtonMouseClicked(evt);
            }
        });
        getContentPane().add(qlBillButton);
        qlBillButton.setBounds(20, 320, 245, 85);

        qlHhButtonShadow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/qlHhButtonShadow.png"))); // NOI18N
        qlHhButtonShadow.setBorderPainted(false);
        qlHhButtonShadow.setPreferredSize(new java.awt.Dimension(245, 85));
        qlHhButtonShadow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qlHhButtonShadowMouseClicked(evt);
            }
        });
        getContentPane().add(qlHhButtonShadow);
        qlHhButtonShadow.setBounds(20, 230, 245, 85);

        qlHhButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/qlHhButton.png"))); // NOI18N
        qlHhButton.setBorderPainted(false);
        qlHhButton.setPreferredSize(new java.awt.Dimension(245, 85));
        qlHhButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qlHhButtonMouseClicked(evt);
            }
        });
        getContentPane().add(qlHhButton);
        qlHhButton.setBounds(20, 230, 245, 85);

        nvButtonShadow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/qlNvButtonShadow.png"))); // NOI18N
        nvButtonShadow.setBorderPainted(false);
        nvButtonShadow.setPreferredSize(new java.awt.Dimension(245, 85));
        nvButtonShadow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nvButtonShadowMouseClicked(evt);
            }
        });
        getContentPane().add(nvButtonShadow);
        nvButtonShadow.setBounds(20, 140, 245, 85);

        nvButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/qlNvButton.png"))); // NOI18N
        nvButton.setBorderPainted(false);
        nvButton.setPreferredSize(new java.awt.Dimension(245, 85));
        nvButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nvButtonMouseClicked(evt);
            }
        });
        getContentPane().add(nvButton);
        nvButton.setBounds(20, 140, 245, 85);
        getContentPane().add(reportForm1);
        reportForm1.setBounds(300, 150, 990, 530);
        getContentPane().add(qlCustomerForm1);
        qlCustomerForm1.setBounds(300, 150, 990, 530);
        getContentPane().add(qlKhoForm1);
        qlKhoForm1.setBounds(420, 150, 766, 530);
        getContentPane().add(qlOrderForm1);
        qlOrderForm1.setBounds(310, 150, 990, 530);
        getContentPane().add(qlHhForm1);
        qlHhForm1.setBounds(310, 160, 990, 530);
        getContentPane().add(qlNvForm1);
        qlNvForm1.setBounds(310, 150, 990, 530);

        ahihihihihi.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        ahihihihihi.setForeground(new java.awt.Color(255, 255, 255));
        ahihihihihi.setText("BreadPlanetManager    ");
        ahihihihihi.setPreferredSize(new java.awt.Dimension(398, 70));
        getContentPane().add(ahihihihihi);
        ahihihihihi.setBounds(20, 20, 480, 70);

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Borreder/BGmanager.png"))); // NOI18N
        getContentPane().add(BG);
        BG.setBounds(0, 0, 1351, 725);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        this.dispose();
        Login.loginform.setVisible(true);
    }//GEN-LAST:event_exitButtonMouseClicked

    private void qlHhButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qlHhButtonMouseClicked
        qlHhButtonShadow.setVisible(true);
        nvButtonShadow.setVisible(false);
        qlBillButtonShadow.setVisible(false);
        qlKhButtonShadow.setVisible(false);
        qlKhoButtonSHadow.setVisible(false);
        xuatBaoCaoButtonShadow.setVisible(false);
        qlHhForm1.setVisible(true);
        qlCustomerForm1.setVisible(false);
        qlKhoForm1.setVisible(false);
        qlNvForm1.setVisible(false);
        qlOrderForm1.setVisible(false);
        reportForm1.setVisible(false);        
    }//GEN-LAST:event_qlHhButtonMouseClicked

    private void qlHhButtonShadowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qlHhButtonShadowMouseClicked
        qlHhButtonShadow.setVisible(false);
        qlHhForm1.setVisible(false);
    }//GEN-LAST:event_qlHhButtonShadowMouseClicked

    private void nvButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nvButtonMouseClicked
        nvButtonShadow.setVisible(true);
        qlHhButtonShadow.setVisible(false);
        qlBillButtonShadow.setVisible(false);
        qlKhButtonShadow.setVisible(false);
        qlKhoButtonSHadow.setVisible(false);
        xuatBaoCaoButtonShadow.setVisible(false);
        qlHhForm1.setVisible(false);
        qlCustomerForm1.setVisible(false);
        qlKhoForm1.setVisible(false);
        qlNvForm1.setVisible(true);
        qlOrderForm1.setVisible(false);
        reportForm1.setVisible(false);        
    }//GEN-LAST:event_nvButtonMouseClicked

    private void nvButtonShadowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nvButtonShadowMouseClicked
        nvButtonShadow.setVisible(false);
        qlNvForm1.setVisible(false);
    }//GEN-LAST:event_nvButtonShadowMouseClicked

    private void qlBillButtonShadowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qlBillButtonShadowMouseClicked
        qlBillButtonShadow.setVisible(false);
        qlOrderForm1.setVisible(false);
    }//GEN-LAST:event_qlBillButtonShadowMouseClicked

    private void qlBillButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qlBillButtonMouseClicked
        qlBillButtonShadow.setVisible(true);
        qlHhButtonShadow.setVisible(false);
        nvButtonShadow.setVisible(false);
        qlKhButtonShadow.setVisible(false);
        qlKhoButtonSHadow.setVisible(false);
        xuatBaoCaoButtonShadow.setVisible(false);
        qlHhForm1.setVisible(false);
        qlCustomerForm1.setVisible(false);
        qlKhoForm1.setVisible(false);
        qlNvForm1.setVisible(false);
        qlOrderForm1.setVisible(true);
        reportForm1.setVisible(false);        
    }//GEN-LAST:event_qlBillButtonMouseClicked

    private void qlKhoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qlKhoButtonMouseClicked
        qlKhoButtonSHadow.setVisible(true);
        qlHhButtonShadow.setVisible(false);
        nvButtonShadow.setVisible(false);
        qlBillButtonShadow.setVisible(false);
        qlKhButtonShadow.setVisible(false);
        xuatBaoCaoButtonShadow.setVisible(false);      
        qlHhForm1.setVisible(false);
        qlCustomerForm1.setVisible(false);
        qlKhoForm1.setVisible(true);
        qlNvForm1.setVisible(false);
        qlOrderForm1.setVisible(false);
        reportForm1.setVisible(false);        
    }//GEN-LAST:event_qlKhoButtonMouseClicked

    private void qlKhButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qlKhButtonMouseClicked
        qlKhButtonShadow.setVisible(true);
        qlHhButtonShadow.setVisible(false);
        nvButtonShadow.setVisible(false);
        qlBillButtonShadow.setVisible(false);
        qlKhoButtonSHadow.setVisible(false);
        xuatBaoCaoButtonShadow.setVisible(false);  
        qlHhForm1.setVisible(false);
        qlCustomerForm1.setVisible(true);
        qlKhoForm1.setVisible(false);
        qlNvForm1.setVisible(false);
        qlOrderForm1.setVisible(false);
        reportForm1.setVisible(false);        
    }//GEN-LAST:event_qlKhButtonMouseClicked

    private void xuatBaoCaoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xuatBaoCaoButtonMouseClicked
        xuatBaoCaoButtonShadow.setVisible(true);
        qlHhButtonShadow.setVisible(false);
        nvButtonShadow.setVisible(false);
        qlBillButtonShadow.setVisible(false);
        qlKhButtonShadow.setVisible(false);
        qlKhoButtonSHadow.setVisible(false);
        qlHhForm1.setVisible(false);
        qlCustomerForm1.setVisible(false);
        qlKhoForm1.setVisible(false);
        qlNvForm1.setVisible(false);
        qlOrderForm1.setVisible(false);
        reportForm1.setVisible(true);
    }//GEN-LAST:event_xuatBaoCaoButtonMouseClicked

    private void qlKhoButtonSHadowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qlKhoButtonSHadowMouseClicked
        qlKhoButtonSHadow.setVisible(false);
        qlKhoForm1.setVisible(false);
    }//GEN-LAST:event_qlKhoButtonSHadowMouseClicked

    private void qlKhButtonShadowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qlKhButtonShadowMouseClicked
        qlKhButtonShadow.setVisible(false);
        qlCustomerForm1.setVisible(false);
    }//GEN-LAST:event_qlKhButtonShadowMouseClicked

    private void xuatBaoCaoButtonShadowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xuatBaoCaoButtonShadowMouseClicked
        xuatBaoCaoButtonShadow.setVisible(false);
        reportForm1.setVisible(false);
    }//GEN-LAST:event_xuatBaoCaoButtonShadowMouseClicked

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(QuanLyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(QuanLyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(QuanLyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(QuanLyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new QuanLyForm().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel ahihihihihi;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton nvButton;
    private javax.swing.JButton nvButtonShadow;
    private javax.swing.JButton qlBillButton;
    private javax.swing.JButton qlBillButtonShadow;
    private view.QuanLy.qlCustomerForm qlCustomerForm1;
    private javax.swing.JButton qlHhButton;
    private javax.swing.JButton qlHhButtonShadow;
    private view.QuanLy.QlHhForm qlHhForm1;
    private javax.swing.JButton qlKhButton;
    private javax.swing.JButton qlKhButtonShadow;
    private javax.swing.JButton qlKhoButton;
    private javax.swing.JButton qlKhoButtonSHadow;
    private view.QuanLy.qlKhoForm qlKhoForm1;
    private view.QuanLy.qlNvForm qlNvForm1;
    private view.QuanLy.qlOrderForm qlOrderForm1;
    private view.QuanLy.reportForm reportForm1;
    private javax.swing.JButton xuatBaoCaoButton;
    private javax.swing.JButton xuatBaoCaoButtonShadow;
    // End of variables declaration//GEN-END:variables
}