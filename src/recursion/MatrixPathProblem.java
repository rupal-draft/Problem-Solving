package recursion;

public class MatrixPathProblem {

    public static void main(String[] args) {
        int n = 3, m = 3;

        int count = countPaths(0 ,0, n, m);
        int count2 = matrixPaths(n, m);
        System.out.println(count);
        System.out.println(count2);
    }

    static int countPaths(int i, int j, int n, int m) {
        if (i == n-1 && j == m-1) {
            return 1;
        }

        int downPaths = 0, rightPaths = 0;

        if (i < n-1) downPaths = countPaths(i+1, j, n, m);
        if(j < m-1) rightPaths = countPaths(i, j+1, n, m);

        return downPaths + rightPaths;
    }

    static int matrixPaths(int n, int m) {
        if (n == 1 || m == 1) return 1;
        return matrixPaths(n-1, m) + matrixPaths(n, m-1);
    }
}
