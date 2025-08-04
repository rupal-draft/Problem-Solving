package recursion;

public class SubsetSumProblem {

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 3};
        int target = 8;
        int result = countSubsets(arr, 0, target);
        System.out.println(result);
    }

    static int countSubsets(int[] arr, int ind, int target) {

        if (target < 0) return 0;
        if (target == 0) return 1;
        if (ind == arr.length) return 0;

        int include = countSubsets(arr, ind + 1, target - arr[ind]);
        int notInclude = countSubsets(arr, ind + 1, target);

        return include + notInclude;
    }
}
