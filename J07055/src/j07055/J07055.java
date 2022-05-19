/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j07055;
import java.util.*;
import java.io.*;
/**
 *
 * @author ADMIN
 */
public class J07055 {
public static void main(String[] args) throws FileNotFoundException{
		Scanner sc = new Scanner(new File("BANGDIEM.in"));
		ArrayList<Student> lst = new ArrayList<>();
		int t = Integer.parseInt(sc.nextLine());
		for (int i=1; i <= t; i++){
			lst.add(new Student(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
		}
		Collections.sort(lst, new Comparator<Student>(){
			@Override
			public int compare(Student o1, Student o2) {
				if (o1.avg > o2.avg) return -1;
				else if (o1.avg < o2.avg) return 1;
				else return 0;
			}
		});
		for (Student x : lst) System.out.println(x);
		sc.close();
	}
}
