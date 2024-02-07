public class Graph {
    Queue BFS = new Queue();
    int size = 0;
    Vertex head, tail;
    Graph(){
        head = tail = null;
    }
    public void insertVertex(String name){
        Vertex baru = new Vertex(name);
        if (head == null){
            head = tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
        size++;
    }
    public Vertex BFS(String name){
        Vertex current = head;
        while (current != null){
            if(current.name.equals(name)){
                System.out.println("Vertex  = " + current.name);
                return current;
            }
            current = current.next;
        }
        System.out.println("Vertex tidak ditemukan!");
        return null;
    }



    public void insertEdge(String start_loc, String goal_loc){
        Vertex start = BFS(start_loc);
        Vertex goal = BFS(goal_loc);
        Edge baru = new Edge();
        if (start.route == null){
            start.route = start.last = baru;
        } else {
            start.last.next = baru;
            start.last = baru;
        }
        start.last.goal = goal;
    }
    public void printVertex(){
        Vertex current = head;
        while (current != null){
            current.print();
            current = current.next;
        }
    }
    public void printEdge(){
        Vertex current = head;
        Edge visit;
        while (current != null){
            System.out.print(current.name+" : ");
            visit = current.route;
            while (visit != null){
                System.out.print("[" + visit.goal.name + "]");
                visit = visit.next;
            }
            System.out.println();
            current = current.next;
        }
    }

}
