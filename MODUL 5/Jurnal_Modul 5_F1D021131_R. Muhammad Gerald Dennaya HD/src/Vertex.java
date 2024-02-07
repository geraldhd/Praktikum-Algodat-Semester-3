/*
class Vertex merupakan class yang merepresantasikan vertex(node) yang akan digunakan di dalam program
class ini memiliki 3 vairabel bertipe String yaitu realm, item1, item2, satu buah variabel lable dengan
tipe data integer, kemudian terdapat 2 veriabel dengan nama nextVertex, prevVertex bertipe vertex
dan satu buah variabel edge bertipe Edge.
*/
public class Vertex {
    String realm;
    String item1,item2;
    int lable;
    Vertex nextVertex,prevVertex;
    Edge edge;
    /*
    sebuah konstruktor yang menerima value realm, lable, item1, item2.
    konstruktor ini bekerja dengan menyimpan semua value ke vairabel class yang telah tersedia.
    */
    public Vertex(String realm,int lable,String item1, String item2){
        this.realm = realm;
        this.lable = lable;
        this.item1 = item1;
        this.item2 = item2;
    }
}
