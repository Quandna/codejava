import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.io.IOException;


/**
 * songuyento
 */
public class songuyento {
    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0 ) return false;
        }
        return true;
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> lst = (ArrayList<Integer>) ois.readObject();
        int a[] = new int[10000000];
        for(Integer x:lst){
            a[x]++;
        }
        int count = 0;
        for(int i=999999; i>0 ; i--){
            if(count ==10) break;
            if(a[i]>0 && isPrime(i)){
                System.out.println(i + " " + a[i]);
                count++;
            }
        }
        ois.close();
    }
}