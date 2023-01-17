public class StackQueueDriver {
    public static void main(String[] args) {

        StackQueue q = new StackQueue();

        System.out.println("is the q empty?: " + q.isEmpty());

        q.enQueue('x');
        q.enQueue('y');
        q.enQueue('z');

        System.out.println("the next item is: " + q.peek());

        q.deQueue();

        System.out.println("the next item is: " + q.peek());
        System.out.println("is the q empty?: " + q.isEmpty());

        q.enQueue('w');
        q.enQueue('v');
        q.enQueue('u');

        System.out.println("the next item is: " + q.peek());

        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();

        System.out.println("the next item is: " + q.peek());

        q.deQueue();

        System.out.println("the next item is: " + q.peek());
        System.out.println("is the q empty?: " + q.isEmpty());
    }
}
