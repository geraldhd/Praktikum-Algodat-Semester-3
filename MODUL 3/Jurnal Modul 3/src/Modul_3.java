//class node merupakan class yang merepresantasikan node-node yang akan digunakan di dalam program
//berikut node-node yang berad apada class ini
//mendeklarasikan variabel input dengan tipe data string yang akan dimasukkan data nama dari barang yang akan dijual
//mendeklarasikan variabel harga dengan tipe data int yang akan dimasukkan data berupa nilai harga dari barang yang akan dijual
//mendeklarasikan variabel stok dengan tipe data int yang akan dimasukkan data berupa nilai stok dari barang yang akan dijual
//mendeklarasikan variabel next dengan tipe data Node yang akan digunakan sebagai penunjuk pada linked list yang akan dibuat nanti
//mendeklarasikan variabel prev dengan tipe data Node yang akan digunakan sebagai penunjuk pada linked list yang akan dibuat nanti
class Node {
    String input;
    int harga;
    int stok;
    Node next;
    Node prev;

    //public node digunakan untuk mengisi node dengan nilai dari variabel input, height, dan power yang akan dimasukkan nilai
    //berikut node-node yang diinisialisasikan
    //menginisialisasikan variabel input dengan memasukkan nilai dari paramater input
    //menginisialisasikan variabel harga dengan memasukkan nilai dari paramater harga
    //menginisialisasikan variabel stok dengan memasukkan nilai dari paramater stok
    public Node(String input, int harga, int stok) {
        this.input = input;
        this.harga = harga;
        this.stok = stok;
    }

}
//class Menu merupakan class yang merepresantasikan method-method yang akan digunakan di dalam program
//di dalam class ini juga mendeklarasikan node head, tail, dan current yang akan digunakan sebagai pointer pada linked list yang akan digunakan
class Menu {
    Node head;
    Node tail;
    Node current;
    int size;
    //public void addFirst adalah method dengan paramater yang digunakan untuk menambahkan node head pada linked list
    //sebelum menambahkan di butuhkan if dengan kondisi head == null untuk membuat list baru
    //untuk kondisi lainnya akan menambahkan nilai pada node head yang baru dan akan menggeser head sebelumnya
    //di akhir dibutuhkan statement size++ untuk menghitung jumlah node yang bertambah
    public void addFirst(String input, int height, int power) {
        Node baru = new Node(input, height, power);
        if (head == null) {
            head = tail = baru;
        } else {
            baru.next = head;
            head.prev = baru;
             head = baru;
        }
         size ++;
    }

    //public void printALL adalah method tanpa paramater yang digunakan untuk seluruh isi dari linked list
    //diawali dengan meletakkan current di head dengan mendeklarasikannya
    //lalu dilanjutkan perulangan yang akan menampilkan isi dari print dengan fungsi System.out.println
    //dengan isi "Nama : " + current.input + " " + ", Harga : Rp. " + current.harga + ", Stok : " + current.stok
    //setelah menampilkan isi di atas current akan digeser dengan fungsi advance()
    //method akan berhenti melakukan perulangan jika data telah diprint semuanya dengan kondisi perulangan while (current.next != null)
    public void printAll() {
        current = head;
        while (current.next != null) {
            System.out.println("Nama : " + current.input + " " + ", Harga : Rp. " + current.harga + ", Stok : " + current.stok);
            advance();
        }
        System.out.println("Nama : " + current.input + " " + ", Harga : Rp. " + current.harga + ", Stok : " + current.stok);
        System.out.println("");
    }
    //public void printSearch adalah method yang digunakan untuk menampilkan data yang telah disearch oleh program
    //method print ini tidak perlu melakukan perulangan dikarenakan disini program hanya ingin menampilan data satu saja
    //setelah menampilan data dengan  System.out.println("Nama Barang : " + current.input + " " );
    //diperlukan kondisi if yang akan menampilkan data sebelum dan detelah dari data yang telah ditampilkan di atas
    //kondisi pertama if (current.next != null) dengan statement System.out.print("Letak : berada di sebelum barang " + current.next.input)
    //kondisi kedua if (current.prev != null) dengan statement System.out.print("Letak : berada di setelah barang " + current.prev.input)
    public void printSearch() {
        System.out.println("==========Barang Ditemukan==========");
        System.out.println("Nama Barang : " + current.input + " " );
        if (current.next != null){
           System.out.print("Letak : berada di sebelum barang " + current.next.input);
        }
        if (current.prev != null){
            System.out.print("Letak : berada di setelah barang " + current.prev.input);
        }
        System.out.println("");
    }
    //Method yang digunakan untuk mengecek ukuran dari list yang sedang digunakan
    //dengan tipe data integer
    //dengan awalan meletakkan current pada head
    //lalu melakukan pengulangan while dengan kondisi current != null
    //didalam perulangan terdapat statement current = current.next dan size yang di increment
    public int size() {
        current = head;
        int size = 0;
        while (current != null) {
        current = current.next;
        size++;
        }
        return size;
    }
    //method advance adalah method yang digunakan untuk memindahkan current ke current.next
    public void advance(){current = current.next;}

