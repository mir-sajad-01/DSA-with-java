public class _65_counsetbits {
    public static int count(int n ){
        int count = 0 ; 
          while ( n >0){
            if ( (n & 1) == 1){
                count++;
            }
            n=n >> 1;
          }
          return count ; 
    }
    public static void main(String[] args) {
       System.out.println(count ( 10)); 
    }
}
