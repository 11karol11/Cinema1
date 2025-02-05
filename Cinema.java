import java.util.ArrayList;
import java.util.List;

public class Cinema {
    String name;
    String address;

    public List<Room> rooms = new ArrayList<>();

    public Cinema(String name, String address){
        this.name = name;
        this.address= address;
        this.rooms = new ArrayList<>();
    }
    public void addRoom(Room room){
        rooms.add(room);
    }
    public static ArrayList<Room> getRooms(ArrayList<Room> rooms){
        return rooms;
    }
}
