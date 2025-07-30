package recursion;

public class Combination {

    public static void main(String[] args) {
        System.out.println(nCr(5,2));
    }

    // Formula: nCr = (n-1)Cr + (n-1)Cr-1

    static int nCr(int n, int r){

        if (n == r || r == 0) {
            return 1;
        }

        return nCr(n-1, r-1) + nCr(n-1, r);
    }

}
