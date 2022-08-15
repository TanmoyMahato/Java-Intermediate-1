// Java method to compute average of three numbers

import java.util.*;

class FindAverage {
    
    public static float avg(int a, int b, int c){
        return (a+b+c)/3;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter three numbers: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        
        float result=avg(num1,num2,num3);
        System.out.print("Average = "+ result);
    }
    
}