package j01017;
import java.util.*;
public class J01017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t --> 0){
            int ok = 1;
            String s = sc.nextLine();
            for (int i=0; i<s.length()-1; i++){
                char x = s.charAt(i);
                char y = s.charAt(i+1);
                if (Math.abs((int) x - (int) y) != 1){
                    ok = 0;
                    break;
                }
            }
            System.out.println((ok == 1) ? "YES" : "NO");
        }
    }
    
}
