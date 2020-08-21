
package model;



/**
 *
 * @author DinhGi
 */
public class KhachHang implements Comparable {
    private int sdt, diem;
    private String ten, hang;
    public  static final String hang1 = "Bronze";
    public  static final String hang2 = "Sliver";
    public  static final String hang3 = "Gold";
    public  static final String hang4 = "Diamond";
    

    public KhachHang() {
    }

    public KhachHang(int sdt, String ten, int diem) {
        this.sdt = sdt;
        this.ten = ten;
        this.diem = diem;
        this.hang = hang1;
        upHang(0);
    }
    
    public KhachHang(int sdt, String ten,int diem, String hang) {
        this.sdt = sdt;
        this.diem = diem;
        this.ten = ten;
        this.hang = hang;
    }
    
    public boolean upHang(int them){
        this.diem += them;
        
        if(diem <= 100 ) { 
            if(!hang.equals(hang1)){
                hang = hang1;
                return true;
            }   
        }
        else if(diem <= 200 ) { 
            if(!hang.equals(hang2)){
                hang = hang2;
                return true;
            }   
        }   
        else if(diem <= 300 ) { 
            if(!hang.equals(hang3)){
                hang = hang3;
                return true;
            }   
        }
        else if(!hang.equals(hang4) ) { 
            
                hang = hang4;
                return true;
              
        }     
        return false   ;
    }
    
    public int getSdt() {
        return sdt;
    }

    public int getDiem() {
        return diem;
    }

    public String getTen() {
        return ten;
    }

    public String getHang() {
        return hang;
    }
    
    public int getUuDaiHang(){
        if( hang.equals(hang1)) return 1;
        if( hang.equals(hang2)) return 2;
        if( hang.equals(hang3)) return 3;
        if( hang.equals(hang4)) return 4;       
        return 0;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "sdt=" + sdt + ", diem=" + diem + ", ten=" + ten + ", hang=" + hang + '}';
    }

    
    public Object[] toObject() {
        
        return new Object[]{ten, sdt, diem, hang};    
    }

    @Override
    public int compareTo(Object o) {
        return diem - ((KhachHang)o).getDiem();
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
        final KhachHang other = (KhachHang) obj;
        if (this.sdt != other.sdt) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.sdt;
        return hash;
    }
    
    
    
    
      
}
