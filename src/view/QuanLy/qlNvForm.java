
package view.QuanLy;

import exception.SaiCMT;
import exception.SaiSDT;
import exception.SaiTen;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import model.*;

/**
 *
 * @author MeoMeo
 * @author DinhGi
 */
public class qlNvForm extends javax.swing.JPanel {

    Connection con = controller.ConnectDB.getConnection();
    ArrayList<NhanVien> dsnv;
    DefaultTableModel bang;
    
    public qlNvForm() {
        initComponents();
        bang = new DefaultTableModel(new String[] {"Mã", "Tên", "CMT", "Số điện thoại", "Địa chỉ"}, 0);
        nvTable.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        nvTable.setModel(bang);
        updateData();
        update();
    }
    
    private void updateData(){
        dsnv = controller.AccessData.loadListNhanVien(con);
        xoaBang();
        for( NhanVien nv: dsnv)
            bang.addRow(nv.toObject());
    }
    
    private void xoaBang(){
        while( bang.getRowCount() != 0)
            bang.removeRow(0);
    }
    
    private void update(){
        arangeButton.setEnabled(true);
        maNV.setText( "NV" + (dsnv.size()+1));
        addButton.setEnabled(true);
        fixButton.setEnabled(false);
        tenNV.setText("");
        SDT.setText("");
        diaChi.setText("");
        CMT.setText("");
        int row = nvTable.getSelectedRow();
        if( row >= 0 && row < bang.getRowCount())
            nvTable.removeRowSelectionInterval(row, row);
    }
    
    private NhanVien docThongTin(  ) throws SaiSDT, SaiCMT, StringIndexOutOfBoundsException, SaiTen{
        String ma = maNV.getText();
        String ten = tenNV.getText();
        char c = ten.charAt(0);
        if(!ten.matches("[^0-9]{1,}")) throw new SaiTen();
        String sdt = SDT.getText();
        if( !sdt.matches("[0-9]{1,}")) throw new SaiSDT();
        String cmt = CMT.getText();
        if( !cmt.matches("[0-9]{1,}")) throw new SaiCMT();
        String diachi = diaChi.getText();
        c = diachi.charAt(0);
        if(!diachi.matches("[^0-9]{1,}")) throw new SaiTen();
        return new NhanVien(ma, ten, cmt, sdt, diachi);
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
        nvTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        maNV = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tenNV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CMT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        SDT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        diaChi = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        fixButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        arangeButton = new javax.swing.JButton();
        CanhBao = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(191, 248, 221));
        setPreferredSize(new java.awt.Dimension(990, 530));
        setLayout(null);

        nvTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "CMT", "Số điện thoại", "Địa chỉ"
            }
        ));
        nvTable.setFillsViewportHeight(true);
        nvTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nvTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(nvTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(30, 100, 480, 404);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel1.setText("Mã nhân viên:");
        add(jLabel1);
        jLabel1.setBounds(540, 130, 130, 40);

        maNV.setEditable(false);
        maNV.setBackground(new java.awt.Color(204, 204, 255));
        maNV.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        add(maNV);
        maNV.setBounds(700, 130, 250, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel2.setText("Tên nhân viên:");
        add(jLabel2);
        jLabel2.setBounds(540, 190, 130, 40);

        tenNV.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        add(tenNV);
        tenNV.setBounds(700, 190, 250, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel3.setText("CMT:");
        add(jLabel3);
        jLabel3.setBounds(540, 250, 50, 40);

        CMT.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        add(CMT);
        CMT.setBounds(700, 250, 250, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel4.setText("Số điện thoại:");
        add(jLabel4);
        jLabel4.setBounds(540, 310, 120, 40);

        SDT.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        add(SDT);
        SDT.setBounds(700, 320, 250, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel5.setText("Địa chỉ:");
        add(jLabel5);
        jLabel5.setBounds(540, 370, 80, 40);

        diaChi.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        add(diaChi);
        diaChi.setBounds(700, 380, 250, 30);

        addButton.setBackground(new java.awt.Color(25, 142, 169));
        addButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/addIcon.png"))); // NOI18N
        addButton.setText("Thêm");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        add(addButton);
        addButton.setBounds(560, 450, 120, 50);

        fixButton.setBackground(new java.awt.Color(232, 161, 52));
        fixButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        fixButton.setForeground(new java.awt.Color(255, 255, 255));
        fixButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/fixIcon.png"))); // NOI18N
        fixButton.setText("Sửa");
        fixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fixButtonActionPerformed(evt);
            }
        });
        add(fixButton);
        fixButton.setBounds(710, 450, 110, 50);

        deleteButton.setBackground(new java.awt.Color(239, 67, 64));
        deleteButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cancelIcon.png"))); // NOI18N
        deleteButton.setText("Hủy");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        add(deleteButton);
        deleteButton.setBounds(840, 450, 110, 50);

        arangeButton.setBackground(new java.awt.Color(250, 107, 104));
        arangeButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        arangeButton.setForeground(new java.awt.Color(255, 255, 255));
        arangeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/sortButton.png"))); // NOI18N
        arangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arangeButtonActionPerformed(evt);
            }
        });
        add(arangeButton);
        arangeButton.setBounds(460, 60, 50, 40);

        CanhBao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CanhBao.setForeground(new java.awt.Color(251, 16, 16));
        add(CanhBao);
        CanhBao.setBounds(530, 60, 420, 30);

        jLabel6.setBackground(new java.awt.Color(26, 136, 115));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Quản lý nhân viên");
        jLabel6.setOpaque(true);
        add(jLabel6);
        jLabel6.setBounds(-30, 10, 370, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        updateData();
        update();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        try {
            NhanVien nv = docThongTin();
            controller.AccessData.insertNhanVien(nv, con);
            bang.addRow(nv.toObject());
            dsnv.add(nv);
        } catch (SaiSDT | SaiCMT | StringIndexOutOfBoundsException | SaiTen ex) {
            JOptionPane.showMessageDialog(null, "Nhập sai!");
        } finally{
            update();
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void arangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arangeButtonActionPerformed
        dsnv = controller.AccessData.loadListNhanVien(con);
        Collections.sort(dsnv); 
        xoaBang();
        for( NhanVien nv : dsnv)
            bang.addRow(nv.toObject());
    }//GEN-LAST:event_arangeButtonActionPerformed

    private void fixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fixButtonActionPerformed
        try {
            NhanVien nv =  docThongTin();
            int row = nvTable.getSelectedRow();
            bang.removeRow(row);
            bang.insertRow(row, nv.toObject());
            controller.AccessData.updateNhanVien(nv, con);
        } catch (SaiSDT | SaiCMT | StringIndexOutOfBoundsException | SaiTen ex) {
            JOptionPane.showMessageDialog(null, "Nhập sai!");
        }finally{
            update();
        }
        
    }//GEN-LAST:event_fixButtonActionPerformed

    private void nvTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nvTableMouseClicked
        int row = nvTable.getSelectedRow();
        if( row < 0 || row >= bang.getRowCount()){
            // k cohang duoc chon
        }
        else{
            maNV.setText(bang.getValueAt(row, 0).toString());
            tenNV.setText(bang.getValueAt(row, 1).toString());
            CMT.setText(bang.getValueAt(row, 2).toString());
            SDT.setText(bang.getValueAt(row, 3).toString());
            diaChi.setText(bang.getValueAt(row, 4).toString());
            fixButton.setEnabled(true);
            addButton.setEnabled(false);
        }
        arangeButton.setEnabled(false);
    }//GEN-LAST:event_nvTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CMT;
    private javax.swing.JLabel CanhBao;
    private javax.swing.JTextField SDT;
    private javax.swing.JButton addButton;
    private javax.swing.JButton arangeButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField diaChi;
    private javax.swing.JButton fixButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField maNV;
    private javax.swing.JTable nvTable;
    private javax.swing.JTextField tenNV;
    // End of variables declaration//GEN-END:variables
}
