/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhanSoJ04003;

public class PhanSo {
    public long tu,mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public void rutGon(){
        long x = ucln(tu,mau);
        tu = tu/x;
        mau = mau/x;
    }
    
    private long ucln(long a, long b){
        while(b>0){
            long t = a%b;
                    a = b;
                    b = t;
        }
        return a;
    }
    
    @Override
    public String toString() {
        return + tu + "/" + mau;
    }
    
}
