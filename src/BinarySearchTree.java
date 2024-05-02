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
        traverseInOrder(root);
    }

    private void traversePostOrder(TreeNode root){
        if(root == null)
            return;
        traverseInOrder(root.rightChild);
        traverseInOrder(root.leftChild);
        System.out.println(root.value);

    }
}
