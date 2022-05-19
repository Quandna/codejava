package j07007;
import java.util.*;
import java.io.*;
class WordSet {
    private WordSet(){
    
}
    private TreeSet<String> set = new TreeSet<>();
    public WordSet(String name) throws IOException{
        Scanner sc = new Scanner(new File(name));
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s);
            while(st.hasMoreTokens()){
                set.add(st.nextToken().toLowerCase());
            }
        }
        sc.close();
    }
    
    public WordSet union(WordSet s){
       WordSet u = new WordSet();
       u.set.addAll(set);
       u.set.addAll(s.set);
       return u;
   }
    
    public String toString(){
        String kq = "";
        for(String i:set){
            if(i!=set.last()){
                kq = kq+i+"\n";
            } else {
                kq = kq+i;
            }
            
        }
        return kq;
    }
    
    
}
