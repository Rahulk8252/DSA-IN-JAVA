public class Hollowpattern {
    public static void hollow(int totRows, int totCols){
        //outer loop
        for(int i=1; i<=totRows;i++){
            //inner coloum
            for(int j=1; j<=totCols; j++){
                //cell -(i,j)
                if(i==1 || i==totRows|| j==1 || j==totCols ){
                    //boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void inverted_pyramid(int n){
        //outer 
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i;j++){
            System.out.print(" ");
        }
        //star
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
    public static void main(Strings[] args) {
     // hollow(20,15);
     inverted_pyramid(10);
    }

}
