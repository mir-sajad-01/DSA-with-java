import java.util.*;
public class _5_largestof3nos {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ( (a>b) &&(b>c)){
            System.out.println(" A ");
        }
        else if ( b>c){
            System.out.println("B");
        }
        else if ( (a ==b) && (b==c)){
            System.out.println("Same");
        }
        else 
        {
            System.out.println("C");
        }
        sc.close();
    }
}
