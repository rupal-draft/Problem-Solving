package recursion;

public class TowerOfHanoi {

    public static void main(String[] args) {
        char source = 'A', auxiliary = 'B', destination = 'C';
        int n = 3;
        TOH(n, source, auxiliary, destination);
    }

    static void TOH(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move " + n + " from " + source + " to " + destination);
            return;
        }

        TOH(n-1, source, destination, auxiliary);
        System.out.println("Move " + n + " from " + source + " to " + destination);
        TOH(n-1, auxiliary, source, destination);
    }
}
