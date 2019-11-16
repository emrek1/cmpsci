package bilal;

import window.GameWindow;


public class TopYolla extends GameWindow{
    
    int ballX=100, ballY=100;
    int velX = 10, velY = 1;
    int grv = 1;
    
    
    public TopYolla(){
        
    }
    
    public void update(){
        velY += grv;
        ballX += velX;
        ballY += velY;
    }
    
    public void paint(){
        g.fillOval(ballX, ballY, 50, 50);
    }
    
    
    public static void main(String[] args) {
        TopYolla ty = new TopYolla();
        ty.dt = 100;
        ty.run();
    }
    
}
