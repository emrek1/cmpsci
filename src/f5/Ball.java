package f5;

import datastructure.Vector2;
import java.awt.Graphics;


public class Ball {
    
    public Vector2 pos, vel;
    public double speed;

    public Ball(Vector2 pos, double speed) {
        this.pos = pos;
        this.speed = speed;
        this.vel = new Vector2(0,0);
    }
    
    
    public void updatePos(int dt){
        Vector2 disp = vel.mul(dt/1000f);//vel * dt
        pos.addOn(disp);
    }
   
    
    public void updateVel(double targetX, double targetY){
        vel = new Vector2((targetX - pos.x), (targetY- pos.y));  // direction      
        vel.normalize();                                         // unit vector
        vel.mulon(speed);
    }
    
    public void draw(Graphics g){
        g.fillOval((int)pos.x-25, (int)pos.y-25, 50, 50);
        
    }

}
