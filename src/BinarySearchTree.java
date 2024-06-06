import static java.lang.Math.max;

public class BinarySearchTree {

//    private class Node {
//        Integer value;
//        Node leftChild;
//        Node rightChild;
////        Node(int value){
////            this.value = value;
////        }
//
//    }

    private TreeNode root = new TreeNode();


    public void insert(int item) {
        TreeNode current = root;

        while (true) {
            if (root.value == null) {
                root.value = item;
                return;
            }
            if (item > current.value) {
                if (current.rightChild == null) {
                    current.rightChild = new TreeNode();
                    current.rightChild.value = item;
                    return;
                }
                current = current.rightChild;
            } else {
                if (current.leftChild == null) {
                    current.leftChild = new TreeNode();
                    current.leftChild.value = item;
                    return;
                }
                current = current.leftChild;
            }
        }

    }

    public boolean find(int value) {
        TreeNode current = root;
        while (current != null) {
            if (current.value == value) return true;
            current = value > current.value ? current.rightChild : current.leftChild;

        }
        return false;

    }

    public void traversePreorder(){
        traversePreorder(root);
    }

    private void traversePreorder(TreeNode root){
        if(root == null)
            return;
        System.out.println(root.value);
        traversePreorder(root.leftChild);
        traversePreorder(root.rightChild);


    }

    public void traverseInOrder(){
        traverseInOrder(root);
    }

    private void traverseInOrder(TreeNode root){
        if(root == null)
            return;
        traverseInOrder(root.leftChild);
        System.out.println(root.value);
        traverseInOrder(root.rightChild);

    }

    public void traversePostOrder(){
        traversePostOrder(root);
    }

    private void traversePostOrder(TreeNode root){
        if(root == null)
            return;
        traversePostOrder(root.rightChild);
        traversePostOrder(root.leftChild);
        System.out.println(root.value);

    }

    public int heightOfTree(){
        return heightOfNode(root);
    }


    public int heightOfNode(TreeNode node){
        if(node == null)
            return -1;
        if(isLeaf(node))
            return 0;
        return 1 + max( heightOfNode(node.leftChild),heightOfNode(node.rightChild));


    }

    public int min(){

        return min(root);
    }

    public int min(TreeNode node){

        if(isLeaf(node))
            return node.value;
        return  min(node.leftChild);

    }

    public boolean isLeaf(TreeNode node){

        return node.leftChild == null && node.rightChild == null ;

    }

    public boolean isBinarySearchTree(){
        return isBinarySearchTree( Integer.MIN_VALUE, Integer.MAX_VALUE, root);

    }

    public boolean isBinarySearchTree(int min , int max, TreeNode node){
        if(node == null)
            return true;
        return min < node.value  && node.value < max
                && isBinarySearchTree(min, node.value -1, node.leftChild)
                && isBinarySearchTree(node.value +1, max, node.rightChild);
    }

    public void printNodesAtDistance(int distance){
        printNodesAtDistance(distance, root);
    }

    public void printNodesAtDistance(int distance, TreeNode node){
        if(node == null )
            return;
        if(distance == 0){
            System.out.println("nodes at distance: "+node.value);
            return;
        }
        printNodesAtDistance(distance -1,node.leftChild);
        printNodesAtDistance(distance -1,node.rightChild);

    }


}
