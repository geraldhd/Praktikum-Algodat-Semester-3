public class Stack {
    Vertex head, tail;
    Stack(){
        head = tail = null;
    }

    public boolean isEmpty(){
        return head == null;
    }
    public void push(Vertex baru){
        if (head == null){
            head = tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
    }

    public void pop(){
        Vertex current = head;
        if(tail == head){
            head = tail = null;
        } else if (current != null){
            while(current.next.next != null){
                current = current.next;
            }
            current = tail;
            tail.next = null;
        }
    }
}
