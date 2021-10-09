package sh3;

import datastructure.Vector2;
import java.awt.Color;
import java.awt.Graphics;

public abstract class GameObject {

    Vector2 pos, vel;
    int radius;
    Color color;

    public GameObject(Vector2 pos) {
        this.pos = pos;
        this.vel = Vector2.zero;
        Shooter.gameObjects.add(this);
    }

    public void updatePos(int dt) {
        Vector2 disp = vel.mul(dt / 1000f);
        pos.addOn(disp);
    }
    
    public void draw(Graphics g){
        g.setColor(color);
        g.fillOval((int)pos.x-radius, (int)pos.y-radius, radius*2, radius*2);
    }

}
