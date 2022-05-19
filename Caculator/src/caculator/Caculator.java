import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Caculator extends JFrame implements ActionListener{ 
            // dung de bieu dien 4 nut cua 4 phep toan
           private JButton bt1,bt2,bt3,bt4;
           //dung de chua 2 so va 1 ket qua
           private JTextField tf1,tf2,tf3;
           //dung de luu tru ket qua tinh toan
           private double result;
           //dung de nhan tang contentpane cua jframe
           private Container cont;
           //dung de nhom cac thanh phan tren giao dien
           private JPanel panel1,panel2;
           
           
           //HAM KHOI TAO
public Caculator(String s)
{
    super(s);
    // lay lop ContentPane de dat lai cac doi tuong hien thi
    cont = this.getContentPane();
    
    // tao cac thanh phan tren giao dien;
    JLabel num1lb = new JLabel("NUM1: ");
        tf1 = new JTextField();
    JLabel num2lb = new JLabel("NUM2: ");
        tf2 = new JTextField();
    JLabel resultb = new JLabel("RESULT: ");
        tf3 = new  JTextField();
        // Textfiled chua ket qua khong duoc phep su dung du lieu
        tf3.setEditable(false);
        
        
        // panel1 chua 3 Textfield
        
        panel1 = new JPanel();
        // thiet lap Layout gom 3 hang 2 cot
        panel1.setLayout(new GridLayout(3,2));
        //dat cac thanh phan vao panel 1
        panel1.add(num1lb);
            panel1.add(tf1); 
        panel1.add(num2lb);
             panel1.add(tf2);
        panel1.add(resultb);
            panel1.add(tf3);
       
       
        
        
        
        //tao 4 nut bieu dien 4 phep toan
        bt1 = new JButton("+");
        bt2 = new JButton("-");
        bt3 = new JButton("*");
        bt4 = new JButton("/");
        
        
        // panel2 chua 4 nut
        panel2 = new JPanel();
        panel2.add(bt1);
        panel2.add(bt2);
        panel2.add(bt3);
        panel2.add(bt4);
        
        
        //day 2 panel vao ContentPane
        cont.add(panel1);
        cont.add(panel2,"South");
        
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        //thiet lap kich thuoc hien thi
        this.pack();
        this.setVisible(true);
        
}

    // ding nghia ham cong
public void doPlus(){
    result = Double.parseDouble(tf1.getText())+Double.parseDouble(tf2.getText());
        tf3.setText(String.valueOf(result));
}
    // dinh nghia ham tru
public void doMinus(){
    result = Double.parseDouble(tf1.getText())-Double.parseDouble(tf2.getText());
        tf3.setText(String.valueOf(result));
}
public void doMult(){
    result = Double.parseDouble(tf1.getText())*Double.parseDouble(tf2.getText());
        tf3.setText(String.valueOf(result));
}
public void doDiv(){
    result = Double.parseDouble(tf1.getText())/Double.parseDouble(tf2.getText());
        tf3.setText(String.valueOf(result));
}

// dinh nghia ham xu li khi nguoi dung an cac nut phep toan
public void actionPerformed(ActionEvent e)
{
    if(e.getActionCommand()=="+")
        doPlus();
     if(e.getActionCommand()=="-")
        doMinus();
      if(e.getActionCommand()=="*")
        doMult();
       if(e.getActionCommand()=="/")
        doDiv();
    
}


    
    public static void main(String[] args) {
        // tao giao dien chuong trinh
        Caculator simpleCalculator = new Caculator("SimpleCaclulator");
        simpleCalculator.setLocationRelativeTo(null);
    }
    
}
