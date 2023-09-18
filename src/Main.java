
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
//        list.addLast(24);
//        list.addFirst(47);
        list.addFirst(23);

        System.out.println("====================================");
        System.out.println("index of 41 is: "+ list.indexOf(41));
        System.out.println("does list contain 47 :"+ list.contains(17));

    }
}