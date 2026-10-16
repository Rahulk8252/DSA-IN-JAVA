import java.util.*;
public class evenfunction {
    public static void main(Strings[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.println("enter an integer");
         num =input.nextInt();
         if(isEven(num)){
            System.out.println("Number is even");
         } else{
            System.out.println("number is odd");
         }
    }
    public static boolean isEven(int number){
        if(number%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    
}
