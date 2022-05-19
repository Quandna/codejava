package j08021;
import java.util.*;

/**
 *
 * @author ADMIN
 */
public class J08021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            Stack<Integer> st = new Stack<>();
            st.push(-1);
            int a = 0;
            for(int i = 0;i<s.length();i++){
                char x = s.charAt(i);
                if(x == '(') st.push(i);
                else {
                    st.pop();
                    if(st.size()>0) a = Math.max(a, i-st.peek());
                    if(st.size() == 0) st.push(i);
                }
            }
            System.out.println(a);
        }
    }
    
}
