public class Main {

    public static void main(String[] args) {
        LinkedList MCU = new LinkedList();
        MCU.addLast(new Node("INFOR", new Graph()));

        System.out.println("penambahan vertx dan edge");
        MCU.findVerse("INFOR").ruang.insertVertex("Erudite");
        MCU.findVerse("INFOR").ruang.insertVertex("Amity");
        MCU.findVerse("INFOR").ruang.insertVertex("Dauntless");
        MCU.findVerse("INFOR").ruang.insertVertex("Maasai");
        MCU.findVerse("INFOR").ruang.insertVertex("Candor");
        MCU.findVerse("INFOR").ruang.insertVertex("Dogon");
        MCU.findVerse("INFOR").ruang.insertVertex("Abnegation");
        MCU.findVerse("INFOR").ruang.insertEdge("Erudite", "Amity");
        MCU.findVerse("INFOR").ruang.insertEdge("Erudite", "Dauntless");
        MCU.findVerse("INFOR").ruang.insertEdge("Dauntless", "Amity");
        MCU.findVerse("INFOR").ruang.insertEdge("Dauntless", "Erudite");
        MCU.findVerse("INFOR").ruang.insertEdge("Dauntless", "Dogon");
        MCU.findVerse("INFOR").ruang.insertEdge("Amity", "Erudite");
        MCU.findVerse("INFOR").ruang.insertEdge("Amity", "Maasai");
        MCU.findVerse("INFOR").ruang.insertEdge("Amity", "Dogon");
        MCU.findVerse("INFOR").ruang.insertEdge("Maasai", "Candor");
        MCU.findVerse("INFOR").ruang.insertEdge("Maasai", "Amity");
        MCU.findVerse("INFOR").ruang.insertEdge("Candor", "Amity");
        MCU.findVerse("INFOR").ruang.insertEdge("Candor", "Dogon");
        MCU.findVerse("INFOR").ruang.insertEdge("Maasai", "Abnegation");
        MCU.findVerse("INFOR").ruang.insertEdge("Dogon", "Candor");
        MCU.findVerse("INFOR").ruang.insertEdge("Dogon", "Abnegation");
        MCU.findVerse("INFOR").ruang.insertEdge("Dogon", "Dauntless");
        MCU.findVerse("INFOR").ruang.insertEdge("Abnegation", "Dogon");
        MCU.findVerse("INFOR").ruang.insertEdge("Abnegation", "Maasai");

        System.out.println("");
        System.out.println("");
        System.out.println("");

        //NOMOR 1 ADJACENCY LIST
        System.out.println("Adjacensy List");
        MCU.findVerse("INFOR").ruang.printEdge();

        System.out.println("");
        System.out.println("");

        //NOMOR 2 SEARCH BFS OR DFS
        System.out.println("Search");
        MCU.findVerse("INFOR").ruang.BFS("Maasai");

    }
}