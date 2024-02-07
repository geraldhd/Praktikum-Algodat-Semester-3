//class LinkedList merupakan class yang merepresantasikan method-method yang akan digunakan di
//dalam program untuk membuat linkedlist.
public class LinkedList {
    //mendeklarasikan variabel head dengan tipe data Node yang akan digunakan sebagai penunjuk
    //pada linked list yang akan dibuat nanti
    Node head;
    //isEmpty digunakan untuk menguji apakah variabel Varians berisi nilai Kosong.
    public boolean isEmpty(){
        return head == null;
    }
    //public void addFirst adalah method dengan paramater data yang digunakan untuk menambahkan
    //node pada linkedlist.
    //pada method ini digunakan statement if dimana jika bernilai true maka variabel head akan
    //diinisialisasikan dengan nilai variabel obj.
    //pada statement else akan memasukan nilai head ke obj.next,
    //lalu nilai obj akan dimasukkan head.prev, nilai obj juga dimasukkan ke head,
    //kemudian head.prev akan diinisialisasikan dengan null.
    public void addFirst(Vertex data){
        Node obj = new Node(data);
        if(isEmpty()) {
            head = obj;
        }else {
            obj.next = head;
            head.prev =  obj;
            head = obj;
            head.prev = null;
        }
    }
    //public void removeFirst adalah method dengan paramater data yang digunakan untuk menghapus
    //node pada linkedlist.
    //pada method ini, jika digunakan maka variabel node akan
    //diinisialisasikan dengan nilai variabel head.
    //lalu nilai head akan dimasukkan head.next,
    //kemudian nilai variabel node akan di kembalikan atau return.
    public Node removeFirst(){
        Node node;
        node = head;
        head = head.next;
        return node;
    }
}
