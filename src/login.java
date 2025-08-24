import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class login extends JFrame implements ActionListener  {
    ImageIcon ii;
    JLabel l0,l1,l2,l3;
    JButton b1,b2,b3;
    JTextField t1;
    JPasswordField pa1;
    login(){
        setTitle("login page");
        setLayout(null);
         ii=new ImageIcon(getClass().getResource("img/bank.jpg"));
         Image i2= ii.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
         ImageIcon I3=new ImageIcon(i2);
         l0=new JLabel(I3);
         l1=new JLabel("Welcome to you");
         l0.setBounds(50,10,50,50);
         l1.setBounds(150,20,300,30);
         l1.setFont(new Font("Osward",Font.BOLD,28));
         
         setBackground(Color.WHITE);
         l2=new JLabel("User id :");
         l2.setFont(new Font("Osward",Font.BOLD,20));
         l3=new JLabel("Pin :");
         l3.setFont(new Font("Osward",Font.BOLD,20));
         t1=new JTextField(20);
         pa1=new JPasswordField(20);
         l2.setBounds(250,100,100,20);
         l3.setBounds(250,150,100,30);
         t1.setBounds(350,100,100,25);;
         pa1.setBounds(350,150,100,25);
         b1 = new JButton("LOG IN");
         b2 = new JButton("Clear");
         b3 = new JButton("SIGN UP");
         b1.setBackground(Color.BLACK);
         b2.setBackground(Color.BLACK);
         b3.setBackground(Color.BLACK);
         b1.setForeground(Color.WHITE);
         b2.setForeground(Color.WHITE);
         b3.setForeground(Color.WHITE);
          b1.setBounds(200,250,100,40);
          b2.setBounds(300,250,100,40);
          b3.setBounds(400,250,100,40);
          this.add(b1);
          this.add(b2);
         this. add(b3);
         this.add(l0);
        this. add(l1);
        this. add(l2);
        this. add(l3);
        this. add(t1);
        this. add(pa1);
        setBounds(600,200,700,500);
        setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b1) { 
        String userId = t1.getText().trim();
        String password = new String(pa1.getPassword());

        if (userId.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "User ID or Password cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            sqll a = new sqll();
            a.sqlll(Integer.parseInt(userId));
            String dbPassword = a.ss2; 
            String dbUser = a.ss1; 

            if (dbPassword == null || dbUser == null) {
                JOptionPane.showMessageDialog(this, "Invalid User ID!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!password.equals(dbPassword)) {
                JOptionPane.showMessageDialog(this, "Incorrect Password!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            ATM aa = new ATM(dbUser, dbPassword);
            aa.setVisible(true);
            setVisible(false);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "User ID must be a number!", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Login Failed: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }

    if (e.getSource() == b2) { 
        t1.setText(null);
        pa1.setText(null);
    }

    if (e.getSource() == b3) { 
        signup ss = new signup();
        ss.setVisible(true);
        setVisible(false);
    }
}

    public static void main(String[] args){

        new login();

    }
    
}
