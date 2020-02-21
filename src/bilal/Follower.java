package bilal;

import java.awt.event.MouseEvent;
import window.GameWindow;


public class Follower extends GameWindow{
    
    double ballX = 100, ballY = 100;
    double velX, velY;
    double speed = 300;
    
    
    public void update(){                
        ballX += velX*(dt/1000f);
        ballY += velY*(dt/1000f);        
    }
    
    public void mousePressed(MouseEvent e){
        int targetX = e.getX();
        int targetY = e.getY();
        
        double distX = targetX - ballX;
        double distY = targetY - ballY;
        
        double dist = Math.sqrt(distX*distX + distY*distY);
        
        double time = dist/speed;
        
        velX = distX/time;
        velY = distY/time;
        
        /*double alpha = Math.atan(distY/distX);
        velX = speed*Math.cos(alpha);
        velY = speed*Math.sin(alpha);*/
        
        
    }
    
    
    
    
    
    public void paint(){
        g.fillOval((int)ballX, (int)ballY, 50, 50);
    }
    
    
    public static void main(String[] args) {
        new Follower().run();
    }
}
