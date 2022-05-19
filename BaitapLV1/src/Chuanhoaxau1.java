import java.util.*;
public class Chuanhoaxau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            String s;
            s = sc.nextLine();
            System.out.println(chuanHoa(s));
        }
    }
    public static String chuanHoa(String s) {
        StringBuilder kq = new StringBuilder();
        StringTokenizer st  =   new StringTokenizer(s);
        while(st.hasMoreTokens()) { // neu con token thi tiep tuc
            String tmp = st.nextToken();
            kq.append(Character.toUpperCase(tmp.charAt(0)));
                for(int i = 1 ;i < tmp.length();i++) {
                    kq.append(Character.toLowerCase(tmp.charAt(i)));
                }
                kq.append(" ");
        }
        return kq.toString().trim();
    }
}
