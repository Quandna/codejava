/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j02034;
import java.math.*;
import java.util.*;
public class J02034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int check = 0;
        ArrayList<Integer> ds = new ArrayList<>();
        for(int i = 0;i<n;i++){
            ds.add(sc.nextInt());
        }
        for(int i = 1;i<ds.get(ds.size()-1);i++){
            if(!ds.contains(i)){
                System.out.println(i);
                check = 1;
            }
        }
        if(check == 1)return ;
        else System.out.println("Excellent!");
    }
    
}
