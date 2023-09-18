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
        Node node = new Node(item);
        if(first == null){
            node.setNext(node);
            first = last = node;
        }else{
            node.setNext(first);
            first = node;
        }
    }

//    public int indexOf(int value){
//        int index = 0;
//        Node currentNode = first;
//        while(currentNode != null){
//            if(currentNode.getValue() == value)
//                return index;
//            else {
//                index++;
//                currentNode = currentNode.nextNode();
//            }
//
//        }
//
//        return -1;
//
//    }
}
