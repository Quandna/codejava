package j03040;
import java.util.*;
public class J03040 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t --> 0){
            String s = sc.nextLine();
            s = s.substring(5).replaceAll("[.]", "");
            if (check1(s) || check2(s) || check3(s) || check4(s)) System.out.println("YES");
            else System.out.println("NO");
        }
		sc.close();
	}
        
        
    static boolean check1 (String s){
        for (int i=1; i<5; i++){
            if ((int) s.charAt(i) <= (int) s.charAt(i-1)) return false;
        }
        return true;
    }
    static boolean check2 (String s){
        for (int i=1; i<5; i++){
            if (s.charAt(i) != s.charAt(i-1)) return false;
        }
        return true;
    }
    static boolean check3 (String s){
        for (int i=1; i<3; i++){
            if (s.charAt(i) != s.charAt(i-1)) return false;
        }
        if (s.charAt(4) != s.charAt(3)) return false;
        return true;
    }
    static boolean check4 (String s){
        for (int i=0; i<5; i++){
            if (s.charAt(i) != '6' && s.charAt(i) != '8') return false;
        }
        return true;
    }
}
