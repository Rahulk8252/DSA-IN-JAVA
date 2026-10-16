import java.util.Scanner;
public class checkprime {
    public static void main(Strings[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int n=input.nextInt();
        if(n==2){
            System.out.println("n is prime");
        }else{
            boolean isprime=true;
            for(int i=2; i<n-1;i++){
                if(n%i ==0){
                    isprime= false;
                }
            }
            if(isprime == true){
                System.out.println("n is prime");
            }else{
                System.out.println("n is not prime");
            }
        }
    }
}
