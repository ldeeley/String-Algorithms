import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckIfStringsAreAnagrams {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String firstString = reader.readLine();
        String secondString = reader.readLine();
        System.out.println(checkStringsAnagrams(firstString, secondString));
    }

    public static boolean checkStringsAnagrams(String firstString, String secondString) {

        if (firstString.length() != secondString.length()) return false;
        firstString = firstString.toLowerCase();
        secondString = secondString.toLowerCase();

        char[] chars = firstString.toCharArray();

        for (char ch : chars) {
            int index = secondString.indexOf(ch);
            if (index != -1) {
                secondString = secondString.substring(0, index) + secondString.substring(index + 1);
            } else {
                return false;
            }
        }

        return secondString.isEmpty();
    }

}
