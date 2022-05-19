package j01010;
import java.util.*;
public class J01010 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=Integer.parseInt(in.nextLine());
        while(t-->0){
            String s=in.nextLine();
           long n=Long.parseLong(check(s));
           if(n==0) System.out.println("INVALID");
           else System.out.println(n);
        }
    }
    public static String check(String s){
        boolean ok=true;
        StringBuilder a=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'&&s.charAt(i)!='1'&&s.charAt(i)!='8'&&s.charAt(i)!='9'){
                ok=false;
                return "0";
            }
            else{
                if(s.charAt(i)=='0'||s.charAt(i)=='8'||s.charAt(i)=='9'){
                    a.append("0");
                }
                else{
                    a.append("1");
                }
            }
        }
        return a.toString();
    }
}


    

