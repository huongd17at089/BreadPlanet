
package controller;

import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.BanhMi;

/**
 *
 * @author DinhGi
 */
public class QueryReport {
    public static DefaultTableModel reportDoanhThuNV(int thang, int nam, Connection conn){
        DefaultTableModel bang = new DefaultTableModel(new String[] {"Mã nhân viên", "Tên nhân viên", "Doanh số bán"}, 0);
        String dauthang = nam + "-" + thang + "-1";
        String cuoithang;
        if(thang < 12)
            cuoithang = nam + "-" + (thang+1) + "-1";
        else
            cuoithang = (nam+1) + "-" + "1-1";
        String sql = "SELECT nhanvien.MaNV, TenNV, doanhso\n" +
                    "FROM (\n" +
                    "SELECT MaNV, SUM(TongTriGia) AS doanhso\n" +
                    "FROM hoadon\n" +
                    "WHERE NgayLap >= ? \n" +
                    "AND NgayLap <= ? \n" +
                    "GROUP BY MaNV\n" +
                    ") AS doanhsonv, nhanvien\n" +
                    "where nhanvien.MaNV = doanhsonv.MaNV\n";
        String ma, ten;
        int doanhso;
        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ps.setString(1, dauthang);
            ps.setString(2, cuoithang);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ma = rs.getString(1);
                ten = rs.getString(2);
                doanhso = rs.getInt(3);
                bang.addRow(new Object[] {ma, ten,doanhso});
            }
            return bang;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
        
    } 
    public static DefaultTableModel reportDoanhThuBanh(int thang, int nam, Connection conn){
        DefaultTableModel bang = new DefaultTableModel(new String[] {"Mã bánh", "Tên bánh","Số lượng bán " , "Doanh số bán"}, 0);
        String dauthang = nam + "-" + thang + "-1";
        String cuoithang;
        if(thang < 12)
            cuoithang = nam + "-" + (thang+1) + "-1";
        else
            cuoithang = (nam+1) + "-" + "1-1";
        String sql = "SELECT banh.MaBanh , TenBanh, sl, sl*gia As doanhso\n" +
                        "FROM banh, \n" +
                        "(\n" +
                        "	SELECT MaBanh, sum(soluong) AS sl\n" +
                        "	FROM chitietdon\n" +
                        "	WHere MaDon IN(\n" +
                        "		SELECT MaDon\n" +
                        "		FROM hoadon\n" +
                        "		WHERE NgayLap >= ? \n" +
                        "		AND NgayLap <= ? \n" +
                        "		) \n" +
                        "	GROUP By MaBanh\n" +
                        ") AS doanhsob\n" +
                        "WHere banh.MaBanh = doanhsob.MaBanh; \n" ;
        String ma, ten;
        int soluong, doanhso;
        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ps.setString(1, dauthang);
            ps.setString(2, cuoithang);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ma = rs.getString(1);
                ten = rs.getString(2);
                soluong = rs.getInt(3);
                doanhso = rs.getInt(4);
                bang.addRow(new Object[] {ma, ten,soluong, doanhso});
            }
            return bang;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return null;
    }
    public static DefaultTableModel reportTonKho(Connection conn){
        DefaultTableModel bang = new DefaultTableModel
                                (new String[] {"Mã bánh", "Tên bánh", "Loại", "Tồn kho"}, 0);
        String ma, ten , loai;
        int ton;
        String sql = "SELECT banh.MaBanh, TenBanh, Loai, SoLuong \n" +
                        "FROM kho, banh\n" +
                        "WHERE banh.MaBanh = kho.MaBanh ";
        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ma = rs.getString(1);
                ten = rs.getString(2);
                loai = rs.getString(3);
                ton = rs.getInt(4);
                bang.addRow(new Object[] {ma, ten,loai, ton});
            }
            return bang;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
//    public static void reportDonHangNV(){
//        
//    }
    public static String reportTonBanh(String mabanh, Connection conn){
        int ton;
        String sql = "SELECT SoLuong \n" +
                        "FROM kho\n" +
                        "WHERE MaBanh = ? ";
        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ps.setString(1, mabanh);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                ton = rs.getInt(1);
                return ton + "";
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return "0";
    }
    
    public static DefaultTableModel reportNhapKho(int thang, int nam, Connection conn){
        DefaultTableModel bang = new DefaultTableModel(new String [] {"Mã phiếu", "Mã bánh", "Số lượng", "Ngày nhập"}, 0);
        String map, mab ;
        int soluong;
        String ngay;
        String sql = "SELECT * From nhapkho ";
        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                map = rs.getString(1);
                mab = rs.getString(2);
                soluong = rs.getInt(3);
                ngay = rs.getString(4);
                bang.addRow(new Object[] {map, mab,soluong, ngay});
            }
            return bang;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public static DefaultTableModel reportXuatKho(int thang, int nam, Connection conn){
        DefaultTableModel bang = new DefaultTableModel(new String [] {"Mã phiếu", "Mã bánh", "Số lượng", "Ngày xuất"}, 0);
        String map, mab ;
        int soluong;
        String ngay;
        String sql = "SELECT * From xuatkho ";
        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                map = rs.getString(1);
                mab = rs.getString(2);
                soluong = rs.getInt(3);
                ngay = rs.getString(4);
                bang.addRow(new Object[] {map, mab,soluong, ngay});
            }
            return bang;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    
}
