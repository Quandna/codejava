
package j07004;
import java.util.*;
import java.io.*;
import java.util.Map.Entry;
public class J07004 {

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("DATA.in"));
        Map<Integer,Integer> s = new HashMap<Integer,Integer>();
        
        while(in.hasNextInt()){
            int i = in.nextInt();
            if(s.containsKey(i) == false){
                s.put(i, 1);
            }
            else{
                s.put(i, s.get(i)+1);
            }
        }
        for(Entry<Integer,Integer> t : s.entrySet()){
            System.out.print(t.getKey()+" ");
            System.out.println(t.getValue());
        }
    }
    
}
