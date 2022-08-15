// Java method to compute the sum of the digits in an Integer

import java.util.*;

public class SumOfDigits{

    public static int findSum(int num){
        
        int n = num, rem, sum=0;
        while(n!=0){
            rem=n%10;
            sum += rem;
            n/=10;
        }

        return sum;

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to count sum: ");
        int num = sc.nextInt();

        System.out.print("\n Sum of Digits = "+ findSum(num));

    }
}