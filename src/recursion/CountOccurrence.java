package recursion;

public class CountOccurrence {

    public static void main(String[] args) {
        String str = "abcabcabcabc";
        String s = "abc";
        int count = countOccurrence(str, s, 0, 0);
        System.out.println("Count of " + s + " in " + str + " is " + count);
    }

    static int countOccurrence(String str, String s, int start, int count) {
        if (start + s.length() > str.length()) return count;

        if (str.substring(start, start + s.length()).equals(s)) count ++;

        return countOccurrence(str, s, start+1, count);
    }
}
