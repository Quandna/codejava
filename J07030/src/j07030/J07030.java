package j07030;
import java.util.*;
import java.io.*;
public class J07030 {
     public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
    	ObjectInputStream ois = null;
         ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> lst1 = (ArrayList<Integer>) ois.readObject();
        
        ois = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> lst2 = (ArrayList<Integer>) ois.readObject();
        
        Map<Integer,Integer> map = new TreeMap<>();
        sangSNT();
        
        for(Integer x : lst1){
            Integer y = 1000000-x;
            if(isPrime[x] && isPrime[y]){
                if(x<y&&lst2.contains(y)) map.put(x, y);
            }
        }
        
        for(Integer x:map.keySet()){
            System.out.println(x+" "+map.get(x));
        }
        
    }
    
    static boolean[] isPrime = new boolean[1000001];
    static void sangSNT(){
        Arrays.fill(isPrime,true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i = 2;i*i<=1000000;i++){
            if(isPrime[i]){
                for(int j = i*i;j <= 1000000;j+=i){
                    isPrime[j] = false;
                }
            }
        }
    }
}
