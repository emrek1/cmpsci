package rustem;

import javax.swing.JOptionPane;

public class Study2 {

    public static void main(String[] args) {
        int x = 5;
        m1(x);
        System.out.println(x);

        String s = JOptionPane.showInputDialog("Enter a number");
        int i = Integer.valueOf(s);
        //int i = Integer.parseInt(s);

        System.out.println(i);

        
    }
    
    public static void m1(int x) {
        x++;
    }

}
