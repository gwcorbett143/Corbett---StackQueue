import java.util.*;
public class StackQueue <N>{

    public class Node<N>{
        public N data;
        public Node(N data) {
            this.data = data;
        }
    }

    public Stack s1 = new Stack();
    public Stack s2 = new Stack();

    public N peek(){
        return (N) s1.peek();
    }

    public void enQueue(N data) {
        // Move all elements from s1 to s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        // Push item into s1
        s1.push(data);

        // Push everything back to s1
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    // Dequeue an item from the queue
    public N deQueue() {
        // if first stack is empty
        if (s1.isEmpty()) {
            System.out.println("Q is Empty");
            System.exit(0);
        }

        // Return top of s1
        N data = (N) s1.peek();
        s1.pop();
        return data;
    }

    public boolean isEmpty(){
        return s1.isEmpty() && s2.isEmpty();
    }
}
