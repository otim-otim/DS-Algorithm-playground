import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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

    public static  Character firstRepeatedCharacterSet(String string) {
        char[] charArray = string.toCharArray();
        Set<Character> set = new HashSet<>();
        for (int i = 1; i < charArray.length; i++) {
            if(set.contains(charArray[i]))
                return charArray[i];
            set.add(charArray[i]);
        }
        return null;
    }

    public static Character firstNonRepeatedCharacter(String string){
        char[] charArray = string.toCharArray();
        Map<Character,Integer > map = new HashMap<>();
        for (int i = 0; i < charArray.length; i++) {
            int count = map.containsKey(charArray[i]) ? map.get(charArray[i]) + 1 : 1;
            map.put(charArray[i],count );
        }
        for (char c: charArray) {
            if(map.get(c) == 1)
                return c;
        }
        return null;
    }
}
