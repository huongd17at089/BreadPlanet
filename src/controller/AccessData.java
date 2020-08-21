
package controller;

import com.mysql.jdbc.PreparedStatement;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;

/**
 *
 * @author DinhGi
 */


public class AccessData {

  
    public static ArrayList<BanhMi> loadListBanhMi(Connection conn){
        //  Connection conn = ConnectDB.getConnection();
        ArrayList<BanhMi> list = new ArrayList<>();
        String sql = "SELECT * FROM banh";
        String ma, ten, donvi, loai;
        int gia;
        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ma = rs.getString(1);
                ten = rs.getString(2);
                donvi = rs.getString(3);
                gia = Integer.parseInt(rs.getString(4)); 
                loai = rs.getString(5);
                list.add(new BanhMi(ma, ten, donvi, gia, loai));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       
        return list;
    }
    

    
    public static boolean insertBanhMi(BanhMi b, Connection conn) {
       //Connection conn = ConnectDB.getConnection();
      String sql= "INSERT INTO banh(MaBanh, TenBanh, DonViTinh, Gia, Loai) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ps.setString(1, b.getMa());
            ps.setString(2, b.getTen());
            ps.setString(3, b.getDonvi());
            ps.setInt(4, b.getGia());
            ps.setString(5, b.getLoai());
            ps.executeUpdate();
            return true;     
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false; 
    }
    
