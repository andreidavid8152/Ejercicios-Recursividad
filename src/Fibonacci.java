public class Fibonacci {

    private int n;

    public Fibonacci() {
        n = 0;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int fibonacciR(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciR(n - 1) + fibonacciR(n - 2);
        }
    }

    public String imprimirFibo(int n) {
        String text = "";
        for (int i = 1; i <= n; i++) {
            text += fibonacciR(i) + ", ";
        }
        return text;
    }

}
