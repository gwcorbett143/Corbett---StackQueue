public class StackQueue <N> {

    public static class Node<Item>{
        private Item data;
        private Node<Item> next;

        public Node(Item data) {
            this.data = data;
        }

    }

    private StackNode inStack = new StackNode();
    private StackNode outStack = new StackNode();

    private Node<Item> head;
    private Node<Item> tail;

    public boolean isEmpty(){
        return head == null;
    }

    public Item peek(){
        return head.data;
    }

    public void enqueue(Item data){
        Node<Item> node = new Node<Item>(data);
        if (tail != null){
            tail.next = node;
        }
        tail = node;

        if (head == null){
            head = node;
        }
    }

    public Item dequeue(){
        Item data = head.data;
        head = head.next;

        if(head == null){
            tail = null;
        }
        return data;
    }
}

    }

}
