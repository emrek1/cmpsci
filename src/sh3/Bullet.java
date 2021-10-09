package sh3;

import datastructure.Vector2;
import java.awt.Color;


public class Bullet extends GameObject {
    

    public Bullet(Vector2 pos) {
        super(pos);
        vel = new Vector2(1000,0);        
        radius = 5;
        color = Color.BLUE;
    }
    

    

}
