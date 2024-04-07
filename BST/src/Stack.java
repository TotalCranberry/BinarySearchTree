public class Stack {
    Node top;
    public Stack(){
        this.top = null;
    }
    public boolean isEmpty(){
        if(this.top!=null){
            return false;
        }
        return true;
    }
    public void push(treeNode data){
        Node newNode = new Node(data);
        if(this.top==null){
            this.top = newNode;
        }else{
            newNode.next = this.top;
            this.top = newNode;
        }
    }
    public treeNode pop(){
        if(!isEmpty()) {
            Node temp = this.top;
            this.top = this.top.next;
            treeNode data = temp.data;
            temp = null;
            return data;
        }
        return null;
    }
}
