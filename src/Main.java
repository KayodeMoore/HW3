public class Main {
    public static void main(String[] args) {
//        Stack
        Stack stack = new Stack();

        System.out.println("STACK DEMONSTRATION");
        stack.push(15);
        stack.push(25);
        stack.push(35);
        stack.push(45);
        stack.push(55);
        System.out.println("Adding:");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.push(15);
        stack.push(25);
        stack.push(35);
        stack.push(45);
        stack.push(55);
        System.out.println("Top item:");
        System.out.println(stack.peek());
        System.out.println("Removing:");
        System.out.println(stack.pop());
        System.out.println("Removing:");
        System.out.println(stack.pop());
        System.out.println("New top:");
        System.out.println(stack.peek());
        System.out.println("Is Stack empty?");
        System.out.println(stack.isEmpty());
        System.out.println();

//       Queue
        Queue queue = new Queue();

        System.out.println("QUEUE DEMONSTRATION");
        queue.enqueue(15);
        queue.enqueue(25);
        queue.enqueue(35);
        queue.enqueue(45);
        queue.enqueue(55);
        System.out.println("Adding:");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        queue.enqueue(15);
        queue.enqueue(25);
        queue.enqueue(35);
        queue.enqueue(45);
        queue.enqueue(55);
        System.out.println("Front item:");
        System.out.println(queue.peek());
        System.out.println("Removing:");
        System.out.println(queue.dequeue());
        System.out.println("Removing:");
        System.out.println(queue.dequeue());
        System.out.println("New front:");
        System.out.println(queue.peek());
        System.out.println("Is Queue empty?");
        System.out.println(queue.isEmpty());
    }
}