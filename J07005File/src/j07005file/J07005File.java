
package j07005file;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class J07005File {

    public static void main(String[] args) throws IOException{
        DataInputStream dis = new DataInputStream(new FileInputStream("DATA.IN"));
        int a[] = new int[1000];
        for(int i=0;i<100000;i++) a[dis.readInt()]++;
        for(int i=0;i<1000;i++){
            if(a[i] > 0) System.out.println(i + " " + a[i]);
        }
        dis.close();
    }
}
