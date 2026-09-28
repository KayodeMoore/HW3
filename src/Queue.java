class Queue {
    Node head;
    Node tail;
    int length;

    Queue(){
        head = null;
        tail = null;
        length = 0;
    }
    void enqueue(Object value){
        Node node = new Node(value);
        if(tail != null){
            tail.next = node;
        }else{
            head = node;
        }
        tail = node;
        length++;
    }
    Object dequeue(){
        if(head == null){
            return null;
        }
        Object value = head.value;
        head = head.next;

        if(head == null){
            tail = null;
        }
        length--;
        return value;
    }
    Object peek(){
        if(head == null){
            return null;
        }
        return head.value;
    }
    boolean isEmpty(){
        return length == 0;
    }
}
