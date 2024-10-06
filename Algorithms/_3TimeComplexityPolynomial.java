public class _3TimeComplexityPolynomial {
    public static void main(String[] args) {
        // double now = System.currentTimeMillis();

        _3TimeComplexityPolynomial test = new _3TimeComplexityPolynomial();
        test.print(3);

        // System.out.println("time taken: " + (System.currentTimeMillis() - now) + "millisecs.");
    }
    public void print(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.println("i = " + i + ", j = " + j);
            }
            System.out.println("End of inner loop");
        }
        System.out.println("End of outer loop");
    }
}
