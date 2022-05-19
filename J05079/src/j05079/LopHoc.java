package j05079;

public class LopHoc implements Comparable<LopHoc>{
    private String ma,monhoc,ten,nhom;
    public LopHoc(String ma,String monhoc,String nhom,String ten){
        this.ma = ma;
        this.monhoc = monhoc;
        this.ten = ten;
        this.nhom = nhom;       
    }
    public String getMonHoc(){
        return monhoc;
    }
    public boolean check(String s){
        if(s.equals(ma)) return true;
        else return false;
    }
    
    @Override
    public String toString(){
        return nhom+" "+ten;
    }
    
    @Override
    public int compareTo(LopHoc o){
        return (this.nhom.compareTo(o.nhom));
    }
}
