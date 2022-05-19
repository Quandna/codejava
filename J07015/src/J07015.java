import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07015 {
    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i<=(int) Math.sqrt(n);i++){
            if(n%i ==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> lst = (ArrayList<Integer>) ois.readObject();
        int a[] = new int[10000];
        for(Integer x: lst){
            a[x]++;
        }
        for(int i=0;i<10000;i++){
            if(a[i]>0 && isPrime(i)) System.out.println(i+ " " + a[i]);
        }
        ois.close();
    }
}