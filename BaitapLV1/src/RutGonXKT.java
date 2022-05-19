import java.util.*;
public class RutGonXKT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String s = sc.next();
            String luu = "";
           Stack<Character> stk = new Stack<>();
           
           for(int i = 0;i < s.length();i++) {
               if(stk.isEmpty()){
                   stk.add(s.charAt(i));
               } else {
                   if(stk.peek() == s.charAt(i)){
                       stk.pop();
                   } else {
                       stk.add(s.charAt(i));
                   }
               }
           }
           while(stk.isEmpty() == false){
               luu = stk.pop() + luu;
           }
           if(luu.length()==0){
               System.out.println("Empty String");
           } else {
               System.out.println(luu);
           }
    }
}
