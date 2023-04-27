package tourism.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class UpdateCustomer extends JFrame implements ActionListener {
     JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
        JComboBox c1;
        JRadioButton r1,r2;
        JButton b1,b2;
    UpdateCustomer(String Username){
                
        setBounds(300,100,850,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
         JLabel l1 = new JLabel("Username");
        l1.setBounds(30,50,150,25);
        l1.setFont(new Font("Tahoma",Font.BOLD,14));
        add(l1);
        
        t1=new JTextField();
        t1.setBounds(220,50,150,25);
        //t1.setBorder(BorderFactory.createEmptyBorder());
        add(t1);
        
        
         JLabel l2 = new JLabel("ID : ");
        l2.setBounds(30,90,150,25);
        l2.setFont(new Font("Tahoma",Font.BOLD,14));
        add(l2);
        
        t8=new JTextField();
        t8.setBounds(220,90,150,25);
        //t1.setBorder(BorderFactory.createEmptyBorder());
        add(t8);        
        
         JLabel l3 = new JLabel("Number : ");
        l3.setBounds(30,130,150,25);
        l3.setFont(new Font("Tahoma",Font.BOLD,14));
        add(l3);
        
        t2=new JTextField(40);
        t2.setBounds(220,130,150,25);
        //t2.setBorder(BorderFactory.createEmptyBorder());
        add(t2);
        
         JLabel l4 = new JLabel("Name : ");
        l4.setBounds(30,170,150,25);
        l4.setFont(new Font("Tahoma",Font.BOLD,14));
        add(l4);
        
        t3=new JTextField();
        t3.setBounds(220,170,150,25);
        //t3.setBorder(BorderFactory.createEmptyBorder());
        add(t3);

         JLabel l5 = new JLabel("Gender : ");
        l5.setBounds(30,210,150,25);
        l5.setFont(new Font("Tahoma",Font.BOLD,14));
        add(l5);
        
        t9=new JTextField();
        t9.setBounds(220,210,150,25);
        //t1.setBorder(BorderFactory.createEmptyBorder());
        add(t9);
        
         JLabel l6 = new JLabel("Country : ");
        l6.setBounds(30,250,150,25);
        l6.setFont(new Font("Tahoma",Font.BOLD,14));
        add(l6);
        
        t4=new JTextField();
        t4.setBounds(220,250,150,25);
        //t4.setBorder(BorderFactory.createEmptyBorder());
        add(t4);
        
         JLabel l7 = new JLabel("Address : ");
        l7.setBounds(30,290,150,25);
        l7.setFont(new Font("Tahoma",Font.BOLD,14));
        add(l7);
        
        t5=new JTextField();
        t5.setBounds(220,290,150,25);
        //t5.setBorder(BorderFactory.createEmptyBorder());
        add(t5);
        
         JLabel l8 = new JLabel("Phone : ");
        l8.setBounds(30,330,150,25);
        l8.setFont(new Font("Tahoma",Font.BOLD,14));
        add(l8);
        
        t6=new JTextField();
        t6.setBounds(220,330,150,25);
        //t6.setBorder(BorderFactory.createEmptyBorder());
        add(t6);

         JLabel l9 = new JLabel("Email : ");
        l9.setBounds(30,370,150,25);
        l9.setFont(new Font("Tahoma",Font.BOLD,14));
        add(l9);
        
        t7=new JTextField();
        t7.setBounds(220,370,150,25);
        //t7.setBorder(BorderFactory.createEmptyBorder());
        add(t7);
        

        b1 = new JButton ("Update");
        b1.setBounds(70,430,100,25);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Tahoma",Font.BOLD,14));
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton ("Back");
        b2.setBounds(220,430,100,25);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Tahoma",Font.BOLD,14));
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("tourism/management/system/icons/update.png"));
        Image i2 = i1.getImage().getScaledInstance(200,350,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(400,100,450,350);
        add(l10);
        
        JLabel l11 = new JLabel("UPDATE CUSTOMER DETAILS");
        l11.setBounds(100,10,500,25);
        l11.setFont(new Font("Eras Demi ITC",Font.BOLD,20));
        add(l11);
        
         try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer where Username = '"+Username+"'");
            while(rs.next()){
                t1.setText(rs.getString("Username"));
                t2.setText(rs.getString("Number"));
                t3.setText(rs.getString("Name"));
                t4.setText(rs.getString("Country"));
                t5.setText(rs.getString("Address"));
                t6.setText(rs.getString("Phone"));
                t7.setText(rs.getString("Email"));
                t8.setText(rs.getString("ID"));
                t9.setText(rs.getString("Gender"));
                }
            }catch(Exception e){}
            
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            String Username = t1.getText();
            String ID = t8.getText();
            String Number = t2.getText();
            String Name = t3.getText();
            String radio = t9.getText();
            String Country = t4.getText();
            String Address = t5.getText();
            String Phone = t6.getText();
            String Email = t7.getText();
            
            String q = "update customer set Username = '"+Username+"', ID = '"+ID+"', Number = '"+Number+"', Name = '"+Name+"', Gender = '"+radio+"', Country = '"+Country+"', Address = '"+Address+"', Phone = '"+Phone+"', Email = '"+Email+"'";
            
            try{
                Conn c = new Conn();
                c.s.executeUpdate(q);
                
                JOptionPane.showMessageDialog(null,"Customer Details Updated Successfully");
                this.setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }       
        }else if(ae.getSource()==b2){
            this.setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new UpdateCustomer("").setVisible(true);
    }
}
