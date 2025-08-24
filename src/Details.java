import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.*;

public class Details extends JFrame implements ActionListener {
    JLabel l1,l11,l2,l22,l3,l33,l4,l44,l5,l55,l6,l66,l7;
    JButton b1;
    JLabel t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
    Details(int a){
        sqll dd=new sqll();
        dd.details(a);

        setLayout(new GridLayout(14,2));
           l1= new JLabel("Name >>>>:");
          l11= new JLabel(" father's name >>:");
          l2= new JLabel("Status >>>>:");
          l22= new JLabel("Gender  >>>>:");
          l3= new JLabel("D.O.B  >>>>:");
          l33= new JLabel("E-mail >>>>:");
          l4= new JLabel("Mob no >>>>:");
          l44= new JLabel("Address >>>>");
          l5= new JLabel("Aadhar No >>>>:");
          l55= new JLabel("PAN (optional)>:");
          l6= new JLabel("Features >>>>:");
          l66= new JLabel("User id >>>>:");
          l7= new JLabel("Balance >>>>:");
         b1=new JButton("back");
   b1.setBackground(Color.black);
   b1.setForeground(Color.white);

          t1=new JLabel(dd.name);
          t2=new JLabel(dd.fname);
          t3=new JLabel(dd.status);
          t4=new JLabel(dd.gender);
          t5=new JLabel(dd.dob);
          t6=new JLabel(dd.email);
          t7=new JLabel(dd.mob);
          t8=new JLabel(dd.addrs);
          t9=new JLabel(dd.aadher);
          t10=new JLabel(dd.pan);
          t11=new JLabel(dd.features);
          t12=new JLabel(""+dd.userid);
          t13=new JLabel(dd.balence);
add(l1);
add(t1);
add(l11);
add(t2);
add(l2);
add(t3);
add(l22);
add(t4);
add(l3);
add(t5);
add(l33);
add(t6);
add(l4);
add(t7);
add(l44);
add(t8);
add(l5);
add(t9);
add(l55);
add(t10);
add(l6);
add(t11);
add(l66);
add(t12);
add(l7);
add(t13);
add(b1);
setDefaultCloseOperation(EXIT_ON_CLOSE);
b1.addActionListener(this);
          setBounds(700,150,500,600);
          setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            setVisible(false);
        }
    }
}
