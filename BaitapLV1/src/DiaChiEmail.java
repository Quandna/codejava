import java.util.*;
public class DiaChiEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        String email[] = new String[100];
        for(int i = 0;i < t;i++) {
            String hoten = sc.nextLine().trim().toLowerCase();
            String ds[] = hoten.split("\\s+");
            StringBuilder tmp = new StringBuilder(ds[ds.length-1]);
            for(int j = 0;j < ds.length-1;j++){
                tmp.append(ds[j].charAt(0));
            
            }
            email[i] = tmp.toString();
        }
      
        for(int i = 0;i < t;i++){
              int d = 1;
            for(int j = i-1;j>=0;j--) {
                if(email[j].equals(email[i])) {
                    d++;
                }
            }
            if(d==1) System.out.print(email[i]);
            else System.out.print(email[i]+d);
                System.out.println("@ptit.edu.vn");
        }
    }
}
