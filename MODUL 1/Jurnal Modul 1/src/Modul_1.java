//class node merupakan class yang merepresantasikan node-node yang akan digunakan di dalam program
class Node {
    //mendeklarasikan variabel input dengan tipe data string yang akan dimasukkan data nama dari penonton konser
    String input;
    //mendeklarasikan variabel height dengan tipe data int yang akan dimasukkan data berupa nilai tinggi dari penonton konser
    int height;
    //mendeklarasikan variabel power dengan tipe data int yang akan dimasukkan data berupa nilai power dari penonton konser
    int power;
    //mendeklarasikan variabel next dengan tipe data Node yang akan digunakan sebagai penunjuk pada linked list yang akan dibuat nanti
    Node next;
    //mendeklarasikan variabel prev dengan tipe data Node yang akan digunakan sebagai penunjuk pada linked list yang akan dibuat nanti
    Node prev;
    //public node digunakan untuk mengisi node dengan nilai dari variabel input, height, dan power yang akan dimasukkan nilai
    public Node(String input, int height, int power) {
        //menginisialisasikan variabel input dengan memasukkan nilai dari paramater input
        this.input = input;
        //menginisialisasikan variabel height dengan memasukkan nilai dari paramater height
        this.height = height;
        //menginisialisasikan variabel power dengan memasukkan nilai dari paramater power
        this.power = power;
    }

}
//class Menu merupakan class yang merepresantasikan method-method yang akan digunakan di dalam program
class Menu {
    //mendeklarasikan variabel head dengan tipe data Node yang akan digunakan sebagai penunjuk pada linked list yang akan dibuat nanti
    Node head;
    //mendeklarasikan variabel tail dengan tipe data Node yang akan digunakan sebagai penunjuk pada linked list yang akan dibuat nanti
    Node tail;
    //mendeklarasikan variabel current dengan tipe data Node yang akan digunakan sebagai penunjuk pada linked list yang akan dibuat nanti
    Node current;
    //public void addFirst adalah method dengan paramater yang digunakan untuk menambahkan node head pada linked list
    public void addFirst(String input, int height, int power) {
        //mendeklarasikan sekaligus menginisialisasikan variabel baru dengan tipe data node dengan masukkan new Node(input, height, power) dengan paramater yang telah diisi
        Node baru = new Node(input, height, power);
        //memberikan kondisi (head == null). apabila kondisi terpenuhi maka statement di dalam if akan berjalan
        if (head == null) {
            //menginisialisasikan variabel head dengan masukkan nilai variabel tail yang diisi oleh variabel baru
            head = tail = baru;
        //memberikan kondisi selain kondisi if di atas dan apabila terpenuhi maka statement di dalam else akan berjalan
        } else {
            //menginisialisasikan variabel baru.next dengan masukkan nilai variabel head (next dari variabel baru menunjuk variabel head)
            baru.next = head;
            //menginisialisasikan variabel head.prev dengan masukkan nilai variabel baru (prev dari variabel head menunjuk variabel baru)
            head.prev = baru;
            //menginisialisasikan variabel head dengan masukkan nilai variabel baru (memindahkan head ke baru)
            head = baru;
        }
    }
    //public void addNext adalah method dengan paramater yang digunakan untuk menambahkan node baru pada next dari current pada linked list
    public void addNext(String input, int height, int power, String posisi) {
        //mendeklarasikan sekaligus menginisialisasikan variabel baru dengan tipe data node dengan masukkan new Node(input, height, power) dengan paramater yang telah diisi
        Node baru = new Node(input, height, power);
        //memberikan kondisi (head == null). apabila kondisi terpenuhi maka statement di dalam if akan berjalan
        if (head == null) {
            //menampilkan isi dari "Tidak Dapat Menambahkan" saat program berjalan jika kondisi di atas terpenuhi
            System.out.println("Tidak Dapat Menambahkan");
            return;
        //memberikan kondisi selain kondisi if di atas dan apabila terpenuhi maka statement di dalam else akan berjalan
        } else {
            //menginisialisasikan variabel current dengan masukkan nilai variabel head (memindahkan current ke head)
            current = head;
            //melakukan perulangan dengan memberikan kondisi (current.next != null). apabila kondisi terpenuhi maka statement di dalam if akan berjalan
            while (current.next != null) {
                //memberikan kondisi (current.input == posisi). apabila kondisi terpenuhi maka statement di dalam if akan berjalan
                if (current.input == posisi) {
                    //menginisialisasikan variabel baru.next dengan masukkan nilai variabel current.next (next dari variabel baru menunjuk variabel current.next)
                    baru.next = current.next;
                    //menginisialisasikan variabel baru.prev dengan masukkan nilai variabel current (prev dari variabel baru menunjuk variabel current)
                    baru.prev = current;
                    //menginisialisasikan variabel current.next dengan masukkan nilai variabel baru(next dari variabel current menunjuk variabel baru)
                    current.next = baru;
                    //menginisialisasikan variabel current.next dengan masukkan nilai variabel baru (prev dari variabel current.next menunjuk variabel baru)
                    current.next.prev = baru;
                    //break adalah fungsi yang digunakan untuk menghentikan perulangan pada while di atas
                    break;
                }
                //menginisialisasikan variabel current dengan masukkan nilai variabel current.next (memindahkan current ke current.next)
                current = current.next;
            }
        }
    }
    //public void removeNext adalah method dengan paramater yang digunakan untuk menghapus node pada next dari current pada linked list
    public void removeNext(String input) {
        //memberikan kondisi (head == null). apabila kondisi terpenuhi maka statement di dalam if akan berjalan
        if (head == null) {
            //menampilkan isi dari "Tidak ada data" saat program berjalan jika kondisi di atas terpenuhi
            System.out.println("Tidak ada data");
            //return adalah fungsi yang digunakan untuk mengembalikan nilai
            return;
        //memberikan kondisi selain kondisi if di atas dan apabila terpenuhi maka statement di dalam else akan berjalan
        } else {
            //menginisialisasikan variabel current dengan masukkan nilai variabel head (memindahkan current ke head)
            current = head;
            //melakukan perulangan dengan memberikan kondisi (current.next != null). apabila kondisi terpenuhi maka statement di dalam if akan berjalan
            while (current.next != null) {
                //memberikan kondisi (current.next.input == input). apabila kondisi terpenuhi maka statement di dalam if akan berjalan
                if (current.next.input == input) {
                    //menginisialisasikan variabel current.next.next.prev dengan masukkan nilai variabel current.next (prev dari variabel current.next.next.prev menunjuk variabel current.next)
                    current.next.next.prev = current.next;
                    //menginisialisasikan variabel current.next dengan masukkan nilai variabel current.next.next(next dari variabel current menunjuk variabel current.next.next)
                    current.next = current.next.next;
                    //break adalah fungsi yang digunakan untuk menghentikan perulangan pada while di atas
                    break;
                //memberikan kondisi (input == null). apabila kondisi terpenuhi maka statement di dalam else if akan berjalan
                } else if (input == null) {
                    //menampilkan isi dari "Data Tidak Ditemukan" saat program berjalan jika kondisi di atas terpenuhi
                    System.out.println("Data Tidak Ditemukan");
                }
                //menginisialisasikan variabel current dengan masukkan nilai variabel current.next (memindahkan current ke current.next)
                current = current.next;
            }
        }
    }
    //public void printALL adalah method tanpa paramater yang digunakan untuk seluruh isi dari linked list
    public void printAll() {
        //menginisialisasikan variabel current dengan masukkan nilai variabel head (memindahkan current ke head)
        current = head;
        //melakukan perulangan dengan memberikan kondisi (current.next != null). apabila kondisi terpenuhi maka statement di dalam if akan berjalan
        while (current.next != null) {
            //menampilkan isi dari ("Nama : " + current.input + " " + ", Height : " + current.height + ", Power : " + current.power) saat program berjalan jika kondisi di atas terpenuhi
            System.out.println("Nama : " + current.input + " " + ", Height : " + current.height + ", Power : " + current.power);
            //menginisialisasikan variabel current dengan masukkan nilai variabel current.next (memindahkan current ke current.next)
            current = current.next;
        }
        //menampilkan isi dari ("Nama : " + current.input + " " + ", Height : " + current.height + ", Power : " + current.power) saat program berjalan jika kondisi di atas tidak terpenuhi
        System.out.println("Nama : " + current.input + " " + ", Height : " + current.height + ", Power : " + current.power);
        //menampilkan isi dari " " saat program berjalan jika kondisi di atas tidak terpenuhi
        System.out.println("");
    }
    //public void printline adalah method dengan paramater yang digunakan untuk menampilkan linkedlist dengan isi yang berbeda dengan methode printAll
    public void printline() {
        //menginisialisasikan variabel current dengan masukkan nilai variabel head (memindahkan current ke head)
        current = head;
        //melakukan perulangan dengan memberikan kondisi (current.next != null). apabila kondisi terpenuhi maka statement di dalam if akan berjalan
        while (current.next != null) {
            //menampilkan isi dari ("Nama : " + current.input + " " ) saat program berjalan jika kondisi di atas terpenuhi
            System.out.println("Nama : " + current.input + " " );
            //menginisialisasikan variabel current dengan masukkan nilai variabel current.next (memindahkan current ke current.next)
            current = current.next;
        }
        //menampilkan isi dari ("Nama : " + current.input + " " ) saat program berjalan jika kondisi di atas tidak terpenuhi terpenuhi
        System.out.println("Nama : " + current.input + " " );
        //menampilkan isi dari " " saat program berjalan jika kondisi di atas tidak terpenuhi
        System.out.println("");
    }
    //public void Merge adalah method dengan paramater yang digunakan untuk 2 liked list yang sudah dibuat pada fungsi main
    public void Merge(Menu List2, Menu List1){
        //menginisialisasikan variabel List2.tail.next dengan masukkan nilai variabel List1.head (next dari List2.tail menunjuk variabel List1.head)
        List2.tail.next = List1.head;
        //menginisialisasikan variabel List1.head.prev dengan masukkan nilai variabel List1.tail (prev dari List2.head menunjuk variabel List1.tail)
        List1.head.prev = List2.tail;
        //menginisialisasikan variabel current dengan masukkan nilai variabel List2.head (memindahkan current ke List2.head)
        current = List2.head;
        //melakukan perulangan dengan memberikan kondisi (current.next != null). apabila kondisi terpenuhi maka statement di dalam if akan berjalan
        while (current.next != null) {
            //menampilkan isi dari (current.input + " ===> ")  saat program berjalan jika kondisi di atas terpenuhi
            System.out.print(current.input + " ===> " );
            //menginisialisasikan variabel current dengan masukkan nilai variabel current.next (memindahkan current ke current.next)
            current = current.next;
        }
        //menampilkan isi dari (current.input ) saat program berjalan jika kondisi di atas tidak terpenuhi
        System.out.print(current.input);
        //menampilkan isi dari " " saat program berjalan jika kondisi di atas tidak terpenuhi
        System.out.println("");
        }
    }
