package Nomor2;

//public class Stack merupakan class yang merepresantasikan method-method yang akan digunakan di dalam program
public class Stack {
    // script dibawah merupakan beberapa variabel yang menggunakan tipe data Node
    // yang berasal dari kelas Node
    Node top;
    Node Bottom;
    Node current;

    // method dibawah merupakan method Push dimana fungsi method ini adalah untuk menaruh data Node
    // pada posisi depan dari Stack atau biasa disebut dengan top, cara kerja method ini sama seperti
    // method AddHead pada linked list yaitu menyambungkan Node baru ke list yang paling depan
    public void Push(String data) {
        Node NewNode = new Node(data);
        if (top == null) {
            top = NewNode;
            Bottom = NewNode;
        } else {
            NewNode.next = top;
            top = NewNode;
        }
    }

    // method dibawah merupakan method pop dimana fungsi method ini adalah untuk menghapus data Node
    // pada posisi depan dari Stack atau biasa disebut dengan top, cara kerja method ini sama seperti
    // method DelTail pada linked list yaitu memutuskan node pada list yang paling depan, namun pada
    // method ini terdapat variabel tambahan temp yang berfungsi sebagai penanda dari Top yang kemudian
    // akan di return nilai dari datanya
    String pop() {
        Node temp = top;
        if (top == null) {
            System.out.println("Stack is not defined yet...");
            return "";
        } else {
            current = top;
            top = current.next;
        }
        return temp.data;
    }

    //Method printStack digunakan untuk menampilkan hasil dari pemasukkan nilai yang telah ditambahkan pada stack
    //Dengan melakukan perulangan data yang telah dimasukkan akan langsung ditampilakn pada layar program
    public void printStack() {
        current = top;
        while (current != null) {
            if (current.next != null) {
                System.out.println(current.data + "\n^");
            } else {
                System.out.println(current.data);
            }
            current = current.next;
        }
    }
    //Method yang digunakan untuk mereturn ke top
    String getTop(){
        return top.data;
    }
    //Method untuk mengecek stack apakah null atau tidak
    public boolean isempty(){
        return top==null;
    }
}

