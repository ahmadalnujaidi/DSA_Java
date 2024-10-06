public class _2TimeComplexityLinear{
    public static void main(String[] args) {
        double now = System.currentTimeMillis();

        _2TimeComplexityLinear test = new _2TimeComplexityLinear();
        System.out.println(test.findSum(3));

        System.out.println("time taken: " + (System.currentTimeMillis() - now) + "millisecs.");
    }
        
    
    public int findSum(int n){
        int sum = 0; // 1 step
        for (int i = 1; i <= n; i++) {
            sum = sum + i; // n steps
        }
        return sum; // 1 step
    }
}