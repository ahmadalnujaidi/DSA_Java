public class _7FindMin {
    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 15, 1, 2};
        _7FindMin ma = new _7FindMin();
        System.out.println(ma.findMinimum(arr));
    }
    public int findMinimum(int[] arr){
        // edge case
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("invalid input");
        }
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}

