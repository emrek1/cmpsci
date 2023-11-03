package rustem;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;

public class st4 extends Animal{
    
    public static void main(String[] args) {
        
        
        
        Object a=new Object(),
                b=new Object(),
                c=new Object(),
                d=new Object();
        
        Object e = a;
        
        List list = new ArrayList();
        
        list.add(a);
        list.add(a);
        list.add(a);
        list.add(b);
        
        Set s = new HashSet();
        s.add("a");
        s.add("a");
        s.add("a");
        s.add("a");
        
        System.out.println(list.size());
        System.out.println(s.size());
                
        Map hm = new HashMap();
        hm.put(1, a);
        hm.put(2, a);
        hm.put(3, a);
        hm.put(4, b);
        
        System.out.println(hm.get(3));
        
        
        
        
        
    }
    
    
    public String toString(){
        return "std4 class objesi";
    }
    


}

