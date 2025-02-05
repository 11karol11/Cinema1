import java.util.ArrayList;
import java.util.List;

public class Customer {
    String customer;

    public List<Ticket> tickets = new ArrayList<>();

    public Customer(String customer){
        this.customer = customer;
        this.tickets = new ArrayList<>();
    }
    public void addTicket(Ticket ticket){
        tickets.add(ticket);
    }
    public static ArrayList<Ticket> getTicket(ArrayList<Ticket> tickets){
        return tickets;
    }
}
