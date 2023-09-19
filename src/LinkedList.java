public class LinkedList {

    Node last;
    Node first;

    private int nodeCount = 0;


    public void addLast(int value){
        Node node = new Node(value);
        node.setNext(null);
        if(first == null)
            first = last = node;
        else{
            last.setNext(node);
            last = node;
        }
        nodeCount++;

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
        nodeCount++;
    }

    public int indexOf(int value){
        int index = 0;
        Node currentNode = first;
        while(currentNode != null){
            if(currentNode.getValue() == value)
                return index;
            else {
                if(currentNode == last) return -1;
                index++;
                currentNode = currentNode.nextNode();
            }

        }

        return -1;

    }

    public boolean contains(int item){

        return indexOf(item) != -1;
    }

    public void removeLast(){
        if(first == last ) {
            first = last = null;
            return;
        }
        if(first == null) throw new IllegalArgumentException();
        last = getPreviousNode(last);
        last.setNext(null);
        nodeCount--;

    }

    public void removeFirst(){
        Node newNode = first.nextNode();
        first.setNext(null);
        first = newNode;
        nodeCount--;
    }

    private Node getPreviousNode(Node node){
        Node currentNode = first;
        while(currentNode != node && currentNode.nextNode() != null) {
            if (currentNode.nextNode() != node )
                currentNode = currentNode.nextNode();
//            else if (node == last) currentNode.setNext(null);
            else break;
        }
        return currentNode;
    }

    public int size(){
        return nodeCount;
    }

    public Array toArray(){
        if(first == null) throw  new IllegalArgumentException();

        Array newArray = new Array(size() );
        Node currentNode = first;
        while(currentNode.nextNode() != null){
            newArray.insert(currentNode.getValue());
            currentNode = currentNode.nextNode();
        }
        return newArray;
    }

    public void reverse(){
        if(first == null) return;
        Node currentNode = last;
        do{
            Node previous = getPreviousNode(currentNode);
            currentNode.setNext(previous);
            currentNode = previous;
            if(currentNode == first) {
                currentNode.setNext(null);
                Node temporaryNode = last;
                last = first;
                first = temporaryNode;
            }

        }
        while(currentNode.nextNode() != null);


    }

    public void reverseProxy(){
        if(first == null) return;
        Node previous = first;
        Node current = first.nextNode();

        while(current != null){
            Node next = current.nextNode();
            current.setNext(previous);
            previous = current;
            current = next;
        }

        last = first;
        last.setNext(null);
        first = previous;
    }

    public int getKthNodeFromTheEnd(int k){
        if(k > nodeCount) throw new IllegalArgumentException();
        Node head= first;
        Node tail = first;
        for(int i = 0 ; i< k-1; i++)
            tail = tail.nextNode();
        while(tail != last){
            head = head.nextNode();
            tail = tail.nextNode();
        }
        return head.getValue();

    }
}
