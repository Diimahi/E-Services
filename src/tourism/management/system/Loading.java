package tourism.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Loading extends JFrame implements Runnable {
    
    JProgressBar p;
    Thread t;
    String Username;
    
    public void run(){
        try{
            for(int i=1; i<=101; i++){
                int m = p.getMaximum();
                int n = p.getValue();
                if(n<m){
                    p.setValue(p.getValue()+1);
                }else{
                    i=101;
                    setVisible(false);
                    new Dashboard(Username).setVisible(true);
                }
                Thread.sleep(50);
            }
        }catch(Exception e){}
    }
    
    Loading(String user){
        Username = user;
        t=new Thread(this);
        
        setBounds(300,200,650,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l1 = new JLabel("TOUR & TRAVEL");
        l1.setBounds(160,30,600,40);
        l1.setFont(new Font("Eras Demi ITC",Font.BOLD,35));
        l1.setForeground(Color.LIGHT_GRAY);
        add(l1);
        
        p = new JProgressBar();
        p.setStringPainted(true);
        p.setBounds(150,100,300,25);
        add(p);
        
        JLabel l2 = new JLabel("Please Wait....");
        l2.setBounds(255,130,120,25);
        l2.setFont(new Font("Tahoma",Font.BOLD,16));
        l2.setForeground(Color.blue);
        add(l2);
        
        JLabel l3 = new JLabel("Welcome " +Username);
        l3.setBounds(20,310,400,25);
        l3.setFont(new Font("Tahoma",Font.BOLD,16));
        l3.setForeground(Color.red);
        add(l3);
        
        t.start();
    }
    
    public static void main(String[] args){
        new Loading("").setVisible(true);
    }
}
