import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Repertory {
    Movie movie;
    LocalDateTime startTime;
    boolean is3D;
    boolean isVIP;
    public List<Ticket> tickets;

    public Repertory(Movie movie, LocalDateTime startTime,boolean is3D, boolean isVIP){
        this.movie = movie;
        this.startTime = startTime;
        this.is3D = is3D;
        this.isVIP = isVIP;
        this.tickets = new ArrayList<>();
    }
    public  Ticket addSeat(Customer customer){
        if (tickets.size() < 50 ) {
            Ticket ticket = new Ticket(customer, this);
            tickets.add(ticket);
            return ticket;
        }
        return null;
    }
    public Movie getMovie(){
        return movie;
    }
}
