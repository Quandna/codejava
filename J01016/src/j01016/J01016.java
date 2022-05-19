package j01016;
import java.util.*;
public class J01016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a4 = 0, a7 = 0;
        for(int i = 0 ;i < s.length();i++){
            if(s.charAt(i) == '4') a4++;
            else if (s.charAt(i)=='7') a7++;          
    }
        if(a4+a7 == 4 || a4+a7 == 7){
            System.out.println("YES");
        } else System.out.println("NO");
    
}
}
