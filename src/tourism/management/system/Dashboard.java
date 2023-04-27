package tourism.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {
     
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14;
    String Username;
    Dashboard(String Username){
        this.Username = Username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0,0,1400,50);
        p1.setBackground(new Color(0,0,102));
        add(p1);
        
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("tourism/management/system/icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1600,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(300,0,1600,700);
        add(l1);

        
       /*  ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("tourism/management/system/icons/dashboard.png"));
        Image i5 = i4.getImage()getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(5,0,70,70);
        p1.add(l2);*/
        
        JLabel l3 = new JLabel("Dashboard");
        l3.setBounds(50,5,300,40);
        l3.setFont(new Font("Tahoma",Font.BOLD,30));
        l3.setForeground(Color.WHITE);
        p1.add(l3);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(0,30,300,1000);
        p2.setBackground(new Color(0,0,102));
        add(p2);

        b1 = new JButton ("Add Personal Details");
        b1.setBounds(0,30,300,40);
        b1.setBackground(new Color(0,0,102));
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Tahoma",Font.PLAIN,20));
        b1.setMargin(new Insets(0,0,0,60));
        b1.addActionListener(this);
        p2.add(b1);

        b2 = new JButton ("Update Personal Details");
        b2.setBounds(0,70,300,40);
        b2.setBackground(new Color(0,0,102));
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Tahoma",Font.PLAIN,20));
        b2.setMargin(new Insets(0,0,0,30));
        b2.addActionListener(this);
        p2.add(b2);

        b3 = new JButton ("View Details");
        b3.setBounds(0,110,300,40);
        b3.setBackground(new Color(0,0,102));
        b3.setForeground(Color.WHITE);
        b3.setFont(new Font("Tahoma",Font.PLAIN,20));
        b3.setMargin(new Insets(0,0,0,130));
        b3.addActionListener(this);
        p2.add(b3);

        JButton b4 = new JButton ("Delete Personal Details");
        b4.setBounds(0,150,300,40);
        b4.setBackground(new Color(0,0,102));
        b4.setForeground(Color.WHITE);
        b4.setFont(new Font("Tahoma",Font.PLAIN,20));
        b4.setMargin(new Insets(0,0,0,33));
        b4.addActionListener(this);
        p2.add(b4);

        JButton b5 = new JButton ("Check Hotel");
        b5.setBounds(0,190,300,40);
        b5.setBackground(new Color(0,0,102));
        b5.setForeground(Color.WHITE);
        b5.setFont(new Font("Tahoma",Font.PLAIN,20));
        b5.setMargin(new Insets(0,0,0,140));
        b5.addActionListener(this);
        p2.add(b5);
        
        JButton b6 = new JButton ("Book Package");
        b6.setBounds(0,230,300,40);
        b6.setBackground(new Color(0,0,102));
        b6.setForeground(Color.WHITE);
        b6.setFont(new Font("Tahoma",Font.PLAIN,20));
        b6.setMargin(new Insets(0,0,0,120));
        b6.addActionListener(this);
        p2.add(b6);
        
        JButton b7 = new JButton ("View Package");
        b7.setBounds(0,270,300,40);
        b7.setBackground(new Color(0,0,102));
        b7.setForeground(Color.WHITE);
        b7.setFont(new Font("Tahoma",Font.PLAIN,20));
        b7.setMargin(new Insets(0,0,0,120));
        b7.addActionListener(this);
        p2.add(b7);

         JButton b8 = new JButton ("View Hotel");
        b8.setBounds(0,310,300,40);
        b8.setBackground(new Color(0,0,102));
        b8.setForeground(Color.WHITE);
        b8.setFont(new Font("Tahoma",Font.PLAIN,20));
        b8.setMargin(new Insets(0,0,0,150));
        b8.addActionListener(this);
        p2.add(b8);

        JButton b9 = new JButton ("Book Hotel");
        b9.setBounds(0,350,300,40);
        b9.setBackground(new Color(0,0,102));
        b9.setForeground(Color.WHITE);
        b9.setFont(new Font("Tahoma",Font.PLAIN,20));
        b9.setMargin(new Insets(0,0,0,150));
        b9.addActionListener(this);
        p2.add(b9);

        JButton b10 = new JButton ("View Booked Hotel");
        b10.setBounds(0,390,300,40);
        b10.setBackground(new Color(0,0,102));
        b10.setForeground(Color.WHITE);
        b10.setFont(new Font("Tahoma",Font.PLAIN,20));
        b10.setMargin(new Insets(0,0,0,80));
        b10.addActionListener(this);
        p2.add(b10);

        JButton b11 = new JButton ("Destinations");
        b11.setBounds(0,430,300,40);
        b11.setBackground(new Color(0,0,102));
        b11.setForeground(Color.WHITE);
        b11.setFont(new Font("Tahoma",Font.PLAIN,20));
        b11.setMargin(new Insets(0,0,0,130));
        b11.addActionListener(this);
        p2.add(b11);
        
        JButton b12 = new JButton ("Payment");
        b12.setBounds(0,470,300,40);
        b12.setBackground(new Color(0,0,102));
        b12.setForeground(Color.WHITE);
        b12.setFont(new Font("Tahoma",Font.PLAIN,20));
        b12.setMargin(new Insets(0,0,0,150));
        b12.addActionListener(this);
        p2.add(b12);
       
        b13 = new JButton ("Calculator");
        b13.setBounds(0,510,300,40);
        b13.setBackground(new Color(0,0,102));
        b13.setForeground(Color.WHITE);
        b13.setFont(new Font("Tahoma",Font.PLAIN,20));
        b13.setMargin(new Insets(0,0,0,145));
        b13.addActionListener(this);
        p2.add(b13);
        
        b14 = new JButton ("Notepad");
        b14.setBounds(0,550,300,40);
        b14.setBackground(new Color(0,0,102));
        b14.setForeground(Color.WHITE);
        b14.setFont(new Font("Tahoma",Font.PLAIN,20));
        b14.setMargin(new Insets(0,0,0,155));
        b14.addActionListener(this);
        p2.add(b14);
        
        JButton b15 = new JButton ("About");
        b15.setBounds(0,590,300,40);
        b15.setBackground(new Color(0,0,102));
        b15.setForeground(Color.WHITE);
        b15.setFont(new Font("Tahoma",Font.PLAIN,20));
        b15.setMargin(new Insets(0,0,0,175));
        b15.addActionListener(this);
        p2.add(b15);
        
        JLabel l4 = new JLabel("Tourism Management System");
        l4.setBounds(200,100,1000,70);
        l4.setFont(new Font("Tahoma",Font.PLAIN,50));
        l4.setForeground(new Color(51,136,136));
        l1.add(l4);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==b13){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){}
        }else if(ae.getSource()==b14){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){}
            
        }else if(ae.getSource()==b1){
            new AddCustomer(Username).setVisible(true);
        }else if(ae.getSource()==b2){
            new UpdateCustomer(Username).setVisible(true);
                    
        }else if(ae.getSource()==b3){
            new ViewCustomer(Username).setVisible(true);
        }
    }
    
    public static void main(String[] args){
           
       new Dashboard("").setVisible(true);
    }
}
