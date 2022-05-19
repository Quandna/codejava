package colorframe;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class colorframe extends JFrame implements  ActionListener{
    private JPanel p = new JPanel();
    private JButton OK = new JButton("OK");
    private JButton newOK = new JButton("Green");
    private JComboBox<String> chon = new JComboBox<>();
    public colorframe(String title) throws HeadlessException{
        super(title);
        setLayout(new BorderLayout());
        add(p,BorderLayout.CENTER);
        
        JPanel ps = new JPanel();
        ps.setLayout(new FlowLayout());
        ps.add(OK);
        ps.add(chon);
        chon.addItem("Xanh");
        chon.addItem("Do");
        chon.addItem("Tim");
        chon.addItem("Vang");
        chon.addItem("Trang");
        chon.addItem("Den");
        add(ps,BorderLayout.SOUTH);
        OK.addActionListener(this);
        newOK.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(OK)){
           String  s = chon.getSelectedItem().toString();
           if(s.equals("Xanh")) p.setBackground(Color.blue);
           if(s.equals("Do")) p.setBackground(Color.red);
           if(s.equals("Tim")) p.setBackground(Color.magenta);
           if(s.equals("Vang")) p.setBackground(Color.yellow);
           if(s.equals("Trang")) p.setBackground(Color.white);
           if(s.equals("Den")) p.setBackground(Color.black);
        }
        else p.setBackground(Color.GREEN);
    }

    
}
    
    
    

