package Nomor1;
//public class Main adalah merupakan public class yang berisi code utama yang akan dijalankan program
public class Main {
    //public static void main (String[] args) merupakan fungsi main yang akan dijalankan oleh program
    public static void main(String[] args) {
        //Script code dibawah merupakan code utama yang akan dijalankan di saat program melakukan proses running
        //method-method yang sudah dibuat sebelumnya akan dipanggil disini
        //disini data uang akan di-Push ada 5 data yang bisa dilihat di bawah
        //lalu akan ada proses penghapusan data dengan nilai "Anya"
        //untuk menghapus digunakan proses pemindahan data dari stack_1 ke stack_2
        //lalu method printStack dipanggil untuk menampilkan hasil program
                Stack stack_1 = new Stack();
                System.out.println("==Stack sebelum elemen dihapus==\n");
                stack_1.Push("Goku");
                stack_1.Push("Anya");
                stack_1.Push("Nagato");
                stack_1.Push("Denji");
                stack_1.Push("Loid");
                stack_1.printStack();
                System.out.println();
                Stack stack_2 = new Stack();
                System.out.println("==Stack setelah elemen dihapus==\n");
                stack_2.Push(stack_1.Pop());
                stack_2.Push(stack_1.Pop());
                stack_2.Push(stack_1.Pop());
                stack_1.Pop();
                stack_1.Switch(stack_1, stack_2);
                stack_1.printStack();
    }
}
