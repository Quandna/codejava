package j07005;
import java.util.*;
import java.io.*;
public class J07005 {
    public static void main(String[] args) throws IOException {
        DataInputStream in=new DataInputStream(new FileInputStream("DATA.IN"));
        Map<Integer,Integer> s=new HashMap<>();
        Set<Integer> p=new HashSet<>();
        int t=0;
        for(int i=1;i<=100000;i++){
            t=in.readInt();
            if(s.containsKey(t)==false){
                s.put(t,1);
                
            }
            else{
                s.put(t, s.get(t)+1);
            }
        }
        p=s.keySet();
        ArrayList<Integer> q=new ArrayList<>(p);
        Collections.sort(q);
       for(Integer i:q){
           System.out.println(i+" "+s.get(i));
       }
    }
}
