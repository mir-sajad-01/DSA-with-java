public class _41_bubblesort {
    public static void bubble(int array[]) {
        int n = array.length;
        for (int turns = 0; turns < n - 1; turns++) {
            for (int j = 0; j < n - 1 - turns; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for ( int i = 0 ; i < n; i++){
            System.out.print(array[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int array[] = { 2, 5, 1,4 ,3};
        bubble (array);

     }
}
