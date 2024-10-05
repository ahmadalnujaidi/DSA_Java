

public class _4Arrays {
    public static void main(String[] args) {
       
        _4Arrays arrUtil = new _4Arrays();
        arrUtil.arrayDemo();
    }

    public void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public void arrayDemo(){

        int[] myArray = new int[5]; // default values
        // printArray(myArray);
        myArray[0] = 5;
        myArray[1] = 1;
        myArray[2] = 8;
        myArray[3] = 2;
        myArray[4] = 10;
        myArray[2] = 9; // reupdates the value at index 2

        printArray(myArray);
        // myArray[5] = 26;
        System.out.println(myArray.length);
        System.out.println(myArray[myArray.length-1]);

        int[] arr = {5, 1, 8, 10};
        printArray(arr);

    }
}
