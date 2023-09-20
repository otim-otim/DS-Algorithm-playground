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
                char lastBracket = balanceStack.peek();
                boolean isBalancing = false;
                switch(i){
                    case ')':
                        if(lastBracket == '(' )
                            isBalancing = true;
                        break;
                    case ']':
                        if(lastBracket == '[' )
                            isBalancing = true;
                        break;
                    case '>':
                        if(lastBracket == '<' )
                            isBalancing = true;
                        break;


                }
                if(isBalancing)
                    balanceStack.pop();
                else balanceStack.push(i);

            }
        }

        return balanceStack.size() == 0 ;
    }
}
