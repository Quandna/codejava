import java.util.*;
public class XauDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            int dem = 0;
            int check = 0;
            String s = sc.next();
            int len = s.length();
            if(len % 2 == 0) {
                for(int i = 0;i < (len/2);i++) {
                if((s.charAt(i)) != (s.charAt(len-i-1))){
                    dem++;
                }
               }
                     if(dem == 1) System.out.println("YES");
                     else System.out.println("NO");
            } else {
               for(int i = 0;i < (len/2);i++) {
                if((s.charAt(i)) != (s.charAt(len-i-1))){
                    dem++;
                    }
                }  
            
           if(dem <= 1) {
               System.out.println("YES");
               
           } else {
               System.out.println("NO");
           }
          } 
        }
    }
}
