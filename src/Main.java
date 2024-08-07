import java.util.LinkedList;
import java.util.Queue;
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
//        System.out.println("last list item is :"+ list.last.getValue());
        System.out.println("the linked list has :"+ list.size() + " items");

        System.out.println("====================================");

//        Array convertedArray = list.toArray();
//        convertedArray.print();

        System.out.println("====================================reversed array");
//        list.reverse();
//        Array reversedArray = list.toArray();
//        reversedArray.print();
//        System.out.println("====================================2nd reversed array");
////        list.reverseProxy();
//        reversedArray = list.toArray();
//        reversedArray.print();

        System.out.println("====================================kth node");
//        System.out.println("the 5th node from the end is:" + list.getKthNodeFromTheEnd(5));
//        reversing a string using a stack

        System.out.println("====================================stacks");
        String newString = "<[(kalash)]>";
        StringReverser reverser = new StringReverser(newString);
        System.out.println("the reversed string is: " +  reverser.reverseString());
        System.out.println("is string balanced: " +  reverser.checkStringBalance());

        System.out.println("====================================manual stacks from scratch");
        ManualStack manualStack = new ManualStack();

        System.out.println("static is empty: " +  manualStack.isEmpty());

        manualStack.push(23);
        manualStack.push(24);
        manualStack.push(25);
        manualStack.push(26);
        manualStack.push(27);

        System.out.println("current stack: " +  manualStack.isEmpty());
        manualStack.pop();
        manualStack.pop();

        System.out.println("====================================reversing a queue");
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(12);
        queue.add(14);
        queue.add(19);
        queue.add(178);
        queue.add(124);

        System.out.println("the current queue: "+ queue.toString());
        QueueImplementation.reverse(queue);
        System.out.println("the reversed queue: "+ queue.toString());


        System.out.println("====================================array queue");
        ArrayQueue arrayQueue = new ArrayQueue(5);
        arrayQueue.enqueue(3);
        arrayQueue.enqueue(8);
        arrayQueue.enqueue(9);
        arrayQueue.enqueue(23);
        arrayQueue.enqueue(32);
        ;

        arrayQueue.printQueue();
        System.out.println("dequeue: "+ arrayQueue.dequeue());
        arrayQueue.enqueue(43);
        System.out.println("current head: "+ arrayQueue.peek());
        arrayQueue.printQueue();

        System.out.println("====================================stack queue");
        StackQueue stackQueue = new StackQueue(6);
        stackQueue.enqueue(34);
        stackQueue.enqueue(54);
        stackQueue.enqueue(64);
        stackQueue.enqueue(39);
        stackQueue.enqueue(290);
        stackQueue.enqueue(341);

        stackQueue.printQueue();

        stackQueue.dequeue();
        stackQueue.enqueue(444);
        stackQueue.printQueue();
        stackQueue.dequeue();
        stackQueue.enqueue(477);

        stackQueue.printQueue();

        System.out.println("====================================priority queue");
        PriorityQueue priorityQueue = new PriorityQueue(6);
        priorityQueue.addItem(17);
        System.out.println("current count: " + priorityQueue.count);
        priorityQueue.addItem(12);
        System.out.println("current count: " + priorityQueue.count);
        priorityQueue.addItem(10);
        System.out.println("current count: " + priorityQueue.count);
        priorityQueue.printQueue();
        priorityQueue.addItem(16);
        System.out.println("current count: " + priorityQueue.count);
        priorityQueue.addItem(19);
        System.out.println("current count: " + priorityQueue.count);
        priorityQueue.addItem(20);
        System.out.println("current count: " + priorityQueue.count);
        priorityQueue.printQueue();

        priorityQueue.removeItem();
        priorityQueue.printQueue();


        System.out.println("====================================hash maps");
        System.out.println("first repeated cahracter: " + RepeatedCharacter.firstRepeatedCharacter("rendezvous"));
        System.out.println("first repeated cahracter using set: " + RepeatedCharacter.firstRepeatedCharacter("rendezvous"));
        System.out.println("first non-repeated cahracter: " + RepeatedCharacter.firstNonRepeatedCharacter("rrendezvous"));

        ChainHashMap hashMap = new ChainHashMap(5);
        hashMap.put(new Entry(6,"A"));
        hashMap.put(new Entry(5,"B"));
        hashMap.put(new Entry(11,"A+"));

        System.out.println("====================================last hash maps");

        System.out.println("====================================binary search trees");

        BinarySearchTree binaryTree = new BinarySearchTree();
        binaryTree.insert(12);
        binaryTree.insert(10);
        binaryTree.insert(14);
        binaryTree.insert(16);
        binaryTree.insert(4);

        System.out.println("tree has 10? :" + binaryTree.find(10));


//        normal tree
        Tree normalTree = new Tree();
        normalTree.insert(12);
        normalTree.insert(14);
        normalTree.insert(17);
        normalTree.insert(7);
        normalTree.insert(4);
        normalTree.insert(9);
        normalTree.insert(23);
        normalTree.insert(11);
        normalTree.insert(5);

        Tree normalTree1 = new Tree();
        normalTree1.insert(12);
        normalTree1.insert(14);
        normalTree1.insert(17);
        normalTree1.insert(7);
        normalTree1.insert(4);
        normalTree1.insert(9);
        normalTree1.insert(23);
        normalTree1.insert(11);
        normalTree1.insert(5);

        Tree normalTree2 = new Tree();
        normalTree2.insert(12);
        normalTree2.insert(14);
        normalTree2.insert(17);
        normalTree2.insert(7);
        normalTree2.insert(4);
        normalTree2.insert(9);
        normalTree2.insert(23);
        normalTree2.insert(11);
        normalTree2.insert(5);

        System.out.println("normal tree   pretraversal");
        normalTree.traversePreOrder();
        System.out.println("normal tree intraversal");

        normalTree.traverseInOrder();
//
        System.out.println("traversing post order");
        normalTree.traversePostOrder();

        System.out.println(" binary tree minimum number:" + binaryTree.min());
        System.out.println(" is this a binary search tree:" + binaryTree.isBinarySearchTree());
        binaryTree.printNodesAtDistance(3);
//        System.out.println(" normal tree minimum number: " + normalTree.min());

        System.out.println("is tree1 == tree2:" + normalTree1.isEqual(normalTree2));

        System.out.println("====================================AVL trees");

        AVLTree avlTree = new AVLTree();
        avlTree.insert(10);
        avlTree.insert(20);
        avlTree.insert(30);

    }
}