//public class Modul_1 merupakan public class yang berisi code utama yang akan dijalankan program
public class Modul_1{
    //public static void main (String[] args) merupakan fungsi main yang akan dijalankan oleh program
    public static void main (String[] args){
        //membuat class baru bernama obj dengan format seperti class Menu (sebagai linkked list)
        Menu obj = new Menu();
        //Jurnal Modul 1 Nomor 1
        //menampilkan isi dari "KETIKA PENAMPILAN FEAST" saat program berjalan
        System.out.println("KETIKA PENAMPILAN FEAST");
        //memanggil method addfirst dengan paramater ("Jidan", 183, 62) yang akan menjadi nilai dari variabel input, height dan power
        obj.addFirst("Jidan", 183, 62);
        //memanggil method addfirst dengan paramater ("Weng", 182, 61) yang akan menjadi nilai dari variabel input, height dan power
        obj.addFirst("Weng", 182, 61);
        //memanggil method addfirst dengan paramater ("Azzam", 170, 57) yang akan menjadi nilai dari variabel input, height dan power
        obj.addFirst("Azzam", 170, 57);
        //memanggil method addfirst dengan paramater ("Pande", 168, 51) yang akan menjadi nilai dari variabel input, height dan power
        obj.addFirst("Pande", 168, 51);
        //memanggil method addfirst dengan paramater ("Melki", 165, 40) yang akan menjadi nilai dari variabel input, height dan power
        obj.addFirst("Melki", 165, 40);
        //memanggil method addfirst dengan paramater ("Devian", 160, 36) yang akan menjadi nilai dari variabel input, height dan power
        obj.addFirst("Devian", 160, 36);
        //memanggil method addfirst dengan paramater ("Putri", 158, 34) yang akan menjadi nilai dari variabel input, height dan power
        obj.addFirst("Putri", 158, 34);
        //memanggil method addfirst dengan paramater ("Alita", 155, 33) yang akan menjadi nilai dari variabel input, height dan power
        obj.addFirst("Alita", 155, 33);
        //method di atas masuk ke dalam class obj
        //memanggil method printAll untuk menampilkan isi dari linked list di atas
        obj.printAll();
        //menampilkan isi dari "KETIKA DEVIAN KELUAR BARISAN" saat program berjalan
        System.out.println("KETIKA DEVIAN KELUAR BARISAN");
        //memanggil method removeNext untuk menghapus data "Devian" dari linklist
        obj.removeNext("Devian");
        //memanggil method printAll untuk menampilkan isi dari linked list setelah proses penghapusan
        obj.printAll();
        //menampilkan isi dari "SETELAH DADI MENGGANTIKAN DEVIAN" saat program berjalan
        System.out.println("SETELAH DADI MENGGANTIKAN DEVIAN");
        //memanggil method addNext untuk menambahkan data "Dadi", 164, 37 pada linklist sesuai dengan posisi next dari data "Putri"
        obj.addNext("Dadi", 164, 37, "Putri");
        //memanggil method printAll untuk menampilkan isi dari linked list setelah proses penambahan
        obj.printAll();
        //menampilkan isi dari "KETIKA AZZAM KELUAR BARISAN" saat program berjalan
        System.out.println("KETIKA AZZAM KELIAR BARISAN");
        //memanggil method removeNext untuk menghapus data "Azzam" dari linklist
        obj.removeNext("Azzam");
        //memanggil method printAll untuk menampilkan isi dari linked list setelah proses penghapusan
        obj.printAll();
        //menampilkan isi dari "SETELAH AGUS MENGGANTIKAN AZZAM" saat program berjalan
        System.out.println("SETELAH AGUS MENGGANTIKAN AZZAM");
        //memanggil method addNext untuk menambahkan data "Agus", 169, 54 pada linklist sesuai dengan posisi next dari data "Pande"
        obj.addNext("Agus", 169, 54, "Pande");
        //memanggil method printAll untuk menampilkan isi dari linked list setelah proses penambahan
        obj.printAll();

        //Jurnal Modul 1 Nomor 2
        //menampilkan isi dari "BERTEDUH" saat program berjalan
        System.out.println("BERTEDUH");
        //membuat class baru bernama line_1 dengan format seperti class Menu (sebagai linkked list)
        Menu line_1 = new Menu();
        //memanggil method addfirst dengan paramater ("Jidan",183, 62) yang akan menjadi nilai dari variabel input, height dan power
        line_1.addFirst("Jidan",183, 62);
        //memanggil method addfirst dengan paramater ("Weng", 182, 61) yang akan menjadi nilai dari variabel input, height dan power
        line_1.addFirst("Weng",182, 61);
        //memanggil method addfirst dengan paramater ("Agus",169, 54) yang akan menjadi nilai dari variabel input, height dan power
        line_1.addFirst("Agus",169, 54);
        //memanggil method addfirst dengan paramater ("Dadi",164, 37) yang akan menjadi nilai dari variabel input, height dan power
        line_1.addFirst("Dadi",164, 37  );
        //method di atas masuk ke dalam class line_1
        //memanggil method printline untuk menampilkan isi dari linked list setelah proses di atas
        line_1.printline();
        //menampilkan isi dari "TETAP MENONTON KONSER" saat program berjalan
        System.out.println("TETAP MENONTON KONSER");
        //membuat class baru bernama line_2 dengan format seperti class Menu (sebagai linkked list)
        Menu line_2 = new Menu();
        //memanggil method addfirst dengan paramater ("Permadi", 169, 47) yang akan menjadi nilai dari variabel input, height dan power
        line_2.addFirst("Permadi", 169, 47);
        //memanggil method addfirst dengan paramater ("Melki", 165, 40) yang akan menjadi nilai dari variabel input, height dan power
        line_2.addFirst("Melki", 165, 40);
        //memanggil method addfirst dengan paramater ("Putri", 158, 34) yang akan menjadi nilai dari variabel input, height dan power
        line_2.addFirst("Putri", 158, 34);
        //memanggil method addfirst dengan paramater ("Alita", 155, 33) yang akan menjadi nilai dari variabel input, height dan power
        line_2.addFirst("Alita", 155, 33);
        //method di atas masuk ke dalam class line_2
        //memanggil method printline untuk menampilkan isi dari linked list setelah proses di atas
        line_2.printline();
        //menampilkan isi dari "SETELAH BERGABUNG" saat program berjalan
        System.out.println("SETELAH BERGABUNG");
        //membuat class baru bernama linemerge dengan format seperti class Menu (sebagai linkked list)
        Menu linemerge = new Menu ();
        //memanggil method Merge dengan paramater (line_1, line_2) untuk menampilkan isi dari linked list setelah proses penggabungan
        linemerge.Merge(line_1, line_2);
    }
}





