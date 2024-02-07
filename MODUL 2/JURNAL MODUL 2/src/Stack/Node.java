package Stack;
//class node merupakan class yang merepresantasikan node-node yang akan digunakan di dalam program
class Node {
    //mendeklarasikan variabel data dengan tipe data Object yang akan dimasukkan data nama dari penonton konser
    Object data;
    //mendeklarasikan variabel next dengan tipe data Node yang akan digunakan sebagai penunjuk pada linked list yang akan dibuat nanti
    Node next;
    //mendeklarasikan variabel prev dengan tipe data Node yang akan digunakan sebagai penunjuk pada linked list yang akan dibuat nanti
    Node prev;
    //Node digunakan untuk mengisi node dengan nilai dari variabel data yang akan digunakan untuk memasukkan nilai di fungsi main
    Node(Object data) {
        //menginisialisasikan variabel data dengan memasukkan nilai dari paramater data
        this.data = data;
    }
}

