package physics;

import window.GameWindow;

public class SpringExample extends GameWindow {

    public SpringExample() {
        super(1700, 900);
    }
    
    
    double len = 200;
    double x1=300,x2=500;
    
    
    double v2=0.1;
    
    public void update(){
        
        x2 = x2 + v2*dt;        
                
        double a = 0.001 * ( len - (x2-x1) );
        
        v2 = v2 + a*dt;
        
        
    }
    
    
    
    public void paint(){
        g.fillOval((int)x1-15, 500-15, 30, 30);
        g.fillOval((int)x2-15, 500-15, 30, 30);
        g.drawLine((int)x1, 500, (int)x2, 500);
        
    }
    
    
    
    public static void main(String[] args) {
        new SpringExample().run();        
        
    }

}