    //method SortBubble adalah method digunakan untuk mengurutkan data dengan menyimpan data pada variabel temp
    //untuk variabel digunakan dua variabel temp untuk membandingkan 2 data yang berbeda
    //hal ini akan dilakukan menggunakan perulangan while dan kedua variabel temp akan terus bergeser
    //hingga data yang ditampilkan berurut
    public Node SortBubble() {
        String nama;
        int harga;
        int stok;
        Node temp = head;
        while (temp != null) {
            Node temp1 = head;
            Node temp2 = temp1.next;
            while (temp2 != null) {
                if (temp2.input.compareTo(temp1.input) < 0) {
                    nama = temp2.input;
                    temp2.input = temp1.input;
                    temp1.input = nama;

                    harga = temp2.harga;
                    temp2.harga = temp1.harga;
                    temp1.harga = harga;

                    stok = temp2.stok;
                    temp2.stok = temp1.stok;
                    temp1.stok = stok;
                }
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        return temp;
    }

    //Method change adalah method yang digunakan untuk menukar nilai data yang terletak pada dua node
    //dengan parameter dua node yang akan ditukar nilainya dan untuk melakukannya diperlukan variabel temp
    //yang digunakan untuk menyimpan data dari node sementara
    //hal ini dilakukan kepada 3 nilai pada satu node untuk menykar nilai seluruhnya
    //methpd ini merupakan method untuk membantu method IsertonSort
    public void change(Node X, Node Y) {
        String temp = X.input;
        X.input = Y.input;
        Y.input = temp;

        int temp1 = X.harga;
        X.harga = Y.harga;
        Y.harga = temp1;

        int temp2 = X.stok;
        X.stok = Y.stok;
        Y.stok = temp2;
    }

    //method InsertionSort adalah method yang digunkan untuk mengurutkan data dengan algoritma
    //membandingkan 2 data awal lalu akan membandingkan data berikutnya untuk menempatkan data di tempat yang seharusnya
    //dibutuhkan 2 data pembantu untuk melakukan pengurutan yaitu cek dan temp
    //juga dibutuhkan perulangan 2 prulangan yang akan mngecek data setelahnya untuk diurutkan
    //di dalam perulangan kedua akan memanggil fungsi change yang akan menukar isi dari 2 node yang telah ditunjuk
    public void InsertionSort() {
        current = head;
        Node cek, temp;
        for (int a = 0; a < size - 1; a++) {
            cek = current;
            temp = cek.next;
            for (int b = 0; b < a + 1; b++) {
                if (cek.harga < temp.harga && temp != null) {
                    change(cek, temp);
                    temp = cek;
                    cek = cek.prev;
                }
            }
            current = current.next;
        }
    }
    //method split adalah method pembantu method Merge yang akan membagi data list menjadi dua bagian
    //method ini memiliki parameter berupa head dengan type data Node
    //dibutuhkan 2 node pembantu yaitu fast dan slow
    // di dalam method diperlukan perulangan agar variabel slow mencapai tengah bagian dari list
    //setelah perulangan akan ada statement Node temp = slow.next; dan slow.next = null; yang akan memotong list
    Node split(Node head) {
        Node fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node temp = slow.next;
        slow.next = null;
        return temp;
    }

    //method mergeurut merupakan method yang digunakan untuk melakukan pengecekan nilai terkecil antara 2 list
    //method ini merupakan method pembantu method Merge
    //method ini memiliki parameter berupa 2 data dengan type data Node yaitu first dan second
    //memiliki 4 kondisi dengan statement yang berbeda-beda
    //kondisi if (first == null) yang akan me-return second
    //kondisi if (second == null) yang akan me-return first
    //kondisi if (first.stok < second.stok) yang akan memerintah first melakukan pengecekan terhadap nilai second serta mengembalikan nilai first di awal
    //kondisi else selain konsdisi di atas yang akan memerintah second melakukan pengecekan terhadap nilai first serta mengembalikan nilai second di awal
    Node mergeurut(Node first, Node second) {
        if (first == null) {
            return second;
        }
        if (second == null) {
            return first;
        }

        if (first.stok < second.stok) {
            first.next = mergeurut(first.next, second);
            first.next.prev = first;
            first.prev = null;
            return first;
        } else {
            second.next = mergeurut(first, second.next);
            second.next.prev = second;
            second.prev = null;
            return second;
        }
    }

    //method Merge adalah method yang digunakan untuk membandingkan nilai dan juga merupakan method pembantu method MergeSort
    //method ini memiliki parameter berupa node dengan type data Node
    // dari list yang telah dipotong pada method split
    //sebelum melakukan fingsinya dibutuhkan kondisi if (node == null || node.next == null) yang akan me-return node
    Node Merge(Node node) {
        if (node == null || node.next == null) {
            return node;
        }
        Node second = split(node);

        node = Merge(node);
        second = Merge(second);

        return mergeurut(node, second);
    }

    //method MergeSort adalah method yang digunakan untuk mengurutkan dan menampilkan data yang telah diurutkan
    //dengan metode pembagian list menjadi dua dan setelah dibagi kedua kelompok tersebut akan dibandingkan
    //lalu akan diuurutkan berdasarkan hasil perbandingan dari kedua kelompok tersebut
    //diawal akan dibutuhkan Node yang merupakan hasil dari method Merge
    //lalu program akan melakukan perulangan dengan kondisi while (node != null)
    //terdapat kondisi if (test == 0) yang akan menentukan node pertama sehingga node ini akan bertanda head
    //setelah kondisi di atas method ini akan menampilkan data yang terlah dirutkan melalui perulangan
    //dan setiap perulangan variabel test akan terus bertambah untuk meng-update kondisi sebelumnya
    public void MergeSort() {
        int test = 0;
        Node node = Merge(head);
        while (node != null) {
            if (test == 0) {
                head = node;
            }
            System.out.println("nama: " + node.input + ", harga: Rp." + node.harga + ", stok: " + node.stok);
            node = node.next;
            test++;
        }
    }

    //method middle merupakan method pembantu method BinarySearch yang digunakan untuk meletakkan current di tengah list
    //method ini membutuhkan parameter 2 data denga type data Node
    //dengan menggunakan perulangan maka current akan berpindah ke tengah list
    Node middle(Node head, Node tail) {
        if (head == null)
            return null;

        Node slow = head;
        Node fast = head.next;

        while (fast != tail) {
            fast = fast.next;
            if (fast != tail) {
                slow = slow.next;
                fast = fast.next;
            }
        }
        return slow;
    }

    //method BinarySearch adalah method yang digunakan untuk mencari data
    //dengan metode dimana di awal list telah melakukan proses pengurutan dan current harus diletakkan di tengah sebagi perbandingan
    //method ini memiliki 3 kondisi
    //kondisi if (check == search) jika data berada di tengah
    //kondisi else if (check.compareToIgnoreCase(search) > 0) jika data berada di sebelah kiri
    //dan kondisi lainnya jika data terletak di sebelah kanan
    public void BinarySearch(String search) {
        Node start = head;
        Node last = null;
        do {
            Node mid = middle(start, last);
            String check = mid.input;
            if (check == search) {
                current = mid;
                System.out.println("MENCARI BARANG : " + search);
                System.out.println("======= BARANG DITEMUKAN =======");
                System.out.println("Nama barang : " + search);
                if (check == head.input) {
                    System.out.println("LETAK :");
                    System.out.println("- sebelum barang " + current.next.input);
                } else if (check == tail.input) {
                    System.out.println("LETAK :");
                    System.out.println("- setelah barang " + current.prev.input);
                } else {
                    System.out.println("LETAK :");
                    System.out.println("- setelah barang " + current.prev.input);
                    System.out.println("- sebelum barang " + current.next.input);
                }
                System.out.println();
                break;
            } else if (check.compareToIgnoreCase(search) > 0) {
                last = mid;
            } else {
                start = mid.next;
            }
        } while (last == null || last != start);

    }

    //Method SequentialSearch adalah method searching yang menggunakan metode pencarian dari awal (head) hingga akhir (tail)
    //hal ini diawali dengan meletakkan current pada head
    //lalu menambahkan perulangan dengan tambahan didalamnya ada kondisi yang akan mencari data yang ingin dicari
    //kodisinya seperti if (current.input == cari)
    //jika data tidak ada dalam list maka program akan menampilkan "====Barang Tidak Ditemukan====="
    public void SequentialSearch(String cari){
        current = head;
        while(current != null) {
            if (current.input == cari){
                printSearch();
            }else if (current == tail && cari != tail.input){
                System.out.println("=====Barang Tidak Ditemukan=====");
            }
            advance();
        }
    }
}
//public class Modul_3 merupakan public class yang berisi code utama yang akan dijalankan program
public class Modul_3 {
    //public static void main (String[] args) merupakan fungsi main yang akan dijalankan oleh program
    public static void main (String[] args){
        //membuat class baru bernama obj dengan format seperti class Menu (sebagai linkked list)
        Menu obj = new Menu();

        //Jurnal Modul 1 Nomor 1
        //menampilkan isi dari "========TOKO GUE===========" saat program berjalan
        System.out.println("========TOKO GUE===========");
        //menampilkan isi dari "===========================" saat program berjalan
        System.out.println("===========================");
        //menampilkan isi dari "      DAFTAR BARANG        "saat program berjalan
        System.out.println("      DAFTAR BARANG        ");
        //menampilkan isi dari "===========================" saat program berjalan
        System.out.println("===========================");
        //memanggil method addfirst dengan paramater ("Kuda Mas Original", 1000 , 77) yang akan menjadi nilai dari variabel input, height dan power
        obj.addFirst("Kuda Mas Original", 1000 , 77);
        //memanggil method addfirst dengan paramater ("Nabati Permen karet", 2000, 39) yang akan menjadi nilai dari variabel input, height dan power
        obj.addFirst("Nabati Permen Karet", 2000, 39);
        //memanggil method addfirst dengan paramater ("Nabati coklat", 2000, 34) yang akan menjadi nilai dari variabel input, height dan power
        obj.addFirst("Nabati Coklat", 2000, 34);
        //memanggil method addfirst dengan paramater ("kopikap", 1500, 40) yang akan menjadi nilai dari variabel input, height dan power
        obj.addFirst("Kopikap", 1500, 40);
        //memanggil method addfirst dengan paramater ("Indomie Soto", 3000, 12) yang akan menjadi nilai dari variabel input, height dan power
        obj.addFirst("Indomie Soto", 3000, 12);
        //memanggil method addfirst dengan paramater ("Pulpy", 3000, 17) yang akan menjadi nilai dari variabel input, height dan power
        obj.addFirst("Pulpy", 3000, 17);
        //memanggil method addfirst dengan paramater ("Indomie goreng", 3500, 8) yang akan menjadi nilai dari variabel input, height dan power
        obj.addFirst("Indomie Goreng", 3500, 8);
        //memanggil method addfirst dengan paramater ("Mizon", 6000, 30) yang akan menjadi nilai dari variabel input, height dan power
        obj.addFirst("Mizon", 6000, 30);
        //method di atas masuk ke dalam class obj
        //memanggil method printAll untuk menampilkan isi dari linked list di atas
        obj.printAll();
        //menampilkan isi dari "URUTAN BERDASARKAN NAMA" saat program berjalan
        System.out.println("URUTAN BERDASARKAN NAMA");
        //memanggil method SortBubble untuk mengurutkan data berdasarkan Nama
        obj.SortBubble();
        //memanggil method printAll untuk menampilkan isi dari linked list setelah diurutkan
        obj.printAll();
        //menampilkan isi dari "URUTAN BERDASARKAN HARGA" saat program berjalan
        System.out.println("URUTAN BERDASARKAN HARGA");
        //memanggil method InsertonSort untuk mengurutkan data berdasarkan harga
        obj.InsertionSort();
        //memanggil method printAll untuk menampilkan isi dari linked list setelah diurutkan
        obj.printAll();
        //menampilkan isi dari "URUTAN BERDASARKAN STOK" saat program berjalan
        System.out.println("URUTAN BERDASARKAN STOK");
        //memanggil method MergeSort untuk mengurutkan sekaligus menampilkan data yang diurutkan
        obj.MergeSort();
        //menampilkan isi dari " " saat program berjalan
        System.out.println(" ");
        //menampilkan isi dari "MENCARI BARANG: Indomie Goreng" saat program berjalan
        System.out.println("MENCARI BARANG: Indomie Goreng");
        //memanggil method SequentialSearch untuk mencari data String "Indomie Goreng" dan langsung menampilkan data yang dicari
        obj.SequentialSearch("Indomie Goreng");
        //menampilkan isi dari " " saat program berjalan
        System.out.println(" ");
        //menampilkan isi dari "MENCARI BARANG: Nabati Coklat" saat program berjalan
        System.out.println("MENCARI BARANG: Nabati Coklat");
        //memanggil method SortBubble untuk mengurutkan data berdasarkan Nama
        obj.SortBubble();
        //memanggil method Binary Search untuk mencari data String "Nabati Coklat" dan langsung menamplikan data yang dicari
        obj.BinarySearch("Nabati Coklat");
        //menampilkan isi dari " " saat program berjalan
        System.out.println(" ");
        //menampilkan isi dari "MENCARI BARANG: Pulpy" saat program berjalan
        System.out.println("MENCARI BARANG: Pulpy");
        //memanggil method SequentialSearch untuk mencari data String "Pulpy" dan langsung menampilkan data yang dicari
        obj.SequentialSearch("Pulpy");
        //menampilkan isi dari " " saat program berjalan
        System.out.println(" ");
        //menampilkan isi dari "MENCARI BARANG: Nabati Keju" saat program berjalan
        System.out.println("MENCARI BARANG: Nabati Keju");
        //memanggil method SequentialSearch untuk mencari data String "Nabati Keju" dan langsung menampilkan data yang dicari
        obj.SequentialSearch("Nabati Keju");
    }
}





