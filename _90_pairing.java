public class _90_pairing {
    public static int pairing(int n ){
        if(n==1 || n==2){
            return n ;
        }
        // single 
        // int fnm1 = pairing(n-1);
        // // pair
        // int fnm2 = pairing(n-2);
        // int pairways = (n-1) *fnm2;
        // // total ways ; 
        // int totways = fnm1 + pairways;
        // return totways;\
        return pairing(n-1)+(n-1)*pairing(n-2);
    }
    public static void main(String[] args) {
        System.out.println(pairing(4));
    }
}
