
package view.QuanLy;

import exception.SaiSoDuong;
import exception.SaiTen;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.BanhMi;

/**
 *
 * @author MeoMeo
 * @author DinhGi
 */
public class QlHhForm extends javax.swing.JPanel {

    Connection con = controller.ConnectDB.getConnection();
    ArrayList<BanhMi> banh;
    DefaultTableModel bang;
    public static QlHhForm qlhangform;
    
    public QlHhForm() {
        initComponents();
        qlhangform = this;
        donVi.removeAllItems();
        for( int i = 0; i < BanhMi.cacdonvi.length; i++)
            donVi.addItem(BanhMi.cacdonvi[i]);
        loaiBanh.removeAll();
        loaiSearch.addItem("select all");
        for( int i = 0 ; i < BanhMi.cacloai.length; i++){
            loaiBanh.addItem(BanhMi.cacloai[i]);
            loaiSearch.addItem(BanhMi.cacloai[i]);
        }
        banghang.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        bang = new DefaultTableModel(new String[] {"Mã", "Tên", "Đơn vị", "Giá", "Loại"}, 0);
        banghang.setModel(bang);
        updateData();
        update();
    }
    
    private  void updateData(){
        banh = controller.AccessData.loadListBanhMi(con);
        xoaBang();
        
        for( BanhMi b: banh)
            bang.addRow(b.toObject()); 
    }
    
    private void xoaBang(){
        while(bang.getRowCount() != 0)
            bang.removeRow(0);
    }
    private void update(){
        maBanh.setText("B"+(banh.size()+1));
        tenBanh.setText("");
        giaBanh.setText("");
        fixButton.setEnabled(false);
        addButton.setEnabled(true);
        loaiBanh.setEnabled(true);
        int row = banghang.getSelectedRow();
        if( row >= 0 && row < bang.getRowCount())
            banghang.removeRowSelectionInterval(row, row);
    }
    
