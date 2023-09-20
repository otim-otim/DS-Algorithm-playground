import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StringReverser {

    String string;
    Stack<Character> balanceStack = new Stack<>();

    private final List<Character> leftBrackets = Arrays.asList('(' ,'[' ,'<','{');

    private final List<Character> rightBrackets = Arrays.asList(')', ']' ,'>','}');

    public StringReverser(String string){
        this.string = string;
    }
    public  String reverseString(){
        if(string == null) throw new IllegalArgumentException();
        Stack<Character> reversal = new Stack<Character>();
        StringBuffer reversed = new StringBuffer();
        for (char i:string.toCharArray() )
            reversal.push(i);
        while(!reversal.empty())
            reversed.append(reversal.pop());
        return reversed.toString();
    }

    public  boolean checkStringBalance(){

        for( char i : string.toCharArray()){
            if(isLeftBracket(i))
                balanceStack.push(i);
            else if (isRightBracket(i)) {
                if(balanceStack.empty()) return false;

                boolean isBalancing = isHasCorrespondingLeft(i);
                if(isBalancing)
                    balanceStack.pop();
                else return false;
            }
        }
        return balanceStack.empty()  ;
    }

    private  boolean isLeftBracket(char bracket){
        return leftBrackets.contains(bracket);
    }

    private  boolean isRightBracket(char bracket){
        return rightBrackets.contains(bracket);
    }

    private  boolean isHasCorrespondingLeft(char bracket){
        char lastBracket = balanceStack.peek();
        boolean isBalancing = false;
        switch(bracket){
            case ')':
                isBalancing = lastBracket == '(' ;
                break;
            case ']':
                isBalancing = lastBracket == '[' ;
                break;
            case '>':
                isBalancing = lastBracket == '<' ;
                break;
            case '}':
                isBalancing = lastBracket == '{' ;
                break;


        }

        return isBalancing;
    }
}
