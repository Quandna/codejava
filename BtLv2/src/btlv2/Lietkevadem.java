
package btlv2;

import java.util.*;
public class Lietkevadem {//chua dung
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set1 = new HashSet<String>();
        Map<String, Integer> map1 = new HashMap<String, Integer>();
        while(sc.hasNext()){
           String tmp = sc.next();
           if(map1.containsKey(tmp) == true){
               
           map1.put(tmp, map1.get(tmp)+1);
           
        }else {
               map1.put(tmp,0);
           }
        
        }
        for(Map.Entry<String,Integer> entry : map1.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
