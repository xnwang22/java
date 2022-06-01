import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        char[] ca1 = a.toLowerCase().toCharArray();
        char[] ca2 = b.toLowerCase().toCharArray();
        java.util.Arrays.sort(ca1);
        java.util.Arrays.sort(ca2);
        return java.util.Arrays.equals(ca1, ca2);
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
