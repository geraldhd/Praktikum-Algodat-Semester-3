/*
public class Main merupakan public class yang digunakan untuk menyimpan program utama, yang akan dijalankan.
*/
public class Main {
    // fungsi main bawaan java yang berfungsi sebagai titik mulai dari
    //suatu program.
    public static void main(String[] args) {
        //Script code dibawah merupakan code utama yang akan dijalankan di saat program melakukan proses running
        //method-method yang sudah dibuat sebelumnya akan dipanggil disini,
        //data pada graph di setiap tahun akan dimasukkan atau diinputkan,
        //kemudian data data tersebut akan ditampilkan atau diprint dengan metode DFS,
        //lalu terdapat fitur untuk mencari lokasi subuah item dengan metode BFS
        Graph graph1 = new Graph();
        graph1.addVertex(0,"New York","Super Serum","Mie Ayam Ceker");
        graph1.addVertex(1,"Markas S.H.I.E.L.D","Partikel Pym","Seblak Korea");
        graph1.addVertex(2,"Wakanda","Vibranium","Adamantium");
        graph1.addVertex(3,"Asgard","Mjolnir","Spirite");
        graph1.addVertex(4,"Vormir","Soul Stone","Ceker Mercon");

        Graph graph2 = new Graph();
        graph2.addVertex(5,"New York","Space Stone","Nasi Padang");
        graph2.addVertex(6,"Sanctum Sanctorium","Thai Tea","Time Stone");
        graph2.addVertex(7,"Morag","Power Stone","Es Semangka India");
        graph2.addVertex(8,"Kekalik","Suit Ironman","Printer");
        graph2.addVertex(9,"Midgard","Boba","Sempol");

        Graph graph3 = new Graph();
        graph3.addVertex(10,"Hollywood","DVD Avenger","Microphone");
        graph3.addVertex(11,"Knowhere","Mind Stone","Batu Akik");
        graph3.addVertex(12,"New York","KFC","IPhone 13");
        graph3.addVertex(13,"Vormir","Mouse Wireless","Keyboard");
        graph3.addVertex(14,"Asgard","Mjolnir","Storm Breaker");
        graph3.addVertex(15,"Qatar","Yamaha YZR-M1","Ducati GP15");
        graph3.addVertex(16,"Valencia","Kartu UNO","Kartu Remi");

        System.out.println("DFS Print");
        System.out.println("Tahun 1970");
        graph1.addEdge(0,1);
        graph1.addEdge(0,2);
        graph1.addEdge(0,0);
        graph1.addEdge(0,3);
        graph1.addEdge(0,4);
        graph1.DFS(0);

        System.out.println("\nTahun 2012");
        graph2.addEdge(5,6);
        graph2.addEdge(5,7);
        graph2.addEdge(5,8);
        graph2.addEdge(5,9);
        graph2.DFS(5);

        System.out.println("\nTahun 2015");
        graph3.addEdge(10,11);
        graph3.addEdge(10,12);
        graph3.addEdge(10,13);
        graph3.addEdge(10,14);
        graph3.addEdge(10,15);
        graph3.addEdge(10,16);
        graph3.DFS(10);

        System.out.print("\nCari: ");
        Graph graphAll = new Graph();
        graphAll.BFS(graph1,graph2,graph3,"Mjolnir");
    }
}
