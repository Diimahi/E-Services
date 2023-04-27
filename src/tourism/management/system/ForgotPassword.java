package tourism.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ForgotPassword extends JFrame implements ActionListener {
    JTextField t1,t2,t3,t4;
    JButton b1,b2,b3;
    
    ForgotPassword(){
        setBounds(300,200,900,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("tourism/management/system/icons/forgotpassword.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l6 = new JLabel(i3);
        l6.setBounds(580,70,200,200);
        add(l6);

        
        JPanel p = new JPanel();
        p.setLayout(null);
        p.setBounds(30,30,500,280);
        add(p);
        
        JLabel l1 = new JLabel("Username");
        l1.setBounds(40,20,100,25);
        l1.setFont(new Font("Tahoma",Font.BOLD,14));
        p.add(l1);
        
        t1=new JTextField();
        t1.setBounds(220,20,150,25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p.add(t1);
        
        b1 = new JButton ("Search");
        b1.setBounds(380,20,100,25);
        b1.setBackground(Color.GRAY);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Tahoma",Font.BOLD,14));
        b1.addActionListener(this);
        p.add(b1);
        
         JLabel l2 = new JLabel("Name");
        l2.setBounds(40,60,100,25);
        l2.setFont(new Font("Tahoma",Font.BOLD,14));
        p.add(l2);
        
        t2 = new JTextField();
        t2.setBounds(220,60,150,25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p.add(t2);
        
        JLabel l3 = new JLabel("Email");
        l3.setBounds(40,100,170,25);
        l3.setFont(new Font("Tahoma",Font.BOLD,14));
        p.add(l3);
        
        t3 = new JTextField();
        t3.setBounds(220,100,250,25);
        t3.setBorder(BorderFactory.createEmptyBorder());
        p.add(t3);
        
        b2 = new JButton ("Retrieve");
        b2.setBounds(180,140,150,25);
        b2.setBackground(Color.GRAY);
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Tahoma",Font.BOLD,14));
        b2.addActionListener(this);
        p.add(b2);
        
        JLabel l4 = new JLabel("Password");
        l4.setBounds(40,180,170,25);
        l4.setFont(new Font("Tahoma",Font.BOLD,14));
        p.add(l4);
        
        t4 = new JTextField();
        t4.setBounds(220,180,150,25);
        t4.setBorder(BorderFactory.createEmptyBorder());
        p.add(t4);
        
        b3 = new JButton ("Back");
        b3.setBounds(150,230,100,25);
        b3.setBackground(Color.GRAY);
        b3.setForeground(Color.WHITE);
        b3.setFont(new Font("Tahoma",Font.BOLD,14));
        b3.addActionListener(this);
        p.add(b3);
    }
    
    public void actionPerformed(ActionEvent ae){
        Conn c = new Conn();
        if(ae.getSource()==b1){
            try{
                String sql = "select * from account where Username = '"+t1.getText()+"'";
                ResultSet rs = c.s.executeQuery(sql);
                while(rs.next()){
                    
                    t2.setText(rs.getString("Name"));
                    
                }
            }catch(Exception e){}
        }else if(ae.getSource()==b2){
            try{
                String sql ="select * from account where Email = '"+t3.getText()+"' AND Username = '"+t1.getText()+"'";
                ResultSet rs = c.s.executeQuery(sql);
                while(rs.next()){
                    t4.setText(rs.getString("Password"));
                    
                }
            }catch(Exception e){}
            
        }else if(ae.getSource()==b3){
            this.setVisible(false);
            new Login().setVisible(true);
            
        }
    }
    
    public static void main (String[] args){
        new ForgotPassword().setVisible(true);
    }
    
}
