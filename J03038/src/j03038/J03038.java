package j03038;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class J03038 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Character> set  = new HashSet<>();
        String s = sc.nextLine();
        for(int i = 0;i < s.length();i++){
            set.add(s.charAt(i));
        }
        System.out.println(set.size());
    }
    
}
