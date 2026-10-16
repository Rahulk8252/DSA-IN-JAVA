import java.util.Scanner;
public class averageofthreeno {
   
  
    public static void main(Strings[] args) {
        Scanner input= new Scanner(System.in);
    System.out.println("enter first number");
    int a=input.nextInt();
    System.out.println("enter second number");
    int b=input.nextInt();
    System.out.println("enter third number");
    int c=input.nextInt();
    System.out.println("the average is: "+average(a,b,c)+"\n");

    
   } 
    public static int average(int a, int b, int c){
    
    return (a+b+c)/3;
    
   }

}
