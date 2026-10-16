import java.util.Scanner;
public class weekcheck {
    public static void main(Strings[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("enter week number");
        int n=input.nextInt();
        switch (n) {
            case 1: System.out.println("monday");
                   break;
            case 2: System.out.println("TUESDAY");
                   break;
            case 3: System.out.println("WEDNESDAY");
                   break;
            case 4: System.out.println("THURSDAY");
                   break;
            case 5: System.out.println("FRIDAY");
                   break;
            case 6: System.out.println("SATURDAT");
                   break;
            case 7: System.out.println("SUNDAY");
                   break;
            
                default:System.out.println("wrong enter number");   
        
        }

    }
    
}
