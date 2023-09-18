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
        Node currentNode = getPreviousNode();
        currentNode.setNext(null);
        last = currentNode;
        nodeCount--;

    }

    public void removeFirst(){
        Node newNode = first.nextNode();
        first.setNext(null);
        first = newNode;
        nodeCount--;
    }

    private Node getPreviousNode(){
        Node currentNode = first;
        while(currentNode != last && currentNode.nextNode() != null) {
            if (currentNode.nextNode() != last )
                currentNode = currentNode.nextNode();
            else currentNode.setNext(null);
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
}
