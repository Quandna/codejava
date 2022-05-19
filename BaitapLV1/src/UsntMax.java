import java.util.*;
public class UsntMax { 
    public static boolean checksnt(long n) {
        if(n < 2) return false;
        for(int i = 2;i <= Math.sqrt(n);i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            long n = sc.nextLong();
            long max = 0;
            for(long i = 1;i <= Math.sqrt(n);i++)
            {
                if(n%i == 0){
                    if(checksnt(n/i)){
                        max = n/i;
                        break;
                    } else if(checksnt(i))
                    {
                        max = i;
                    }
                }
            }
            System.out.println(max);
            }
        
       sc.close();
    }//main
}
