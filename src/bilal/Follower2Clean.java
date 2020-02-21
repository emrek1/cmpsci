package bilal;

import datastructure.Vector2;
import java.awt.event.MouseEvent;
import window.GameWindow;


public class Follower2Clean extends GameWindow{
    
    Vector2 ballpos = new Vector2(100, 100);
    Vector2 vel = new Vector2(200, 100);    
    double speed = 300;
    
    @Override
    public void update(){
        Vector2 vdt = vel.mul(dt/1000f);        
        ballpos.addOn(vdt);     
    }
    
    public void mousePressed(MouseEvent e){        
        vel = new Vector2((e.getX() - ballpos.x), (e.getY() - ballpos.y));  // direction      
        vel.normalize();                                                    // unit vector
        vel.mulon(speed);                                                   // velocity
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void paint(){
        g.fillOval((int)ballpos.x, (int)ballpos.y, 50, 50);
    }
    
    
    public static void main(String[] args) {
        new Follower2Clean().run();
    }

}
