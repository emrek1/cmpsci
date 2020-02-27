package f5;

import datastructure.Vector2;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import window.GameWindow;


public class Follower5 extends GameWindow{
    
    ArrayList<Ball> balls = new ArrayList<>();
    
    public void init(){
        Ball b = new Ball(new Vector2(100,200), 100);
        Ball b2 = new Ball(new Vector2(100,200), 50);
        
        balls.add(b);
        balls.add(b2);
    }
    
    public void update(){
        for(Ball b:balls){
            b.updatePos(dt);
        }
    }
    
    public void mousePressed(MouseEvent me){
        for(Ball b:balls){
            b.updateVel(me.getX(), me.getY());
        }
    }
    
    public void paint(){
        for(Ball b:balls){
            b.draw(g);
        }
    }
    
    
    
    public static void main(String[] args) {
        new Follower5().run();
    }

}
