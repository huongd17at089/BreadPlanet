
package view.QuanLy;

import exception.SaiNam;
import exception.SaiThang;
import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.io.IOException;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.DefaultCategoryDataset;
import view.BieuDo.ChartForm;

/**
 *
 * @author MeoMeo
 * @author DinhGi
 */
public class reportForm extends javax.swing.JPanel {
    private Connection con = controller.ConnectDB.getConnection();
    private DefaultTableModel bangnv, bangbanh, nhap, xuat;
    public reportForm() {

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

        jLabel6 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        doanhsobanh = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        doanhsonv = new javax.swing.JTable();
        bieudonv = new javax.swing.JButton();
        bieudobanh = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        thang1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nam1 = new javax.swing.JTextField();
        truyxuat1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        bangnhap = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        bangxuat = new javax.swing.JTable();
        thang2 = new javax.swing.JTextField();
        nam2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        truyxuat2 = new javax.swing.JButton();
        innhapxuat = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(198, 233, 217));
        setPreferredSize(new java.awt.Dimension(990, 530));
        setLayout(null);

        jLabel6.setBackground(new java.awt.Color(69, 137, 104));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Thống kê");
        jLabel6.setOpaque(true);
        add(jLabel6);
        jLabel6.setBounds(-10, 10, 300, 60);

