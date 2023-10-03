import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacter {

    public static  Character firstRepeatedCharacter(String string) {
        char[] charArray = string.toCharArray();
        Map<Integer, Character> map = new HashMap<>();
        for (int i = 1; i < charArray.length; i++) {
            if(map.containsValue(charArray[i]))
                return charArray[i];
            map.put(i,charArray[i]);
        }
        return null;
    }

    public static Character firstNonRepeatedCharacter(String string){
        char[] charArray = string.toCharArray();
        Map<Character,Integer > map = new HashMap<>();
        for (int i = 0; i < charArray.length; i++) {
            if (map.containsKey(charArray[i]))
                map.put(charArray[i], map.get(charArray[i]) + 1);
            else
                map.put(charArray[i], 1);
        }
        for (char c: charArray) {
            if(map.get(c) == 1)
                return c;
        }
        return null;
    }
}
