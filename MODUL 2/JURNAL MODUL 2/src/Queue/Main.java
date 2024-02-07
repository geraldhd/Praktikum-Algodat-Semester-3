package Queue;

//public class Main adalah merupakan public class yang berisi code utama yang akan dijalankan program
public class Main {
    //public static void main (String[] args) merupakan fungsi main yang akan dijalankan oleh program
    public static void main(String[] args) {
                //KASUS
                //mambuat sistem antrian sederhana
                Queue antrian = new Queue();
                System.out.println("==ANTRIAN==");
                antrian.Enqueue("Ge");
                antrian.Enqueue("Naruto");
                antrian.Enqueue("Natsu");
                antrian.Enqueue("Gojo");
                antrian.Enqueue("Udin");
                antrian.Enqueue("Makima");
                antrian.print();
                int x = antrian.size();
                for (int i = 1; i <= x; i++){
                    System.out.println(" ");
                    System.out.println("Sedang Melayani antrian no "+ i);
                    antrian.getfront();
                    antrian.setHead();
                    if (antrian.current.next !=null) {
                        antrian.Dequeue();
                        if (antrian.current != antrian.current.next){
                            System.out.println("Sisa Antrian: ");
                            antrian.print();
                        }
                    }
                }
        System.out.println(" ");
        System.out.println("ANTRIAN TELAH SELESAI" );
    }
}
