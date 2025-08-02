package recursion;

public class RopeCuttingProblem {

    public static void main(String[] args) {
        int n = 7, a = 5, b = 2, c = 2;
        int maxCuts = ropeCutting(n, a, b, c);
        System.out.println(maxCuts);
    }

    static int ropeCutting(int n, int a, int b, int c) {
        if (n < 0) return -1;
        if (n == 0) return 0;

        int aCut = ropeCutting(n - a, a, b, c);
        int bCut = ropeCutting(n - b, a, b, c);
        int cCut = ropeCutting(n - c, a, b, c);

        int max = Math.max(aCut, Math.max(bCut, cCut));

        if (max == -1) return -1;

        return 1 + max;
    }
}
