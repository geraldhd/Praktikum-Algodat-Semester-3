package Stack;
//public class Main adalah merupakan public class yang berisi code utama yang akan dijalankan program
public class Main {
    //public static void main (String[] args) merupakan fungsi main yang akan dijalankan oleh program
    public static void main(String[] args) {
        //KASUS
        //bayu ingin meletakkan buku di dalam kardus untuk disumbangkan
        //namun secara tidak sengaja buku yang diletakkan merupakan buku yang sangat penting baginya "buku nikah"
        //namun posisi buku berada di posisi tengah kardus
        //untuk mengeluarkannya bayu menletakkan buku diatasnya di lantai
        //tampilkan urutan buku di dalam kardus sebelum dan sesudah buku nikah dikeluarkan
                Stack kardus = new Stack();
                System.out.println("==Buku di Dalam Kardus==\n");
                kardus.Push("Si kancil");
                kardus.Push("Bahasa indonesia");
                kardus.Push("Buku Nikah");
                kardus.Push("Belajar Bahasa Jepang");
                kardus.Push("Cara buat Kue");
                kardus.Push("Buku Gambar");
                kardus.printStack();
                System.out.println();
                Stack lantai = new Stack();
                System.out.println("==Setelah Buku Nikah Dikeluarkan==\n");
                lantai.Push(kardus.Pop());
                lantai.Push(kardus.Pop());
                lantai.Push(kardus.Pop());
                lantai.Push(kardus.Pop());
                lantai.Pop();
                lantai.Switch(kardus, lantai);
                kardus.printStack();
    }
}
