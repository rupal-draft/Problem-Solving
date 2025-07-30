package recursion;

public class Fibonacci {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    static int fibonacci(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
