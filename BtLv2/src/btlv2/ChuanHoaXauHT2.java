package btlv2;
import java.util.*;
public class ChuanHoaXauHT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s;
            s = sc.nextLine();
            System.out.println(chuanHoa(s));
        }
    }
    public static String chuanHoa(String s){
          StringBuilder kq = new StringBuilder();
          StringTokenizer st  =   new StringTokenizer(s);
          String ten = st.nextToken();
          while(st.hasMoreTokens()){
              String tmp = st.nextToken();
              kq.append(Character.toUpperCase(tmp.charAt(0)));//noi 1 tu duoc viet  hoa chu cai dau tien
              for(int i = 1 ;i < tmp.length();i++) { // doi tat ca cac chu sau ve viet thuong
                    kq.append(Character.toLowerCase(tmp.charAt(i)));
                }
                kq.append(" ");
          }
          kq.delete(kq.length()-1, kq.length());
          kq.append(", ");
          kq.append(Character.toUpperCase(ten.charAt(0)));
          for(int i = 1;i<ten.length();i++){
              kq.append(Character.toUpperCase(ten.charAt(i)));
          }
         return  kq.toString().trim();
          
    }
}
