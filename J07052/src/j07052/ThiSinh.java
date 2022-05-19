package j07052;
class ThiSinh{
    private String id, ten ;
    private float dToan,dLy,dHoa,diemUt,diemXetTuyen;

    public ThiSinh(String id, String ten, String  dToan, String  dLy, String  dHoa) {
        this.id = id;
        this.ten = findTen(ten);
        this.dToan = Float.parseFloat(dToan);
        this.dLy =  Float.parseFloat(dLy);
        this.dHoa =  Float.parseFloat(dHoa);
        this.diemUt = findUt();
        this.diemXetTuyen = findDiemXt();

    }
    public String findTen(String s){
        s= s.trim();
        String [] tmp = s.split("\\s+");
        String ans = "";
        for (String x : tmp){
            ans += x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase() +" ";
        }
        return ans.trim();
    }
    public float findUt(){
        String khuVuc = id.substring(0,3);
        if (khuVuc.equals("KV1"))return (float) 0.5;
        else if (khuVuc.equals("KV2"))return (float) 1.0;
        else if (khuVuc.equals("KV3"))return (float) 2.5;
        else return 0;
    }
    public float findDiemXt(){
        return dToan*2 + dLy + dHoa + diemUt;
    }

    public float getDiemXetTuyen() {
        return diemXetTuyen;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {

        if(diemXetTuyen == (int)diemXetTuyen){
            if (diemUt == (int)diemUt)return id +" "+ ten +" "+ (int)diemUt +" "+(int)diemXetTuyen ;
            else return id +" "+ ten +" "+ diemUt +" "+(int)diemXetTuyen ;
        }
        else {
            if (diemUt == (int)diemUt)return id +" "+ ten +" "+ (int)diemUt +" "+diemXetTuyen ;
            else return id +" "+ ten +" "+ diemUt +" "+diemXetTuyen ;
        }
    }
}
