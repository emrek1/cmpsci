package bilal;

import java.awt.event.MouseEvent;
import window.GameWindow;


public class Follower extends GameWindow{
    
    double ballX = 100, ballY = 100;
    double targetX = ballX, targetY = ballY;
    double speed = 10;
    
    double velX, velY;
    
    public void update(){
                
        ballX += velX;
        ballY += velY;
        
    }
    
    public void paint(){
        g.fillOval((int)ballX, (int)ballY, 30, 30);
    }
    
    
    public static void main(String[] args) {
        new Follower().run();
    }
    
    public void mousePressed(MouseEvent e){
        targetX = e.getX();
        targetY = e.getY();
        
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

}
