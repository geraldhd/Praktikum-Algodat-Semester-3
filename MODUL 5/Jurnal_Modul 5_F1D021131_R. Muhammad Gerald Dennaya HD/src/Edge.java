/*
class Edge merupakan class yang merepresantasikan Edge yang akan digunakan di dalam graph.
Edge ini merupakan sebuah penghubung yang akan menghubungkan setiap vertex yang ada.
class ini memiliki 2 vairabel yaitu variabel value bertipe Vertex dan variabel nextEdge bertipe Edge.
kemudian terdapat 2 veriabel dengan nama nextVertex, prevVertex bertipe vertex
dan satu buah variabel edge bertipe Edge.
 */
public class Edge {
    Vertex value;
    Edge nextEdge;
    /*
    konstruktor dibawah akan menerima nilai dari value.
    konstruktor ini bekerja dengan menyimpan semua nilai ke vairabel class yang telah tersedia.
     */
    public Edge (Vertex value){
        this.value  = value;
    }
}
