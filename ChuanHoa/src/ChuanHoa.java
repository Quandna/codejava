import java.util.*;
import java.io.*;
public class ChuanHoa {
    public static void main(String[] args) throws IOException {
        Scanner in=new Scanner(new File("DATA.in"));
        while(in.hasNextLine()){
            String s=in.nextLine();
            if(s.equals("END")){
                break;
            }
            else System.out.println(chuanHoa(s));
            
        }}
     public static StringBuilder chuanHoa(String s) {
        StringBuilder a = new StringBuilder();
        StringTokenizer b = new StringTokenizer(s);
        while(b.hasMoreTokens()){
            String word=b.nextToken();
            a.append(Character.toUpperCase(word.charAt(0)));
            for(int i=1;i<word.length();i++){
                a.append(Character.toLowerCase(word.charAt(i)));
           }
            
            a.append(" ");
            
        } 
      a.deleteCharAt(a.length()-1);
       return a;    
    } 
    }
