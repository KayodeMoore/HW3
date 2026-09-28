class Stack {
    Node top;
    int length;

    Stack(){
        top = null;
        length = 0;
    }
    void push(Object value){
        Node node = new Node(value);

        node.next = top;
        top = node;

        length++;
    }
    Object pop(){
        if (top == null){
            return null;
        }
        Object value = top.value;
        top = top.next;

        length--;

        return value;
    }
    Object peek(){
        if (top == null){
            return null;
        }
        return top.value;
    }
    boolean isEmpty(){
        return length==0;
    }
}