package j07040;
import java.io.*;
import java.lang.*;
import java.util.*;
@SuppressWarnings("unchecked")
public class J07040 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        ArrayList<String> lst1 = new ArrayList<>();
        while(sc.hasNext()){
            lst1.add(sc.next().toLowerCase());
        }
        sc.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> lst3 = (ArrayList<String>) ois.readObject();
        ArrayList<String> lst2 = new ArrayList<>();
        for(String i: lst3){
            String[]spl = i.split("\\s+");
            for(String y : spl) lst2.add(y.toLowerCase());
        }
        Set<String> set = new LinkedHashSet<>();
        for(String x : lst1){
            if(lst2.contains(x)) set.add(x);
        }
        for(String x : set) System.out.println(x);
        ois.close();
    }
}
