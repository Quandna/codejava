package j07024;
import java.util.*;
import java.io.*;
public class WordSet {
    private TreeSet<String> set = new TreeSet<>();
    private WordSet(){
    
}
    public WordSet(String name) throws FileNotFoundException{
        Scanner sc = new Scanner(new File(name));
        while(sc.hasNextLine()){
            String x = sc.nextLine();
            StringTokenizer st = new StringTokenizer(x.toLowerCase());
            while(st.hasMoreTokens()){
               set.add(st.nextToken());
           }
        }
        sc.close();
    }
    
    public WordSet difference(WordSet s){
        WordSet inter = new WordSet();
        TreeSet<String> giao = new TreeSet<>();
       inter.set.addAll(set);
       giao.addAll(set);
       giao.retainAll(s.set);
       inter.set.removeAll(giao);
       return inter;
    }
    public String toString(){
       String kq = " ";
       for(String i:set) kq= kq+i+" ";
       return kq.trim();
   }
}
