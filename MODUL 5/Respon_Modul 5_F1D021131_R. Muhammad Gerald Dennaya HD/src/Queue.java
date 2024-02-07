public class Queue {
    Vertex head, tail;
    Queue(){
        head = tail = null;
    }
    public void enqueue(Vertex baru){
        if (head == null){
            head = tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
    }
    public void dequeue(){
        if (head == tail){
            head.print();
            head = tail = null;
        }
        else if (head != null){
            head.print();
            head = head.next;
        }
    }
    public Vertex findVertex(String nama){
        Vertex current = head;
        while (current != null){
            if(current.name.equals(nama)){
                return current;
            }
            current = current.next;
        }
        return null;
    }
}
