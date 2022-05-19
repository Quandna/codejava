package j01018;
import java.util.*;
public class J01018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            int check = 0;
            int tong = 0;
            for(int i = 0;i < s.length()-1;i++){
                if(Math.abs((int)s.charAt(i)-(int)s.charAt(i+1)) != 2){
                    check = 1;
                    break;
                }
                tong +=  s.charAt(i)-'0' ;
            }
            tong+= s.charAt(s.length()-1) - '0';
            if(tong%10 == 0 && check == 0){
                System.out.println("YES");
            }else System.out.println("NO");
            
        }
    }
    
}
