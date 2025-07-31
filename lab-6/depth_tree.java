class DepthTree{
    public static void main(String[] args) {
        int arr[] = {1,2,-1,-1,3,4,-1,-1,5,-1,-1};
        ExampleNode eNode =new ExampleNode();
        ExampleNode.Node root = eNode.buildTree(arr);
        int depth = eNode.findDepth(root);
        eNode.findLeaf(root);

        System.err.println(depth);
    }
}

class ExampleNode{
    class Node{
        Node right;
        Node left;
        int data;

        Node(int data){
            this.right = null;
            this.left = null;
            this.data = data;
        }
    }

    int index = -1;

    public  Node buildTree(int arr[]){
        index++;
        if(arr[index] == -1 || arr.length < index){
            return null;
        }

        Node root = new Node(arr[index]);
        root.right = buildTree(arr);
        root.left = buildTree(arr);

        return root;
    }

    public int findDepth(Node root){

        if(root == null){
            return 0;
        }
        
        int leftHeight = findDepth(root.right);
        int rightHeight =findDepth(root.left);
        
        return Math.max(leftHeight,rightHeight) + 1;
    }

    public void findLeaf(Node root){
        if(root.right == null && root.left == null){
            System.err.println(root.data + "is root");
            
            return;
        }
        findLeaf(root.right);
        findLeaf(root.left);
    }
}