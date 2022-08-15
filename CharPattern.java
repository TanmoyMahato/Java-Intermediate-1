public class CharPattern {
    
    public static void main(String args[]){

        char ch='A';
        for(char i=1; i<5; i++){
            for(char j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
