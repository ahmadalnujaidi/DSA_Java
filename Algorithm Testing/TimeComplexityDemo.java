public class TimeComplexityDemo{
    public static void main(String[] args) {
        double now = System.currentTimeMillis();

        TimeComplexityDemo test = new TimeComplexityDemo();
        System.out.println(test.findSum(99999));

        System.out.println("time taken: " + (System.currentTimeMillis() - now) + "millisecs.");
    }
    // public int findSum(int n){
    //     return n * (n + 1) / 2;
    // };

    public int findSum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum = sum + i;
        }
    return sum;
    }
}