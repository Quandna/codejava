package j05079;
import java.util.*;
public class J05079 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList <LopHoc> ds = new ArrayList<>();
        while(t-->0){
            LopHoc p = new LopHoc(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            ds.add(p);
        }
        Collections.sort(ds);
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            String s = sc.nextLine();
            System.out.print("Danh sach nhom lop mon ");
            for(int i = 0;i<ds.size();i++){
                if(ds.get(i).check(s)){
                   System.out.print(ds.get(i).getMonHoc()+":");
                    System.out.println("");
                   break; 
                }               
            }       
            for(int i = 0;i<ds.size();i++){
                if(ds.get(i).check(s)){
                    System.out.println(ds.get(i));
                }
            }
        }
    }
    
}
