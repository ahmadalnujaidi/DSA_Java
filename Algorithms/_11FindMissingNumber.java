public class _11FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 8, 2, 4, 7};
        System.out.println(findMissingNumber(arr));
        
    }
    public static int findMissingNumber(int[] arr){
        int n = arr.length + 1;
        int sum = (n * (n + 1)) / 2;
        for(int num : arr){
            sum -= num;
        }
        return sum;
    }
    
}
