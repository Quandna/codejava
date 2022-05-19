package j05042;
import java.util.*;
public class BXH implements Comparable<BXH>{
    private String s;
    private int c;
    private long t;
    public BXH(String s,int c,long t){
        this.s = s;
        this.c = c;
        this.t = t;
        
    }
    
    @Override
    public int compareTo(BXH o){
        if(this.c == o.c){
            if(this.t == o.t){
               return (this.s.compareTo(o.s));
            } else {
                return (this.t>o.t) ?1:-1;
            }
        } else return (this.c>o.c) ?-1:1;
    }
    
    @Override
    public String toString(){
        return s+" "+c+" "+t;
    }
}
