public class Node {
    String kelas;
    Graph ruang;
    Node next, prev;
    Node(String kelas, Graph ruang){
        this.kelas = kelas;
        this.ruang = ruang;
        next = prev = null;
    }
}
