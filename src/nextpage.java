import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
public class nextpage extends JFrame implements ActionListener{
    JFileChooser fi;
    FileNameExtensionFilter f11;
    JLabel l0,l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2;
    JCheckBox c1,c2,c3,c4,c5,c6,c7,c8;
    JButton b1,b2,b3;
    JRadioButton r1,r2;
    int a;
    nextpage(int a){ 
        this.a=a;      
       setTitle("next Page");
       setLayout(null);
       setBackground(Color.white);
       l0=new JLabel("id : "+a);
       l1=new JLabel("Provide informations>>>");
       l2=new JLabel("Aadhar no:");
       l3=new JLabel("PAN no(optional):");
       l4=new JLabel("Gender:");
       l5=new JLabel("Features >>>>");
       l6=new JLabel("Aggrements>>>>");
       
       
       t1=new JTextField(null);
       t2=new JTextField(null);
    
    c1=new JCheckBox("you may obey all rules .",false);
    c2=new JCheckBox("we will be on your care.",false);
    c3=new JCheckBox("Be happy");
    c4=new JCheckBox("Select all at once");

    r1=new JRadioButton("Male",false);
    r2=new JRadioButton("Female",false);


    c5=new JCheckBox("ATM CARD",true);
    c6=new JCheckBox("UPI ",false);
    c7=new JCheckBox("WALLET",false);
    c8=new JCheckBox("NET BANKING",false);

    b1=new JButton("next >");
    b2=new JButton("< prev");

    b1.setBackground(Color.BLACK);
    b2.setBackground(Color.BLACK);
    b1.setForeground(Color.white);
    b2.setForeground(Color.white);

    l1.setFont(new Font("",Font.BOLD,20));

    l0.setBounds(600,10,100,10);
    
    l1.setBounds(100,50,300,50);
    
    l2.setBounds(200,100+30,150,20);
    
    l3.setBounds(200,140+30,150,20);
    
    l4.setBounds(200,180+30,150,20);
    
    l5.setBounds(200,220+30,150,20);
    
    l6.setBounds(200,220+(40*4)+30,150,20);
    
    t1.setBounds(360,100+30,150,20);
    
    t2.setBounds(360,140+30,150,20);
    
    c1.setBounds(360, 340+40+30,200,20);
    
    c2.setBounds(360,380+40+30,200,20);
    
    c3.setBounds(360,420+40+30,200,20);
    
    c4.setBounds(360,460+40+30,200,20);

    c5.setBounds(360,180+40+30,200,20);
    
    c6.setBounds(360,220+40+30,200,20);
    
    c7.setBounds(360,260+40+30,200,20);
    
    c8.setBounds(360,300+40+30,200,20);
    
    r1.setBounds(360,180+30,90,20);
    
    r2.setBounds(450,180+30,150,20);

    b1.setBounds(600,600,80,30);
    
    b2.setBounds(5,600,80,30);

    add(b1);
    add(b2);
    add(l0);
    add(l1);
    add(l2);
    add(l3);
    add(l4);
   add(l5);
    add(l6);
    add(t1);
    add(t2);
   add(c1);
    add(c2);
    add(c3);
    add(c4);
    add(c5);
    add(c6);
    add(c7);
    add(c8);
    add(r1);
    add(r2);

     b1.addActionListener(this);
     b2.addActionListener(this);

     c1.addActionListener(this);

     c2.addActionListener(this);

     c3.addActionListener(this);

     c3.addActionListener(this);

     c4.addActionListener(this);
c5.addActionListener(this);
     r1.addActionListener(this);
     r2.addActionListener(this);

 setDefaultCloseOperation(EXIT_ON_CLOSE);

       setBounds(600,200,700,700);   
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==c5){
            c5.setSelected(true);
        }
        if(e.getSource()==b2){
            signup ss=new signup();
         ss.setVisible(true);
         setVisible(false);
        }
        if(c1.isSelected()){
            if(c2.isSelected()){
            if(c3.isSelected()){
             c4.setSelected(true);
        }
        }
        }
        
        
        if(c4.isSelected()){
            c1.setSelected(true);
            c2.setSelected(true);
            c3.setSelected(true);
 
        }
        String s1;
                if(r1.isSelected()){
                 s1="male";}
                 else{
                 s1="female";}
                 
                 StringBuffer bb=new StringBuffer("ATM CARD");
                 if(c6.isSelected()){
                        bb.append(" "+c6.getText());
                 }
                  if(c7.isSelected()){
                     bb.append(" "+c7.getText());
                                  }
                   if(c8.isSelected()){
                          bb.append(" "+c8.getText());
                     }
            if(e.getSource()==b1){
                sqll sq=new sqll();
                sq.signup11(a,t1.getText(),t2.getText(),s1,bb.toString());
               spLast ss=new spLast(a);
               ss.setVisible(true);
               setVisible(false);
            }
       
        if(c5.isSelected()){
            c5.setSelected(true);
            
        }
        if(e.getSource()==r1){
            r2.setSelected(false);
        }
        if(e.getSource()==r2){
            r1.setSelected(false);
        }
       

    }
}
