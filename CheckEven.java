// Java method to check even number

import java.util.*;

class CheckEven {
    
    public static boolean isEven(int num1){
        if(num1%2==0)
          return true;
        else 
          return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int num1=sc.nextInt();
        
        boolean result=isEven(num1);
        System.out.print(result);
    }
    
}