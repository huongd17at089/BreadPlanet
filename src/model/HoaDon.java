
package model;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author DinhGi
 */
public class HoaDon {
    private String ma;
    private NhanVien nhanVien;
    private KhachHang khachHang;
    private ArrayList<ChiTietDon> dsBanh;
    private int chietKhau;
    private Date ngay;

    

    public void setChietKhau(int chietKhau) {
        this.chietKhau = chietKhau;
    }

    public HoaDon(String ma, NhanVien nhanVien, KhachHang khachHang, ArrayList<ChiTietDon> dsBanh, int chietKhau, Date ngay) {
        this.ma = ma;
        this.nhanVien = nhanVien;
        this.khachHang = khachHang;
        this.dsBanh = dsBanh;
        this.chietKhau = chietKhau;
        this.ngay = ngay;
    }
    
    
    

    public HoaDon() {
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public void setDsBanh(ArrayList<ChiTietDon> dsBanh) {
        this.dsBanh = dsBanh;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }
    
    
    
    public String getMa() {
        return ma;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public ArrayList<ChiTietDon> getDsBanh() {
        return dsBanh;
    }

    public Date getNgay() {
        return ngay;
    }
    
    public void addBanh(ChiTietDon c){
        this.dsBanh.add(c);
    }

    public int getChietKhau() {
        return chietKhau;
    }

    public int getTien(){
        int tong = 0;
        for( ChiTietDon d : dsBanh)
            tong +=  d.getTien();
        return tong - (int)tong*this.chietKhau/100;
    }
    

    @Override
    public String toString() {
        String s =  "HoaDon{" + "ma=" + ma + "\n" +
                "nhanVien=" + nhanVien.toString() + "\n" +
                "khachHang=" + khachHang.toString() + "\n" + 
                "chietKhau=" + chietKhau + "\n" +
                "ngay=" + ngay  + "\n" + "chitiet \n";
        for(ChiTietDon c : dsBanh)
           s = s + c.toString() + "\n";
        return s;
    }
    
    public Object[] toObject() {
        return new Object[]{ma, nhanVien.getTen(), khachHang.getTen(), chietKhau, this.getTien()
                , new SimpleDateFormat("dd/MM/yyyy").format(ngay)};    
    }
    
    
}
