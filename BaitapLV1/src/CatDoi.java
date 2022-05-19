
import java.util.*;
public class CatDoi {
    public static void catDoi(String s){             //loi IR
        int check = 1;
        StringBuilder kq = new StringBuilder();
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == '0'|| s.charAt(i) == '8' || s.charAt(i) == '9'){
                kq.append(0);
            } 
            else if(s.charAt(i)== '1'){
                kq.append(1);
            } 
            else{
                check = 0;
                break;
            }
        }
        if(check == 0){
            System.out.println("INVALID");
        }
        else{
            while(kq.charAt(0) == '0'){
                kq.deleteCharAt(0);
            }
            if(kq.length() == 0){
                System.out.println("INVALID");
            }
            else{
                
                System.out.println(kq.toString());
            }
           
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t = sc.nextInt();
        while(t-->0){
            String s;
            s = sc.nextLine();
            catDoi(s);
        }
    }
    
}
