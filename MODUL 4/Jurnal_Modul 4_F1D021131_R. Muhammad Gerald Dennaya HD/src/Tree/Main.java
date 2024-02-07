package Tree;

//public class Main merupakan class yang digunakan sebagai class utama yang diisi oleh program yang akan dijalankan
public class Main {
    public static void main(String[] args) {
        // Membuat objek baru sebagai binary tree
        tree obj = new tree();
        // Menambahkan nama turunan sesuai dengan hubungan nya dengan memanggil method add dan mengisi parameternya dengan
        // mengisi variabel ortu dan input
        obj.add("", "DAUS");
        obj.add("DAUS", "PUTRI");
        obj.add("DAUS","DADEN");
        obj.add("PUTRI", "ARI");
        obj.add("PUTRI", "LILUL");
        obj.add("DADEN", "ARSAN");
        obj.add("DADEN", "JIDAN");
        obj.add("ARI", "UNO");
        obj.add("ARI", "SHAFA");
        obj.add("LILUL", "DIAZ");
        obj.add("LILUL", "MELKI");
        obj.add("ARSAN", "MAHEN");
        obj.add("ARSAN", "ALITA");
        obj.add("JIDAN", "ROZAKI");
        obj.add("JIDAN", "AGUNG");

        System.out.println();
        System.out.println("Pre-Order");
        System.out.println("No. Parent : Child");
        // memanggil method pre-order untuk melakukan pre-order kepada tree yang sudah terbentuk
        obj.PreOrder(obj.root);
        // Menampilkan relasi/hubungan node dengan node lainnya dengan memanggil method silsilah dengan
        // parameter nama1 dan nama2 yang akan dicari relasinya
        System.out.println("\nHubungan\n");
        obj.relation("PUTRI", "DAUS");
        obj.relation("SHAFA", "DAUS");
        obj.relation("MAHEN", "ALITA");
        obj.relation("MAHEN", "UNO");
        obj.relation("LILUL", "DAUS");
        obj.relation("MELKI", "DADEN");
        obj.relation("ROZAKI", "ARSAN");
        obj.relation("ROZAKI", "ARI");
        obj.relation("DIAZ", "AGUNG");
    }
}