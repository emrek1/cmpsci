package bilal;

import datastructure.Vector2;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import window.GameWindow;


public class Follower3 extends GameWindow{
    
    //Ball ball, ball2;
    
    ArrayList<Ball> balls = new ArrayList<>();
    
    /*{
        ball.pos = new Vector2(200, 100);
        ball.vel = new Vector2(100, 100);
        ball.speed = 300;
    }*/
    
    @Override
    public void init(){
        
        Vector2 pos = new Vector2(200, 100);
        Vector2 vel = new Vector2(100, 100);
        double speed = 300;
        
        Ball ball = new Ball(pos, vel, speed);
        String input = JOptionPane.showInputDialog("enter speed");
        speed = Double.parseDouble(input);  //wrapper
        Ball ball2 = new Ball(new Vector2(pos), new Vector2(vel), speed);     
        
        ball.pos.x +=3;
        pos.x +=3;
        ball2.pos.x +=3;
        
        
        
        balls.add(ball);
        balls.add(ball2);
        
    }
    
    @Override
    public void update(){
        /*for(int i = 0; i<balls.size(); i++){
            Ball ball = balls.get(i);
            //ball...
        }*/
        
        for(Ball ball:balls){
            Vector2 vdt = ball.vel.mul(dt/1000f);        
            ball.pos.addOn(vdt); 
        }
    }
    
    public void mousePressed(MouseEvent e){   
        for(Ball ball:balls){
            ball.vel = new Vector2((e.getX() - ball.pos.x), (e.getY() - ball.pos.y));  // direction      
            ball.vel.normalize();                                                    // unit vector
            ball.vel.mulon(ball.speed);                                                 // velocity
        }            
    }
    
    
    public void paint(){     
        for(Ball ball:balls)
            g.fillOval((int)ball.pos.x, (int)ball.pos.y, 50, 50);
    }
    
    
    
    
    
    
    
    public static void main(String[] args) {
        Follower3 f3 = new Follower3();
        
        /*Ball b = new Ball();
        b.pos = new Vector2(100, 100);
        b.vel = new Vector2(200, 100);
        b.speed = 300;
        f3.ball = b;*/
        
        /*f3.ball.pos = new Vector2(100, 100);  
        f3.ball.vel = new Vector2(200, 100);
        f3.ball.speed = 100;*/
        
        f3.run();
    }
    

}


