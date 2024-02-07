package Queue;

public class Queue {
    // script dibawah merupakan beberapa variabel yang menggunakan tipe data Node
    // yang berasal dari kelas Node
    Node head;
    Node tail;
    Node current;
    // method dibawah merupakan method Push dimana fungsi method ini adalah untuk menaruh data Node
    // pada posisi depan dari Queue atau biasa disebut dengan top, cara kerja method ini sama seperti
    public void Enqueue(Object data) {
        Node NewNode = new Node(data);
        if (head == null) {
            head = NewNode;
            tail = NewNode;
        } else {
            NewNode.next = head;
            head = NewNode;
        }
    }

    // method dibawah merupakan method Dequeue dimana fungsi method ini adalah untuk menghapus data Node
    public Object Dequeue() {
        Node temp = head;
        if (head == null) {
            System.out.println("Queue is not defined yet...");
        } else{
            current = head;
            while(current.next.next != null) {
                current = current.next;
            }
            tail = current;
            tail.next = null;
        }
        return temp.data;
    }

    //Method printStack digunakan untuk menampilkan hasil dari pemasukkan nilai yang telah ditambahkan pada stack
    //Dengan melakukan perulangan data yang telah dimasukkan akan langsung ditampilakn pada layar program
    public void print() {
        current = head;
        while (current != null) {
            if (current.next != null) {
                System.out.println(current.data + "\n^");
            } else {
                System.out.println(current.data);
            }
            current = current.next;
        }
    }

    public void getfront(){
        if(head == null){
            return;
        } else{
            System.out.println("Nama : " + tail.data);
        }
    }
    public int size() {
        current = head;
        int size = 0;
        while (current != null) {
            current = current.next;
            size ++;
        }
        return size;
    }

    public void setHead(){
        current = head;
    }
}

