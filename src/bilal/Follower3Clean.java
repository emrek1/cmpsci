package bilal;

import datastructure.Vector2;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import window.GameWindow;


public class Follower3Clean extends GameWindow{
    
    ArrayList<Ball> list = new ArrayList<>();
    
    public void init(){
        Vector2 pos = new Vector2(100, 100);
        Vector2 vel = new Vector2(100, 100);
        double speed = 100;
        Ball b1 = new Ball(pos, vel, speed);
        speed = Double.parseDouble( JOptionPane.showInputDialog("Enter speed") );
        Ball b2 = new Ball(new Vector2(pos), new Vector2(vel), speed);
        
        list.add(b1);
        list.add(b2);        
    }
    
    public void update(){        
        for(Ball b:list){
            Vector2 disp = b.vel.mul(dt/1000f);//vel * dt
            b.pos.addOn(disp);
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
            g.fillOval((int)ball.pos.x-25, (int)ball.pos.y-25, 50, 50);
    }
    
    public static void main(String[] args) {
        new Follower3Clean().run();
    }
    

}
