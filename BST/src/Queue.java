public class Queue {
    Node front;
    Node rear;
    public void enqueue(treeNode data){
        Node newNode = new Node(data);
        if(this.front==null){
            this.front = this.rear = newNode;
        }else{
            this.rear.next = newNode;
            this.rear = newNode;
        }
    }
    public treeNode dequeue(){
        if(this.front!=null){
            Node temp = this.front;
            this.front = this.front.next;
            treeNode data = temp.data;
            temp = null;
            return data;
        }
        return null;
    }
}
