/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j02017;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class J02017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<n;i++){
            int x = sc.nextInt();
            if(!st.empty() && (x+st.peek()) % 2 ==0) st.pop();
            else st.push(x);
        }
        System.out.println(st.size());
    }
    
}
