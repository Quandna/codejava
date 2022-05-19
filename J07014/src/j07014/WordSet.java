package j07014;
import java.io.*;
import java.util.*;
public class WordSet {
   private TreeSet<String> set = new TreeSet<>();
   private WordSet(){
       
   }
   public WordSet(String name) throws IOException{
       Scanner in = new Scanner(new File(name));
       while(in.hasNextLine()){
           String s = in.nextLine();
           StringTokenizer st = new StringTokenizer(s.toLowerCase());
           while(st.hasMoreTokens()){
               set.add(st.nextToken());
           }
       }
       in.close();
   }
     
   public WordSet union(WordSet s){
       WordSet u = new WordSet();
       u.set.addAll(set);
       u.set.addAll(s.set);
       return u;
   }

   public WordSet intersection(WordSet a){
       WordSet inter = new WordSet();
       inter.set.addAll(set);
       inter.set.retainAll(a.set);
       return inter;
   }
   
   
   public String toString(){
       String kq = " ";
       for(String i:set) kq= kq+i+" ";
       return kq.trim();
   }
   
}