package sh3;

import datastructure.Vector2;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import window.GameWindow;


public class Shooter extends GameWindow {
    
    Player p;    
    static ArrayList<GameObject> gameObjects = new ArrayList<>();
        
    public void init(){
        p = new Player(new Vector2(100, 100));
        new Enemy(new Vector2(600,100));
        new Enemy(new Vector2(600,300));
        new Enemy(new Vector2(600,500));
    }
        
    public void update(){        
        for(GameObject go:gameObjects)
            go.updatePos(dt);
    }    
    
    public void paint(){
        for(GameObject go:gameObjects)
            go.draw(g);        
    }
    
    public void mousePressed(MouseEvent me){
        new Bullet(new Vector2(p.pos.x, p.pos.y));
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
