/*
class Graph merupakan class yang mempresentasikan struktur Graph. class ini dimodifikasi
sedemikian rupa sehingga dapat digunakan dalam menampilkan struktur jurnal5, diawali dengan
deklarasi head, tail, curr serta inisialisasi variabel goal dengan nilai 0.
 */
public class Graph {
    Vertex head, tail, curr;
    int goal = 0;
    /*
    public void addVertex merupakan method yang digunakan untuk menambahkan atau membuat node
    atau vertex baru pada graph. pada method ini menggunakan parameter int lable,String realm,
    String item1,String item2 dan statment if. pada statement if jika kondisinya terpenuhi
    maka akan menginisialisasikan variabel head dengan masukkan nilai variabel tail yang diisi
    oleh variabel baru. jika kondisi if takterpenuhi maka akan berjalan kondisi else dimana
    akan menginisialisasikan tail.nextVertex dengan nilai baru dan tail dengan nilai baru.
    setelah statement if atau else berakhir akan menambahkan nilai dari variabel goal.
    */
    public void addVertex(int lable,String realm,String item1,String item2){
        Vertex baru = new Vertex(realm,lable,item1,item2);
        if(head == null){
            head = tail = baru;
        }else{
            tail.nextVertex = baru;
            tail = baru;
        }
        goal++;
    }
    /*
    private Vertex findVertex dengan parameter int lable digunakan untuk mencari lokasi
    vertex atau untuk menentukan vertex awal(head graph). method ini akan digunakan pada method addEdge
    dalam menghubungkan vertex awal dengan destinasi yang diinginkan.
    */
    private Vertex findVertex(int lable){
        Vertex curr = head;
        while(curr != null){
            if(curr.lable == lable) break;
            curr = curr.nextVertex;
        }
        return curr;
    }
    //perbedaan method findVertex dan findVertexS terdapat pada parameter nya yang bebas digunakan
    //apabila dibutuhkan

    /*
        public Vertex findVertexS dengan parameter String lokasi digunakan untuk mencari lokasi
        vertex atau untuk menentukan vertex awal(head graph). method ini akan digunakan pada method addEdge
        dalam menghubungkan vertex awal dengan destinasi yang diinginkan.
        */
    public Vertex findVertexS(String lokasi){
        Vertex current = head;
        while (current != null){
            if(current.realm.equals(lokasi)){
                return current;
            }
            current = current.nextVertex;
        }
        System.out.println("Vertex tidak ditemukan!");
        return null;
    }
    /*
    public void addEdge dengan parameter int searchLable, int destinationLable merupakan
    method untuk menambahkan Edge baru. edge tersebut akan menghubungkan vertex-vertex yang
    sudah dibuat. pada method ini Vertex start akan diinisialisasikan dengan nilai dari
    findVertex(searchLable), Vertex finish dengan nilai dari findVertex(destinationLable)
    dan Edge temp dengan nilai dari start.edge.

    vertex start merupakan vertex awal yang akan dihubungkan ke vertex goalnya atau dalam
    hal ini merupakan vertex finish. terdapat juga statement if dan else, dimana jika kondisi if
    terpanuhi (temp == null) maka akan memasukan new Edge(finish) ke start.edge atau inisialisasi.
    jika if tidak berjalan, maka akan dilanjutkan untuk mengeksekusi else dimana terdapat looping while
    dengan kondisi (temp.nextEdge != null). pada loop ini nilai temp.nextEdge akan dimasukkan ke
    temp dan  new Edge(finish) ke temp.nextEdge. kedua statemen ini berfungsi untuk menambahkan edge pada
    vertexnya.
    */
    public void addEdge(int searchLable, int destinationLable){
        Vertex start = findVertex(searchLable);
        Vertex finish = findVertex(destinationLable);
        Edge temp = start.edge;
        if(temp == null) {
            start.edge = new Edge(finish);
        }
        else{
            while(temp.nextEdge != null) temp = temp.nextEdge;
            temp.nextEdge = new Edge(finish);
        }
    }

    /*
    public void DFSprint dengan merupakan method Depth First Search, pada method ini kita
    akan membuat linked list baru terlebih dahululu, kemudian kita akan mennentukan vertex
    awal kita dalam memulai pencarian, dalam hal ini diberinama root.

    pada code boolean[] condition = new boolean[goal*4] dimaksudkan untuk sebagai membuat penanda
    apakah node atau vertex tersebut sudah dikunjungi atau belum, yang bergoal agar nantinya
    vertex tidak dikunjungi secara terus-menerus yang akan mengakibatkan infinity loop.

    vertex pertama akan diprint, dan diberi condition true. setelah itu, akan dilakukan looping
    menggunakan while, while yang pertama disini digunakan untuk berpindah ke vertex berikutnya.
    dan pada while ke-2 digunakan untuk print vertex berikutnya beserta item unik yang terdapat
    pada vertex tersebut.
    */
    public void DFS(int lable){
        LinkedList sta = new LinkedList();
        Vertex root = findVertex(lable);
        sta.addFirst(root);
        boolean[] condition = new boolean[goal*4];
        System.out.print(root.realm+" : [" + root.item1 + ", " + root.item2 + "]\n");
        condition[root.lable] = true;
        while(!sta.isEmpty()) {
            Node curr = sta.removeFirst();
            Edge temp = curr.data.edge;
            while (temp != null){
                if (!condition[temp.value.lable]) {
                    sta.addFirst(temp.value);
                    condition[temp.value.lable] = true;
                    System.out.print(temp.value.realm+" : [" + temp.value.item1 + ", " + temp.value.item2 + "]\n");
                }
                temp = temp.nextEdge;
            }
        }
    }
    /*
    public void BFS dengan parameter (Graph graph1, Graph graph2, Graph graph3, String item)
    digunakan untuk mencari lokasi berdasarkan item yang terdapat pada setiap graph.

    pertama-tama graph akan menghubungkan semua graph yang ada agar mempermudah dalam
    proses pencarian.

    pada proses mencarian menggunakan looping while, yang akan mengunjungi setiap vertex dari
    graph yang ada dan mengecek item pada vertex-vertexnya apakah sesuai dengan
    item yang sedang dicari. jika telah ditemukan maka akan ditampilkan pada lokasi mana saja
    item tersebut dijumpai. looping akan terus berlamgsung hingga seluruh vertex dikunjungi.
    */
    public void BFS(Graph graph1,Graph graph2,Graph graph3,String item){
        graph1.tail.nextVertex = graph2.head;
        graph1.head.prevVertex = null;
        graph2.tail.nextVertex = graph3.head;
        graph2.head.prevVertex = graph1.tail;
        graph3.head.prevVertex = graph2.tail;
        graph3.tail.nextVertex = null;
        curr = graph1.head;
        while (curr != null){
            if(curr.item1.equalsIgnoreCase(item) || curr.item2.equalsIgnoreCase(item)){
                System.out.print("Ketemu, "+item+" ada di:\n");
                if(curr.lable < 5) {
                    System.out.println("1970, "+curr.realm);
                }
                else if (curr.lable < 10) {
                    System.out.println("2012, "+curr.realm);
                }
                else if(curr.lable < 17) {
                    System.out.println("2015, "+curr.realm);
                }
            }
            curr = curr.nextVertex;
        }
    }
}
