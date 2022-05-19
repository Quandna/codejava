import java.util.*;
public class Sodep1 {
    
    public static void main(String[] args) {
   
       Scanner sc = new Scanner(System.in);
            int t ;
            t = sc.nextInt();
            sc.nextLine();// them dong nay k bi dinh dau enter
            while(t  > 0) {
                      String s;
                     s = sc.nextLine();
                    int check = 0;
                    int len = s.length();
                    for(int i = 0;i <= (len/2)+1;i++)
                    {
                        if(i == (len/2)+1 &&  (s.charAt(i)-'0')%2==0)
                        {
                            check = 0;
                        }
                        else if(s.charAt(i) == s.charAt(len-i-1)&&(s.charAt(i)-'0')%2==0)
                            {
                                check = 0;
                            }
                            else {
                                check = 1;
                            break;
                        }
                    }
                    if(check == 0) System.out.println("YES");
                    else System.out.println("NO");

                t--;
            }
        
    }
}
