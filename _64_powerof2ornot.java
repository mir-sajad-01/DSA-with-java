public class _64_powerof2ornot {
    public static boolean powerof2(int n ){
         return (n & (n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(powerof2(64));
    }
}
