package tinhtoanphanso;
public class phanSo {
    private long x,y;
    public phanSo(){
        
    }
    
    public phanSo(long x,long y){
        this.x = x;
        this.y = y;
        
    }
    private long UCLN (long x, long y){
        long tmp;
        while(y!=0){
            tmp = x%y;
            x=y;
            y=tmp;
        }
        return x;
    }
    
    phanSo Tong(phanSo q){
        phanSo p = new phanSo();
        p.x = q.x*y+q.y*x;
        p.y = q.y*y;
        long t = UCLN(p.x, p.y);
        p.x/=t;
        p.y/=t;
        p.x *= p.x;
        p.y *= p.y;
        return p;
    }
    
    public String toString(){
        return x+"/"+y; 
    }
    phanSo Tich(phanSo a,phanSo b){
        phanSo c=new phanSo();
        c.x=a.x*b.x*x;
        c.y=a.y*b.y*y;
        long t=UCLN( c.x,c.y);
        c.x/=t;
        c.y/=t;
        return c;
    }
    
}