    public static boolean updateBanhMi(BanhMi b, Connection conn){
          String sql = "UPDATE banh SET TenBanh = ?, DonViTinh = ?, Gia = ? , Loai = ? where MaBanh = ?";
        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ps.setString(1, b.getTen());
            ps.setString(2, b.getDonvi());
            ps.setInt(3, b.getGia());
            ps.setString(4, b.getLoai());
            ps.setString(5, b.getMa());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AccessData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
     
    public static BanhMi findBanhMi(String mabanh, Connection conn){
     //   Connection conn = ConnectDB.getConnection();
        String sql= "SELECT * FROM banh" +" WHERE MaBanh = ?";
        String ma, ten, donvi, loai;
        int gia;
        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ps.setString(1, mabanh);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                ma = rs.getString(1);
                ten = rs.getString(2);
                donvi = rs.getString(3);
                gia = Integer.parseInt(rs.getString(4)); 
                loai = rs.getString(5);
                return new BanhMi(ma, ten, donvi, gia, loai);
            }else
                return null;
                
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public static ArrayList<NhanVien> loadListNhanVien(Connection conn){
       // Connection conn = ConnectDB.getConnection();
        ArrayList<NhanVien> list = new ArrayList<>();
        String sql = "SELECT * FROM nhanvien where MaNV != 'admin'";
        String ma, ten, diachi;
        String cmt, sdt;
        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ma = rs.getString(1);
                ten = rs.getString(2);
                cmt = rs.getString(3);
                sdt = rs.getString(4); 
                diachi = rs.getString(5);
                list.add(new NhanVien(ma, ten, cmt, sdt, diachi));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       
        return list;
    }
    
    public static boolean insertNhanVien(NhanVien nv, Connection conn) {
      //  Connection conn = ConnectDB.getConnection();
        String sql= "INSERT INTO nhanvien(MaNV, TenNV, CMT, SDT, DiaChi) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ps.setString(1, nv.getMa());
            ps.setString(2, nv.getTen());
            ps.setString(3, nv.getCmt());
            ps.setString(4, nv.getSdt());
            ps.setString(5, nv.getDiachi());
            ps.executeUpdate();
           // insertTaiKhoan(nv.getMa(), conn);
            return true;     
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false; 
    }
    
    public static boolean updateTaiKhoan(String ten, String mkmoi, Connection conn){
        String sql = "UPDATE taikhoan SET MatKhau = ? where TenDangNhap = ?";
        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ps.setString(1, mkmoi);
            ps.setString(2, ten);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AccessData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public static String findTaiKhoan(String tk,Connection conn){
        String sql= "SELECT * FROM taikhoan WHERE TenDangNhap = ?";

        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ps.setString(1, tk);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return rs.getString(2);
            }
            else
                return null;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public static boolean updateNhanVien(NhanVien nv, Connection conn){
        String sql = "UPDATE nhanvien SET TenNV = ? , CMT = ?, SDT = ? , DiaChi = ? where MaNV = ?";
        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ps.setString(1, nv.getTen());
            ps.setString(2, nv.getCmt());
            ps.setString(3, nv.getSdt());
            ps.setString(4, nv.getDiachi());
            ps.setString(5, nv.getMa());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AccessData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
         
    }
    
//    public static boolean deleteNhanVien(String ma, Connection conn){
//        return deleteRecord("DELETE FROM nhanvien WHERE MaNV = ?", ma, conn);
//    }
    
    public static NhanVien findNhanVien(String manv, Connection conn){
       // Connection conn = ConnectDB.getConnection();
        String sql= "SELECT * FROM nhanvien WHERE MaNV = ?";
        String ma, ten, diachi;
        String cmt, sdt;
        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ps.setString(1, manv);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                ma = rs.getString(1);
                ten = rs.getString(2);
                cmt = rs.getString(3);
                sdt = rs.getString(4); 
                diachi = rs.getString(5);
                return new NhanVien(ma, ten, cmt, sdt, diachi);
            }
            else
                return null;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public static ArrayList<KhachHang> loadListKhachHang(Connection conn){
     //   Connection conn = ConnectDB.getConnection();
        ArrayList<KhachHang> list = new ArrayList<KhachHang>();
        String sql = "SELECT * FROM khachhang";
        String ten, hang;
        int diem, sdt;
        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                sdt = Integer.parseInt(rs.getString(1));
                ten = rs.getString(2);
                diem = Integer.parseInt(rs.getString(3));
                hang = rs.getString(4);
                list.add(new KhachHang(sdt, ten, diem, hang));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       
        return list;
    }
    
    
    public static boolean insertKhachHang(KhachHang kh, Connection conn) {
      //  Connection conn = ConnectDB.getConnection();
        String sql= "INSERT INTO khachhang(SDT, TenKH, Diem, Hang) VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ps.setInt(1, kh.getSdt());
            ps.setString(2, kh.getTen());
            ps.setInt(3, kh.getDiem());
            ps.setString(4, kh.getHang());
            ps.executeUpdate();
            return true;     
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false; 
    }
    

    
    public static boolean updateKhachHang(KhachHang kh, Connection conn){
        String sql = "UPDATE khachhang SET Diem = ?, Hang = ? , TenKH = ? Where SDT = ?";
        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ps.setInt(1, kh.getDiem() );
            ps.setString(2, kh.getHang());
            
            ps.setString(3, kh.getTen());
            ps.setString(4, kh.getSdt() + "");
            ps.executeUpdate();
            return true;     
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
    

    
    
    public static KhachHang findKhachHang(String mak, Connection conn){
  //      Connection conn = ConnectDB.getConnection();
        String sql= "SELECT * FROM khachhang WHERE SDT = ?";
        String ten, hang;
        int diem, sdt;
        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ps.setString(1, mak);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                sdt = Integer.parseInt(rs.getString(1));
                ten = rs.getString(2);
                diem = Integer.parseInt(rs.getString(3));
                hang = rs.getString(4);
                return new KhachHang(sdt, ten, diem, hang);
            }else
                return null;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public  static ArrayList<ChiTietDon> loadListChiTietDon(String mad, Connection conn){
       // Connection conn = ConnectDB.getConnection();
        ArrayList<ChiTietDon> list = new ArrayList<>();
        String sql = "SELECT * FROM chitietdon WHERE MaDon = ?";
        BanhMi b;
        int soluong;
        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ps.setString(1, mad);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                b = findBanhMi(rs.getString(1), conn);
                soluong = rs.getInt(3);
                list.add(new ChiTietDon(b, soluong));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       
        return list;
    }
    
    private static boolean insertChiTietDon( String mahd, ChiTietDon chitiet, Connection conn ){
  //      Connection conn = ConnectDB.getConnection();
        String sql= "INSERT INTO chitietdon(MaDon, MaBanh, soluong) VALUES(?,?,?)";
        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ps.setString(1, mahd);
            ps.setString(2, chitiet.getBanh().getMa());
            ps.setInt(3, chitiet.getSoluong());
            ps.executeUpdate();
            return true;     
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    private static boolean insertListChiTietDon( String mahd, ArrayList<ChiTietDon> chitiet, Connection conn ){
        for(ChiTietDon c : chitiet)
            if(!insertChiTietDon(mahd, c, conn))
                return false;
        return true;
    }
    
    public  static ArrayList<HoaDon> loadListHoaDon(Connection conn){
      //  Connection conn = ConnectDB.getConnection();
        ArrayList<HoaDon> list = new ArrayList<>();
        String sql = "SELECT * FROM hoadon WHERE TrangThai  IS NULL";
        String ma;
        NhanVien nv;
        KhachHang kh;
        int chietkhau;
        ArrayList<ChiTietDon> chitiet;
        java.util.Date ngay;
        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ma = rs.getString(1);
                nv = findNhanVien(rs.getString(3), conn);
                chietkhau = rs.getInt(5);
                kh = findKhachHang(rs.getString(2), conn);
                ngay = rs.getDate(6);
                chitiet = loadListChiTietDon(ma, conn);
                list.add(new HoaDon(ma, nv, kh, chitiet,chietkhau, ngay));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       
        return list;
    }
    
    public static boolean insertHoaDon(HoaDon hd, Connection conn){
      //  Connection conn = ConnectDB.getConnection();
        String sql= "INSERT INTO hoadon(MaDon, MaKH, MaNV, TongTriGia, ChietKhau, NgayLap) VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ps.setString(1, hd.getMa());
            ps.setInt(2, hd.getKhachHang().getSdt());
            ps.setString(3, hd.getNhanVien().getMa());
            ps.setInt(4, hd.getTien());
            ps.setInt(5, hd.getChietKhau());
            ps.setTimestamp(6, new Timestamp(hd.getNgay().getTime()));
          // ps.setString(7, "default");
            ps.executeUpdate();
            insertListChiTietDon(hd.getMa(), hd.getDsBanh(), conn);
            return true;     
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    public static boolean updateTrangThaiHoadon(String ma, Connection conn){
        String sql = "UPDATE hoadon SET TrangThai = ? Where MaDon = ?";
        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ps.setString(1, "complete");
            ps.setString(2, ma);
            ps.executeUpdate();
            return true;     
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    public static boolean deleteHoaDon(String ma, Connection conn){
     //   Connection conn = ConnectDB.getConnection();
        String sql = "DELETE FROM hoadon WHERE MaDon = ?";
        try { 
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ps.setString(1, ma);
            ps.executeUpdate();
            return true;     
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    
    public static boolean insertPhieuNhapKho(String map, String mab, int soluong, Connection conn) {
      //  Connection conn = ConnectDB.getConnection();
        String sql= "INSERT INTO nhapkho(MaPhieu, MaBanh, soLuong, NgayNhap) VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ps.setString(1, map);
            ps.setString(2, mab);
            ps.setInt(3, soluong);
            ps.setTimestamp(4, new Timestamp(new java.util.Date().getTime()));
            ps.executeUpdate();
            return true;     
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false; 
    }
    
    public static boolean insertPhieuXuatKho(String map, String mab, int soluong, Connection conn) {
      //  Connection conn = ConnectDB.getConnection();
        String sql= "INSERT INTO xuatkho(MaPhieu, MaBanh, soLuong, NgayXuat) VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ps.setString(1, map);
            ps.setString(2, mab);
            ps.setInt(3, soluong);
            ps.setTimestamp(4, new Timestamp(new java.util.Date().getTime()));
            ps.executeUpdate();
            return true;     
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false; 
    }
    
    
    
    
}
