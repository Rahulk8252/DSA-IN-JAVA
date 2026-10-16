public class primeinrange {
  public static void primerange(int n){
  for(int i=2; i<=n; i++){
    if(isPrime(i)) {
        System.out.println(i+" ");
    }
  }
  System.out.println();
  }  
  public static void main(Strings[] args) {
    primerange(20);
  }
}
