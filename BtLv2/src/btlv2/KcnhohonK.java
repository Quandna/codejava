import java.util.*;
import java.util.ArrayList;
import java.util.Comparator;
public class KcnhohonK { // chua xanh
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            int n,k;
            n = sc.nextInt();
            k = sc.nextInt();
            ArrayList<Integer> numbers = new ArrayList<>();
            int[] Arr = new int[n+5];
            int[] Luu = new int[n+5];
            for(int i = 0;i < n;i ++)
            {
                int x = sc.nextInt();
                numbers.add(x);
            }
                
          numbers.sort(Comparator.naturalOrder());
           for(int i = 0;i < n;i++) {
               Luu[i] = numbers.get(n-i-1);
           }
//           for(int i = 0;i < n;i++) {
//               System.out.print(Luu[i]+" ");
//           }
           int count = 0;
           for(int i = 0;i < n-1;i++) {
               for(int j = i+1;j < n;j++) {
                   if(Luu[i] - Luu[j] < k)
                       count++;
               }
           }
            System.out.println(count);
        }
    }
}
