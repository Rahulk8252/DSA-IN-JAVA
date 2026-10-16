import java.util.Scanner;
public class fact {
    public static void main(Strings[] args){
        Scanner input = new Scanner(System.in);
        int num;
        int fact =1;
        System.out.println("enter any positive number");
        num=input.nextInt();
        for(int i=1; i<=num; i++){
            fact *=i;
        }
        System.out.println("factorial: "+ fact);
    }
    
}
