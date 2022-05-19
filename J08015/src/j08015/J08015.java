package j08015;
import java.util.*;
public class J08015 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
             HashMap<Long,Long> map=new HashMap<>();
            long n=in.nextInt();
            long s = in.nextInt();
            long a;
            for(long i=1;i<=n;i++){
                 a=in.nextLong();
                if(map.containsKey(a)==true) map.put(a, map.get(a)+1);
                else map.put(a,(long)1);
            }
            long sum=0;
        for(Long i:map.keySet()){
            if(map.containsKey(s-i)==true){
                if(i==s-i) sum+=gt(map.get(i)-1);
                else sum+=map.get(i)*map.get(s-i);
                map.put(s-i, (long)0);             
            }           
        }
            System.out.println(sum);
      
        }  
    }
    public static long gt(long n){
        long sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }   
}
