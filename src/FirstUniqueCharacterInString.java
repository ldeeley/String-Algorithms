import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String stringToCheck = reader.readLine();
        System.out.println(getFirstUniqueCharInString(stringToCheck));
    }

    public static char getFirstUniqueCharInString(String stringToCheck) {

        Map<Character, Integer> charMap = new LinkedHashMap<>(stringToCheck.length());

        for (char ch : stringToCheck.toCharArray()) {
            charMap.put(ch, charMap.containsKey(ch) ? charMap.get(ch) + 1 : 1);
        }

        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        throw new RuntimeException("didn't find a unique character");
    }

}
