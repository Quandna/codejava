package j01005;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class J01005 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int h = sc.nextInt();
            Tim(n,h);
        }
        sc.close();;
    }
  
  private static void Tim(int n,int h){
      for(int i = 1;i < n;i++){
          System.out.print(String.format("%.6f",  Math.sqrt(i / (n * 1.0)) * h) + " ");
      }
      System.out.println();
  }
    
}
