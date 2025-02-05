import java.util.ArrayList;
import java.util.List;

public class Room {
    String number;
    int capacity;
    public  List<Repertory> repertories = new ArrayList<>();

    public Room(String number, int capacity){
        this.number = number;
        this.capacity = capacity;
        this.repertories = new ArrayList<>();
    }

    public void addRepertory(Repertory repertory){
        repertories.add(repertory);
    }
    public ArrayList<Repertory> getRepertories(ArrayList<Repertory> repertories){
        return repertories;
    }
}
