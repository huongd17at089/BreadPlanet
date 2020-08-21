
package model;

/**
 *
 * @author DinhGi
 */
public class ChiTietDon {
    BanhMi banh;
    int soluong;

    public ChiTietDon( BanhMi banh, int soluong) {
        this.banh = banh;
        this.soluong = soluong;
    }

    public BanhMi getBanh() {
        return banh;
    }

    public int getSoluong() {
        return soluong;
    }
    
    public int getTien(){
        return banh.getGia()*soluong;
    }

    @Override
    public String toString() {
        return "ChiTietDon{" + "banh=" + banh + ", soluong=" + soluong + '}';
    }
    
    public Object[] toObject() {
        return new Object[]{banh.getTen(),banh.getLoai(), soluong, getTien()};    
    }
    
}
