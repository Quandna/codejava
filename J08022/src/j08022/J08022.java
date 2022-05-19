/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j08022;

import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author ADMIN
 */
public class J08022 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t --> 0){
            int n = sc.nextInt();
            Stack<Integer> st = new Stack<>();
            int[] arr = new int[n];
            int[] ans = new int[n];
            for (int i=0; i<n; i++) arr[i] = sc.nextInt();
            for (int i = n - 1; i >= 0; i--) {
                if (!st.empty()) {
                    while (!st.empty() && st.peek() <= arr[i]) st.pop();
                }
                ans[i] = st.empty() ? -1 : st.peek();
                st.push(arr[i]);
            }
            for (int i=0; i<n; i++) System.out.print(ans[i] + " ");
            System.out.println();
        }
		sc.close();
	}
}


    

