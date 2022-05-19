/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sotamphan;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class SoTamPhan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t  = Integer.parseInt(sc.nextLine());
        while(t-->0){
            int ok = 1;
            String s = sc.nextLine();
            for(int i = 0;i<s.length();i++){
                char x = s.charAt(i);
                if(x != '0' && x!= '1' && x!= '2'){
                    ok = 0;
                    break;
                }
            }
            System.out.println((ok == 1)?"YES" : "NO");
        }
    }
    
}
