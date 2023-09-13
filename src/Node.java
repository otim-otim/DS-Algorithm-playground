public class Node {
    private int value;
    private Node node;
    public Node(int value, Node node){
        this.value = value;
        this.node = node;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int newValue){
        value = newValue;
    }

    public void setNode(Node newNode){
        node = newNode;
    }
    public Node nextNode(){
        return node;
    }


}
