import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.toedter.calendar.JDateChooser;
public class signup extends JFrame implements ActionListener {
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l0;
    JTextField t1,t2,t4,t5;
    JTextArea t7;
    JRadioButton r1,r2;
    JButton b1,b2;
    JDateChooser jd;
    int a=(int) (Math.random()*1550);;
    public signup(){
        setTitle("SIGN UP");
        setLayout(null);
        l0=new JLabel("Fill the from                            ID:- "+a);
        l1=new JLabel("NAME:");
        l2=new JLabel("FATHER'S NAME:");
        l3=new JLabel("DATE OF BIRTH:");
        l4=new JLabel("E-Mail ID:");
        l5=new JLabel("CONTACT NO:");
        l6=new JLabel("STATUS:");
        l7=new JLabel("ADDRESS:");
         t1=new JTextField(null);
         t2=new JTextField(null);
         t4=new JTextField(null);
         t5=new JTextField(null);
         t7=new JTextArea();
        
         jd=new JDateChooser();
        
         b1=new JButton("NEXT >");
         b2=new JButton("< BACK");
         b1.setBackground(Color.BLACK);
         b1.setForeground(Color.white);
         b2.setBackground(Color.BLACK);
         b2.setForeground(Color.white);
         r1=new JRadioButton("married",false);
         r2=new JRadioButton("unmarried",false);
         l0.setFont(new Font("",Font.ITALIC,20));
         l0.setForeground(Color.BLUE);
         l0.setBounds(160,20,500,30);
         l1.setBounds(150,100,100,30);
         l2.setBounds(150,130,100,30);
         l3.setBounds(150,170,100,30);
         l4.setBounds(150,210,100,30);
         l5.setBounds(150,250,100,30);
         l6.setBounds(150,290,100,30);
         l7.setBounds(150,330,100,30);

         t1.setBounds(250,100,150,30);
         t2.setBounds(250,130,150,30);
         t4.setBounds(250,210,150,30);
         t5.setBounds(250,250,150,30);
         t7.setBounds(250,330,200,60);
         r1.setBounds(250,290,100,30);
         r2.setBounds(350,290,150,30);
         b1.setBounds(570,500,100,30);
         jd.setBounds(250,170,100,30);
         b2.setBounds(10,500,100,30);
         add(l0);
         add(l1);
        add(t1);
         add(l2);
         add(t2);
         add(l3);
         add(l4);
        add(t4);
         add(l5);
         add(t5);
         add(l6);
        add(r1);
        add(r2);
         add(l7);
         add(t7);
         add(b1);
         add(b2);
         add(jd);
         b1.addActionListener(this);
         b2.addActionListener(this);
         r2.addActionListener(this);
         r1.addActionListener(this);
         setBackground(Color.white);
         setBounds(600,200,700,600);
  setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
      
            if(e.getSource()==b1){
                sqll sq=new sqll();
                jd.getDateFormatString();
                String s1;
if(r1.isSelected()){
 s1="married";
 
} else s1="unmarried";
Date dd= jd.getDate();
SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
String s3=new String(sdf.format(dd));
               
       System.out.println(s3);
                sq.signu(a,t1.getText(),t2.getText(),s3,t4.getText(),t5.getText(),s1,t7.getText());
                nextpage aa=new nextpage(a);
                aa.setVisible(true);
                this.setVisible(false); 
            }
        
        if(e.getSource()==b2){
             login ll=new login();
           ll.setVisible(true);
           this.setVisible(false); 
        }
        if(e.getSource()==r1){
            r2.setSelected(false);
        }
        if(e.getSource()==r2){
            r1.setSelected(false);
        }
    }
}