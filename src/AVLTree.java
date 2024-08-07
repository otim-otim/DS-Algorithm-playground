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
           return  balanceTree(node);


        // Return the (unchanged) node pointer
        return node;

    }

    private int heightNode(AVLNode node){
        if(node == null)
            return -1;
        if(isLeaf(node))
            return 0;
        return 1+ max(heightNode(node.leftChild),heightNode(node.rightChild));


    }
    private boolean isLeaf(AVLNode node){
        return node.leftChild == null && node.rightChild == null ;
    }

    private boolean isBalanced(AVLNode node){
        if(balanceFactor(node) > 1 || balanceFactor(node) < -1))
            return false;
        return true;

    }

    private int balanceFactor(AVLNode node){
        return (heightNode(node.leftChild) - heightNode(node.rightChild));
    }

    private AVLNode rightRotate(AVLNode node){
        AVLNode leftNode = node.leftChild;
        if(leftNode.rightChild == null)
            node.leftChild = null;
        else{
            if(leftNode.value > node.value ){
                node.rightChild = leftNode.rightChild;
            }else
                node.leftChild = leftNode.rightChild;

        }
        leftNode.rightChild  = node;
        return leftNode;

        
    }

    private AVLNode leftRotate(AVLNode node){
        AVLNode rightNode = node.rightChild;
        if(rightNode.leftChild == null)
            node.rightChild = null;
        else{
            if(rightNode.value > node.value ){
                node.rightChild = rightNode.leftChild;
            }else
                node.leftChild = rightNode.leftChild;

        }

        rightNode.leftChild  = node;
        return rightNode;



    }

    private AVLNode balanceTree(AVLNode node){

        if(balanceFactor(node) > 1) { //if tree is left heavy
            if(balanceFactor(node.leftChild) > 0 )
                return rightRotate(node);
            leftRotate(node);
            return rightRotate(node);

        }
//else if right heavy
        if (balanceFactor(node.rightChild) < 0)
                return leftRotate(node);
        rightRotate(node);
        return leftRotate(node);

    }

}
