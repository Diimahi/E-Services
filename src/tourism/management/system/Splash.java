package tourism.management.system;
import javax.swing.*;
import java.awt.*;

public class Splash {
     public static void main(String[] args){

          SplashFrame frame = new SplashFrame();
          frame.setLocation(5,5);
          frame.setSize(1350,750);
          frame.setVisible(true);     
    
    }
}


class SplashFrame extends JFrame implements Runnable{
   Thread t1;
   SplashFrame(){
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("tourism/management/system/icons/bookpackage.jpg"));
        Image i2=i1.getImage().getScaledInstance(1600,700,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        add(l1);
        t1=new Thread(this);
        t1.start();
    }  
   public void run(){

     try{
         Thread.sleep(7000);
         this.setVisible(false);
         new Login().setVisible(true);
         }catch(Exception e){}

}

}
