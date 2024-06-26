public class Tree {

    private TreeNode root = new TreeNode();


    public void insert(int nodeValue){
        TreeNode current = root;
        if(root.value == null) {
            root.value = nodeValue;
            return;
        }

        while(true){
            if(nodeValue > current.value){
                if(current.rightChild == null){
                    current.rightChild = new TreeNode();
                    current.rightChild.value = nodeValue;
                    return;

                }else
                    current = current.rightChild;
            }
            else{
                if(current.leftChild == null){
                    current.leftChild = new TreeNode();
                    current.leftChild.value = nodeValue;
                    return;
                }else
                    current = current.leftChild;

            }
        }



    }

    public boolean find(int item){
        TreeNode current = root;

        while(current != null){
            if(item == current.value) return true;

            current = item > current.rightChild.value ? current.rightChild : current.leftChild;

        }
        return false;

    }

    public void traversePreOrder(){
        traversePreOrder(root);
    }

    private void traversePreOrder(TreeNode node){
        if(node == null) return;
        System.out.println(node.value);
        traversePreOrder(node.leftChild);
        traversePreOrder(node.rightChild);

    }

    public void traverseInOrder(){
        traverseInOrder(root);
    }

    private void traverseInOrder(TreeNode node){
        if(node == null) return;
        traversePreOrder(node.leftChild);
        System.out.println(node.value);
        traversePreOrder(node.rightChild);
    }

    public void traversePostOrder(){
        traversePostOrder(root);
    }

    private void traversePostOrder(TreeNode node){
        if(node == null) return;
        traversePostOrder(node.leftChild);
        traversePostOrder(node.rightChild);
        System.out.println(node.value);
    }

    public int min(){

        return min(root);
    }

    public int min(TreeNode node){
        if(root == null)
            return -1;
        
        if(isLeaf(node))
            return node.value;
        int left = min(node.leftChild);
        int right = min(node.rightChild);

        return Math.min(Math.min(left,right), node.value);

    }

    public boolean isLeaf(TreeNode node){
        System.out.println(" is leaf node"+node.value);
        return node.leftChild == null && node.rightChild == null ;

    }

    public boolean isEqual( Tree tree2){
        return isEqual(this.root, tree2.root);

    }

    public boolean isEqual(TreeNode node1, TreeNode node2){
        if(node1 != null && node2 != null) {
            if(node1.value == node2.value){
                if(!isLeaf(node1) && !isLeaf(node2))
                    return isEqual(node1.leftChild, node2.leftChild) && isEqual(node1.rightChild, node2.rightChild);
                return true;
            }
            return false;
        }
        return true;

        //mosh implementation

//        if(node1 == null && node2 == null)
//            return true;
//        return node1.value == node2.value
//                && isEqual(node1.leftChild, node2.leftChild)
//                && isEqual(node1.rightChild, node2.rightChild);
    }





}
