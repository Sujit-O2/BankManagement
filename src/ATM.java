import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
 import java.awt.event.*;
public class ATM extends JFrame implements ActionListener {
     JLabel l1,l2,l3,l4;
     JLabel L1,L2,L3,L4,L5,L6,L7,L8;
     JButton b1,b2,b3,b4,b5;
     JButton B1,B2,B3,B4,B5,B6,B7,B8;
     JDialog d1,d2,d3,d4,d5;
     JPasswordField p1,p2,p3,p4;
     JTextField t1,t2,t3,t4;
     String pass,ssss;
     long a3;

    ATM(String ssss,String pass){
      this.pass=pass;
      this.ssss=ssss;
        setLayout(null);
       ImageIcon ii=new ImageIcon(getClass().getResource("img/ATM.jpg"));
       Image ia=ii.getImage().getScaledInstance(700,700,0);
       ii.setImage(ia);
       l1=new JLabel(ii);
       l2=new JLabel("WELCOME TO ATM");
       l3= new JLabel();
       l4=new JLabel("Made by : Sujit Swain");
       b1=new JButton("Diposite>");
       b2=new JButton("Withdraw>");
       b3=new JButton("Details>");
       b4=new JButton("check Balence >");
       b5=new JButton("< Back");

       d1=new JDialog(this,"Diposite",false);
       d2=new JDialog(this,"withdraw",false);
       d3=new JDialog(this,"view Details",false);
       d4=new JDialog(this,"check balence",false);
       
       d1.setBounds(750,500,300,100);
       d2.setBounds(750,500,300,100);
       d3.setBounds(750,500,300,100);
       d4.setBounds(750,500,300,100);
    
       d1.setLayout(new GridLayout(3,2));
       d2.setLayout(new GridLayout(3,2));
       d3.setLayout(new GridLayout(3,2));
       d4.setLayout(new GridLayout(3,2));

       L1=new JLabel("Enter the Amount:");
       L2=new JLabel("Enter the Amount:");
       L3=new JLabel("PIN:");
       L4=new JLabel("PIN:");
       L5=new JLabel("PIN:");
       L6=new JLabel("PIN:");
              
            t1= new JTextField(null);
            t2= new JTextField(null);
            t3= new JTextField(null);
            t4= new JTextField(null);
              
               p1= new JPasswordField(null);
               p2= new JPasswordField(null);
               p3= new JPasswordField(null);
               p4= new JPasswordField(null);

          B1= new JButton("Diposite >");
          B2= new JButton("Withdraw >");
          B3= new JButton("Details >");
          B4= new JButton("Check balence >");
          B5= new JButton("< Clear");
          B6= new JButton("< Clear");
          B7= new JButton("< Clear");
          B8= new JButton("< Clear");
         d1.add(L1);
         d1.add(t1);
         d1.add(L3);
         d1.add(p1);
         d1.add(B5);
         d1.add(B1);

         d2.add(L2);
         d2.add(t2);
         d2.add(L4);
         d2.add(p2);
         d2.add(B6);
         d2.add(B2);
            
         d3.add(L5);
         d3.add(p3);
         d3.add(B7);
         d3.add(B3);

         d4.add(L6);
         d4.add(p4);
         d4.add(B8);
         d4.add(B4);

       l1.setBounds(0,0,700,700);
       b1.setBounds(497,130,130,20);
       b2.setBounds(497,155,130,20);
       b3.setBounds(497,180,130,20);
       b4.setBounds(497,205,130,20);
       b5.setBounds(300,630,100,20);
       b1.setBackground(Color.lightGray);
       b2.setBackground(Color.lightGray);
       b3.setBackground(Color.lightGray);
       b4.setBackground(Color.lightGray);
       b5.setBackground(Color.lightGray);
       l2.setBounds(220,250,300,30);
       l3.setBounds(220,290,300,30);
       l4.setBounds(250,150,300,30);
       l2.setFont(new Font("italic",Font.BOLD,16));
       l4.setForeground(Color.BLACK);
       setBackground(Color.BLACK);
       setForeground(Color.white);
       setBounds(600,200,710,700);
       
       add(b1);
       add(b2);
       add(b3);
       add(b4);
       add(b5);
       add(l2);
       add(l3);
       add(l4);
       add(l1);


        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        B1.addActionListener(this);
        B2.addActionListener(this);
        B3.addActionListener(this);
        B4.addActionListener(this);
        B5.addActionListener(this);
        B6.addActionListener(this);
        B7.addActionListener(this);
        B8.addActionListener(this);

     }
  public void actionPerformed(ActionEvent e){
   String s1;
   if(e.getSource()==b1){
         d1.setVisible(true);
      
   }
   if(e.getSource()==b2){
       d2.setVisible(true);
      
   }
   if(e.getSource()==b3){
       d3.setVisible(true);
   }
   if(e.getSource()==b4){
      d4.setVisible(true);
   }
   if(e.getSource()==b5){
      login in=new login();
      in.setVisible(true);
      setVisible(false);
   }
   if(e.getSource()==B1){
      s1=new String(p1.getPassword());
      if(s1.equals(pass)){
         sqll asw=new sqll();
         asw.details(Integer.parseInt(ssss));
         a3=Long.parseLong(asw.balence);
         a3=a3+Long.parseLong(t1.getText());
         asw.dipwid(""+a3,Integer.parseInt(ssss));
    l3.setText("you diposited " +t1.getText()+" rs");
    d1.setVisible(false);
    t1.setText(null);
    p1.setText(null);
   }}
   if(e.getSource()==B2){
      s1=new String(p2.getPassword());
      if(s1.equals(pass)){
         sqll asw=new sqll();
         asw.details(Integer.parseInt(ssss));
         a3=Long.parseLong(asw.balence);
         if(a3>=Long.parseLong(t2.getText())){
         a3=a3-Long.parseLong(t2.getText());
         asw.dipwid(""+a3,Integer.parseInt(ssss));
      l3.setText("you withdraw " +t2.getText()+" rs");}
      else{
         l3.setText("(Insufficient Balance)");
      }
      d2.setVisible(false);
      t2.setText(null);
    p2.setText(null);
      }
   }
  
   if(e.getSource()==B3){
     
      s1=new String(p3.getPassword());
   if(s1.equals(pass)){
      Details sw=new Details(Integer.parseInt(ssss));
      d3.setVisible(false);
    p3.setText(null);
   }}
   if(e.getSource()==B4){
      s1=new String(p4.getPassword());
      if(s1.equals(pass)){
      sqll asw=new sqll();
      asw.details(Integer.parseInt(ssss));
      l3.setText("your balence is " +asw.balence+" rs");
      d4.setVisible(false);
      
    p4.setText(null);
   }}
   if(e.getSource()==B5){
      t1.setText(null);
      p1.setText(null);
   }
   if(e.getSource()==B6){
      t2.setText(null);
      p2.setText(null);
   }
   if(e.getSource()==B7){
      p3.setText(null);
   }
   if(e.getSource()==B8){
      p4.setText(null);
   }

  }
}
