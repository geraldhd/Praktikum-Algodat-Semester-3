package Tree;
// public class tree merupakan class dari tree yang akan digunakan untuk membentuk tree
public class tree {
    //method yang digunakan untuk mengecek node root apakah = null atau tidak
    public boolean isEmpty(){
        return (root == null);
    }
    //method yang digunakan untuk mengeck node root apakah != null atau tidak
    public boolean isNotEmpty(){
        return !isEmpty();
    }
    // Node yang digunakan untuk mendefinisikan nilai dari root dan parent pada awal
    // program
    Node root = null, parent = null;
    /*
     * variabel level digunakan untuk mengetahui level pada suatu node untuk
     * digunakan pada method add
     * sedangkan variabel a digunakan untuk melakukan penomoran pada method
     * pre-order
     */
    int level = 1, a = 1;

    // class add merupakan method yang digunakan untuk menambahkan nama, level, dan letak suatu node di dalam binary
    // tree
    public void add(String ortu, String input) {
        // melakukan pengecekan, jika root bernilai null, maka data yang baru akan dimasukkan
        // akan menjadi root
        if (isEmpty()) {
            root = new Node(input, level);
            System.out.println(root.input + " berhasil dibuat sebagai root");
            return;
        }
        // memanggil method cari untuk menentukan lokasi node pada suatu binary tree
        search(root, ortu);
        // jika data pada left parent bernilai null, maka data baru ditambahkan sebagai
        // data pada parent left
        if (parent.left == null) {
            // mendefinisikan nilai dari node parent left serta menambah level pada node
            parent.left = new Node(input, parent.level + 1);
            parent.left.paren = parent;
            // menampilkan relasi antara parent dengan parent left
            System.out.println(
                    parent.left.input + " berhasil ditambahkan sebagai LEFT CHILD dari " + ortu);
            return;
        }
        // jika data pada right parent bernilai null, maka data baru ditambbahkan ke
        // dalam node parent right sebagai data baru
        if (parent.right == null) {
            // menambahkan data dan nilai pada node di parent right
            parent.right = new Node(input, parent.level + 1);
            parent.right.paren = parent;
            // menampilkan hubungan antara node parent right dengan node parent
            System.out.println(parent.right.input + " berhasil ditambahkan sebagai RIGHT CHILD dari " + ortu);
            return;
        }
    }

    // class relation merupakan method yang digunakan untuk mencari relasi antara node
    public void relation(String nama1, String nama2) {
        // memanggil method cari untuk mencari nilai dari parent dan didefinisikan
        // sebagai node curr
        search(root, nama1);
        Node curr = parent;
        // memanggil method cari untuk mencari nilai dari parent dan didefinisikan
        // sebaai node temp
        search(root, nama2);
        Node temp = parent;
        /*
         * Kondisi jika level pada curr dikurangi dengan level pada temp sama dengan 1
         * dam ortu dari curr adalah temp maka
         * curr diidentifikasi sebagai anak dari temp.
         */
        if (curr.level - temp.level == 1 && curr.paren == temp) {
            System.out.println(curr.input + " adalah anak dari " + temp.input);
            /*
             * kondisi jika level pada curr dan temp sama, maka lanjut ke kondisi setelahnya
             */
        } else if (curr.level == temp.level) {
            // jika paren pada curr dan ortu pada temp sama, maka curr dan temp merupakan saudara
            if (curr.paren.equals(temp.paren))
                System.out.println(curr.input + " adalah saudara dari " + temp.input);
                // jika paren pada curr dan paren pada temp berbeda, maka curr dengan temp merupakan saudara jauh
            else if (curr.paren != temp.paren) {
                System.out.println(curr.input + " adalah saudara jauh dari " + temp.input);
            }
            // kondisi jika level pada curr di kurangi dengan level temp dan bernilai 1, serta paren pada curr tidak sama dengan temp
        } else if (curr.level - temp.level == 1 || curr.level - temp.level == -1 && curr.input != temp) {
            // jika kakek curr tidak sama dengan temp, maka curr merupakan keponakan dari temp
            if (curr.paren.paren != temp.paren) {
                System.out.println(curr.input + " adalah keponakan jauh dari " + temp.input);
                return;
            }
            // jika kakek curr sama dengan temp, maka curr merupakan keponakan dari temp
            System.out.println(curr.input + " adalah keponakan dari " + temp.input);
            // kondisi jika level pada curr dikurangi dengan level temp sama dengan 2 dan begitu sebaliknya
        } else if (curr.level - temp.level == 2 || temp.level - curr.level == -2) {
            // kondisi jika kakek curr memiliki nilai sama dengan temp, maka curr merupakan cucu dari temp
            if (curr.paren.paren == temp) {
                System.out.println(curr.input + " adalah cucu dari " + temp.input);
                return;
            }
            // jika kakek dari curr tidak sama dengan temp, maka curr merupakan cucu jauh dari temp
            System.out.println(curr.input + " adalah cucu jauh dari " + temp.input);
            // jika buyut dari curr sama dengan temp, maka curr merupakan cicit dari temp
        } else if (curr.paren.paren.paren == temp) {
            System.out.println(curr.input + " adalah cicit dari " + temp.input);
        }
    }

    // class search merupakan method yang digunakan untuk mencari data pada binary tree
    public void search(Node ortu, String nama) {
        // jika root tidak bernilai null
        if (isNotEmpty()) {
            // jika nama dari ortu sama dengan variabel nama, maka parent menjadi ortu
            if (ortu.input.equals(nama)) {
                parent = ortu;
                return;
            }
        }
        // jika left ortu tidak sama dengan null, maka program akan melakukan rekursif dengan menggunakan left ortu sebagai nilai ortu
        if (ortu.left != null) {
            search(ortu.left, nama);
        }
        // jika right ortu tidak sama dengan null, maka program akan melakukan rekursif dengan menggunakan right ortu sebagai nilai ortu
        if (ortu.right != null) {
            search(ortu.right, nama);
        }
    }

    // class preorder merupakan method untuk melakukan pre-order pad binary tree dengan parent sebagai input
    public void PreOrder(Node parent) {
        // jika parent tidak sama dengan null
        if (parent != null) {
            // lakukan rekursif pada biniary tree dengan inputan left parent
            PreOrder(parent.left);
            // lakukan rekursuf pada binary tree dengan inputan right parent
            PreOrder(parent.right);
            // kondisi jika left parent tidak sama dengan null dan right parent tidak sama dengan null
            if (parent.left != null && parent.right != null) {
                // menampilkan data pada kanan dan kiri parent
                System.out.println(a + ". " + parent.input + " : " + parent.left.input + " & " + parent.right.input);
                // menambah jumlah nomor yang disimpan pada variabel a
                a++;
                // kondisi jika left parent bernilai null dan right parent bernilai null
            } else if (parent.left == null && parent.right == null) {
                // hanya menampilkan nama parent
                System.out.println(a + ". " + parent.input + " : - ");
                // menambah jumlah nomor yang disimpan pada variabel a
                a++;
            }
        }
    }

}
