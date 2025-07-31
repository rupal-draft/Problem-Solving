package recursion;

public class PrintAllSubsets {

    public static void main(String[] args) {
        String str = "abc";
        printAllSubsets(str,"",0);
    }

    static void printAllSubsets(String str, String subset, int start){
        if (start == str.length()) {
            System.out.print(subset + " ");
            return;
        }

        printAllSubsets(str, subset + str.charAt(start), start + 1);
        printAllSubsets(str, subset, start + 1);
    }
}
