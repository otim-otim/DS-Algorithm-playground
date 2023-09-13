public class LinkedList {

    Node last;
    Node first;


    public void addLast(int value){
        Node node = new Node(value);
        node.setNext(node);
        if(first == null)
            first = last = node;
        else{
            last.setNext(node);
            last = node;
        }

    }

    public void addFirst(int item){

    }
}
