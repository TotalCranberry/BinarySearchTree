public class Main {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.addNode(8);
        bst.addNode(3);
        bst.addNode(1);
        bst.addNode(6);
        bst.addNode(4);
        bst.addNode(10);
        bst.DFS(10);
        bst.BFS(4);
    }
}