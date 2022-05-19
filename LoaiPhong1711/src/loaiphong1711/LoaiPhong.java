
package loaiphong1711;
import java.util.*;
import java.io.*;
class LoaiPhong implements Comparable<LoaiPhong>{
    String loai, name;
    public LoaiPhong(String loai) {
        this.loai = loai;
        this.name = Name();
    }

    public String Name(){
        String[] spl = loai.split("\\s");
        return spl[1];
    }
    @Override
    public String toString() {
        return loai;
    }
    @Override
    public int compareTo(LoaiPhong o) {
        return name.compareTo(o.name);
    }
}
