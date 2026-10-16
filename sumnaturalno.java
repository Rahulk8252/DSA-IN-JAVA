import java.util.Scanner;
public class sumnaturalno {
public static void main(Strings[] args){
    Scanner input= new Scanner(System.in);
    System.out.println("enter a number");
    int n=input.nextInt();
    int sum=0;
    int i=1;
    while(i<=n){
        sum+=i;
        i++;
    }
    System.out.println("sum is:" +sum);
}    
}
