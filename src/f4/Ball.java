package f4;

import datastructure.Vector2;


public class Ball {
    
    Vector2 pos, vel;
    double speed;
    double r;

    public Ball(Vector2 pos, double speed, double r) {
        this.pos = pos;
        vel = new Vector2(0,0);
        this.speed = speed;
        this.r = r;
    }
    
    
    void updatePos(Vector2 disp){
        pos.addOn(disp);        
    }
    
}
