package j04022;

import java.util.StringTokenizer;
import java.util.TreeSet;

public class WordSet {

    private TreeSet<String> set = new TreeSet<>();
    public WordSet(){
        
    }
    public WordSet(String name){
        StringTokenizer st = new StringTokenizer(name.toLowerCase());
        while(st.hasMoreTokens()){
            String tmp = st.nextToken();
            set.add(tmp);
        }
    }
    
    public WordSet union(WordSet s){
        WordSet u = new WordSet();
        u.set.addAll(set);
        u.set.addAll( s.set);
        return u;
    }
    
    public WordSet intersection(WordSet s ){
        WordSet u = new WordSet();
        u.set.addAll(set);
        u.set.retainAll(s.set);
        return u;
    }
    
    public String toString(){
        String kq = " ";
        for(String i : set){
            kq = kq+i+" ";
        }
        return kq.trim();
    }
    
}
