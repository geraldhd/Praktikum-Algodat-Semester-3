public class LinkedList {
    Node head, tail;
    LinkedList(){
        head = tail = null;
    }
    public void addLast(Node baru){
        if (head == null){
            head = tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
    }
    public Node findVerse(String kelas){
        Node current = head;
        while (current != null){
            if(current.kelas == kelas){
                return current;
            }
            current = current.next;
        }
        System.out.println("Verse tidak ditemukan!");
        return null;
    }

}
