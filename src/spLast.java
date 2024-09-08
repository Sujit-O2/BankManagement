import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class spLast extends JFrame implements ActionListener{
       JLabel l11,l0,l1,l2,l3,l4,l5,l6,l7,l8;
       JPasswordField t1,t2;
       JTextField t3;
       JButton b1,b2,b3,b4;
       JDialog j1;
       int a,aa;
       int b;
       long c;
       public spLast(int aa){
        this.aa=aa;
        setLayout(null);
        setBackground(Color.white);
       a= (int) (Math.random()*1300+1023*Math.random());
         b=  (int) (Math.random()+24002*Math.random());
        l0=new JLabel("YOUR ACCOUNT DETAILS>>>>");
       l1=new JLabel("Your User Id:");
       l2=new JLabel("Enter youe pin(for log in):");
       l3=new JLabel("Reenter the pin >>>:");
       l4=new JLabel("Enter the amount (atleast 100 rs.):");
       l5=new JLabel("your bank id no:");
       l6=new JLabel(""+b);
       l7=new JLabel(""+a);
       l11=new JLabel("id:"+aa);
       t1=new JPasswordField(null);
       t2=new JPasswordField(null);
       t3=new JTextField("100");
       t1.setBackground(Color.black);
       t2.setBackground(Color.black);
       t1.setForeground(Color.white);
       t2.setForeground(Color.white);
        j1=new JDialog(this,"warning",false);
        l8=new JLabel("Password mismatched");
        b4=new JButton("Try again");
       b1=new JButton("<Submit>");
       b3=new JButton("Clear");
       b2=new JButton("< Back");
       j1.setLayout(new FlowLayout(20,20,30));
        
;        l11.setBounds(600,10,100,20);
        l0.setBounds(100,20,500,50);
        l1.setBounds(200,100,200,30);
        l2.setBounds(200,180,200,30);
        l3.setBounds(200,220,200,30);
        l4.setBounds(200,260,200,30);
        l5.setBounds(200,140,200,30);
        l6.setBounds(400,140,200,30);
        l7.setBounds(400,100,200,30);
        t1.setBounds(400,180,200,30);
        t2.setBounds(400,220,200,30);
        t3.setBounds(400,260,200,30);
        b1.setBounds(260,420,100,30);
        b2.setBounds(160,420,100,30);
        b3.setBounds(360,420,100,30);
        b1.setBackground(Color.black);
        b2.setBackground(Color.black);
        b3.setBackground(Color.black);
        b4.setBackground(Color.black);
        b1.setForeground(Color.white);
        b2.setForeground(Color.white);
        b3.setForeground(Color.white);
        b4.setForeground(Color.white);
        j1.setBounds(700,400,300,100);
        add(l11);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l0);
        add(t1);
        add(t2);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        j1.add(l8);
        j1.add(b4);
        setBounds(600,200,700,500);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    
       }
     public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            String p1=new String(t1.getPassword());
            String p2=new String(t2.getPassword());
            if(p1.equals(p2)){
                c = Long.parseLong(t3.getText());
                sqll sq=new sqll();
                sq.sqll1(a,p1,b,aa,""+c);
                login in=new login();
                in.setVisible(true);
                this.setVisible(false);
               
            }
            else{
                j1.setVisible(true);
            }
        }
        if(e.getSource()==b2){
            nextpage nn=new nextpage(aa);
            nn.setVisible(true);
            setVisible(false);
        }
        if(e.getSource()==b3){
            t1.setText(null);
            t2.setText(null);
        }
        if(e.getSource()==b4){
            j1.setVisible(false);
            t1.setText(null);
            t2.setText(null);
        }
        }
        
     }
