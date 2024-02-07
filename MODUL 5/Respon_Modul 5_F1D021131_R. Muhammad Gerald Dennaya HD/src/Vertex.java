//Public class Vertex ..
public class Vertex {
    String name;
    String[] item_unik;
    Vertex next;
    Edge route;
    Edge last;
    Vertex(String name){
        this.name = name;
        next = null;
        route = last = null;
    }
    public void print(){
        System.out.println(name);
    }
}
