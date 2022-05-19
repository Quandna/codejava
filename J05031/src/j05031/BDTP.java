/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05031;
import java.util.*;
class BDTP implements Comparable<BDTP>{
    private String masv,ten,lop;
    private float diem1,diem2,diem3;
    
    public BDTP (String masv,String ten,String lop,float diem1,float diem2,float diem3){
        
        this.masv = masv;
        this.ten =ten;
        this.lop = lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    
    @Override
    public int compareTo(BDTP o){
        if(this.ten.compareTo(o.ten) > 0) return 1;
        else if(this.ten.compareTo(o.ten) < 0) return -1;
        else return 0;
    }
    
    @Override
    public String toString(){
        return masv+" "+ten+" "+lop+" "+String.format("%.1f", diem1)+" "+String.format("%.1f", diem2)+" "+String.format("%.1f", diem3);
    }
}