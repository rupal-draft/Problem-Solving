package recursion;

public class SumOfDigits {

    public static void main(String[] args) {
        int n = 235;
        int result = sumOfDigits(n);
        System.out.println(result);
    }

    static int sumOfDigits(int n){
        if (n == 0) return n;

        return sumOfDigits(n / 10) + (n % 10);
    }
}
