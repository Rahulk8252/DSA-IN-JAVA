import java.util.Scanner;
public class hii {
  public static void main(Strings[] args){
    Scanner input =new Scanner(System.in);
int number;
int choice;
int evenSum =0;
int oddSum =0;

do{
    System.out.println("enter the number");
    number= input.nextInt();

    if(number % 2 == 0){
        evenSum += number;
    }else{
        oddSum += number;
    }
    System.out.println("Do you want to continue? press 1 for yes or 0 for no");
    choice= input.nextInt();
} while(choice==1);
   System.out.println("Sum of even number " + evenSum);
   System.out.println("Sum of odd number " + oddSum);

  }  
}
