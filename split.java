import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] tokens_1=s.split("[ !,?._'@]");
        List<String> token_list = Arrays.asList(tokens_1);
        ArrayList<String> tokens = new ArrayList<>(token_list);
        Iterator<String> it = tokens.iterator();
        while (it.hasNext()) {
            if (it.next().isEmpty())
            {
                it.remove();
            }
        }
        System.out.println(tokens.size());
        for (int i = 0 ; i < tokens.size(); i++)
        {
            // if(!tokens[i].isEmpty())
            {
                System.out.println(tokens.get(i));
            }
        }
        scan.close();
    }
}
