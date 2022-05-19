import java.util.*;
public class Ptbn {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        if(a == 0)
        {
            if(b==0)
            {
                 System.out.print("VSN");
            }
            else
            System.out.print("VN");
        }
        else{
            float c =(float) (-b)/a;
        System.out.printf("%.2f",c);
        }
        sc.close();
    }
}
