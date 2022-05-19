

public class TinhToanPhanSo {
    private long tuA,mauA,tuB,mauB;
    private long tuC,mauC,tuD,mauD;
    public TinhToanPhanSo(long tuA, long mauA, long tuB, long mauB) {
        this.tuA = tuA;
        this.mauA = mauA;
        this.tuB = tuB;
        this.mauB = mauB;
        this.tuC = tinhTuC(this.tuA, this.mauA, this.tuB, this.mauB);
        this.mauC = tinhMauC(this.tuA, this.mauA, this.tuB, this.mauB);
        this.tuD = tinhTuD(this.tuA, this.mauA, this.tuB, this.mauB,this.tuC,this.mauC);
        this.mauD = tinhMauD(this.tuA, this.mauA, this.tuB, this.mauB,this.tuC,this.mauC);
    }
    //this.tuA, this.mauA, this.tuB, this.mauB
    
    private long tinhTuC(long tuA,long mauA,long tuB,long mauB){
        long tuC = (tuA*mauB+mauA*tuB)*(tuA*mauB+mauA*tuB);
        long mauC = (mauA*mauB)*(mauA*mauB);    
        long x = gcd(tuC,mauC);
        tuC = tuC/x;
        return tuC;

    }
    private long tinhMauC(long tuA,long mauA,long tuB,long mauB){
        long tuC = (tuA*mauB+mauA*tuB);
        long mauC = (mauA*mauB);    
        long x = gcd(tuC,mauC);    
        mauC=mauC/x;
        return mauC*mauC;
    }
    
    private long tinhTuD(long tuA, long mauA, long tuB, long mauB,long tuC,long mauC) {
        long tuD = tuA*tuB*tuC;
        long mauD = mauA*mauB*mauC;
        long x = gcd(tuD,mauD);
        tuD = tuD/x;
        return tuD;
    }
    
    private long tinhMauD(long tuA, long mauA, long tuB, long mauB,long tuC,long mauC) {
        long tuD = tuA*tuB*tuC;
        long mauD = mauA*mauB*mauC;
        long x = gcd(tuD,mauD);
        
        mauD = mauD/x;
        return mauD;
    }
    
    
    private long gcd(long a,long b){
        while(b > 0) {
            long t = a%b;
            a = b;
            b = t;
        }
        return a;
    }
    
    @Override
    public String toString() {
        return tuC +"/"+mauC+" "+tuD+"/"+mauD;
    }
    
    
}
