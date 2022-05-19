/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j07055;
class Student{
    String id, name, classify;
	int lt, th, t;
	double avg;
	
	public Student(int i, String name, String lt, String th, String t) {
        this.id = "SV" + String.format("%02d", i);
		this.name = handleName(name);
        this.lt = Integer.parseInt(lt);
        this.th = Integer.parseInt(th);
        this.t = Integer.parseInt(t);
		this.avg = ((double)this.lt * 25/100) + ((double)this.th * 35/100) + ((double)this.t *40 /100);
		this.classify = findClassify();
    }

	public String handleName(String s) {
		String ans = "";
		s = s.trim();
		String[] spl = s.split("\\s+");
		for (String x: spl) ans += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase() + " ";
		return ans.trim();
	}

	public String findClassify(){
		if (avg >= 8) return "GIOI";
        else if(avg >= 6.5) return "KHA";
        else if(avg >= 5) return "TRUNG BINH";
        else return "KEM";
	}
	
	@Override
	public String toString(){
		return id + " " + name + " " + String.format("%.2f", avg) + " " + classify;
	}
}