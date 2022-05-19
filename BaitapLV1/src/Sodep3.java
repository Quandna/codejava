import java.util.*;
public class Sodep3 {
//    public  static int nt( int n){
//            if(n < 2) return 0;
//            for(int i = 2;i <= Math.sqrt(n);i++) {
//                if(n % i == 0) return 0;
//            }
//            return 1;
//        }
    public static int check(String s) {
        int c = 0;
        for(int i = 0;i < s.length();i++) {
            if(s.charAt(i) == '2' || s.charAt(i) == '3' || s.charAt(i) == '5'||s.charAt(i)=='7') {
                c = 1;
            } else {
                c = 0;
                break;
            }
        }
        if(c == 1) return 1;
        else return 0;
    }
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0) {
            String s;
            s= sc.nextLine();
            if(check(s) == 0) {
                System.out.println("NO");
            } else {
                int k = 0;
                int len = s.length();
                for(int i = 0;i <= (len/2)+1;i++){
                    if(s.charAt(i) == s.charAt(len-i-1)){
                        k = 0;
                    }else if(i == (len/2)+1){
                        k = 0;
                    }
                    else{
                        k = 1;
                        break;
                    }
                }
                if(k == 0) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
