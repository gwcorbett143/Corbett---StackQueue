public class StackQueue <N> {

    public static class Node<N> {
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

    public boolean isEmpty() {
        return head == null;
    }

    public N peek() {
        return head.data;
    }

    public void enQueue(N data) {
        // Move all elements from inStack to outStack
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
            inStack.pop();
        }
        inStack.push(data);
        // Push everything back to inStack
        while (!inStack.isEmpty()) {
            inStack.push(outStack.pop());
            outStack.pop();
        }
    }

    public N deQueue(N data) {

        if (inStack.isEmpty()) {
            System.out.println("Q is Empty");
            System.exit(0);
        }

        // Return top of s1
        N data = inStack.peek();
        inStack.pop();
        return data;
    }
}
