package recursion;

public class SumOfNaturalNumbers {

    public static void main(String[] args){
        int n = 5;

        int result = sum(n,0);
        System.out.println(result);
    }


    static int sum(int n, int result){
        if(n == 0){
            return result;
        }

        result += n;
        return sum(n-1,result);
    }

    static int sum2(int n){
        if(n == 1){
            return 1;
        }

        return n + sum2(n-1);
    }
}
