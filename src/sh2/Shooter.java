package sh2;

import datastructure.Vector2;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import window.GameWindow;


public class Shooter extends GameWindow {
    
    Player p;
    ArrayList<Bullet> bullets = new ArrayList<>();
    ArrayList<Enemy> enemies = new ArrayList<>();
        
    public void init(){
        p = new Player(new Vector2(100, 100));
        enemies.add(new Enemy(new Vector2(600,100)));
        enemies.add(new Enemy(new Vector2(600,300)));
        enemies.add(new Enemy(new Vector2(600,500)));
    }
        
    public void update(){
        
        for(Bullet b : bullets){
            b.updatePos(dt);            
        }
        
        p.updatePos(dt);
    }
    
    
    public void paint(){
        g.fillOval((int)p.pos.x-25, (int)p.pos.y-25, 50, 50);
        
        for(Bullet b:bullets){
            g.setColor(Color.BLUE);
            g.fillOval((int)b.pos.x-5, (int)b.pos.y-5, 10, 10);
            g.setColor(Color.BLACK);
        }       
        
        for(Enemy e:enemies){
            g.setColor(Color.RED);
            g.fillOval((int)e.pos.x-5, (int)e.pos.y-5, 30, 30);
            g.setColor(Color.BLACK);
        }
        
    }
    
    public void mousePressed(MouseEvent me){
        bullets.add(new Bullet(new Vector2(p.pos.x, p.pos.y)));
    }
    
    
    int playerSpeed = 100;
    public void keyPressed(KeyEvent ke){
        
        switch(ke.getKeyCode()){
            case KeyEvent.VK_W:
                p.vel = new Vector2(0,-playerSpeed);
                break;
            case KeyEvent.VK_A:
                p.vel = new Vector2(-playerSpeed,0);
                break;
            case KeyEvent.VK_S:
                p.vel = new Vector2(0,playerSpeed);
                break;
            case KeyEvent.VK_D:
                p.vel =new Vector2(playerSpeed,0); 
                break;
            
        }
        
    }
    
    public void keyReleased(KeyEvent ke){
        p.vel = new Vector2(0,0);
    }
    
    
    
    public static void main(String[] args) {
        new Shooter().run();
    }

}
