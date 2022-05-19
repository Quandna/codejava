import java.util.*;
import java.math.BigInteger;
public class Cong2soNguyeLon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
        BigInteger num1,num2;
        num1 = sc.nextBigInteger();
        num2 = sc.nextBigInteger();
        System.out.println(num1.add(num2));
        }
    }
}
