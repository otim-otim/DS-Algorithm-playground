import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        Array numbers = new Array(4);
        numbers.insert(12);
        numbers.insert(16);
        numbers.insert(19);
        numbers.insert(8);
        numbers.insert(17);
        numbers.insert(21);



        numbers.print();
        numbers.removeAt(4);
        System.out.println("======================");
        numbers.print();
        System.out.println("======================");
        System.out.println("index of 21 is :" + numbers.indexOf(21));

        //linked lists

        LinkedList list = new LinkedList();
        list.addLast(83);
        list.addLast(41);
        list.addLast(24);
        list.addFirst(47);
        list.addFirst(23);
        list.removeLast();
        list.removeFirst();
        list.addLast(101);
        list.addLast(256);
        list.addFirst(15);
        list.addLast(107);
        list.addLast(255);
        list.addFirst(156);

        System.out.println("====================================");
        System.out.println("index of 41 is: "+ list.indexOf(41));
        System.out.println("does list contain 47 :"+ list.contains(47));
        System.out.println("last list item is :"+ list.last.getValue());
        System.out.println("the linked list has :"+ list.size() + " items");

        System.out.println("====================================");

        Array convertedArray = list.toArray();
        convertedArray.print();

        System.out.println("====================================reversed array");
        list.reverse();
        Array reversedArray = list.toArray();
        reversedArray.print();
        System.out.println("====================================2nd reversed array");
        list.reverseProxy();
        reversedArray = list.toArray();
        reversedArray.print();

        System.out.println("====================================kth node");
        System.out.println("the 5th node from the end is:" + list.getKthNodeFromTheEnd(5));
//        reversing a string using a stack
        System.out.println("====================================stacks");
        String newString = "<][(kalash)]>";
        System.out.println("the reversed string is: " +  StringReverser.reverseString(newString));
        System.out.println("is string balanced: " +  StringReverser.checkStringBalance(newString));








    }
}