        jTabbedPane1.setBackground(new java.awt.Color(255, 241, 219));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 241, 219));
        jPanel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Doanh số bánh");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 70, 130, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Doanh số nhân viên");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(520, 70, 170, 30);

        doanhsobanh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã bánh", "Tên Bánh", "Số lượng bán", "Doanh số bán"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        doanhsobanh.setFillsViewportHeight(true);
        doanhsobanh.setIntercellSpacing(new java.awt.Dimension(0, 0));
        doanhsobanh.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(doanhsobanh);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 100, 420, 230);

        doanhsonv.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        doanhsonv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Doanh số bán"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        doanhsonv.setFillsViewportHeight(true);
        doanhsonv.setIntercellSpacing(new java.awt.Dimension(0, 0));
        doanhsonv.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(doanhsonv);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(520, 100, 400, 230);

        bieudonv.setBackground(new java.awt.Color(114, 168, 203));
        bieudonv.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        bieudonv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/chartIcon.png"))); // NOI18N
        bieudonv.setText("Xem biểu đồ");
        bieudonv.setEnabled(false);
        bieudonv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bieudonvActionPerformed(evt);
            }
        });
        jPanel1.add(bieudonv);
        bieudonv.setBounds(660, 340, 170, 50);

        bieudobanh.setBackground(new java.awt.Color(114, 168, 203));
        bieudobanh.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        bieudobanh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/chartIcon.png"))); // NOI18N
        bieudobanh.setText("Xem biểu đồ");
        bieudobanh.setEnabled(false);
        bieudobanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bieudobanhActionPerformed(evt);
            }
        });
        jPanel1.add(bieudobanh);
        bieudobanh.setBounds(170, 340, 170, 50);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Tháng:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(240, 30, 60, 20);

        thang1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(thang1);
        thang1.setBounds(310, 20, 80, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Năm:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(430, 30, 60, 22);

        nam1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(nam1);
        nam1.setBounds(480, 20, 80, 30);

        truyxuat1.setBackground(new java.awt.Color(238, 100, 100));
        truyxuat1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        truyxuat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/querryIcon.png"))); // NOI18N
        truyxuat1.setText("Truy xuất");
        truyxuat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                truyxuat1ActionPerformed(evt);
            }
        });
        jPanel1.add(truyxuat1);
        truyxuat1.setBounds(600, 10, 150, 50);

        jLabel11.setBackground(new java.awt.Color(246, 214, 165));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Borreder/reportFormBG.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(-30, -20, 1010, 430);

        jTabbedPane1.addTab("Doanh số", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 241, 219));
        jPanel2.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Nhập Kho");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(50, 70, 90, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Xuất Kho");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(500, 70, 90, 30);

        jScrollPane3.setOpaque(false);

        bangnhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Phiếu", "Mã bánh", "Số lượng", "Ngày nhập"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bangnhap.setFillsViewportHeight(true);
        bangnhap.setRowHeight(20);
        bangnhap.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(bangnhap);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(0, 100, 380, 230);

        jScrollPane4.setOpaque(false);

        bangxuat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã phiếu", "Mã bánh", "Số lượng", "Ngày xuất"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bangxuat.setFillsViewportHeight(true);
        bangxuat.setRowHeight(20);
        bangxuat.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(bangxuat);

        jPanel2.add(jScrollPane4);
        jScrollPane4.setBounds(500, 100, 420, 230);

        thang2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(thang2);
        thang2.setBounds(280, 20, 80, 30);

        nam2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(nam2);
        nam2.setBounds(450, 20, 90, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Tháng:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(220, 20, 60, 40);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("Năm:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(400, 20, 50, 40);

        truyxuat2.setBackground(new java.awt.Color(238, 100, 100));
        truyxuat2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        truyxuat2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/querryIcon.png"))); // NOI18N
        truyxuat2.setText("Truy xuất");
        truyxuat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                truyxuat2ActionPerformed(evt);
            }
        });
        jPanel2.add(truyxuat2);
        truyxuat2.setBounds(570, 10, 140, 50);

        innhapxuat.setBackground(new java.awt.Color(219, 119, 28));
        innhapxuat.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        innhapxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/printIcon.png"))); // NOI18N
        innhapxuat.setText("In báo cáo");
        innhapxuat.setEnabled(false);
        innhapxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                innhapxuatActionPerformed(evt);
            }
        });
        jPanel2.add(innhapxuat);
        innhapxuat.setBounds(360, 340, 160, 50);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Borreder/reportFormBG.png"))); // NOI18N
        jPanel2.add(jLabel10);
        jLabel10.setBounds(-30, -40, 1010, 531);

        jTabbedPane1.addTab("Xuất/Nhập kho", jPanel2);

        add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 80, 970, 440);
    }// </editor-fold>//GEN-END:initComponents

    private DefaultCategoryDataset createDataSet(DefaultTableModel data, int col){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        int numrow = data.getRowCount();
        int soLuongBanh;
        for( int i = 0 ; i < numrow; i++){
            soLuongBanh = Integer.parseInt(data.getValueAt(i, col).toString());
            if(soLuongBanh >= 10)
                dataset.addValue(soLuongBanh,
                    "Doanh số", data.getValueAt(i, 0).toString());
        }
        return dataset;
    }
    private void truyxuat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_truyxuat1ActionPerformed
        try{
            int thang = Integer.parseInt(thang1.getText());
            if( thang < 1 || thang > 12) throw new SaiThang();
            int nam = Integer.parseInt(nam1.getText());
            if( nam < 2000 ) throw new SaiNam();
            bangnv = controller.QueryReport.reportDoanhThuNV(thang, nam, con);
            bangbanh = controller.QueryReport.reportDoanhThuBanh(thang, nam, con);
            doanhsobanh.setModel(bangbanh);
            doanhsonv.setModel(bangnv);
            bieudobanh.setEnabled(true);
            bieudonv.setEnabled(true);
        }catch( NumberFormatException | SaiThang | SaiNam ex){
            JOptionPane.showMessageDialog(null,"Nhập sai","ERROR",JOptionPane.ERROR_MESSAGE);
            thang1.setText("");
            nam1.setText("");
        }
        
    }//GEN-LAST:event_truyxuat1ActionPerformed

    private void truyxuat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_truyxuat2ActionPerformed
        try{
            int thang = Integer.parseInt(thang2.getText());
            if( thang < 1 || thang > 12) throw new SaiThang();
            int nam = Integer.parseInt(nam2.getText());
            if( nam < 2000 ) throw new SaiNam();
            nhap = controller.QueryReport.reportNhapKho(thang, nam, con);
            xuat = controller.QueryReport.reportXuatKho(thang, nam, con);
            bangnhap.setModel(nhap);
            bangxuat.setModel(xuat);
           innhapxuat.setEnabled(true);
        }catch( NumberFormatException | SaiThang | SaiNam ex){            
            JOptionPane.showMessageDialog(null,"Nhập sai","ERROR",JOptionPane.ERROR_MESSAGE);
            thang2.setText("");
            nam2.setText("");
        }
    }//GEN-LAST:event_truyxuat2ActionPerformed

    private void bieudonvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bieudonvActionPerformed

        JFreeChart barChart = ChartFactory.createBarChart3D(
                "Biểu đồ doanh số nhân viên",
                "Doanh số", "Nhân viên",
                createDataSet(bangnv, 2), PlotOrientation.VERTICAL, false, false, false);

        new ChartForm("Doanh số nhân viên", barChart).setVisible(true);
    }//GEN-LAST:event_bieudonvActionPerformed

    private void bieudobanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bieudobanhActionPerformed
        
        JFreeChart barChart = ChartFactory.createBarChart3D(
                "Biểu đồ doanh số bánh",
                "Bánh", "Doanh số",
                createDataSet(bangbanh, 2), PlotOrientation.VERTICAL, false, false, false);
        new ChartForm("Doanh số bánh", barChart).setVisible(true);
        
    }//GEN-LAST:event_bieudobanhActionPerformed

    private void innhapxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_innhapxuatActionPerformed
        try {
            view.Phieu.Report.openExcelFile(nhap, xuat);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_innhapxuatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bangnhap;
    private javax.swing.JTable bangxuat;
    private javax.swing.JButton bieudobanh;
    private javax.swing.JButton bieudonv;
    private javax.swing.JTable doanhsobanh;
    private javax.swing.JTable doanhsonv;
    private javax.swing.JButton innhapxuat;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nam1;
    private javax.swing.JTextField nam2;
    private javax.swing.JTextField thang1;
    private javax.swing.JTextField thang2;
    private javax.swing.JButton truyxuat1;
    private javax.swing.JButton truyxuat2;
    // End of variables declaration//GEN-END:variables
}
