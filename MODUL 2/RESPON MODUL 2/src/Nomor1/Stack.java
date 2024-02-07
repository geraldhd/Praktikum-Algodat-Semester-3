package Nomor1;
//public class Stack merupakan class yang merepresantasikan method-method yang akan digunakan di dalam program
    public class Stack {
        // script dibawah merupakan beberapa variabel yang menggunakan tipe data Node
        // yang berasal dari kelas Node
        Node top;
        Node bottom;
        Node current;
        // method dibawah merupakan method Push dimana fungsi method ini adalah untuk menaruh data Node
        // pada posisi depan dari Stack atau biasa disebut dengan top, cara kerja method ini sama seperti
        // method AddHead pada linked list yaitu menyambungkan Node baru ke list yang paling depan
        public void Push(Object data) {
            Node NewNode = new Node(data);
            if (top == null) {
                top = NewNode;
                bottom = NewNode;
            } else {
                NewNode.next = top;
                top = NewNode;
            }
        }

        // method dibawah merupakan method Pop dimana fungsi method ini adalah untuk menghapus data Node
        // pada posisi depan dari Stack atau biasa disebut dengan top, cara kerja method ini sama seperti
        // method DelTail pada linked list yaitu memutuskan node pada list yang paling depan, namun pada
        // method ini terdapat variabel tambahan temp yang berfungsi sebagai penanda dari Top yang kemudian
        // akan di return nilai dari datanya
        public Object Pop() {
            Node temp = top;
            if (top == null) {
                System.out.println("Stack is not defined yet...");
            } else {
                current = top;
                top = current.next;
            }
            return temp.data;
        }


        //Method Switch adalah method yang digunakan untuk menukar node dari stack satu ke stack yang lain
        //Hal ini dilakukan dengan cara mengeluarkan node dari stack kedua (Pop) lalu menambhkannya ke stack yang lain untuk menyimpannya (Push)
        //untuk menukar node diperlukan perulangan while untuk menjangkau node yang berisi nilai yang ingin ditukar
        //untuk kasus disini program ingin menyimpan node dari Stack stack_2 ke Stack stack_1
        public void Switch(Stack stack_1, Stack stack_2) {
            while (stack_2.top != null) {
                stack_1.Push(stack_2.Pop());
            }
        }
        //Method printStack digunakan untuk menampilkan hasil dari pemasukkan nilai yang telah ditambahkan pada stack
        //Dengan melakukan perulangan data yang telah dimasukkan akan langsung ditampilakn pada layar program
        public void printStack() {
            current = top;
            while (current != null) {
                if (current.next != null) {
                    System.out.println(current.data + "\n^");
                } else {
                    System.out.println(current.data);
                }
                current = current.next;
            }
        }
    }
