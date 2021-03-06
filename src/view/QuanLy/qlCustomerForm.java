

package view.QuanLy;

import controller.AccessData;
import exception.SaiSDT;
import exception.SaiSoDuong;
import exception.SaiTen;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import model.KhachHang;

/**
 *
 * @author MeoMeo
 * @author DinhGi
 */
public class qlCustomerForm extends javax.swing.JPanel {
    
    private Connection con = controller.ConnectDB.getConnection();
    private DefaultTableModel bang;
    private ArrayList<KhachHang> ds;
    
    public qlCustomerForm() {
        initComponents();
        bang = new DefaultTableModel(new String[] {"Tên", "Số điện thoại", "Điểm", "Hạng"}, 0);
        bangkh.setModel(bang);
        bangkh.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        searchBox.removeAllItems();
        searchBox.addItem("Select all");
        searchBox.addItem(KhachHang.hang1);
        searchBox.addItem(KhachHang.hang2);
        searchBox.addItem(KhachHang.hang3);
        searchBox.addItem(KhachHang.hang4);
        rank.setEditable(false);
        updateData();
        update();
    }
    
    private void updateData(){
        ds = AccessData.loadListKhachHang(con);
        xoaBang();
        
        for( KhachHang kh : ds)
            bang.addRow(kh.toObject());
    }
    
    private void xoaBang(){
        while(bang.getRowCount() != 0)
            bang.removeRow(0);
    }
    
    
    private void update(){
        tenKH.setText("");
        sdt.setText("");
        sdt.setEnabled(true);
        diem.setText("0");
        rank.setText(KhachHang.hang1);
        them.setEnabled(true);
        sua.setEnabled(false);
        //thongbao.setText("");
        searchBox.setSelectedIndex(0);
        int row = bangkh.getSelectedRow();
        if( row >= 0 && row < bang.getRowCount())
            bangkh.removeRowSelectionInterval(row, row);
    }
    
