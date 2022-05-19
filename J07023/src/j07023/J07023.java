package j07023;
import java.util.*;
import java.io.*;
import java.text.*;
public class J07023 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
    	ObjectInputStream ois = null;

        ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> lst1 = (ArrayList<Integer>) ois.readObject();
        
        ois = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> lst2 = (ArrayList<Integer>) ois.readObject();

        int a[] = new int[10001], b[] = new int[10001];
        for (Integer x: lst1) a[x]++;
        for (Integer x: lst2) b[x]++;
        sangNguyenTo();

        for (int i=0; i<10000; i++){
            if (a[i] > 0 && b[i] > 0){
                if (isPrime[i] && check(i)) System.out.println(i + " " + a[i] + " " + b[i]);
            }
        }
    }

    public static boolean check(Integer x){
        String s = String.valueOf(x);
        int n = s.length();
        for (int i=0; i <= n/2; i++){
            if (s.charAt(i) != s.charAt(n-1-i)) return false;
        }
        return true;
    }
    public static boolean[] isPrime = new boolean[10001];
    public static void sangNguyenTo(){
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i = 2; i*i <= 10000; i++){
            if(isPrime[i]){
                for(int j = i*i; j <= 10000; j += i){
                    isPrime[j] = false;
                }
            }
        }
    }
}
