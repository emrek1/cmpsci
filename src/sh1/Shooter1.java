package sh1;

import datastructure.Vector2;
import java.awt.Color;
import java.awt.event.MouseEvent;
import window.GameWindow;

public class Shooter1 extends GameWindow {
    
    Player p;
    Bullet b;
        
    public void init(){
        p = new Player(new Vector2(100, 100));
    }
        
    public void update(){
        
        if(b != null){
            Vector2 disp = b.vel.mul(dt/1000f);
            b.pos.addOn(disp);
        }
    }
    
    public void paint(){
        g.fillOval((int)p.pos.x-25, (int)p.pos.y-25, 50, 50);
        if(b!=null){
            g.setColor(Color.RED);
            g.fillOval((int)b.pos.x-5, (int)b.pos.y-5, 10, 10);
            g.setColor(Color.BLACK);
        }
    }
    
    public void mousePressed(MouseEvent me){
        b = new Bullet(new Vector2(p.pos.x, p.pos.y));
    }
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        new Shooter1().run();
    }

}
