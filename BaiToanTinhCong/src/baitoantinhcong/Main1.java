package baitoantinhcong;
import java.util.*;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TinhCong p = new TinhCong(sc.nextLine(),Long.parseLong(sc.nextLine()),Long.parseLong(sc.nextLine()),sc.nextLine());
        System.out.println(p);
    }
}
