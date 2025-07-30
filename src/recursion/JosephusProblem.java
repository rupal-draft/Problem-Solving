package recursion;

public class JosephusProblem {

    public static void main(String[] args) {
        System.out.println(josephus(5, 3));
    }

    static int josephus(int n, int k){
        if (n == 1){
            return 0;
        }

        return (josephus(n-1,k) + k) % n;
    }

    // ((josephus(n-1, k) + k - 1) % n) + 1 for 1-based indexing
}
