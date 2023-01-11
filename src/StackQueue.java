public class StackQueue <N> {

    public static class Node<N>{
        private N data;
        private Node<N> next;

        public Node(N data) {
            this.data = data;
        }

    }

    private StackNode inStack = new StackNode();
    private StackNode outStack = new StackNode();

    private Node<N> head;
    private Node<N> tail;

    public boolean isEmpty(){
        return head == null;
    }

    public N peek(){
        return head.data;
    }

    public void enqueue(N data){
        Node<N> node = new Node<N>(data);
        if (tail != null){
            tail.next = node;
        }
        tail = node;

        if (head == null){
            head = node;
        }
    }

    public N dequeue(){
        N data = head.data;
        head = head.next;

        if(head == null){
            tail = null;
        }
        return data;
    }
}
