public class _85_firstOccu {
    public static int firstoccu(int arr[ ], int key , int i){
        if( i == arr.length -1){
            return -1;
        }
        if ( arr[i]== key){
            return i ;
        }
        return firstoccu(arr,key,i+1);
    }
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,6,4,7,8};
        int key = 4;
        System.out.println(firstoccu(arr,key,0));
    }
}
