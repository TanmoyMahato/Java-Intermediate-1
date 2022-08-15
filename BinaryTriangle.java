public class BinaryTriangle {
    
    public static void main(String args[]){

        int num=1, binary;
        for(char i=1; i<=5; i++){
            binary=num;
            for(char j=1; j<=i; j++){
                System.out.print(binary);
                if(i>1){
                  if(binary==1)
                  binary--;
                  else
                  binary++;
                }
            }
            if(num==1)
              num--;
            else
              num++;
            System.out.println();
        }
    }
}
