import java.util.HashMap;

public class FindFirstRepeating {
    private String s;

    public FindFirstRepeating(String s) {
        this.s = s;
    }

    public char findFirstRepeatingCharacter() {
        HashMap<Character, Boolean> charMap = new HashMap<>();
        for (char c : this.s.toCharArray()) {
            if (charMap.containsKey(c)) {
                if (charMap.get(c)) {
                    return c;
                }
            } else {
                charMap.put(c, true);
            }
        }
        return Character.MIN_VALUE;
    }
}
