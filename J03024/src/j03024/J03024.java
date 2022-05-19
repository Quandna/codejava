package j03024;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class J03024 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       sc.nextLine();
       while(t-->0){
           String s = sc.nextLine();
           System.out.println(check(s));
       }
    }
    static String check(String s){
        int n =s.length();
        int a = 0,b = 0;
        for(int i = 0;i <n;i++){
            char x = s.charAt(i);
            if(x<48||x>57) return "INVALID";
            if((int) x%2==0) a++;
            else b++;
        }
        if(n%2==0&&a>b) return "YES";
        else if(n%2 != 0 && a>b) return "YES";
        return "NO";
    }
}
