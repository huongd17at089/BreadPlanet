
package model;

import java.util.Objects;

/**
 *
 * @author DinhGi
 */
public class NhanVien implements Comparable {
    private String ma, ten, diachi;
    private String sdt, cmt;

    public NhanVien(String ma, String ten, String cmt, String sdt,String diachi ) {
        this.ma = ma;
        this.ten = ten;
        this.diachi = diachi;
        this.sdt = sdt;
        this.cmt = cmt;
    }

    public NhanVien(String ma) {
        this.ma = ma;
    }
    
    

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public String getCmt() {
        return cmt;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "ma=" + ma + ", ten=" + ten + ", diachi=" + diachi + ", sdt=" + sdt + ", cmt=" + cmt + '}';
    }
    
    public Object[] toObject() {
        
        return new Object[]{ma, ten, cmt, sdt, diachi};    
    }

    @Override
    public int compareTo(Object o) {
        NhanVien other = (NhanVien) o;
        int nv1 = Integer.parseInt(ma.substring(2));
        int nv2 = Integer.parseInt(other.getMa().substring(2));
        return nv1-nv2;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.ma);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NhanVien other = (NhanVien) obj;
        if (!ma.equals(other.ma)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
