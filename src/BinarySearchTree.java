public class BinarySearchTree {

    private class Node{
        Integer value;
        Node leftChild;
        Node rightChild;
//        Node(int value){
//            this.value = value;
//        }

    }
    Node root = new Node();




    public void insert(int item){
        Node current = root;

        while(true){
            if(root.value == null) {
                root.value = item;
                return;
            }
            if(item > current.value){
                if(current.rightChild == null) {
                    current.rightChild = new Node();
                    current.rightChild.value = item;
                    return;
                }
                current = current.rightChild;
            }
            else {
                if(current.leftChild == null){
                    current.leftChild = new Node();
                    current.leftChild.value = item;
                    return;
                }
                current = current.leftChild;
            }
        }

    }

}
