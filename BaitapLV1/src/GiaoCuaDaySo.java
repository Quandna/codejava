import java.util.*;
public class GiaoCuaDaySo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        
        TreeSet<Integer> a=new TreeSet<>();
        TreeSet<Integer> b=new TreeSet<>();
        TreeSet<Integer> c=new TreeSet<>();
        
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        for(int i=0;i<m;i++){
            b.add(sc.nextInt());
        }
        c.addAll(a);
        c.retainAll(b);
        //c.addAll(b); hop cua 2 day so
        for(int i:c){
            System.out.print(i+" ");
        }
        System.out.println("");
    }
}
