import java.util.*;
import java.math.BigInteger;
public class Hieu2songuyenlon1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            BigInteger num1,num2,num3;
            num1 = sc.nextBigInteger();
            num2 = sc.nextBigInteger();
            String s1 = "";
            String s2 = "";
            String s3="";
            num3 = num1.subtract(num2);
            num3 = num3.abs();
            s1 = num1.toString();
            s2 =num2.toString();
            s3=num3.toString();
            if(s1.length()<s2.length()){
                while(s3.length()<s2.length()){
                    s3 = "0"+s3;
                }
            } else {
                while(s3.length() < s1.length()){
                    s3 = "0"+s3;
                }
            }
            System.out.println(s3);
        }
    }
}
