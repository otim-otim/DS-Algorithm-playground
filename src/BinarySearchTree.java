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

    TreeNode root = new TreeNode();


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
}
