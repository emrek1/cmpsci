package bilal;

import datastructures.Vector2;
import java.awt.event.MouseEvent;
import window.GameWindow;


public class Follower2 extends GameWindow{
    
    Vector2 ballpos = new Vector2(100, 100);
    Vector2 vel = new Vector2(200, 100);
    
    double speed = 300;
    
    @Override
    public void update(){
        
        /*ballpos.x += vel.x;
        ballpos.y += vel.y;*/
        
        //ballpos = ballpos.add(vel);
        
        Vector2 vdt = vel.mul(dt/1000f);
        
        ballpos.addOn(vdt);
        
        
        
    }
    
    public void mousePressed(MouseEvent e){
        
        vel = new Vector2((e.getX() - ballpos.x), (e.getY() - ballpos.y));  // direction      
        vel.normalize();                                                    // unit vector
        vel.mulon(speed);                                                   // velocity
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*vel.x = (speed/hip)*distX;
        vel.y = (speed/hip)*distY;*/
        //speed/hip = x/dist;
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void paint(){
        g.fillOval((int)ballpos.x, (int)ballpos.y, 50, 50);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        Follower2 fw = new Follower2();
        //fw.dt = 500;        
        fw.run();
        
    }

}
