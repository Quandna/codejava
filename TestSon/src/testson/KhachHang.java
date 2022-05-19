package testson;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KhachHang implements Comparable<KhachHang>{
    private String id , name , idPhong;
    private Date datecome , datego;
    private long datestay;
    public KhachHang(int id, String name, String idPhong, String datecome, String datego) throws ParseException {
        this.id = "KH" + String.format("%02d", id);
        this.name = name;
        this.idPhong = idPhong;
        this.datecome = new SimpleDateFormat("dd/MM/yyyy").parse(datecome);
        this.datego = new SimpleDateFormat("dd/MM/yyyy").parse(datego);
        datestay = tinhSoNgay();
    }
    private long tinhSoNgay(){
        return (long) ((this.datego.getTime() - this.datecome.getTime()) / (24 * 60 * 60 * 1000));
    }

    @Override
    public int compareTo(KhachHang o) {
        if (this.datestay == o.datestay) return 0;
        else return (this.datestay > o.datestay) ?-1:1;
    }

    @Override
    public String toString() {
        return  id + " " + name + " " + idPhong + " " + datestay;
    }
    
}