
package model;

import java.util.Objects;

/**
 *
 * @author DinhGi
 */
public class BanhMi implements Comparable{
   
    private String ma, ten, donvi,  loai;
    private int gia;
    public static String[] cacdonvi = {"Package","Box","Pack"};
    public static String[] cacloai =  {"Cookie","Donut","Chesse cake","Tiramisu","chocolate",
                        "Macaron","Mochi","Mufin","Flan","Bread"};
  

    public BanhMi(String ma,String ten, String donvi, int gia, String loai) {
        this.ma = ma;
        this.ten = ten;
        this.donvi = donvi;
        this.gia = gia;
        this.loai = loai;
    }

    public BanhMi(String ma) {
        this.ma = ma;
    }

    public BanhMi() {
    }


    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getDonvi() {
        return donvi;
    }

    public int getGia() {
        return gia;
    }

    public String getLoai() {
        return loai;
    }

    @Override
    public String toString() {
        return "BanhMi{" + "ma=" + ma + ", ten=" + ten + ", donvi=" + donvi + ", gia=" + gia + ", loai=" + loai + '}';
    }
    
    public Object[] toObject() {
        return new Object[]{ma, ten, donvi, gia, loai};    
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.ma);
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
        final BanhMi other = (BanhMi) obj;
        if (!ma.equals(other.getMa())) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object o) {
        BanhMi other = (BanhMi)o;
        int b1 =  Integer.parseInt(ma.substring(1));
        int b2 = Integer.parseInt(other.ma.substring(1));
        return b1-b2;
    }
    
    
    
    
    
}
