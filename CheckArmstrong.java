// Java Program to Display Armstrong Numbers Between Intervals Using Function

import java.util.*;

class CheckArmstrong {
    
    public static boolean armstNum(int i){
            
            int digits=0;
            int n=i;
            while(n!=0){ 
                n/=10;
                ++digits;
            }
            
            n=i;
            int armst=0;
            int rem;
            while(n!=0){
                rem=n%10;
                armst+=Math.pow(rem,digits);
                n=n/10;
            }
            
            if(i==armst)
                return true;
            else
                return false;
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter START and END: ");
        int start=sc.nextInt();
        int end=sc.nextInt();
        
        for(int i=start; i<=end; i++){
         if(armstNum(i))
          System.out.print(i);
        }
    }
    
}