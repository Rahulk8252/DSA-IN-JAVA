import java.util.Scanner;
public class invertedhalfpyramid {
     public static void main(Strings[] args) {
    Scanner input =new Scanner(System.in);
    System.out.println("enter a number");
    int n=input.nextInt();
    //outer
    for(int i=1;i<=n;i++){
        //spaces
        for(int j=1;j<=n-i;j++){

        
            System.out.print(" " );
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        

        System.out.println();
    }
        
    }
}
