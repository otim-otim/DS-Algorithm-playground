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


}
