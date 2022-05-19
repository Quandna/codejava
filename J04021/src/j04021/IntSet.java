
package j04021;

import java.util.*;
public class IntSet {
    private TreeSet <Integer> set = new TreeSet<>();
    public IntSet(){
        
    }
    public IntSet(int[]a){
        for(int i = 0;i<a.length;i++){
            set.add(a[i]);
        }
    }
    
    public IntSet union(IntSet b){
        IntSet u = new IntSet();
        u.set.addAll(set);
        u.set.addAll(b.set);
        return u;
    }
    
    public String toString(){
        String kq=" ";
        for(int i:set) kq = kq+i+" ";
        return kq.trim();
    }
    
}
