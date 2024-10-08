public class _9MoveZerosEnd {
    public static void main(String[] args) {
        _9MoveZerosEnd arrUtil = new _9MoveZerosEnd();
        arrUtil.arrayDemo();
    }

    public void arrayDemo(){
        int[] arr = {8, 1, 0, 2, 1, 0, 3};
        printArray(arr);
        moveZeros(arr, arr.length);
        printArray(arr);
    }

    public void moveZeros(int[] arr, int n){
        int j = 0; // focus on zero elements
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0 && arr[j] == 0) { // i will focus on non-zero elements
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0){
                j++;
            }
        }
    }

    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
