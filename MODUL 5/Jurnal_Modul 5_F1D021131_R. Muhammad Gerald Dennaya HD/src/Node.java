/*
public class Node merupakan class yang merepresentasikan node apa saja yang akan digunakan dalam
program. terdapat 3 variabel yaitu next, prev bertipe node dan variabel data bertipe vertex.
*/
public class Node{
    Vertex data;
    Node next,prev;
    /*
    sebuah konstruktor dibawah akan menerima value data.
    konstruktor ini bekerja dengan menyimpan semua value ke vairabel class yang telah tersedia.
    */
    public Node (Vertex data){
        this.data = data;
    }
}
