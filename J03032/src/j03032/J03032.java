package j03032;
import java.util.*;
public class J03032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        
        while(t-->0){
            Stack<Character> k = new Stack<>();
            String s = sc.nextLine();
            for(int i = 0;i<s.length();i++){
                if(s.charAt(i)==' '){
                    while(!k.empty()){
                        char n = k .pop();
                        System.out.print(n);
                    }
                    System.out.print(s.charAt(i));
                }
                else k.push(s.charAt(i));
            }
            while(!k.empty()){
                char n = k.pop();
                System.out.print(n);
            }
            System.out.println();
        }
        sc.close();
    }
}
