
import java.util.LinkedList;
import java.util.Queue;

class MirrorBinaryTree{
    public static void main(String[] args) {
        int arr[] = {1,2,3,-1,-1,4,-1,-1,2,4,-1,-1,3,-1,-1};

        ExampleNode en = new ExampleNode();
        ExampleNode.Node root = en.buildTree(arr);
        // Node root = en.buildTree(arr);
        en.preOrder(root);

        System.err.println(en.isMirror(root));
    }
}

class ExampleNode{

    class Node{
        Node right;
        Node left;
        int data;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public int index = -1;

    public Node buildTree(int[] arr){
        index++;
        if(arr[index] == -1 || index > arr.length){
            return null;
        }

        Node root = new Node(arr[index]);
        root.left = buildTree(arr);
        root.right = buildTree(arr);

        return root;
    }

    public void preOrder(Node root){
        if(root == null){
            return;
        }
        System.err.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    public boolean isMirror(Node root){
        Queue<Node> queue = new LinkedList<>();

        queue.add(root.left);
        queue.add(root.right);

        while(!queue.isEmpty()){
            Node n1 = queue.poll();
            Node n2 = queue.poll();

            if(n1 == null && n2 == null){
                continue;
            }
            if(n1 == null || n2 == null)return false;
            if(n1.data != n2.data)return false;

            queue.add(n1.left);
            queue.add(n2.right);
            queue.add(n1.right);
            queue.add(n2.left);
        }

        return true;
    }
}
