package bilal;

import window.GameWindow;

public class Game1 extends GameWindow{

    int ballY = 100;
    
    public void update(){
        ballY += 3;
    }
    
    public void paint(){
        g.fillOval(400, ballY, 50, 50);
    }
    
    
    public static void main(String[] args) {
        Game1 g = new Game1();
        g.run();
    }
    
}
