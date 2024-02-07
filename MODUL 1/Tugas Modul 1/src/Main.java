
import org.w3c.dom.Node;

import java.util.LinkedList;

class Penonton {
    String name;
    int height;
    int power;

    Penonton(String name, int height, int power) {
        this.name = name;
        this.power = power;
        this.height = height;
    }
}

public class Main {
    static void printout(LinkedList<String> payload){
        for (int x = 0; x < payload.size(); x++) {
            System.out.print(payload.get(x) + " ==> ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        LinkedList<Penonton> konser = new LinkedList();
        konser.add(new Penonton("Alita", 155, 33));
        konser.add(new Penonton("Putri", 158, 34));
        konser.add(new Penonton("Devian", 160, 36));
        konser.add(new Penonton("Melki", 165, 40));
        konser.add(new Penonton("Pande", 168, 51));
        konser.add(new Penonton("Agus", 169, 54));
        konser.add(new Penonton("Azzam", 170, 57));
        konser.add(new Penonton("Dadi", 164, 37));
        konser.add(new Penonton("Weng", 182, 61));
        konser.add(new Penonton("Jidan", 183, 62));

        System.out.println("KETIKA PENAMPILAN FEAST");
        konser.removeIf(Konser -> Konser.name == "Dadi");
        konser.removeIf(Konser -> Konser.name == "Agus");
        konser.forEach(penonton_konser -> System.out.println("Nama: " + penonton_konser.name + ", Height:  " + penonton_konser.height + "cm, Power: " + penonton_konser.power));
        System.out.println(" ");
        System.out.println("SETELAH DEVIAN KELUAR");
        konser.removeIf(Konser -> Konser.name == "Devian");
        konser.forEach(penonton_konser -> System.out.println("Nama: " + penonton_konser.name + ", Height:  " + penonton_konser.height + "cm, Power: " + penonton_konser.power));
        System.out.println(" ");
        System.out.println("SETELAH DIGANTI DADI");
        konser.add(2, new Penonton("Dadi", 164, 37));
        konser.forEach(penonton_konser -> System.out.println("Nama: " + penonton_konser.name + ", Height:  " + penonton_konser.height + "cm, Power: " + penonton_konser.power));
        System.out.println(" ");
        System.out.println("SETELAH AZZAM KELUAR");
        konser.removeIf(Konser -> Konser.name == "Azzam");
        konser.forEach(penonton_konser -> System.out.println("Nama: " + penonton_konser.name + ", Height:  " + penonton_konser.height + "cm, Power: " + penonton_konser.power));
        System.out.println(" ");
        System.out.println("SETELAH AGUS MENGGANTIKAN AZZAM KELUAR");
        konser.add(5, new Penonton("Agus", 169, 54));
        konser.forEach(penonton_konser -> System.out.println("Nama: " + penonton_konser.name + ", Height:  " + penonton_konser.height + "cm, Power: " + penonton_konser.power));
        System.out.println(" ");
        //Nomor 2
        System.out.println("BERTEDUH");
        LinkedList<String> berteduh = new LinkedList();
        berteduh.add("Jidan");
        berteduh.add("Weng");
        berteduh.add("Agus");
        berteduh.add("Dadi");
        printout(berteduh);

        System.out.println(" ");
        System.out.println("TETAP MENONTON");
        LinkedList<String> Tetap = new LinkedList<String>();
        Tetap.add("Pande");
        Tetap.add("Melki");
        Tetap.add("Putri");
        Tetap.add("Alita");
        printout(Tetap);

        System.out.println(" ");
        System.out.println("DIGABUNG");
        Tetap.addAll(berteduh);
        printout(Tetap);
    }
}






