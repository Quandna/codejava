/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j07031;
import java.util.*;
import java.io.*;
/**
 *
 * @author ADMIN
 */
public class J07031 {
 public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
    	ObjectInputStream ois = null;

        ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> lst1 = (ArrayList<Integer>) ois.readObject();
        
        ois = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> lst2 = (ArrayList<Integer>) ois.readObject();

        Map<Integer, Integer> map = new TreeMap<>();
        sangNguyenTo();

        for (Integer x: lst1){
            Integer y = 1000000-x;
            if (isPrime[x] && isPrime[y] && lst1.contains(y) && x<y){
                if (!lst2.contains(x) && !lst2.contains(y)) map.put(x, y);
            }
        }   
        
        for (Integer x: map.keySet()){
            System.out.println(x + " " + map.get(x));
        }
    }

    public static boolean[] isPrime = new boolean[1000001];
    public static void sangNguyenTo(){
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i = 2; i*i <= 1000000; i++){
            if(isPrime[i]){
                for(int j = i*i; j <= 1000000; j += i){
                    isPrime[j] = false;
                }
            }
        }
    }
}
