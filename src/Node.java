public class Node {
    private int value;
    private Node next;
    public Node(int value){
        this.value = value;

    }

    public int getValue(){
        return value;
    }

    public void setValue(int newValue){
        value = newValue;
    }

    public void setNext(Node newNode){
        next = newNode;
    }
    public Node nextNode(){
        return next;
    }


}
