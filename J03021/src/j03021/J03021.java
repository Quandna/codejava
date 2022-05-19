/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j03021;
import java.util.*;
public class J03021 {
static Character Chuyen(Character c){
        if (c >= 65 && c <= 67) return '2';
        else if (c >= 68 && c <= 70) return '3';
        else if (c >= 71 && c <= 73) return '4';
        else if (c >= 74 && c <= 76) return '5';
        else if (c >= 77 && c <= 79) return '6';
        else if (c >= 80 && c <= 83) return '7';
        else if (c >= 84 && c <= 86) return '8';
        else return '9';
    }
    static boolean Ktra(String s){
	int n = s.length();
	for (int i=0; i < n/2; i++){
		if (s.charAt(i) != s.charAt(n-i-1)) return false;
	}
	return true;
    }
    
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        int t =Integer.parseInt(sc.nextLine());
        while (t --> 0){
            String str = sc.nextLine().toUpperCase();
            String tmp = "";
            for (int i=0; i<str.length(); i++){
                tmp += Chuyen(str.charAt(i));
            }
                
            if (Ktra(tmp)) System.out.println("YES");
            else System.out.println("NO");
		}
		sc.close();
	}
    
    
}
