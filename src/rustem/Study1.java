package rustem;

import java.util.HashSet;


public class Study1 {
    static int x;
    public static void main(String[] args) {
        
        int result = getCount3(2, 2, 3);        
        x=3;
    }
    
    
    public static int getCount4(int a, int b, int c){
        int count = 1;        
        if(b==a)
            count++;
        if(c==a)
            count++;        
        
        if(count>1)
            return count;
        else{
            if(b==c)
                return 2;
            else
                return 1;
        }
    }
    
    
    public static int getCount3(int a, int b, int c){
        int count1 = getCountA(a, b, c);
        int count2 = getCountA(b, a, c);
        int count3 = getCountA(c, b, a);
        
        int max = Math.max(count1, count2);
        max = Math.max(max, count3);
        
        return max;
    }    
    public static int getCountA(int a, int b, int c){
        int count = 1;        
        if(b==a)
            count++;
        if(c==a)
            count++;        
        return count;
    }
      
    
    
    public static int getCount2(int a, int b, int c){
        
        if(a==b && b==c){
            return 3;
        }else if(a==b || b==c || a==c){
            return 2;
        }else{ 
            return 1;
        }
        
    }
    
    
    public static int getCount(int a, int b, int c){
        HashSet<Integer> nums = new HashSet<>();
        nums.add(a);
        nums.add(b);
        nums.add(c);        
        int similar = 4-nums.size();
        if( similar==1)
            similar = 0;
        return similar;
    }
    
    
    
    
    
    
    
    
    
}
