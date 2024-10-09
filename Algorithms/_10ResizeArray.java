public class _10ResizeArray{
    public static void main(String[] args) {
        _10ResizeArray arrUtil = new _10ResizeArray();
        // arrUtil.printArray(new int[] {5, 1, 2, 9, 10});
        int[] original = new int[] {5, 1, 2, 9, 10};
        System.out.println("the size of original array: "+original.length);
        original = arrUtil.resize(original, original.length*2);
        System.out.println("the size of resized array: "+original.length);
    }

    public void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int[] resize(int[] arr, int capacity){
        int[] temp = new int[capacity];
        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }
        // arr = temp;
        // return arr;
        return temp;
    }
}