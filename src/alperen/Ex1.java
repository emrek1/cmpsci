package alperen;

import java.awt.Graphics;
import javax.swing.JFrame;


public class Ex1 extends JFrame{
    
    int bx = 250, by = 250;
    
    Ex1(){
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        startLoop();
    }
    
    public void startLoop(){
        for (int i = 0; i < 100; i++) {
            try{Thread.sleep(10);}catch(Exception e){}
            repaint();
            operate();
            System.out.println("paint");
        }
    }
    
    public void operate(){
        bx++;
        by++;
    }
    
    public void paint(Graphics g){
        g.clearRect(0, 0, 500, 500);
        g.fillOval(bx, by, 10, 10);  
    }

    
    public static void main(String[] args) {
        new Ex1();
    }
    
}
