public class FloydsTriangle {
    
    public static void main(String args[]){

        int num=1;
        for(char i=1; i<=5; i++){
            for(char j=1; j<=i; j++){
                System.out.print(num);
                if(num<11)
                System.out.print("  ");
                else
                System.out.print(" ");
                num++;
            }
            System.out.println();
        }
    }
}
