package j08024;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class J08024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            int n = sc.nextInt();
            Queue<Integer> que = new ArrayDeque<>();
            que.add(9);
            int tmp = que.peek();
            while(tmp%n != 0){
                que.add(tmp*10);
                que.add(tmp*10+9);
                tmp=que.poll();
            }
            System.out.println(tmp);
        }
    }
    
}
