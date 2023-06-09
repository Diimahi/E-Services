package tourism.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ViewCustomer extends JFrame implements ActionListener {
    
        JButton b2;
    ViewCustomer(String Username){
                
        setBounds(300,20,850,700);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
         JLabel l1 = new JLabel("Username");
        l1.setBounds(30,50,150,25);
        l1.setFont(new Font("Tahoma",Font.BOLD,14));
        add(l1);
        
         JLabel l11 = new JLabel();
        l11.setBounds(220,50,150,25);
        l11.setFont(new Font("Tahoma",Font.BOLD,14));
        add(l11);
        
        
         JLabel l2 = new JLabel("ID : ");
        l2.setBounds(30,110,150,25);
        l2.setFont(new Font("Tahoma",Font.BOLD,14));
        add(l2);
        
         JLabel l12 = new JLabel();
        l12.setBounds(220,110,150,25);
        l12.setFont(new Font("Tahoma",Font.BOLD,14));
        add(l12);       
        
         JLabel l3 = new JLabel("Number : ");
        l3.setBounds(30,170,150,25);
        l3.setFont(new Font("Tahoma",Font.BOLD,14));
        add(l3);
        
        JLabel l13 = new JLabel();
        l13.setBounds(220,170,150,25);
        l13.setFont(new Font("Tahoma",Font.BOLD,14));
        add(l13);
        
         JLabel l4 = new JLabel("Name : ");
        l4.setBounds(30,230,150,25);
        l4.setFont(new Font("Tahoma",Font.BOLD,14));
        add(l4);
        
        JLabel l14 = new JLabel();
        l14.setBounds(220,230,150,25);
        l14.setFont(new Font("Tahoma",Font.BOLD,14));
        add(l14);

         JLabel l5 = new JLabel("Gender : ");
        l5.setBounds(30,290,150,25);
        l5.setFont(new Font("Tahoma",Font.BOLD,14));
        add(l5);
        
         JLabel l15 = new JLabel();
        l15.setBounds(220,290,150,25);
        l15.setFont(new Font("Tahoma",Font.BOLD,14));
        add(l15);
        
         JLabel l6 = new JLabel("Country : ");
        l6.setBounds(500,50,150,25);
        l6.setFont(new Font("Tahoma",Font.BOLD,14));
        add(l6);
        
         JLabel l16 = new JLabel();
        l16.setBounds(690,50,150,25);
        l16.setFont(new Font("Tahoma",Font.BOLD,14));
        add(l16);
        
         JLabel l7 = new JLabel("Address : ");
        l7.setBounds(500,110,150,25);
        l7.setFont(new Font("Tahoma",Font.BOLD,14));
        add(l7);
        
        JLabel l17 = new JLabel();
        l17.setBounds(690,110,150,25);
        l17.setFont(new Font("Tahoma",Font.BOLD,14));
        add(l17);
        
         JLabel l8 = new JLabel("Phone : ");
        l8.setBounds(500,170,150,25);
        l8.setFont(new Font("Tahoma",Font.BOLD,14));
        add(l8);
        
         JLabel l18 = new JLabel();
        l18.setBounds(690,170,150,25);
        l18.setFont(new Font("Tahoma",Font.BOLD,14));
        add(l18);

         JLabel l9 = new JLabel("Email : ");
        l9.setBounds(500,230,150,25);
        l9.setFont(new Font("Tahoma",Font.BOLD,14));
        add(l9);
        
         JLabel l19 = new JLabel();
        l19.setBounds(690,230,150,25);
        l19.setFont(new Font("Tahoma",Font.BOLD,14));
        add(l19);
        
        
        b2 = new JButton ("Back");
        b2.setBounds(350,380,100,25);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Tahoma",Font.BOLD,14));
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("tourism/management/system/icons/viewall.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(20,420,600,200);
        add(l10);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("tourism/management/system/icons/viewall.jpg"));
        Image i5 = i4.getImage().getScaledInstance(600,200,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l20 = new JLabel(i6);
        l20.setBounds(600,420,600,200);
        add(l20);
        
                
         try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer where Username = '"+Username+"'");
            while(rs.next()){
                l11.setText(rs.getString("Username"));
                l12.setText(rs.getString("ID"));
                l13.setText(rs.getString("Number"));
                l14.setText(rs.getString("Name"));
                l15.setText(rs.getString("Gender"));
                l16.setText(rs.getString("Country"));
                l17.setText(rs.getString("Address"));
                l18.setText(rs.getString("Phone"));
                l19.setText(rs.getString("Email"));
                }
            }catch(Exception e){}
            
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b2){
            this.setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new ViewCustomer("").setVisible(true);
    }
}
