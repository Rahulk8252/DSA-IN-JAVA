public class butterflypattern {
   public static void butterfly(int n){
    for(int i=1; i<=n; i++){
        //star-i
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }

        //spaces _2*(n-i)
        for(int j=1; j<=2*(n-i);j++){
            System.out.print(" ");
        }
        //starrs -i
        for(int j=1; j<=i;j++){
            System.out.print("*");
        }
    }


    //2nd half
    for(int i=n;i>=1;i--){
       //star-i
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }

        //spaces _2*(n-i)
        for(int j=1; j<=2*(n-i);j++){
            System.out.print(" ");
        }
        //starrs -i
        for(int j=1; j<=i;j++){
            System.out.print("*");
        } 
    }
   } 
   public static void main(Strings[] args) {
    butterfly(9);
   }
}
