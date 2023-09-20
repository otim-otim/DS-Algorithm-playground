import java.util.Stack;

public class StringReverser {
    public static String reverseString(String string){
        Stack<Character> reversal = new Stack<Character>();
        StringBuffer reversed = new StringBuffer();
        for (char i:string.toCharArray() )
            reversal.push(i);
        while(!reversal.empty())
            reversed.append(reversal.pop());
        return reversed.toString();
    }
}
