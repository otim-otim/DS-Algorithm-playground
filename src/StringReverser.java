import java.util.Stack;

public class StringReverser {
    public static String reverseString(String string){
        if(string == null) throw new IllegalArgumentException();
        Stack<Character> reversal = new Stack<Character>();
        StringBuffer reversed = new StringBuffer();
        for (char i:string.toCharArray() )
            reversal.push(i);
        while(!reversal.empty())
            reversed.append(reversal.pop());
        return reversed.toString();
    }

    public static boolean checkStringBalance(String string){
        Stack<Character> balanceStack = new Stack<>();
        for( char i : string.toCharArray()){
            if(i == '(' || i == '[' || i== '<')
                balanceStack.push(i);
            else if (i == ')' || i == ']' || i == '>') {
                if(balanceStack.empty()) return false;
                char lastBracket = balanceStack.peek();
                boolean isBalancing = false;
                switch(i){
                    case ')':
                        isBalancing = lastBracket == '(' ? true : false;
                        break;
                    case ']':
                        isBalancing = lastBracket == '[' ? true : false;
                        break;
                    case '>':
                        isBalancing = lastBracket == '<' ? true : false;
                        break;


                }
                if(isBalancing)
                    balanceStack.pop();
                else {
                    balanceStack.push(i);
                    return false;
                }


            }
        }

        return balanceStack.empty()  ;
    }
}
