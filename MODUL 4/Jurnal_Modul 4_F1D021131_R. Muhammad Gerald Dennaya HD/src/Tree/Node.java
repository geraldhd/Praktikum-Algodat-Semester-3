package Tree;
//class Node merupakan class yang digunakan untuk menympan node-node yang akan digunakan di dalam tree
public class Node {
    //Object input meupakan variabel yang digunakan menympan data nama dari tree dengan tipe data object(bebas)
    Object input;
    // node left, right dan paren merupakan node yang akan digunakan sebagai pointer
    Node left = null;
    Node right = null;
    Node paren = null;
    //int level merupakan variabel dengan tipe data integer yang digunakan untuk menympan level yang akan bertambah terus menerus
    int level;
    //Node merupakan constructor yang akan digunakan sebagai node yang menyompan nama dan levelnya
    Node(Object obj, int level){
        this.input = obj;
        this.level = level;
    }

}
