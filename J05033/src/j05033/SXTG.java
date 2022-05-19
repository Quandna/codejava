package j05033;
import java.util.*;
public class SXTG implements Comparable<SXTG>{
    private int gio,phut,giay;
    public SXTG(int gio ,int phut,int giay){
        this.gio = gio;
        this.phut = phut;
        this.giay=giay;
    }
    
    @Override
    public String toString(){
        return gio+" "+phut+" "+giay;
    }
    
    @Override
    public int compareTo(SXTG o){
        if(this.gio == o.gio){
            if(this.phut == o.phut){
                if(this.giay == o.giay){
                    return 0;
                } else return (this.giay > o.giay) ?1:-1;
            }else return (this.phut > o.phut) ? 1:-1;
            
        }else return (this.gio<o.gio) ? -1:1;
        
    }
    
}
