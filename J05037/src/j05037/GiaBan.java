/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05037;
import java.util.*;
public class GiaBan implements Comparable<GiaBan>{
    private String ma,ten,donvi;
    private long phivanchuyen,thanhtien,giabanle,gianhap,soluong;
    public GiaBan(int n,String ten,String donvi,long gianhap,long soluong){
        this.ma = "MH"+String.format("%02d", n);
        this.ten = ten;
        this.donvi=donvi;
        this.gianhap = gianhap;
        this.soluong = soluong;
        this.phivanchuyen = (long) Math.round(gianhap*soluong*0.05);
        this.thanhtien = (long) Math.round(gianhap*soluong+phivanchuyen);
        this.giabanle = (long) Math.ceil(thanhtien*1.02/soluong/100)*100;
    }
       
    public String toString(){
        return ma+" "+ten+" "+donvi+" "+(phivanchuyen)+" "+(thanhtien)+" "+giabanle;
    }
    
    @Override
    public int compareTo(GiaBan o){
        if (this.giabanle == o.giabanle){
            return 0;
        } else return (this.giabanle > o.giabanle) ?-1:1;
    }
}