package sh3;

import datastructure.Vector2;
import java.awt.Color;

public class Enemy extends GameObject{
    

    public Enemy(Vector2 pos) {
        super(pos);
        radius = 15;
        color = Color.RED;
    }
}