    private KhachHang docThongtin() throws SaiSDT, SaiSoDuong,
                                        StringIndexOutOfBoundsException , NumberFormatException, SaiTen{
        String ten = tenKH.getText();
        char c = ten.charAt(0);
        if(!ten.matches("[^0-9]{1,}")) throw new SaiTen();
        int sodt = Integer.parseInt(sdt.getText());
        if(sodt < 10000000 || sodt >= 100000000) throw new SaiSDT();
        int d = Integer.parseInt(diem.getText());
        if( d < 0) throw new SaiSoDuong();
        return new KhachHang(sodt, ten, d);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        thongbao = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sdt = new javax.swing.JTextField();
        diem = new javax.swing.JTextField();
        rank = new javax.swing.JTextField();
        tenKH = new javax.swing.JTextField();
        sua = new javax.swing.JButton();
        huy = new javax.swing.JButton();
        tim = new javax.swing.JButton();
        them = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        searchBox = new javax.swing.JComboBox<>();
        sapXep = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        bangkh = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 220, 162));
        setMinimumSize(new java.awt.Dimension(990, 530));
        setLayout(null);

        jLabel6.setBackground(new java.awt.Color(188, 100, 0));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Quản lý khách hàng");
        jLabel6.setOpaque(true);
        add(jLabel6);
        jLabel6.setBounds(-20, 10, 370, 60);

        thongbao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        thongbao.setForeground(new java.awt.Color(255, 0, 0));
        add(thongbao);
        thongbao.setBounds(610, 60, 350, 40);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Số điện thoại:");
        add(jLabel1);
        jLabel1.setBounds(610, 190, 140, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Điểm:");
        add(jLabel2);
        jLabel2.setBounds(610, 270, 140, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Hạng:");
        add(jLabel3);
        jLabel3.setBounds(610, 340, 140, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Tên khách hàng:");
        add(jLabel4);
        jLabel4.setBounds(610, 120, 140, 30);

        sdt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        add(sdt);
        sdt.setBounds(750, 180, 210, 40);

        diem.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        add(diem);
        diem.setBounds(750, 260, 210, 40);

        rank.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        add(rank);
        rank.setBounds(750, 330, 210, 40);

        tenKH.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        add(tenKH);
        tenKH.setBounds(750, 110, 210, 40);

        sua.setBackground(new java.awt.Color(238, 135, 27));
        sua.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/fixIcon.png"))); // NOI18N
        sua.setText("Sửa");
        sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaActionPerformed(evt);
            }
        });
        add(sua);
        sua.setBounds(750, 400, 110, 50);

        huy.setBackground(new java.awt.Color(233, 59, 92));
        huy.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        huy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cancelIcon.png"))); // NOI18N
        huy.setText("Hủy");
        huy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huyActionPerformed(evt);
            }
        });
        add(huy);
        huy.setBounds(870, 400, 100, 50);

        tim.setBackground(new java.awt.Color(38, 213, 218));
        tim.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/searchIcon.png"))); // NOI18N
        tim.setText("Tìm kiếm");
        tim.setIconTextGap(1);
        tim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timActionPerformed(evt);
            }
        });
        add(tim);
        tim.setBounds(610, 470, 139, 50);

        them.setBackground(new java.awt.Color(7, 177, 117));
        them.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/addIcon.png"))); // NOI18N
        them.setText("Thêm");
        them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themActionPerformed(evt);
            }
        });
        add(them);
        them.setBounds(610, 400, 120, 50);

        jButton5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton5.setText("Thêm");
        add(jButton5);
        jButton5.setBounds(610, 400, 60, 50);

        searchBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        searchBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(searchBox);
        searchBox.setBounds(760, 480, 210, 40);

        sapXep.setBackground(new java.awt.Color(212, 99, 78));
        sapXep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/sortButton.png"))); // NOI18N
        sapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sapXepActionPerformed(evt);
            }
        });
        add(sapXep);
        sapXep.setBounds(550, 110, 50, 40);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        bangkh.setModel(new javax.swing.table.DefaultTableModel(
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
        bangkh.setFillsViewportHeight(true);
        bangkh.setSelectionBackground(new java.awt.Color(255, 153, 51));
        bangkh.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        bangkh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bangkhMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(bangkh);

        add(jScrollPane2);
        jScrollPane2.setBounds(40, 110, 510, 404);
    }// </editor-fold>//GEN-END:initComponents

    private void themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themActionPerformed
        thongbao.setText("");
        try{
            KhachHang kh = docThongtin();
            if(ds.contains(kh))
                
                thongbao.setText("Số đã được đăng kí!");   
            else{
                thongbao.setText("Thêm thành công!");
                bang.addRow(kh.toObject());
            AccessData.insertKhachHang(kh, con); 
        }
    }   catch (StringIndexOutOfBoundsException  | NumberFormatException | SaiSDT | SaiSoDuong | SaiTen ex) {
            JOptionPane.showMessageDialog(null, "Nhập sai!");
        }finally{
            update();
            
        }
        
    }//GEN-LAST:event_themActionPerformed

    private void suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaActionPerformed
        thongbao.setText("");
        try{
            KhachHang kh = docThongtin();
            AccessData.updateKhachHang(kh, con);
            int row = bangkh.getSelectedRow();
            bang.removeRow(row);
            bang.insertRow(row, kh.toObject());
            thongbao.setText("Sửa thành công");
        }
       catch (StringIndexOutOfBoundsException  | NumberFormatException | SaiSDT | SaiSoDuong | SaiTen ex) {
            JOptionPane.showMessageDialog(null, "Nhập sai!");
        }finally{
            update();
        }
    }//GEN-LAST:event_suaActionPerformed

    private void huyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huyActionPerformed
        sapXep.setEnabled(true);
        update();
        updateData( );
    }//GEN-LAST:event_huyActionPerformed

    private void timActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timActionPerformed
        String chon = searchBox.getSelectedItem().toString();
        if(chon.equals("Select all")){
            updateData();
            update();
        }else{
            xoaBang();
            for( KhachHang k: ds)
                if( k.getHang().equals(chon))
                    bang.addRow(k.toObject());
            them.setEnabled(false);
            sua.setEnabled(true);
        }
    }//GEN-LAST:event_timActionPerformed

    private void sapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sapXepActionPerformed
        ds = controller.AccessData.loadListKhachHang(con);
        String chon = searchBox.getSelectedItem().toString();
        if(chon.equals("Select all")){
            Collections.sort(ds); 
            xoaBang();
            for( KhachHang k: ds)
                bang.addRow(k.toObject());
            
        }else{
            xoaBang();
            ArrayList<KhachHang> loc = new ArrayList<>();
            for( KhachHang k: ds)
                if( k.getHang().equals(chon))
                    loc.add(k);
           
            Collections.sort(loc); 
            for( KhachHang k: loc)
                bang.addRow(k.toObject());
        }
    }//GEN-LAST:event_sapXepActionPerformed

    private void bangkhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bangkhMouseClicked

        int row = bangkh.getSelectedRow();
        if( row < 0 || row >= bang.getRowCount()){
           //thong bao
           
       }else{
            tenKH.setText(bang.getValueAt(row, 0).toString());
            sdt.setText(bang.getValueAt(row, 1).toString());
            int d = Integer.parseInt(bang.getValueAt(row, 2).toString());
            diem.setText(d+"");
            rank.setText(bang.getValueAt(row, 3).toString());
            sdt.setEnabled(false);
            sua.setEnabled(true);
            them.setEnabled(false);
            sapXep.setEnabled(false);
        }
    }//GEN-LAST:event_bangkhMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bangkh;
    private javax.swing.JTextField diem;
    private javax.swing.JButton huy;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField rank;
    private javax.swing.JButton sapXep;
    private javax.swing.JTextField sdt;
    private javax.swing.JComboBox<String> searchBox;
    private javax.swing.JButton sua;
    private javax.swing.JTextField tenKH;
    private javax.swing.JButton them;
    private javax.swing.JLabel thongbao;
    private javax.swing.JButton tim;
    // End of variables declaration//GEN-END:variables

}
