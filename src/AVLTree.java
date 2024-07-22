import static java.lang.Math.max;
public class AVLTree {

    private class AVLNode {
        int value;
        AVLNode leftChild = null;
        AVLNode rightChild = null;
    }

    AVLNode root = null;


    public void insert2(int item){
        AVLNode current = root;

        while(true) {
            if(root == null){
                root.value = item;
                return;
            }
            if(item > current.value){
                if(current.rightChild == null){
                    current.rightChild = new AVLNode();
                    current.rightChild.value = item;
                    return;

                }
                current = current.rightChild;

            }
            else{
                if(current.leftChild == null){
                    current.leftChild = new AVLNode();
                    current.leftChild.value = item;
                    return;

                }
                current = current.leftChild;
            }


        }

    }

    public void insert(int item){
        root = insert(root, item);
    }

    private AVLNode insert(AVLNode node, int item){
        // Base case: If the tree is empty, return a new node
        if (node == null) {
            AVLNode newNode = new AVLNode();
            newNode.value = item;
            return newNode;
        }

        // Otherwise, recur down the tree
        if (item < node.value) {
            node.leftChild = insert(node.leftChild, item);
        } else if (item > node.value) {
            node.rightChild = insert(node.rightChild, item);
        }

        if(!isBalanced(node))


        // Return the (unchanged) node pointer
        return node;

    }

    public int heightNode(AVLNode node){
        if(node == null)
            return -1;
        if(isLeaf(node))
            return 0;
        return 1+ max(heightNode(node.leftChild),heightNode(node.rightChild));


    }
    public boolean isLeaf(AVLNode node){
        return node.leftChild == null && node.rightChild == null ;
    }

    public boolean isBalanced(AVLNode node){
        if((heightNode(node.leftChild) - heightNode(node.rightChild)) > 1 || (heightNode(node.leftChild) - heightNode(node.rightChild) < -1))
            return false;
        return true;

    }

    public void rightRotate(AVLNode node){
        AVLNode leftNode = node.leftChild;
        leftNode.rightChild  = node;
        node.leftChild = null;

        
    }



}
