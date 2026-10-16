public class arrayp {
    public static void main(Strings[] args) {
        int[][] nums={ {1,4,9},{11,4,3},{2,2,3}};
        int sum=0;

        //sum of second row element
        for(int j=0;j<nums[0].length;j++){
           sum +=nums[1][j];
        }
        System.out.println("sum is: " +sum);
    }
}
