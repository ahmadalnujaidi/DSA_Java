public class _8SecondMax{
    public static int findSecondMax(int[] arr){
        int max = Integer.MIN_VALUE;       // Integer.MIN_VALUE = -2147483648      to compare safely
        int secondMax = Integer.MIN_VALUE;  // Integer.MIN_VALUE = -2147483648
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            } else if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        int[] arr = {12, 34, 2, 34, 33, 1};
        System.out.println(findSecondMax(arr));
    }
}