package f4;

import datastructure.Vector2;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import window.GameWindow;

public class Follower4 extends GameWindow {
        
    ArrayList<Ball> list = new ArrayList<>();
    
    
    public void init(){
        Vector2 pos = new Vector2(100, 100);
        double speed = 100;
        Ball b1 = new Ball(pos, speed,20);
        double speed2 = 50;
        Ball b2 = new Ball(new Vector2(pos), speed2, 30);
        
        list.add(b1);
        list.add(b2);        
    }
    
    public void update(){        
        for(Ball b:list){
            Vector2 disp = b.vel.mul(dt/1000f);//vel * dt
            //b.pos.addOn(disp);
            b.updatePos(disp);
        }
    }
    
    public void mousePressed(MouseEvent e){
        for(Ball ball:list){
            ball.vel = new Vector2((e.getX() - ball.pos.x), (e.getY() - ball.pos.y));  // direction      
            ball.vel.normalize();                                                    // unit vector
            ball.vel.mulon(ball.speed);                                                 // velocity
        } 
    }
    
    @Override
    public void paint(){        
        for(Ball ball:list)
            g.fillOval((int)(ball.pos.x-ball.r), (int)(ball.pos.y-ball.r), (int)(2*ball.r), (int)(2*ball.r));
    }
    
    
    
    public static void main(String[] args) {
        new Follower4().run();
    }

}