    private BanhMi docThongTin() throws SaiSoDuong, StringIndexOutOfBoundsException ,
                                    NumberFormatException, SaiTen {
        String ma = maBanh.getText();
        String donvi = donVi.getSelectedItem().toString();
        String loai = loaiBanh.getSelectedItem().toString();
        String ten = tenBanh.getText();
        char cc = ten.charAt(0);
        if(!ten.matches("[^0-9]{1,}")) throw new SaiTen();
        int gia = Integer.parseInt(giaBanh.getText());
        if(gia <= 0) throw new exception.SaiSoDuong();
        return new BanhMi(ma, ten, donvi, gia, loai);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        banghang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        thongbao = new javax.swing.JLabel();
        tenBanh = new javax.swing.JTextField();
        giaBanh = new javax.swing.JTextField();
        maBanh = new javax.swing.JTextField();
        loaiBanh = new javax.swing.JComboBox<>();
        donVi = new javax.swing.JComboBox<>();
        fixButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        loaiSearch = new javax.swing.JComboBox<>();
        cancel = new javax.swing.JButton();
        sapxep = new javax.swing.JButton();

        setBackground(new java.awt.Color(197, 232, 222));
        setPreferredSize(new java.awt.Dimension(990, 530));
        setLayout(null);

        jLabel6.setBackground(new java.awt.Color(51, 107, 128));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Quản lý hàng hóa");
        jLabel6.setOpaque(true);
        add(jLabel6);
        jLabel6.setBounds(-20, 10, 370, 60);

        banghang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã bánh", "Tên bánh", "Đơn vị", "Giá", "Loại"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        banghang.setFillsViewportHeight(true);
        banghang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                banghangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(banghang);

        add(jScrollPane1);
        jScrollPane1.setBounds(40, 100, 540, 404);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Tên bánh:");
        add(jLabel1);
        jLabel1.setBounds(630, 150, 90, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Đơn vị:");
        add(jLabel2);
        jLabel2.setBounds(640, 200, 60, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Giá:");
        add(jLabel3);
        jLabel3.setBounds(640, 250, 60, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Loại:");
        add(jLabel4);
        jLabel4.setBounds(640, 300, 60, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Mã bánh:");
        add(jLabel5);
        jLabel5.setBounds(630, 100, 80, 30);

        thongbao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        thongbao.setForeground(new java.awt.Color(255, 0, 0));
        add(thongbao);
        thongbao.setBounds(640, 40, 340, 40);

        tenBanh.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        add(tenBanh);
        tenBanh.setBounds(740, 150, 220, 30);

        giaBanh.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        add(giaBanh);
        giaBanh.setBounds(740, 250, 220, 30);

        maBanh.setEditable(false);
        maBanh.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        add(maBanh);
        maBanh.setBounds(740, 100, 220, 30);

        loaiBanh.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        add(loaiBanh);
        loaiBanh.setBounds(740, 300, 220, 30);

        donVi.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        donVi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(donVi);
        donVi.setBounds(740, 200, 220, 30);

        fixButton.setBackground(new java.awt.Color(255, 178, 59));
        fixButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        fixButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/fixIcon.png"))); // NOI18N
        fixButton.setText("Sửa");
        fixButton.setEnabled(false);
        fixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fixButtonActionPerformed(evt);
            }
        });
        add(fixButton);
        fixButton.setBounds(750, 390, 110, 50);

        searchButton.setBackground(new java.awt.Color(16, 166, 177));
        searchButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/searchIcon.png"))); // NOI18N
        searchButton.setText("Tìm kiếm");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        add(searchButton);
        searchButton.setBounds(610, 470, 150, 50);

        addButton.setBackground(new java.awt.Color(22, 221, 145));
        addButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/addIcon.png"))); // NOI18N
        addButton.setText("Thêm");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        add(addButton);
        addButton.setBounds(610, 390, 120, 50);

        loaiSearch.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        add(loaiSearch);
        loaiSearch.setBounds(770, 470, 210, 50);

        cancel.setBackground(new java.awt.Color(246, 81, 107));
        cancel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cancelIcon.png"))); // NOI18N
        cancel.setText("Hủy");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        add(cancel);
        cancel.setBounds(880, 390, 101, 50);

        sapxep.setBackground(new java.awt.Color(239, 47, 102));
        sapxep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/sortButton.png"))); // NOI18N
        sapxep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sapxepActionPerformed(evt);
            }
        });
        add(sapxep);
        sapxep.setBounds(510, 60, 70, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        try{
            BanhMi b = docThongTin();
            controller.AccessData.insertBanhMi(b, con);
            banh.add(b);
            bang.addRow(b.toObject());
            thongbao.setText("Thêm thành công");
        }catch(StringIndexOutOfBoundsException  | NumberFormatException | SaiSoDuong | SaiTen ex){
            JOptionPane.showMessageDialog(null, "Nhập sai!");
        }finally{
            update();
        }
        
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void banghangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_banghangMouseClicked

        int row = banghang.getSelectedRow();
        if( row < 0 || row >= bang.getRowCount()){
            // k cohang duoc chon
        }
        else{
            maBanh.setText(banghang.getValueAt(row, 0).toString());
            tenBanh.setText(banghang.getValueAt(row, 1).toString());
            String donvi = banghang.getValueAt(row, 2).toString();
            for (int i = 0; i < donVi.getItemCount(); i++) {
                if(donVi.getItemAt(i).toString().equals(donvi)){
                    donVi.setSelectedIndex(i);
                    break;
                }
            }
            giaBanh.setText(banghang.getValueAt(row, 3).toString() );
            String loai = banghang.getValueAt(row, 4).toString();
            for (int i = 0; i < loaiBanh.getItemCount(); i++) {
                if(loaiBanh.getItemAt(i).toString().equals(loai)){
                    loaiBanh.setSelectedIndex(i);
                    break;
                }
            }
            sapxep.setEnabled(false);
            fixButton.setEnabled(true);
            addButton.setEnabled(false);
        }
        
    }//GEN-LAST:event_banghangMouseClicked

    private void fixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fixButtonActionPerformed

        try{
            BanhMi b = docThongTin();
            controller.AccessData.updateBanhMi(b, con);
            int row = banghang.getSelectedRow();
            bang.removeRow(row);
            bang.insertRow(row, b.toObject());
            thongbao.setText("Sửa thành công"); 
        }catch(StringIndexOutOfBoundsException  | NumberFormatException | SaiSoDuong| SaiTen ex){
            JOptionPane.showMessageDialog(null, "Nhập Sai!");
        }finally{
            update();
        }  
    }//GEN-LAST:event_fixButtonActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        sapxep.setEnabled(true);
        loaiSearch.setSelectedIndex(0);
        updateData();
        update();
    }//GEN-LAST:event_cancelActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String chon = loaiSearch.getSelectedItem().toString();
        if(chon.equals(loaiSearch.getItemAt(0))){
            updateData();
            update();
        }else{
            xoaBang();
            for( BanhMi b: banh)
                if( b.getLoai().equals(chon))
                    bang.addRow(b.toObject());
            loaiBanh.setSelectedIndex(loaiSearch.getSelectedIndex()-1);
            loaiBanh.setEnabled(false);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void sapxepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sapxepActionPerformed
       banh = controller.AccessData.loadListBanhMi(con);
        String chon = loaiSearch.getSelectedItem().toString();
        if(chon.equals(loaiSearch.getItemAt(0))){
            Collections.sort(banh); 
            xoaBang();
            for( BanhMi b: banh)
                bang.addRow(b.toObject());
            
        }else{
            xoaBang();
            ArrayList<BanhMi> loc = new ArrayList<>();
            for( BanhMi b: banh)
                if( b.getLoai().equals(chon))
                    loc.add(b);
            Collections.sort(loc); 
            for( BanhMi b: loc)
                bang.addRow(b.toObject());
        }
//        TableRowSorter<TableModel> sorter =  new TableRowSorter(banghang.getModel());
//        sorter.setSortable(0, true);
//        ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<>();
//        sortKeys.add(new RowSorter.SortKey(0, SortOrder.DESCENDING));
//        sorter.setSortKeys(sortKeys);
//        sorter.sort();
    }//GEN-LAST:event_sapxepActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTable banghang;
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox<String> donVi;
    private javax.swing.JButton fixButton;
    private javax.swing.JTextField giaBanh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> loaiBanh;
    private javax.swing.JComboBox<String> loaiSearch;
    private javax.swing.JTextField maBanh;
    private javax.swing.JButton sapxep;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField tenBanh;
    private javax.swing.JLabel thongbao;
    // End of variables declaration//GEN-END:variables
}
