public class BST {
    treeNode root;
    public BST(){
        this.root = null;
    }
    public void addNode(int data){
        root = add(this.root, data);
    }

    public treeNode add(treeNode root, int data){
        treeNode newTreeNode = new treeNode(data);
        if(root==null){
            root = newTreeNode;
            return root;
        }else if(root.data < newTreeNode.data){
            root.right = add(root.right, data);
        }else if(root.data > newTreeNode.data){
            root.left = add(root.left, data);
        }
        return root;
    }
    public void DFS(int target){
        if(root==null){
            return;
        }
        Stack stack = new Stack();
        stack.push(this.root);
        while(!stack.isEmpty()){
            treeNode temp = stack.pop();
            if(temp.data==target) {
                System.out.println("Found " + temp.data);
                return;
            }
            if(temp.right!=null) {
                stack.push(temp.right);
            }
            if(temp.left!=null) {
                stack.push(temp.left);
            }
        }
    }
    public void BFS(int target){
        if(root==null){
            return;
        }
        Queue queue = new Queue();
        queue.enqueue(this.root);
        while(queue.front!=null){
            treeNode temp = queue.dequeue();
            if(temp.data==target) {
                System.out.println("Found " + temp.data);
                return;
            }
            if(temp.left!=null) {
                queue.enqueue(temp.left);
            }
            if(temp.right!=null) {
                queue.enqueue(temp.right);
            }
        }
        System.out.println("\nNot found");
    }
    public int minValue(treeNode root){
        if(root.left==null){
            return root.data;
        }
        return minValue(root.left);
    }
    public void deleteNode(int value){
        root = delete(root, value);
    }
    public treeNode delete(treeNode root, int target){
        if(root==null){
            return null;
        }
        if(root.data==target){
            if(root.right==null && root.left==null){
                return null;
            }
            if(root.right==null){
                return root.left;
            }
            if(root.left==null){
                return root.right;
            }
            int minVal = minValue(root);
            root.data = minVal;
            root.right = delete(root, minVal);
            return root;
        }
        if(root.data>target){
            root.left = delete(root.left,target);
            return root;
        }
        if(root.data<target){
            root.right = delete(root.right,target);
            return root;
        }
        return null;
    }
    public void inOrder(){
        inOrderTraversal(root);
    }
    public void inOrderTraversal(treeNode root){
        if(root!=null){
            inOrderTraversal(root.left);
            System.out.print(root.data+" ");
            inOrderTraversal(root.right);
        }
    }
}
