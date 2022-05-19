/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j08020;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class J08020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            boolean check = true;
            Stack<Character> st  = new Stack<>();
            for(int i = 0;i<s.length();i++){
                char x = s.charAt(i);
                if(x=='{' || x == '[' || x =='(') st.push(x);
                else if(x == '}'){
                    if(st.size() == 0) check = false;
                    else if(st.peek() == '{') st.pop();
                }
                else if(x == ')'){
                    if(st.size() == 0) check = false;
                    else if(st.peek() == '(') st.pop();
                }
                else if(x == ']'){
                    if(st.size() == 0) check = false;
                    else if(st.peek() == '[') st.pop();
                }
            }
            if(st.size()>0) check = false;
            if(check) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
